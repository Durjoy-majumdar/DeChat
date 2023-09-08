package com.eclipsesource.mmv8.debug.mirror;

import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;

public class BooleanMirror extends ValueMirror {
    public BooleanMirror(V8Object v8Object) {
        super(v8Object);
    }

    public boolean isBoolean() {
        return true;
    }

    public String toString() {
        return this.v8Object.executeStringFunction("toText", (V8Array) null);
    }
}
