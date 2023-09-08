package com.tencent.matrix.xlog;

public class XLogNative {
    /* renamed from: a */
    public static void m161209a(String str) {
        setXLoggerNative(str);
    }

    private static native void setXLoggerNative(String str);
}
