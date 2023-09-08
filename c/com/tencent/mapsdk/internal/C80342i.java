package com.tencent.mapsdk.internal;

import com.tencent.wxmm.v2encoder;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.mapsdk.internal.i */
public final class C80342i {

    /* renamed from: a */
    public static final byte[] f235202a = new byte[0];

    /* renamed from: b */
    private static final char[] f235203b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private static byte m97827a(char c) {
        int i;
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    return 0;
                }
            }
            i = (c - c2) + 10;
        } else {
            i = c - '0';
        }
        return (byte) i;
    }

    /* renamed from: a */
    private static String m97828a(byte b) {
        char[] cArr = new char[2];
        char[] cArr2 = f235203b;
        cArr[1] = cArr2[b & 15];
        cArr[0] = cArr2[((byte) (b >>> 4)) & 15];
        return new String(cArr);
    }

    /* renamed from: b */
    private static byte m97832b(String str) {
        if (str == null || str.length() != 1) {
            return 0;
        }
        return m97827a(str.charAt(0));
    }

    /* renamed from: a */
    private static String m97829a(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.flip();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        return m97830a(bArr);
    }

    /* renamed from: a */
    public static String m97830a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f235203b;
            cArr[i2 + 1] = cArr2[b & 15];
            cArr[i2 + 0] = cArr2[((byte) (b >>> 4)) & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static byte[] m97831a(String str) {
        if (str == null || str.equals("")) {
            return f235202a;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m97827a(str.charAt(i2)) * v2encoder.enumCODEC_vcodec2) + m97827a(str.charAt(i2 + 1)));
        }
        return bArr;
    }
}
