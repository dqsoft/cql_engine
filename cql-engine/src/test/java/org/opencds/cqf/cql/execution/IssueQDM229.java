package org.opencds.cqf.cql.execution;

import org.opencds.cqf.cql.runtime.Interval;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

/**
 * Created by Bryn on 4/16/2019.
 */
public class IssueQDM229 extends CqlExecutionTestBase {
    @Test
    public void testUncertainDuration() {
        Context context = new Context(library);
        Object result = context.resolveExpressionRef("UncertainDurationInMonths").getExpression().evaluate(context);
        assertThat(result, instanceOf(Interval.class));
        Interval uncertainty = (Interval)result;
        assertThat(uncertainty.getLow(), is(0));
        assertThat(uncertainty.getLowClosed(), is(true));
        assertThat(uncertainty.getHigh(), is(10));
        assertThat(uncertainty.getHighClosed(), is(true));

        //result = context.resolveExpressionRef("UncertainDurationInDays").getExpression().evaluate(context);
        //assertThat(result, instanceOf(Interval.class));
        //uncertainty = (Interval)result;
        //assertThat(uncertainty.getLow(), is(6));
        //assertThat(uncertainty.getLowClosed(), is(true));
        //assertThat(uncertainty.getHigh(), is(7));
        //assertThat(uncertainty.getHighClosed(), is(true));
    }
}
