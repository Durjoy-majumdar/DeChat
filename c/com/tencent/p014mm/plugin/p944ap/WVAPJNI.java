package com.tencent.p014mm.plugin.p944ap;

/* renamed from: com.tencent.mm.plugin.ap.WVAPJNI */
public class WVAPJNI {
    public static native int nativeInitMixerFunc(String str);

    public static native int nativeMixerGetMixedPCM(long j, byte[] bArr, short s);

    public static native long nativeMixerInit(int i, int i2, int i3);

    public static native int nativeMixerInsertRawPCM(long j, short s, short s2, short s3, int i, byte[] bArr);

    public static native int nativeMixerUninit(long j);
}
