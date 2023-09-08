package p560i2;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: i2.p */
public final class C33184p {

    /* renamed from: b */
    public static final C33186r[] f90061b = {new C33186r(0), new C33186r(4294967296L), new C33186r(8589934592L)};

    /* renamed from: c */
    public static final long f90062c = C33185q.m39976d(0, Float.NaN);

    /* renamed from: a */
    public final long f90063a;

    public /* synthetic */ C33184p(long j) {
        this.f90063a = j;
    }

    /* renamed from: a */
    public static final boolean m39968a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final long m39969b(long j) {
        return f90061b[(int) ((j & 1095216660480L) >>> 32)].f90064a;
    }

    /* renamed from: c */
    public static final float m39970c(long j) {
        return Float.intBitsToFloat((int) (j & Util.MAX_32BIT_VALUE));
    }

    /* renamed from: d */
    public static int m39971d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: e */
    public static String m39972e(long j) {
        long b = m39969b(j);
        if (C33186r.m39977a(b, 0)) {
            return "Unspecified";
        }
        if (C33186r.m39977a(b, 4294967296L)) {
            return m39970c(j) + ".sp";
        } else if (!C33186r.m39977a(b, 8589934592L)) {
            return "Invalid";
        } else {
            return m39970c(j) + ".em";
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C33184p) && this.f90063a == ((C33184p) obj).f90063a;
    }

    public int hashCode() {
        return m39971d(this.f90063a);
    }

    public String toString() {
        return m39972e(this.f90063a);
    }
}
