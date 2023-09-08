package p560i2;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: i2.q */
public final class C33185q {
    /* renamed from: a */
    public static final long m39973a(double d) {
        return m39976d(4294967296L, (float) d);
    }

    /* renamed from: b */
    public static final long m39974b(int i) {
        return m39976d(4294967296L, (float) i);
    }

    /* renamed from: c */
    public static final boolean m39975c(long j) {
        C33186r[] rVarArr = C33184p.f90061b;
        return (j & 1095216660480L) == 0;
    }

    /* renamed from: d */
    public static final long m39976d(long j, float f) {
        long floatToIntBits = j | (((long) Float.floatToIntBits(f)) & Util.MAX_32BIT_VALUE);
        C33186r[] rVarArr = C33184p.f90061b;
        return floatToIntBits;
    }
}
