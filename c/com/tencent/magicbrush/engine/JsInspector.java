package com.tencent.magicbrush.engine;

public class JsInspector {
    public static native int JniNotify(long j, long j2, String str);

    public static native void JniReceiveData(long j, String str);

    public static int jniCallbackNotify(long j, long j2, String str) {
        return -1;
    }

    public static int jniCallbackSendData(long j, String str) {
        return -1;
    }
}
