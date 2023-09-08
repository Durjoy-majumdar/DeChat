package com.eclipsesource.mmv8.debug.mirror;

import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;

public class NumberMirror extends ValueMirror {
    public NumberMirror(V8Object v8Object) {
        super(v8Object);
    }

    public boolean isNumber() {
        return true;
    }

    public String toString() {
        return this.v8Object.executeStringFunction("toText", (V8Array) null);
    }
}
