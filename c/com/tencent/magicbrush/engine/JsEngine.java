package com.tencent.magicbrush.engine;

import java.nio.ByteBuffer;
import p416qd.C89590b;

class JsEngine {
    static {
        C89590b.m112027a();
    }

    public static native void addJsInterface(long j, Object obj, String str);

    public static native long createVM(String str, byte[] bArr);

    public static native long createVMContext(long j, int i);

    public static native String evaluateJavascript(long j, String str);

    public static native String evaluateJavascriptCache(long j, String str, String str2, String str3, String str4);

    public static native String evaluateJavascriptDebug(long j, String str, String str2);

    public static native String evaluateJavascriptFile(long j, String str, String str2);

    public static native ByteBuffer getNativeBuffer(int i, long j);

    public static native int getNativeBufferId();

    public static native void pumpMessageLoop(long j);

    public static native boolean pushObject(long j, long j2, String str);

    public static native void releaseVM(long j);

    public static native void releaseVMContext(long j);

    public static native boolean removeJsInterface(long j, String str);

    public static native boolean removeObject(long j, String str);

    public static native void setNativeBuffer(int i, ByteBuffer byteBuffer);

    public static native void waitForDebuger(long j, String str);
}
