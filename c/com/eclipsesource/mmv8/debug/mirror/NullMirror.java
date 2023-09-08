package com.eclipsesource.mmv8.debug.mirror;

import com.eclipsesource.mmv8.V8Object;

public class NullMirror extends ValueMirror {
    public NullMirror(V8Object v8Object) {
        super(v8Object);
    }

    public boolean isNull() {
        return true;
    }

    public String toString() {
        return "null";
    }
}
