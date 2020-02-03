// When the duration calculation is at a precision below the specified precision of one of the inputs, the result is an uncertainty
define UncertainDurationInMonths: months between @2012-01-02 and @2012 // [0, 10]

// When the duration calculation is at a precision below the specified precision of both inputs, the result is a range covering the possible values
define UncertainDurationInDays: days between @2012-01 and @2012-02 // [days between @2012-01-31 and @2012-02-01, days between @2012-01-01 and @2012-02-29]

// Where the duration calculation is at a precision above the specified precision of both inputs, the result is a range accounting for the uncertainty
//define UncertainDurationInDays: days between @2017-08-07T17:00 and @2017-08-14


// minutes between @T10:00 and @T11:00
// hours between @T08 and @T09
