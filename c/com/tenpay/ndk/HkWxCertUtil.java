package com.tenpay.ndk;

public class HkWxCertUtil {
    public static final int RSA_1024 = 0;
    public static final int RSA_2048 = 1;

    static {
        FitHkWxLibraryLoader.load("tenpay_utils");
    }

    public static native byte[] certDecrypt(String str, byte[] bArr);

    public static native byte[] certEncrypt(String str, byte[] bArr);

    public static native byte[] certSign(String str, byte[] bArr);

    public static native boolean certVerify(String str, byte[] bArr, byte[] bArr2);

    public static native boolean clearAllCert();

    public static native boolean clearCert(String str);

    public static native String getAlgoToken(String str, int i, int i2, byte[] bArr, long j, long j2, long j3, int i3);

    public static native String getCsr(int i);

    public static native int getError();

    public static native long getExpireTime(String str);

    public static native String getVersion();

    public static native boolean hasCert(String str);

    public static native boolean importCert(String str, String str2);

    public static native boolean init(String str, String str2, String str3, String str4);
}
