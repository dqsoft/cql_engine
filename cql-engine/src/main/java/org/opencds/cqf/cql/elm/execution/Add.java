package org.opencds.cqf.cql.elm.execution;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.opencds.cqf.cql.exception.InvalidOperatorArgument;
import org.opencds.cqf.cql.execution.Context;
import org.opencds.cqf.cql.runtime.BaseTemporal;
import org.opencds.cqf.cql.runtime.Date;
import org.opencds.cqf.cql.runtime.DateTime;
import org.opencds.cqf.cql.runtime.Interval;
import org.opencds.cqf.cql.runtime.Precision;
import org.opencds.cqf.cql.runtime.Quantity;
import org.opencds.cqf.cql.runtime.TemporalHelper;
import org.opencds.cqf.cql.runtime.Time;
import org.opencds.cqf.cql.runtime.Value;

public class Add extends AddEvaluator {
}
