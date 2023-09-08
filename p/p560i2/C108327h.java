package p560i2;

import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: i2.h */
public final class C108327h {

    /* renamed from: b */
    public static final long f324347b = C108326g.m146736a(Float.NaN, Float.NaN);

    /* renamed from: c */
    public static final /* synthetic */ int f324348c = 0;

    /* renamed from: a */
    public final long f324349a;

    static {
        float f = (float) 0;
        C108326g.m146736a(f, f);
    }

    public /* synthetic */ C108327h(long j) {
        this.f324349a = j;
    }

    /* renamed from: a */
    public static final float m146738a(long j) {
        if (j != f324347b) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    /* renamed from: b */
    public static final float m146739b(long j) {
        if (j != f324347b) {
            return Float.intBitsToFloat((int) (j & Util.MAX_32BIT_VALUE));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    public boolean equals(Object obj) {
        return (obj instanceof C108327h) && this.f324349a == ((C108327h) obj).f324349a;
    }

    public int hashCode() {
        long j = this.f324349a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        long j = this.f324349a;
        if (!(j != f324347b)) {
            return "DpOffset.Unspecified";
        }
        return '(' + C108325f.m146735b(m146738a(j)) + ", " + C108325f.m146735b(m146739b(j)) + ')';
    }
}
