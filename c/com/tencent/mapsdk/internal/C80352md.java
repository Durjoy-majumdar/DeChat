package com.tencent.mapsdk.internal;

import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;

/* renamed from: com.tencent.mapsdk.internal.md */
public final class C80352md implements C0953mg {
    /* renamed from: a */
    private static byte m97886a(InputStream inputStream) {
        return (byte) inputStream.read();
    }

    /* renamed from: b */
    private static boolean m97889b(InputStream inputStream) {
        return ((byte) inputStream.read()) != 0;
    }

    /* renamed from: c */
    private static int m97890c(InputStream inputStream) {
        return (int) m97887a(2, inputStream);
    }

    /* renamed from: d */
    private static char m97891d(InputStream inputStream) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j |= (long) ((((byte) inputStream.read()) & ExifInterface.MARKER) << (i * 8));
        }
        return (char) ((int) j);
    }

    /* renamed from: e */
    private static int m97892e(InputStream inputStream) {
        return (int) m97887a(4, inputStream);
    }

    /* renamed from: f */
    private static long m97893f(InputStream inputStream) {
        return m97887a(8, inputStream);
    }

    /* renamed from: g */
    private static String m97894g(InputStream inputStream) {
        int a = (int) m97887a(2, inputStream);
        byte[] bArr = new byte[a];
        int i = 0;
        while (i < a) {
            i += inputStream.read(bArr, i, a - i);
        }
        return new String(bArr);
    }

    /* renamed from: a */
    private static byte[] m97888a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            i2 += inputStream.read(bArr, i2, i - i2);
        }
        return bArr;
    }

    /* renamed from: a */
    private static long m97887a(int i, InputStream inputStream) {
        long j = 0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            j |= ((long) (((byte) inputStream.read()) & ExifInterface.MARKER)) << (i2 * 8);
        }
        return j;
    }
}
