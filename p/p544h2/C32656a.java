package p544h2;

import gy3.C87412m;

/* renamed from: h2.a */
public final class C32656a {

    /* renamed from: a */
    public final float f86666a;

    public /* synthetic */ C32656a(float f) {
        this.f86666a = f;
    }

    public boolean equals(Object obj) {
        float f = this.f86666a;
        if (!(obj instanceof C32656a)) {
            return false;
        }
        return C87412m.m108589b(Float.valueOf(f), Float.valueOf(((C32656a) obj).f86666a));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f86666a);
    }

    public String toString() {
        float f = this.f86666a;
        return "BaselineShift(multiplier=" + f + ')';
    }
}
