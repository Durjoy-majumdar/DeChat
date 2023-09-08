package p560i2;

import gy3.C87412m;
import p560i2.C108322d;

/* renamed from: i2.e */
public final class C108324e implements C108322d {

    /* renamed from: d */
    public final float f324344d;

    /* renamed from: e */
    public final float f324345e;

    public C108324e(float f, float f2) {
        this.f324344d = f;
        this.f324345e = f2;
    }

    /* renamed from: F */
    public long mo143031F(float f) {
        return C108322d.C108323a.m146725g(this, f);
    }

    /* renamed from: M */
    public int mo143032M(float f) {
        return C108322d.C108323a.m146719a(this, f);
    }

    /* renamed from: O */
    public float mo143033O(long j) {
        return C108322d.C108323a.m146722d(this, j);
    }

    /* renamed from: T */
    public float mo143034T(float f) {
        return f * getDensity();
    }

    /* renamed from: d0 */
    public float mo143035d0(float f) {
        return f / getDensity();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108324e)) {
            return false;
        }
        C108324e eVar = (C108324e) obj;
        return C87412m.m108589b(Float.valueOf(this.f324344d), Float.valueOf(eVar.f324344d)) && C87412m.m108589b(Float.valueOf(this.f324345e), Float.valueOf(eVar.f324345e));
    }

    /* renamed from: g0 */
    public long mo143036g0(long j) {
        return C108322d.C108323a.m146724f(this, j);
    }

    public float getDensity() {
        return this.f324344d;
    }

    public float getFontScale() {
        return this.f324345e;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f324344d) * 31) + Float.floatToIntBits(this.f324345e);
    }

    /* renamed from: m */
    public float mo143039m(int i) {
        return ((float) i) / getDensity();
    }

    /* renamed from: q */
    public long mo143040q(long j) {
        return C108322d.C108323a.m146721c(this, j);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f324344d + ", fontScale=" + this.f324345e + ')';
    }
}
