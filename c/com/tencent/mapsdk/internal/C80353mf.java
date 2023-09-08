package com.tencent.mapsdk.internal;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.tencent.mapsdk.internal.mf */
public final class C80353mf implements C0953mg {

    /* renamed from: g */
    private static final String f235225g = "UTF-16LE";

    /* renamed from: h */
    private ByteArrayOutputStream f235226h = new ByteArrayOutputStream();

    /* renamed from: a */
    private void m97897a(byte b) {
        this.f235226h.write(b);
    }

    /* renamed from: b */
    private static byte[] m97910b(long j) {
        return new byte[]{(byte) ((int) j), (byte) ((int) (j >> 8)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 32)), (byte) ((int) (j >> 40)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 56))};
    }

    /* renamed from: b */
    private static byte[] m97911b(String str) {
        if (str != null) {
            try {
                return str.getBytes(f235225g);
            } catch (Exception unused) {
            }
        }
        return new byte[0];
    }

    /* renamed from: c */
    private void m97913c(byte[] bArr) {
        this.f235226h.write(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    private static boolean m97914d(byte[] bArr) {
        return bArr[0] > 0;
    }

    /* renamed from: d */
    private static byte[] m97915d(int i) {
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    /* renamed from: e */
    private static long m97916e(byte[] bArr) {
        return ((long) (bArr[0] & ExifInterface.MARKER)) | (((long) (bArr[1] & ExifInterface.MARKER)) << 8) | (((long) (bArr[2] & ExifInterface.MARKER)) << 16) | (((long) (bArr[3] & ExifInterface.MARKER)) << 24) | (((long) (bArr[4] & ExifInterface.MARKER)) << 32) | (((long) (bArr[5] & ExifInterface.MARKER)) << 40) | (((long) (bArr[6] & ExifInterface.MARKER)) << 48) | (((long) (bArr[7] & ExifInterface.MARKER)) << 56);
    }

    /* renamed from: f */
    private static float m97917f(byte[] bArr) {
        return Float.intBitsToFloat(m97895a(bArr));
    }

    /* renamed from: g */
    private static double m97918g(byte[] bArr) {
        return Double.longBitsToDouble(((long) (bArr[0] & ExifInterface.MARKER)) | (((long) (bArr[1] & ExifInterface.MARKER)) << 8) | (((long) (bArr[2] & ExifInterface.MARKER)) << 16) | (((long) (bArr[3] & ExifInterface.MARKER)) << 24) | (((long) (bArr[4] & ExifInterface.MARKER)) << 32) | (((long) (bArr[5] & ExifInterface.MARKER)) << 40) | (((long) (bArr[6] & ExifInterface.MARKER)) << 48) | (((long) (bArr[7] & ExifInterface.MARKER)) << 56));
    }

    /* renamed from: a */
    private void m97904a(boolean z) {
        m97897a(z ? (byte) 1 : 0);
    }

    /* renamed from: b */
    public static String m97908b(byte[] bArr) {
        try {
            return new String(bArr, f235225g).trim();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private void m97912c(int i) {
        m97901a((long) i, 4);
    }

    /* renamed from: a */
    private void m97899a(int i) {
        m97901a((long) i, 2);
    }

    /* renamed from: b */
    private static byte[] m97909b(int i) {
        byte[] bArr = new byte[4];
        long j = (long) i;
        for (int i2 = 3; i2 >= 0; i2--) {
            bArr[(4 - i2) - 1] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        return bArr;
    }

    /* renamed from: a */
    private void m97898a(char c) {
        for (int i = 0; i < 2; i++) {
            m97897a((byte) ((c >> (i * 8)) & 255));
        }
    }

    /* renamed from: a */
    private static void m97902a(long j, byte[] bArr) {
        for (int i = 3; i >= 0; i--) {
            bArr[(4 - i) - 1] = (byte) ((int) ((j >> (i * 8)) & 255));
        }
    }

    /* renamed from: a */
    private void m97900a(long j) {
        m97901a(j, 8);
    }

    /* renamed from: a */
    private void m97903a(String str) {
        if (str != null) {
            byte[] bytes = str.getBytes();
            m97901a((long) bytes.length, 2);
            this.f235226h.write(bytes, 0, bytes.length);
        }
    }

    /* renamed from: a */
    private byte[] m97905a() {
        byte[] bArr = null;
        try {
            this.f235226h.close();
            byte[] byteArray = this.f235226h.toByteArray();
            try {
                this.f235226h = null;
                return byteArray;
            } catch (IOException unused) {
                bArr = byteArray;
            }
        } catch (IOException unused2) {
            return bArr;
        }
    }

    /* renamed from: a */
    private void m97901a(long j, int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            m97897a((byte) ((int) ((j >> (i2 * 8)) & 255)));
        }
    }

    /* renamed from: a */
    public static int m97895a(byte[] bArr) {
        return ((bArr[3] << 24) & -16777216) | (bArr[0] & ExifInterface.MARKER) | ((bArr[1] << 8) & 65280) | ((bArr[2] << v2encoder.enumCODEC_vcodec2) & 16711680);
    }

    /* renamed from: a */
    private static byte[] m97907a(float f) {
        int floatToIntBits = Float.floatToIntBits(f);
        return new byte[]{(byte) floatToIntBits, (byte) (floatToIntBits >> 8), (byte) (floatToIntBits >> 16), (byte) (floatToIntBits >> 24)};
    }

    /* renamed from: a */
    private static byte[] m97906a(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return new byte[]{(byte) ((int) doubleToLongBits), (byte) ((int) (doubleToLongBits >> 8)), (byte) ((int) (doubleToLongBits >> 16)), (byte) ((int) (doubleToLongBits >> 24)), (byte) ((int) (doubleToLongBits >> 32)), (byte) ((int) (doubleToLongBits >> 40)), (byte) ((int) (doubleToLongBits >> 48)), (byte) ((int) (doubleToLongBits >> 56))};
    }

    /* renamed from: a */
    public static String m97896a(byte[] bArr, String str) {
        try {
            return new String(bArr, str).trim();
        } catch (Exception unused) {
            return null;
        }
    }
}
