package p560i2;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: i2.i */
public final class C108328i {

    /* renamed from: b */
    public static final long f324350b;

    /* renamed from: c */
    public static final long f324351c = C108326g.m146737b(Float.NaN, Float.NaN);

    /* renamed from: d */
    public static final /* synthetic */ int f324352d = 0;

    /* renamed from: a */
    public final long f324353a;

    static {
        float f = (float) 0;
        f324350b = C108326g.m146737b(f, f);
    }

    public /* synthetic */ C108328i(long j) {
        this.f324353a = j;
    }

    /* renamed from: a */
    public static final float m146740a(long j) {
        if (j != f324351c) {
            return Float.intBitsToFloat((int) (j & Util.MAX_32BIT_VALUE));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* renamed from: b */
    public static final float m146741b(long j) {
        if (j != f324351c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* renamed from: c */
    public static String m146742c(long j) {
        if (!(j != f324351c)) {
            return "DpSize.Unspecified";
        }
        return C108325f.m146735b(m146741b(j)) + " x " + C108325f.m146735b(m146740a(j));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C108328i) && this.f324353a == ((C108328i) obj).f324353a;
    }

    public int hashCode() {
        long j = this.f324353a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return m146742c(this.f324353a);
    }
}
