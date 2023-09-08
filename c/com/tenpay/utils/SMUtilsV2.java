package com.tenpay.utils;

import com.tenpay.ndk.FitScLibraryLoader;

public class SMUtilsV2 {
    public static final String LIB_NAME = "tsmsc";
    private static boolean isLoadSuccess;
    private static SMUtilsV2 mInstance = null;

    static {
        FitScLibraryLoader.load(LIB_NAME);
    }

    public static native int TSMAllocCount();

    public static native int TSMCryptoDescSM2Decrypt(String str, byte[] bArr, int i, byte[][] bArr2);

    public static native int TSMCryptoDescSM2Encrypt(String str, byte[] bArr, int i, byte[][] bArr2);

    public static native int TSMCryptoDescSM2Sign(String str, byte[] bArr, String str2, int i, byte[][] bArr2);

    public static native int TSMCryptoDescSM2Verify(String str, byte[] bArr, String str2, byte[] bArr2, int i);

    public static native int TSMCryptoDescSM4CBCDecrypt(String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    public static native int TSMCryptoDescSM4CBCEncrypt(String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    public static native int TSMCryptoDescSM4CTRDecrypt(String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    public static native int TSMCryptoDescSM4CTREncrypt(String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    public static native int TSMCryptoDescSM4ECBDecrypt(String str, byte[] bArr, byte[][] bArr2);

    public static native int TSMCryptoDescSM4ECBEncrypt(String str, byte[] bArr, byte[][] bArr2);

    public static native int TSMCryptoDescSM4GCMDecrypt(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][] bArr5);

    public static native int TSMCryptoDescSM4GCMEncrypt(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[][] bArr4, byte[][] bArr5);

    public static native int TSMStorageCheckSM2PriKey(String str);

    public static native int TSMStorageCheckSM2PubKey(String str);

    public static native int TSMStorageCheckSM4Key(String str);

    public static native int TSMStorageDeleteSM2PriKey(String str);

    public static native int TSMStorageDeleteSM2PubKey(String str);

    public static native int TSMStorageDeleteSM4Key(String str);

    public static native int TSMStorageExportSM2PriKey(String str, int i, String[] strArr, String[] strArr2);

    public static native int TSMStorageExportSM2PubKey(String str, int i, String[] strArr);

    public static native int TSMStorageExportSM4Key(String str, byte[][] bArr);

    public static native int TSMStorageGenerateSM2KeyPair(String str);

    public static native int TSMStorageGenerateSM4Key(String str);

    public static native int TSMStorageImportSM2PriKey(String str, String str2, int i);

    public static native int TSMStorageImportSM2PubKey(String str, String str2, int i);

    public static native int TSMStorageImportSM4Key(String str, byte[] bArr);

    public static native int TSMStorageInit(String str, String str2, String str3);

    public static native int TSMStorageUpdateSM2PriKey(String str, String str2, int i);

    public static native int TSMStorageUpdateSM2PubKey(String str, String str2, int i);

    public static native int TSMStorageUpdateSM4Key(String str, byte[] bArr);

    public static SMUtilsV2 getInstance() {
        if (mInstance == null) {
            synchronized (SMUtilsV2.class) {
                if (mInstance == null) {
                    mInstance = new SMUtilsV2();
                }
            }
        }
        return mInstance;
    }

    public static boolean isLoadOK() {
        return isLoadSuccess;
    }
}
