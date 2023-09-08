package com.eclipsesource.mmv8.debug.mirror;

import com.eclipsesource.mmv8.Releasable;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;

public class PropertiesArray implements Releasable {
    private V8Array v8Array;

    public PropertiesArray(V8Array v8Array2) {
        this.v8Array = v8Array2.twin();
    }

    public PropertyMirror getProperty(int i) {
        V8Object object = this.v8Array.getObject(i);
        try {
            return new PropertyMirror(object);
        } finally {
            object.release();
        }
    }

    public int length() {
        return this.v8Array.length();
    }

    public void release() {
        if (!this.v8Array.isReleased()) {
            this.v8Array.release();
        }
    }
}
