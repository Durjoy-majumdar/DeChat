package com.tencent.qafpapi;

import p206nj.C88957l;

public class QAFPNative {
    static {
        C88957l.m111079o("wechatQAFP", QAFPNative.class.getClassLoader());
    }

    public static native int QAFPGetAudioFingerPrint(byte[] bArr);

    public static native int QAFPGetAudioFingerPrintTV(byte[] bArr);

    public static native int QAFPGetVersion();

    public static native int QAFPInit();

    public static native int QAFPProcess(byte[] bArr, int i);

    public static native int QAFPProcessTV(byte[] bArr, int i);

    public static native int QAFPRelease();

    public static native int QAFPReset();
}
