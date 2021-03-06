package org.opencds.cqf.cql.elm.execution;

import org.opencds.cqf.cql.execution.Context;

public class ValueSetRefEvaluator extends org.cqframework.cql.elm.execution.ValueSetRef {

  @Override
  protected Object internalEvaluate(Context context) {
    return context.resolveValueSetRef(this.getLibraryName(), this.getName());
  }
}
