package com.tenpay.ndk;

import com.tenpay.utils.SMUtilsV2;

public class FitScUtil {
    public static byte[] sm2Lock = new byte[0];

    static {
        FitScLibraryLoader.load(SMUtilsV2.LIB_NAME);
    }

    public native synchronized byte[] certDecrypt(String str, byte[] bArr);

    public native synchronized byte[] certEncrypt(String str, byte[] bArr);

    public native synchronized byte[] certSign(String str, byte[] bArr, byte[] bArr2);

    public native synchronized boolean certVerify(String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native synchronized boolean clearAllCert();

    public native synchronized boolean clearAllValue();

    public native synchronized boolean clearCert(String str);

    public native synchronized boolean clearToken(String str);

    public native synchronized boolean clearTokenSeed(String str);

    public native synchronized boolean clearValue(String str);

    public native synchronized String encryptDataWithSm4(byte[] bArr, int i);

    public native synchronized String encryptGenericDataWithCert(String str, String str2, String str3, boolean z);

    public native synchronized String encryptPassWithCert(String str, byte[] bArr, byte[] bArr2, long j, String str2, int i, boolean z);

    public native synchronized String encryptPassword(byte[] bArr, byte[] bArr2, long j, String str, int i);

    public native synchronized int getCaCertVersion();

    public native synchronized long[] getCertValidTime(String str);

    public native synchronized String getGenericDataHash(String str, String str2);

    public native synchronized int getLastError();

    public native synchronized String getToken(String str);

    public native synchronized int getTokenCount(String str);

    public native synchronized String getTokenHeader(String str);

    public native synchronized byte[] getTokenSeed(String str);

    public native synchronized byte[] getValue(String str);

    public native synchronized String getVersion();

    public native synchronized boolean hasCert(String str);

    public native synchronized boolean hasValue(String str);

    public native synchronized boolean importCert(String str, String str2, boolean z);

    public native synchronized boolean init(String str, String str2, String str3, String str4);

    public native synchronized boolean initTsm();

    public native synchronized String makeCsr(String str, String str2);

    public native synchronized byte[] md5(byte[] bArr);

    public native synchronized byte[] randomBytes(int i);

    public native synchronized void release();

    public native synchronized boolean setToken(String str, String str2);

    public native synchronized boolean setTokenSeed(String str, byte[] bArr);

    public native synchronized boolean setValue(String str, byte[] bArr);

    public native synchronized byte[] sha1(byte[] bArr);

    public native synchronized byte[] sha256(byte[] bArr);

    public native synchronized byte[] sm2Decrypt(byte[] bArr, byte[] bArr2);

    public native synchronized byte[] sm2DecryptWithMode(byte[] bArr, byte[] bArr2, int i);

    public native synchronized byte[] sm2Encrypt(byte[] bArr, byte[] bArr2);

    public native synchronized byte[] sm2EncryptWithMode(byte[] bArr, byte[] bArr2, int i);

    public native synchronized Object[] sm2GenKeyPair();

    public native synchronized byte[] sm2GenPublicKey(byte[] bArr);

    public native synchronized byte[] sm2Sign(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public native synchronized byte[] sm2SignWithMode(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i);

    public native synchronized boolean sm2Verify(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public native synchronized boolean sm2VerifyWithMode(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i);

    public native synchronized byte[] sm3(byte[] bArr);

    public native synchronized byte[] sm3Hmac(byte[] bArr, byte[] bArr2);

    public native synchronized byte[] sm4CbcDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z);

    public native synchronized byte[] sm4CbcEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z);

    public native synchronized byte[] sm4CtrDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native synchronized byte[] sm4CtrEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native synchronized byte[] sm4GcmDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public native synchronized Object[] sm4GcmEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public native synchronized boolean updateCaCert(int i, Object[] objArr);
}
