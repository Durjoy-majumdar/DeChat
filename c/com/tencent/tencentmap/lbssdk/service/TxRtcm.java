package com.tencent.tencentmap.lbssdk.service;

public class TxRtcm {
    public static native void jni_rtcm_free(Object obj);

    public static native int jni_rtcm_input_data(Object obj, Byte b, String str);

    public static native Object jni_rtcm_new();
}
