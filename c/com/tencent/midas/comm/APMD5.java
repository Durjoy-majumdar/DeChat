package com.tencent.midas.comm;

import androidx.exifinterface.media.ExifInterface;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class APMD5 {
    public static String parseByte2HexStr(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    public static String toMd5(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bArr);
            return parseByte2HexStr(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
