package org.opencds.cqf.cql.elm.execution;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.cqframework.cql.elm.execution.Expression;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class ExpressionMixin extends Expression {
}
