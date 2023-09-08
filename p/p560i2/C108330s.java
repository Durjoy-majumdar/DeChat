package p560i2;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: i2.s */
public final class C108330s {

    /* renamed from: b */
    public static final long f324354b = C108331t.m146750a(0.0f, 0.0f);

    /* renamed from: c */
    public static final /* synthetic */ int f324355c = 0;

    /* renamed from: a */
    public final long f324356a;

    public /* synthetic */ C108330s(long j) {
        this.f324356a = j;
    }

    /* renamed from: a */
    public static long m146745a(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m146746b(j);
        }
        if ((i & 2) != 0) {
            f2 = m146747c(j);
        }
        return C108331t.m146750a(f, f2);
    }

    /* renamed from: b */
    public static final float m146746b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: c */
    public static final float m146747c(long j) {
        return Float.intBitsToFloat((int) (j & Util.MAX_32BIT_VALUE));
    }

    /* renamed from: d */
    public static final long m146748d(long j, long j2) {
        return C108331t.m146750a(m146746b(j) - m146746b(j2), m146747c(j) - m146747c(j2));
    }

    /* renamed from: e */
    public static final long m146749e(long j, long j2) {
        return C108331t.m146750a(m146746b(j) + m146746b(j2), m146747c(j) + m146747c(j2));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C108330s) && this.f324356a == ((C108330s) obj).f324356a;
    }

    public int hashCode() {
        long j = this.f324356a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        long j = this.f324356a;
        return '(' + m146746b(j) + ", " + m146747c(j) + ") px/sec";
    }
}
