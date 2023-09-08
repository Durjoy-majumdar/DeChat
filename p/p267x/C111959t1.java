package p267x;

import gy3.C8480h;
import p560i2.C108325f;
import p560i2.C108328i;

/* renamed from: x.t1 */
public final class C111959t1 {

    /* renamed from: g */
    public static final C111959t1 f335172g;

    /* renamed from: h */
    public static final C111959t1 f335173h;

    /* renamed from: a */
    public final boolean f335174a;

    /* renamed from: b */
    public final long f335175b;

    /* renamed from: c */
    public final float f335176c;

    /* renamed from: d */
    public final float f335177d;

    /* renamed from: e */
    public final boolean f335178e;

    /* renamed from: f */
    public final boolean f335179f;

    static {
        long j = C108328i.f324351c;
        f335172g = new C111959t1(false, j, Float.NaN, Float.NaN, true, false, (C8480h) null);
        f335173h = new C111959t1(true, j, Float.NaN, Float.NaN, true, false, (C8480h) null);
    }

    public C111959t1(boolean z, long j, float f, float f2, boolean z2, boolean z3, C8480h hVar) {
        this.f335174a = z;
        this.f335175b = j;
        this.f335176c = f;
        this.f335177d = f2;
        this.f335178e = z2;
        this.f335179f = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111959t1)) {
            return false;
        }
        C111959t1 t1Var = (C111959t1) obj;
        if (this.f335174a != t1Var.f335174a) {
            return false;
        }
        return ((this.f335175b > t1Var.f335175b ? 1 : (this.f335175b == t1Var.f335175b ? 0 : -1)) == 0) && C108325f.m146734a(this.f335176c, t1Var.f335176c) && C108325f.m146734a(this.f335177d, t1Var.f335177d) && this.f335178e == t1Var.f335178e && this.f335179f == t1Var.f335179f;
    }

    public int hashCode() {
        int i = 1237;
        int i2 = this.f335174a ? 1231 : 1237;
        long j = this.f335175b;
        int floatToIntBits = ((((((((i2 * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f335176c)) * 31) + Float.floatToIntBits(this.f335177d)) * 31) + (this.f335178e ? 1231 : 1237)) * 31;
        if (this.f335179f) {
            i = 1231;
        }
        return floatToIntBits + i;
    }

    public String toString() {
        if (this.f335174a) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + C108328i.m146742c(this.f335175b) + ", cornerRadius=" + C108325f.m146735b(this.f335176c) + ", elevation=" + C108325f.m146735b(this.f335177d) + ", clippingEnabled=" + this.f335178e + ", fishEyeEnabled=" + this.f335179f + ')';
    }
}
