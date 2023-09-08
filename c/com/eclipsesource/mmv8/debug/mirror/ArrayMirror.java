package com.eclipsesource.mmv8.debug.mirror;

import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;

public class ArrayMirror extends ObjectMirror {
    private static final String LENGTH = "length";

    public ArrayMirror(V8Object v8Object) {
        super(v8Object);
    }

    public boolean isArray() {
        return true;
    }

    public int length() {
        return this.v8Object.executeIntegerFunction(LENGTH, (V8Array) null);
    }
}
