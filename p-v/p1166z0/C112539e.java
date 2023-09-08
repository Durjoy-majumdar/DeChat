package p1166z0;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: z0.e */
public final class C112539e {

    /* renamed from: b */
    public static final long f336955b = C112540f.m153745a(0.0f, 0.0f);

    /* renamed from: c */
    public static final long f336956c = C112540f.m153745a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d */
    public static final long f336957d = C112540f.m153745a(Float.NaN, Float.NaN);

    /* renamed from: e */
    public static final /* synthetic */ int f336958e = 0;

    /* renamed from: a */
    public final long f336959a;

    public /* synthetic */ C112539e(long j) {
        this.f336959a = j;
    }

    /* renamed from: a */
    public static final boolean m153736a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final float m153737b(long j) {
        return (float) Math.sqrt((double) ((m153738c(j) * m153738c(j)) + (m153739d(j) * m153739d(j))));
    }

    /* renamed from: c */
    public static final float m153738c(long j) {
        if (j != f336957d) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: d */
    public static final float m153739d(long j) {
        if (j != f336957d) {
            return Float.intBitsToFloat((int) (j & Util.MAX_32BIT_VALUE));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: e */
    public static int m153740e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: f */
    public static final long m153741f(long j, long j2) {
        return C112540f.m153745a(m153738c(j) - m153738c(j2), m153739d(j) - m153739d(j2));
    }

    /* renamed from: g */
    public static final long m153742g(long j, long j2) {
        return C112540f.m153745a(m153738c(j) + m153738c(j2), m153739d(j) + m153739d(j2));
    }

    /* renamed from: h */
    public static final long m153743h(long j, float f) {
        return C112540f.m153745a(m153738c(j) * f, m153739d(j) * f);
    }

    /* renamed from: i */
    public static String m153744i(long j) {
        if (!C112540f.m153747c(j)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + C112537c.m153733a(m153738c(j), 1) + ", " + C112537c.m153733a(m153739d(j), 1) + ')';
    }

    public boolean equals(Object obj) {
        return (obj instanceof C112539e) && this.f336959a == ((C112539e) obj).f336959a;
    }

    public int hashCode() {
        return m153740e(this.f336959a);
    }

    public String toString() {
        return m153744i(this.f336959a);
    }
}
