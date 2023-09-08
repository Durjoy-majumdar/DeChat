package com.eclipsesource.mmv8;

public class V8ResultUndefined extends V8RuntimeException {
    public V8ResultUndefined(String str) {
        super(str);
    }

    public V8ResultUndefined() {
    }
}
