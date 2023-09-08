package com.eclipsesource.mmv8.debug;

import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;

public class BreakEvent extends EventData {
    private static final String SOURCE_COLUMN = "sourceColumn";
    private static final String SOURCE_LINE = "sourceLine";
    private static final String SOURCE_LINE_TEXT = "sourceLineText";

    public BreakEvent(V8Object v8Object) {
        super(v8Object);
    }

    public int getSourceColumn() {
        return this.v8Object.executeIntegerFunction(SOURCE_COLUMN, (V8Array) null);
    }

    public int getSourceLine() {
        return this.v8Object.executeIntegerFunction(SOURCE_LINE, (V8Array) null);
    }

    public String getSourceLineText() {
        return this.v8Object.executeStringFunction(SOURCE_LINE_TEXT, (V8Array) null);
    }
}
