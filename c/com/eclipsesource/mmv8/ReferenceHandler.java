package com.eclipsesource.mmv8;

public interface ReferenceHandler {
    void v8HandleCreated(V8Value v8Value);

    void v8HandleDisposed(V8Value v8Value);
}
