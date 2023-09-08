package p450b1;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: b1.b */
public final class C103978b {

    /* renamed from: a */
    public static final long f307530a;

    /* renamed from: b */
    public static final long f307531b;

    /* renamed from: c */
    public static final long f307532c;

    /* renamed from: d */
    public static final long f307533d;

    /* renamed from: e */
    public static final /* synthetic */ int f307534e = 0;

    static {
        long j = (long) 3;
        long j2 = j << 32;
        f307530a = (((long) 0) & Util.MAX_32BIT_VALUE) | j2;
        f307531b = (((long) 1) & Util.MAX_32BIT_VALUE) | j2;
        f307532c = j2 | (((long) 2) & Util.MAX_32BIT_VALUE);
        f307533d = (j & Util.MAX_32BIT_VALUE) | (((long) 4) << 32);
    }

    /* renamed from: a */
    public static final boolean m138706a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static String m138707b(long j) {
        return m138706a(j, f307530a) ? "Rgb" : m138706a(j, f307531b) ? "Xyz" : m138706a(j, f307532c) ? "Lab" : m138706a(j, f307533d) ? "Cmyk" : "Unknown";
    }
}
