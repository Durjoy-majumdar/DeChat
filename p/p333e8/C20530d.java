package p333e8;

import android.util.Pair;

/* renamed from: e8.d */
public final class C20530d {

    /* renamed from: a */
    public static final byte[] f57774a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final int[] f57775b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    public static final int[] f57776c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static int m22242a(C20540l lVar) {
        int d = lVar.mo32087d(4);
        if (d == 15) {
            return lVar.mo32087d(24);
        }
        C20528a.m22237a(d < 13);
        return f57775b[d];
    }

    /* renamed from: b */
    public static Pair<Integer, Integer> m22243b(byte[] bArr) {
        C20540l lVar = new C20540l(bArr, bArr.length);
        int d = lVar.mo32087d(5);
        if (d == 31) {
            d = lVar.mo32087d(6) + 32;
        }
        int a = m22242a(lVar);
        int d2 = lVar.mo32087d(4);
        if (d == 5 || d == 29) {
            a = m22242a(lVar);
            int d3 = lVar.mo32087d(5);
            if (d3 == 31) {
                d3 = lVar.mo32087d(6) + 32;
            }
            if (d3 == 22) {
                d2 = lVar.mo32087d(4);
            }
        }
        int i = f57776c[d2];
        C20528a.m22237a(i != -1);
        return Pair.create(Integer.valueOf(a), Integer.valueOf(i));
    }
}
