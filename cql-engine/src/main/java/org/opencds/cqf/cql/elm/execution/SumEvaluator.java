package org.opencds.cqf.cql.elm.execution;

import org.opencds.cqf.cql.exception.InvalidOperatorArgument;
import org.opencds.cqf.cql.execution.Context;
import org.opencds.cqf.cql.runtime.Quantity;
import java.util.Iterator;
import java.math.BigDecimal;

/*
Sum(argument List<Integer>) Integer
Sum(argument List<Decimal>) Decimal
Sum(argument List<Quantity>) Quantity

The Sum operator returns the sum of non-null elements in the source.
If the source contains no non-null elements, null is returned.
If the list is null, the result is null.
Return types: Integer, BigDecimal & Quantity
*/

public class SumEvaluator extends org.cqframework.cql.elm.execution.Sum {

    public static Object sum(Object source) {
        if (source == null) {
            return null;
        }

        if (source instanceof Iterable) {
            Iterable elements = (Iterable)source;
            Object sum = null;
            for (Object element : elements) {
                if (element == null) {
                    continue;
                }

                if (sum == null) {
                    sum = element;
                }
                else {
                    sum = AddEvaluator.add(sum, element);
                }
            }

            return sum;
        }

        throw new InvalidOperatorArgument(
                "Sum(List<Integer>), Sum(List<Decimal>) or Sum(List<Quantity>)",
                String.format("Sum(%s)", source.getClass().getName())
        );
    }

    @Override
    protected Object internalEvaluate(Context context) {
        Object source = getSource().evaluate(context);
        return sum(source);
    }
}
