package com.tencent.xweb.util;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {
    private static String TAG = "AESUtil";

    public static String byteToHexString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte hexString : bArr) {
            String hexString2 = Integer.toHexString(hexString);
            if (hexString2.length() > 3) {
                stringBuffer.append(hexString2.substring(6));
            } else if (hexString2.length() < 2) {
                stringBuffer.append("0" + hexString2);
            } else {
                stringBuffer.append(hexString2);
            }
        }
        return stringBuffer.toString();
    }

    public static byte[] decrypt(byte[] bArr, SecretKey secretKey) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
            instance.init(2, secretKeySpec);
            return instance.doFinal(bArr);
        } catch (Throwable th) {
            String str = TAG;
            XWebLog.m21909e(str, "decrypt exp:" + th.getMessage());
            return null;
        }
    }

    public static String decryptHexStrToStr(String str, SecretKey secretKey) {
        byte[] decrypt = decrypt(hexStrToBytesr(str), secretKey);
        return decrypt == null ? "" : new String(decrypt);
    }

    public static String encrypt(String str, SecretKey secretKey) {
        return byteToHexString(encrypt_to_bytes(str, secretKey));
    }

    public static byte[] encrypt_to_bytes(String str, SecretKey secretKey) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/PKCS5Padding");
            instance.init(1, secretKeySpec);
            return instance.doFinal(str.getBytes("UTF-8"));
        } catch (Throwable th) {
            String str2 = TAG;
            XWebLog.m21909e(str2, "encrypt exp:" + th.getMessage());
            return null;
        }
    }

    public static SecretKey generateKey(String str) {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.setSeed(str.getBytes("UTF-8"));
            instance.init(128, secureRandom);
            return instance.generateKey();
        } catch (Throwable th) {
            String str2 = TAG;
            XWebLog.m21909e(str2, "generateKey exp:" + th.getMessage());
            return null;
        }
    }

    public static byte[] hexStrToBytesr(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static SecretKey makekey(String str) {
        try {
            return new SecretKeySpec(hexStrToBytesr(str), "AES");
        } catch (Throwable th) {
            String str2 = TAG;
            XWebLog.m21909e(str2, "makekey exp:" + th.getMessage());
            return null;
        }
    }
}
