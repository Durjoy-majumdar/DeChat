package ru3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: ru3.c */
public final class C26118c {
    /* renamed from: a */
    public static <T extends Comparable<T>> int m33543a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        for (int i = 0; i < length; i++) {
            int compareTo = tArr[i].compareTo(tArr2[i]);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int m33544b(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int length2 = iArr2.length;
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        for (int i = 0; i < length; i++) {
            int c = m33545c(iArr[i], iArr2[i]);
            if (c != 0) {
                return c;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static int m33545c(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return i < i2 ? -1 : 1;
    }

    /* renamed from: d */
    public static int m33546d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            int i2 = b == b2 ? 0 : (b & ExifInterface.MARKER) < (b2 & ExifInterface.MARKER) ? -1 : 1;
            if (i2 != 0) {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static int m33547e(short[] sArr, short[] sArr2) {
        int length = sArr.length;
        int length2 = sArr2.length;
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        for (int i = 0; i < length; i++) {
            short s = sArr[i];
            short s2 = sArr2[i];
            int i2 = s == s2 ? 0 : (s & 65535) < (s2 & 65535) ? -1 : 1;
            if (i2 != 0) {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static int m33548f(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return (((long) i) & Util.MAX_32BIT_VALUE) < (((long) i2) & Util.MAX_32BIT_VALUE) ? -1 : 1;
    }
}
