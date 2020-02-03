package org.opencds.cqf.cql.elm.execution;

import org.apache.commons.lang3.NotImplementedException;
import org.cqframework.cql.elm.execution.Element;
import org.opencds.cqf.cql.exception.CqlException;
import org.opencds.cqf.cql.exception.CqlExceptionHandler;
import org.opencds.cqf.cql.execution.Context;

import java.util.function.Function;

public class Executable
{
    public Object evaluate(Context context) throws CqlException
    {
        try {
            Object result = internalEvaluate(context);
            if (context.shouldDebug(this)) {
                context.logDebugResult(this, result);
            }
            return result;
        }
        catch (Exception e) {
            if (e instanceof CqlException) {
                throw e;
            }
            else {
                throw new CqlException(e);
            }
        }
    }

    protected Object internalEvaluate(Context context) {
        throw new NotImplementedException(String.format("evaluate not implemented for class %s",
                this.getClass().getSimpleName()));
    }
}
