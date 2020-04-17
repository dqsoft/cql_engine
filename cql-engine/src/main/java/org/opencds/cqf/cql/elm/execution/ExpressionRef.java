package org.opencds.cqf.cql.elm.execution;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class ExpressionRef extends ExpressionRefEvaluator {
}
