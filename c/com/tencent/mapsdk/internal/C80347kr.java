package com.tencent.mapsdk.internal;

import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.tencent.mapsdk.internal.kr */
public final class C80347kr {

    /* renamed from: a */
    private static final String f235210a = "AESCrypt";

    /* renamed from: b */
    private static final String f235211b = "AES/CBC/PKCS7Padding";

    /* renamed from: c */
    private static final String f235212c = "UTF-8";

    /* renamed from: d */
    private static final String f235213d = "SHA-256";

    /* renamed from: e */
    private static final byte[] f235214e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    private C80347kr() {
    }

    /* renamed from: a */
    public static String m97860a(String str) {
        MessageDigest instance = MessageDigest.getInstance(f235213d);
        byte[] bytes = str.getBytes("UTF-8");
        instance.update(bytes, 0, bytes.length);
        return Base64.encodeToString(instance.digest(), 2);
    }

    /* renamed from: b */
    private static String m97864b(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str, 2), "AES");
            byte[] decode = Base64.decode(str2, 2);
            byte[] bArr = f235214e;
            Cipher instance = Cipher.getInstance(f235211b);
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr));
            return new String(instance.doFinal(decode), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new GeneralSecurityException(e);
        }
    }

    /* renamed from: a */
    public static String m97861a(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str, 2), "AES");
            byte[] bArr = f235214e;
            byte[] bytes = str2.getBytes("UTF-8");
            Cipher instance = Cipher.getInstance(f235211b);
            instance.init(1, secretKeySpec, new IvParameterSpec(bArr));
            return Base64.encodeToString(instance.doFinal(bytes), 2);
        } catch (UnsupportedEncodingException e) {
            throw new GeneralSecurityException(e);
        }
    }

    /* renamed from: b */
    private static byte[] m97865b(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) {
        Cipher instance = Cipher.getInstance(f235211b);
        instance.init(2, secretKeySpec, new IvParameterSpec(bArr));
        return instance.doFinal(bArr2);
    }

    /* renamed from: a */
    private static byte[] m97863a(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) {
        Cipher instance = Cipher.getInstance(f235211b);
        instance.init(1, secretKeySpec, new IvParameterSpec(bArr));
        return instance.doFinal(bArr2);
    }

    /* renamed from: a */
    private static String m97862a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & ExifInterface.MARKER;
            int i2 = i * 2;
            cArr2[i2] = cArr[b >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }
}
