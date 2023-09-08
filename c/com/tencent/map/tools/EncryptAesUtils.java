package com.tencent.map.tools;

import android.util.Base64;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptAesUtils {
    private static final String CipherMode = "AES/CBC/PKCS5Padding";
    private static final String EMPTY_STRING = "";
    private static final byte[] EMPYT_BYTE_ARR = new byte[0];

    private static byte[] EnDeCrypt(byte[] bArr, String str, AlgorithmParameterSpec algorithmParameterSpec, int i) {
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("wrong mode.");
        } else if (bArr == null || bArr.length == 0) {
            return EMPYT_BYTE_ARR;
        } else {
            try {
                Cipher cipher = getCipher(str, algorithmParameterSpec, i);
                return cipher == null ? EMPYT_BYTE_ARR : cipher.doFinal(bArr);
            } catch (Throwable unused) {
                return EMPYT_BYTE_ARR;
            }
        }
    }

    private static String EnDeCryptBase64(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec, int i) {
        byte[] bArr;
        if (i == 1 || i == 2) {
            if (!(str == null || str.length() == 0)) {
                if (i == 1) {
                    try {
                        bArr = str.getBytes();
                    } catch (Throwable unused) {
                    }
                } else {
                    bArr = i == 2 ? Base64.decode(str.getBytes(), 2) : null;
                }
                if (bArr != null) {
                    if (bArr.length != 0) {
                        byte[] EnDeCrypt = EnDeCrypt(bArr, str2, algorithmParameterSpec, i);
                        if (i == 1) {
                            return Base64.encodeToString(EnDeCrypt, 2);
                        }
                        if (i == 2) {
                            return new String(EnDeCrypt);
                        }
                        return null;
                    }
                }
            }
            return "";
        }
        throw new IllegalArgumentException("wrong mode.");
    }

    public static byte[] decryptAes256(byte[] bArr, String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCrypt(bArr, str, algorithmParameterSpec, 2);
    }

    public static String decryptAes256Base64(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCryptBase64(str, str2, algorithmParameterSpec, 2);
    }

    public static byte[] encryptAes256(byte[] bArr, String str, AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCrypt(bArr, str, algorithmParameterSpec, 1);
    }

    public static String encryptAes256Base64(String str, String str2, AlgorithmParameterSpec algorithmParameterSpec) {
        return EnDeCryptBase64(str, str2, algorithmParameterSpec, 1);
    }

    private static Cipher getCipher(String str, AlgorithmParameterSpec algorithmParameterSpec, int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes("UTF-8"), "AES");
        Cipher instance = Cipher.getInstance(CipherMode);
        instance.init(i, secretKeySpec, algorithmParameterSpec);
        return instance;
    }
}
