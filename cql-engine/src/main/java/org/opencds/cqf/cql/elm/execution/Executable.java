package org.opencds.cqf.cql.elm.execution;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.commons.lang3.NotImplementedException;
import org.opencds.cqf.cql.exception.CqlException;
import org.opencds.cqf.cql.execution.Context;

public class Executable
{
    public Object evaluate(Context context) throws CqlException
    {
        try {
            return internalEvaluate(context);
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
