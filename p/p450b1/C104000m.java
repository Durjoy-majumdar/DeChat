package p450b1;

import gy3.C87412m;

/* renamed from: b1.m */
public final class C104000m {

    /* renamed from: a */
    public final float f307606a;

    /* renamed from: b */
    public final float f307607b;

    public C104000m(float f, float f2) {
        this.f307606a = f;
        this.f307607b = f2;
    }

    /* renamed from: a */
    public final float[] mo145596a() {
        float f = this.f307606a;
        float f2 = this.f307607b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104000m)) {
            return false;
        }
        C104000m mVar = (C104000m) obj;
        return C87412m.m108589b(Float.valueOf(this.f307606a), Float.valueOf(mVar.f307606a)) && C87412m.m108589b(Float.valueOf(this.f307607b), Float.valueOf(mVar.f307607b));
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f307606a) * 31) + Float.floatToIntBits(this.f307607b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f307606a + ", y=" + this.f307607b + ')';
    }
}
