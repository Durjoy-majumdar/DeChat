package gi1;

import gy3.C87412m;

/* renamed from: gi1.e */
public final class C32459e {

    /* renamed from: a */
    public final float f86246a;

    /* renamed from: b */
    public final float f86247b;

    /* renamed from: c */
    public final float f86248c;

    /* renamed from: d */
    public final float f86249d;

    public C32459e(float f, float f2, float f3, float f4) {
        this.f86246a = f;
        this.f86247b = f2;
        this.f86248c = f3;
        this.f86249d = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32459e)) {
            return false;
        }
        C32459e eVar = (C32459e) obj;
        return C87412m.m108589b(Float.valueOf(this.f86246a), Float.valueOf(eVar.f86246a)) && C87412m.m108589b(Float.valueOf(this.f86247b), Float.valueOf(eVar.f86247b)) && C87412m.m108589b(Float.valueOf(this.f86248c), Float.valueOf(eVar.f86248c)) && C87412m.m108589b(Float.valueOf(this.f86249d), Float.valueOf(eVar.f86249d));
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f86246a) * 31) + Float.floatToIntBits(this.f86247b)) * 31) + Float.floatToIntBits(this.f86248c)) * 31) + Float.floatToIntBits(this.f86249d);
    }

    public String toString() {
        return "MicHoleInfo(xRatio=" + this.f86246a + ", yRatio=" + this.f86247b + ", wRatio=" + this.f86248c + ", hRatio=" + this.f86249d + ')';
    }
}
