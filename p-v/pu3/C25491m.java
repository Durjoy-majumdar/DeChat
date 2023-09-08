package pu3;

import androidx.exifinterface.media.ExifInterface;
import ru3.C26116a;
import ru3.C26117b;

/* renamed from: pu3.m */
public final class C25491m {
    /* renamed from: a */
    public static int m32904a(C26116a aVar, int i) {
        int i2 = 0;
        for (int i3 = i; i3 >= 0; i3--) {
            i2 = (i2 >>> 8) | ((aVar.readByte() & ExifInterface.MARKER) << 24);
        }
        return i2 >> ((3 - i) * 8);
    }

    /* renamed from: b */
    public static int m32905b(C26116a aVar, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            for (int i3 = i; i3 >= 0; i3--) {
                i2 = (i2 >>> 8) | ((aVar.readByte() & ExifInterface.MARKER) << 24);
            }
            return i2 >>> ((3 - i) * 8);
        }
        while (i >= 0) {
            i2 = ((aVar.readByte() & ExifInterface.MARKER) << 24) | (i2 >>> 8);
            i--;
        }
        return i2;
    }

    /* renamed from: c */
    public static void m32906c(C26117b bVar, int i, long j) {
        int numberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (numberOfTrailingZeros == 0) {
            numberOfTrailingZeros = 1;
        }
        int i2 = (numberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        bVar.mo52789o(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            bVar.mo52789o((byte) ((int) j2));
            j2 >>= 8;
            i2--;
        }
    }

    /* renamed from: d */
    public static void m32907d(C26117b bVar, int i, long j) {
        int numberOfLeadingZeros = ((65 - Long.numberOfLeadingZeros((j >> 63) ^ j)) + 7) >> 3;
        bVar.mo52789o(i | ((numberOfLeadingZeros - 1) << 5));
        while (numberOfLeadingZeros > 0) {
            bVar.mo52789o((byte) ((int) j));
            j >>= 8;
            numberOfLeadingZeros--;
        }
    }

    /* renamed from: e */
    public static void m32908e(C26117b bVar, int i, long j) {
        int numberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros == 0) {
            numberOfLeadingZeros = 1;
        }
        int i2 = (numberOfLeadingZeros + 7) >> 3;
        bVar.mo52789o(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            bVar.mo52789o((byte) ((int) j));
            j >>= 8;
            i2--;
        }
    }
}
