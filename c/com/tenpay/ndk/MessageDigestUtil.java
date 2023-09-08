package com.tenpay.ndk;

import androidx.exifinterface.media.ExifInterface;

public class MessageDigestUtil {
    public static String bytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString.toUpperCase());
        }
        return sb.toString();
    }

    private native byte[] doSHA256(byte[] bArr);

    public String getSHA256Hex(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            byte[] doSHA256 = doSHA256(bArr);
            if (doSHA256 != null) {
                return bytesToHex(doSHA256);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
