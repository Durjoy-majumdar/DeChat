package com.eclipsesource.mmv8.debug.mirror;

import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;

public class FunctionMirror extends ObjectMirror {
    private static final String NAME = "name";
    private static final String SCRIPT = "script";

    public FunctionMirror(V8Object v8Object) {
        super(v8Object);
    }

    public String getName() {
        return this.v8Object.executeStringFunction("name", (V8Array) null);
    }

    public String getScriptName() {
        V8Object executeObjectFunction = this.v8Object.executeObjectFunction(SCRIPT, (V8Array) null);
        try {
            return executeObjectFunction.executeStringFunction("name", (V8Array) null);
        } finally {
            executeObjectFunction.release();
        }
    }

    public boolean isFunction() {
        return true;
    }
}
