package p604m1;

import gy3.C8480h;
import gy3.C87412m;
import p1166z0.C112539e;

/* renamed from: m1.e */
public final class C109463e {

    /* renamed from: e */
    public static final C109463e f327629e;

    /* renamed from: a */
    public final long f327630a;

    /* renamed from: b */
    public final float f327631b;

    /* renamed from: c */
    public final long f327632c;

    /* renamed from: d */
    public final long f327633d;

    static {
        long j = C112539e.f336955b;
        f327629e = new C109463e(j, 1.0f, 0, j, (C8480h) null);
    }

    public C109463e(long j, float f, long j2, long j3, C8480h hVar) {
        this.f327630a = j;
        this.f327631b = f;
        this.f327632c = j2;
        this.f327633d = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C109463e)) {
            return false;
        }
        C109463e eVar = (C109463e) obj;
        return C112539e.m153736a(this.f327630a, eVar.f327630a) && C87412m.m108589b(Float.valueOf(this.f327631b), Float.valueOf(eVar.f327631b)) && this.f327632c == eVar.f327632c && C112539e.m153736a(this.f327633d, eVar.f327633d);
    }

    public int hashCode() {
        long j = this.f327632c;
        return (((((C112539e.m153740e(this.f327630a) * 31) + Float.floatToIntBits(this.f327631b)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + C112539e.m153740e(this.f327633d);
    }

    public String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + C112539e.m153744i(this.f327630a) + ", confidence=" + this.f327631b + ", durationMillis=" + this.f327632c + ", offset=" + C112539e.m153744i(this.f327633d) + ')';
    }
}
