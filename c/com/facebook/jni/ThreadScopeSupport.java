package com.facebook.jni;

import p1003m6.C88699a;

public class ThreadScopeSupport {
    static {
        C88699a.m110646a("fbjni");
    }

    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}
