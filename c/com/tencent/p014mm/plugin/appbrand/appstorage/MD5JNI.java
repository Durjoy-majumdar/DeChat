package com.tencent.p014mm.plugin.appbrand.appstorage;

import androidx.exifinterface.media.ExifInterface;
import java.nio.charset.StandardCharsets;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.MD5JNI */
public class MD5JNI {
    private static final byte[] HEX_ARRAY = "0123456789abcdef".getBytes(StandardCharsets.US_ASCII);

    public static String bytesToHexStringFast(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        byte[] bArr2 = new byte[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & ExifInterface.MARKER;
            int i2 = i * 2;
            byte[] bArr3 = HEX_ARRAY;
            bArr2[i2] = bArr3[b >>> 4];
            bArr2[i2 + 1] = bArr3[b & 15];
        }
        return new String(bArr2, StandardCharsets.UTF_8);
    }

    public static native int getMD5String(String str, String[] strArr);

    public static native int getMD5StringLegacy(String str, String[] strArr);

    public static String getMD5Wrap(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] strArr = new String[1];
        getMD5String(str, strArr);
        return strArr[0];
    }

    public static String getMD5WrapLegacy(String str) {
        String[] strArr = new String[1];
        getMD5StringLegacy(str, strArr);
        return strArr[0];
    }
}
