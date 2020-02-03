library Draft_Common version '0.9.001'

//using QDM version '5.4'

codesystem "SOP": 'urn:oid:2.16.840.1.113883.3.221.5'

code "MEDICAID": '2' from "SOP" display 'MEDICAID'
code "MEDICARE": '1' from "SOP" display 'MEDICARE'
code "PRIVATE HEALTH INSURANCE": '5' from "SOP" display 'PRIVATE HEALTH INSURANCE'

//parameter "Measurement Period" Interval<DateTime>
//parameter "Product Line" String

//context Patient

define "Measurement Period":
  Interval[@2012-01-01T00:00:00.0, @2012-12-31T23:59:59.999]

define "Product Line":
  "Commercial Product"

//define function MemberAgeInYearsAt(date Date):
//  years between ToDate(Patient.birthDatetime) and date

define "Medicaid Product":
	'medicaid'

define "Medicare Product":
	'medicare'

define "Commercial Product":
	'commercial'

//define "Participation":
//	["Participation": "PRIVATE HEALTH INSURANCE"]
//		union ["Participation": "MEDICARE"]
//		union ["Participation": "MEDICAID"]

define function QDMId(namingSystem String, value String): { namingSystem: namingSystem, value: value }

define "Participation":
  {
    {
      id: 'Participation001',
      code: "MEDICARE",
      patientId: QDMId(null, 'Patient001'),
      reporter: null, // as { namingSystem: String, value: String },
      recorder: null, // as { namingSystem: String, value: String },
      participationPeriod: Interval[@2011-10-15T00:00:00.0, @2012-04-30T23:59:59.999]
    },
    {
      id: 'Participation002',
      code: "PRIVATE HEALTH INSURANCE",
      patientId: QDMId(null, 'Patient001'),
      reporter: null, // as { namingSystem: String, value: String },
      recorder: null, // as { namingSystem: String, value: String },
      participationPeriod: Interval[@2012-05-01T00:00:00.0, @2013-05-31T23:59:59.999]
    }
  }

define function "Participation In Period"(ParticipationPeriod Interval<DateTime> ):
	collapse ( Participation P
				let I: P.participationPeriod
					intersect ParticipationPeriod
				where P.participationPeriod overlaps ParticipationPeriod
				return all Interval[ToDate(start of I), predecessor of ( ToDate(
						end of I
					)+ 1 day
				)]
		)

define function "Is Continuously Enrolled In Period"(EnrollmentPeriod Interval<DateTime>, AllowedGapDays Integer ):
	"Gap Days In Period"(EnrollmentPeriod, "Participation In Period"(EnrollmentPeriod))<= AllowedGapDays

define function "Is Enrolled"(ProductLine String, IndexDate DateTime, ParticipationPeriod Interval<DateTime>, AllowedGapDays Integer ):
  (ProductLine is null or "Is Enrolled On Date"(ProductLine, IndexDate))
    and AllTrue(
      ("Enrollment Periods"(ParticipationPeriod)) EnrollmentPeriod
        return "Is Continuously Enrolled In Period"(
          EnrollmentPeriod, if duration in months of EnrollmentPeriod >= 6 then AllowedGapDays else 0
        )
    )

// If no index date is provided, take the product line closest to the end of the
// participation period. Otherwise, take the product in which the member is enrolled
// on the index date
define function "Product Line"(IndexDate DateTime, ParticipationPeriod Interval<DateTime>):
  Last(
    "Participation" P
      where P.participationPeriod
        overlaps Interval[Coalesce(IndexDate, start of ParticipationPeriod),
          Coalesce(IndexDate, end of ParticipationPeriod)]
      sort by end of participationPeriod
  ).code

define function "Gap Days In Period"(ParticipationPeriod Interval<DateTime>, Periods List<Interval<DateTime>> ):
	case Count(Periods)
		when 1 then if Periods[0]starts day of ParticipationPeriod then difference in days between
		end of Periods[0]and
		end of ParticipationPeriod
			else if Periods[0]ends day of ParticipationPeriod then difference in days between start of ParticipationPeriod and start of Periods[0]
			else maximum Integer
		when 2 then if Periods[0]starts day of ParticipationPeriod
			and Periods[1]ends day of ParticipationPeriod then difference in days between
		end of Periods[0]and start of Periods[1]
			else maximum Integer
		else maximum Integer
	end

define function "Enrollment Periods"(ParticipationPeriod Interval<DateTime> ):
	( { 3 years, 2 years, 1 year } ) Year
		where
		end of ParticipationPeriod - ( Year - 1 year ) after start of ParticipationPeriod
		return Interval[Max({ successor of(
				end of ParticipationPeriod - Year
			), start of ParticipationPeriod }
		),
		end of ParticipationPeriod - ( Year - 1 year )]

define function "ToDate"(Value DateTime ):
	DateTime(year from Value, month from Value, day from Value, 0, 0, 0, 0, timezone from Value)

define function "Is Enrolled On Date"(ProductLine String, IndexDate DateTime ):
	exists ( (
		case ProductLine
			when "Commercial Product" then "Participation" P where P.code ~ "PRIVATE HEALTH INSURANCE" //["Participation": "PRIVATE HEALTH INSURANCE"]
			when "Medicare Product" then "Participation" P where P.code ~ "MEDICARE" //["Participation": "MEDICARE"]
			when "Medicaid Product" then "Participation" P where P.code ~ "MEDICAID" //["Participation": "MEDICAID"]
			else null
		end ) P
			where IndexDate during P.participationPeriod
	)

// These should actually be using the Product Line function then if this is what stratifies the result
//define "Is Commercial":
//	exists ( ["Patient Characteristic Payer": "PRIVATE HEALTH INSURANCE"] )

//define "Is Medicaid":
//	exists ( ["Patient Characteristic Payer": "MEDICAID"] )

//define "Is Medicare":
//	exists ( ["Patient Characteristic Payer": "MEDICARE"] )


// Tests:
define Test1: "Is Enrolled"("Commercial Product", end of "Measurement Period", "Measurement Period", 45)

