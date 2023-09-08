package com.tenpay.ndk;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

public class Encrypt {
    private static final String CHARSET = "UTF-8";
    private byte[] dec_buf;
    private byte[] enc_buf;
    private byte[] enc_passwd;
    private byte[] key_buf;
    private byte[] raw_buf;
    private byte[] raw_passwd;
    private String server_time_stamp = "0";
    private int time_stamp;

    public static native byte[] aesDecryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] aesEncryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private native boolean decrypt(byte[] bArr, byte[] bArr2);

    private native boolean encrypt(byte[] bArr, byte[] bArr2);

    private native boolean encryptPasswdWithRSA(byte b, byte[] bArr, int i);

    private native boolean encryptVerifyCode(byte[] bArr);

    private native byte[] encryptWithRSA(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    private native byte[] getRandom();

    private static byte[] hexToBytes(String str) {
        if (TextUtils.isEmpty(str) || str.length() % 2 != 0) {
            return null;
        }
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public String desedeDecode(String str, String str2) {
        if (str == null || str2 == null || str.length() <= 0) {
            return null;
        }
        try {
            this.raw_buf = str.getBytes("UTF-8");
            byte[] bytes = str2.getBytes("UTF-8");
            this.key_buf = bytes;
            decrypt(bytes, this.raw_buf);
            byte[] bArr = this.dec_buf;
            if (bArr == null) {
                return null;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    public String desedeEncode(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            this.raw_buf = bytes;
            encrypt((byte[]) null, bytes);
            byte[] bArr = this.enc_buf;
            if (bArr == null) {
                return null;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    public String desedeVerifyCode(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            this.raw_buf = bytes;
            encryptVerifyCode(bytes);
            byte[] bArr = this.enc_buf;
            if (bArr == null) {
                return null;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    public String encryptPasswd(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            this.raw_passwd = bytes;
            encryptPasswdWithRSA((byte) 2, bytes, 0);
            byte[] bArr = this.enc_passwd;
            if (bArr == null) {
                return null;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (encryptPasswdWithRSA((byte) 2, r5, 1) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String encryptPasswdWithRSA2048(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0042
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x0042
            r4.raw_passwd = r0
            r4.enc_passwd = r0
            int r1 = r5.length()
            java.lang.String r2 = "UTF-8"
            if (r1 <= 0) goto L_0x0024
            byte[] r5 = r5.getBytes(r2)     // Catch:{ Exception -> 0x0023 }
            r4.raw_passwd = r5     // Catch:{ Exception -> 0x0023 }
            r1 = 2
            r3 = 1
            boolean r5 = r4.encryptPasswdWithRSA(r1, r5, r3)
            if (r5 != 0) goto L_0x0024
        L_0x0023:
            return r0
        L_0x0024:
            byte[] r5 = r4.enc_passwd
            if (r5 != 0) goto L_0x0029
            return r0
        L_0x0029:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0042 }
            r5.<init>()     // Catch:{ Exception -> 0x0042 }
            java.lang.String r1 = "V01_"
            r5.append(r1)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x0042 }
            byte[] r3 = r4.enc_passwd     // Catch:{ Exception -> 0x0042 }
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x0042 }
            r5.append(r1)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.ndk.Encrypt.encryptPasswdWithRSA2048(java.lang.String):java.lang.String");
    }

    public String encryptWithRSA1024(String str, String str2, String str3) {
        byte[] encryptWithRSA;
        if (!TextUtils.isEmpty(str) && (encryptWithRSA = encryptWithRSA(str.getBytes(), hexToBytes(str2), hexToBytes(str3), 0)) != null) {
            return Base64.encodeToString(encryptWithRSA, 0);
        }
        return null;
    }

    public String encryptWithRSA2048(String str, String str2, String str3) {
        byte[] encryptWithRSA;
        if (!TextUtils.isEmpty(str) && (encryptWithRSA = encryptWithRSA(str.getBytes(), hexToBytes(str2), hexToBytes(str3), 1)) != null) {
            return Base64.encodeToString(encryptWithRSA, 0);
        }
        return null;
    }

    public String getPasswdTimeStamp() {
        return String.valueOf(this.time_stamp);
    }

    public String getRandomKey() {
        byte[] random = getRandom();
        if (random != null) {
            try {
                return new String(random, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return null;
    }

    public void setTimeStamp(String str) {
        this.server_time_stamp = str;
    }

    public native byte[] sm4DecryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] sm4EncryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public String desedeEncode(String str, String str2) {
        if (str == null || str2 == null || str.length() <= 0) {
            return null;
        }
        try {
            this.raw_buf = str.getBytes("UTF-8");
            byte[] bytes = str2.getBytes("UTF-8");
            this.key_buf = bytes;
            encrypt(bytes, this.raw_buf);
            byte[] bArr = this.enc_buf;
            if (bArr == null) {
                return null;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
