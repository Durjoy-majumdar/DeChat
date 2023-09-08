package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.vfs.C86009m1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.sdk.platformtools.MD5Util */
public class MD5Util {
    public static ThreadLocal<MessageDigest> TLS_digest = new ThreadLocal<MessageDigest>() {
        public MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Initialize MD5 failed.", e);
            }
        }
    };
    public static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static void appendHexPair(byte b, StringBuffer stringBuffer) {
        char[] cArr = hexDigits;
        char c = cArr[(b & 240) >> 4];
        char c2 = cArr[b & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    private static String bufferToHex(byte[] bArr) {
        return bufferToHex(bArr, 0, bArr.length);
    }

    public static boolean checkPassword(String str, String str2) {
        return getMD5String(str).equals(str2);
    }

    @Deprecated
    public static String getFileMD5String(C86009m1 m1Var) {
        return C90193h.m112873a(m1Var, 102400);
    }

    public static String getMD5String(String str) {
        return getMD5String(str.getBytes());
    }

    private static String bufferToHex(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            appendHexPair(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    public static String getMD5String(byte[] bArr) {
        return bufferToHex(TLS_digest.get().digest(bArr));
    }
}
