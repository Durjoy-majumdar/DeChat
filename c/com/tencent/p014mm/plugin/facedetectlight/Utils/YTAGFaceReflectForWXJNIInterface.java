package com.tencent.p014mm.plugin.facedetectlight.Utils;

/* renamed from: com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface */
public class YTAGFaceReflectForWXJNIInterface {
    public static native String decrypt(String str, byte[] bArr, long j);

    public static native byte[] encrypt(String str, String str2, long j);

    public static native String faceMd5(byte[] bArr, long j);

    public static native YTAGFaceReflectResult getEncodeString(String str);

    public static native String verifyDataToJpg(String str, String str2);
}
