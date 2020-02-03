package org.opencds.cqf.cql.execution;

import org.opencds.cqf.cql.debug.DebugResult;

import java.util.HashMap;
import java.util.Map;

public class LibraryResult {
    public Map<String, Object> expressionResults;

    public LibraryResult() {
        this.expressionResults = new HashMap<>();
    }

    public Object forExpression(String expressionName) {
        return this.expressionResults.get(expressionName);
    }

    private DebugResult debugResult;
    public DebugResult getDebugResult() {
        return this.debugResult;
    }

    public void setDebugResult(DebugResult debugResult) {
        this.debugResult = debugResult;
    }
}