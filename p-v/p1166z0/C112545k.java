package p1166z0;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: z0.k */
public final class C112545k {

    /* renamed from: b */
    public static final long f336973b = C112546l.m153761a(0.0f, 0.0f);

    /* renamed from: c */
    public static final long f336974c = C112546l.m153761a(Float.NaN, Float.NaN);

    /* renamed from: d */
    public static final /* synthetic */ int f336975d = 0;

    /* renamed from: a */
    public final long f336976a;

    public /* synthetic */ C112545k(long j) {
        this.f336976a = j;
    }

    /* renamed from: a */
    public static final boolean m153755a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final float m153756b(long j) {
        if (j != f336974c) {
            return Float.intBitsToFloat((int) (j & Util.MAX_32BIT_VALUE));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: c */
    public static final float m153757c(long j) {
        return Math.min(Math.abs(m153758d(j)), Math.abs(m153756b(j)));
    }

    /* renamed from: d */
    public static final float m153758d(long j) {
        if (j != f336974c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: e */
    public static final boolean m153759e(long j) {
        return m153758d(j) <= 0.0f || m153756b(j) <= 0.0f;
    }

    /* renamed from: f */
    public static String m153760f(long j) {
        if (!(j != f336974c)) {
            return "Size.Unspecified";
        }
        return "Size(" + C112537c.m153733a(m153758d(j), 1) + ", " + C112537c.m153733a(m153756b(j), 1) + ')';
    }

    public boolean equals(Object obj) {
        return (obj instanceof C112545k) && this.f336976a == ((C112545k) obj).f336976a;
    }

    public int hashCode() {
        long j = this.f336976a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return m153760f(this.f336976a);
    }
}
