package com.tenpay.ndk;

public class HkWxCryptoUtil {
    static {
        FitHkWxLibraryLoader.load("tenpay_utils");
    }

    public static native String encryptPassword(byte[] bArr, byte[] bArr2, long j, String str, int i);

    public static native int getError();

    public static native String getVersion();
}
