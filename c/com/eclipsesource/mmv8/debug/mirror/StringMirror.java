package com.eclipsesource.mmv8.debug.mirror;

import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;

public class StringMirror extends ValueMirror {
    public StringMirror(V8Object v8Object) {
        super(v8Object);
    }

    public boolean isString() {
        return true;
    }

    public String toString() {
        return this.v8Object.executeStringFunction("toText", (V8Array) null);
    }
}
