package org.opencds.cqf.cql.elm.execution;

import org.opencds.cqf.cql.execution.Context;

import java.util.ArrayList;

public class ListEvaluator extends org.cqframework.cql.elm.execution.List {

    @Override
    protected Object internalEvaluate(Context context) {
        ArrayList<Object> result = new ArrayList<Object>();
        for (org.cqframework.cql.elm.execution.Expression element : this.getElement()) {
            result.add(element.evaluate(context));
        }
        return result;
    }
}
