package er1;

import gy3.C87412m;

/* renamed from: er1.y4 */
public final class C31686y4 {

    /* renamed from: a */
    public final float f84631a;

    /* renamed from: b */
    public final float f84632b;

    /* renamed from: c */
    public final float f84633c;

    public C31686y4(float f, float f2, float f3) {
        this.f84631a = f;
        this.f84632b = f2;
        this.f84633c = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31686y4)) {
            return false;
        }
        C31686y4 y4Var = (C31686y4) obj;
        return C87412m.m108589b(Float.valueOf(this.f84631a), Float.valueOf(y4Var.f84631a)) && C87412m.m108589b(Float.valueOf(this.f84632b), Float.valueOf(y4Var.f84632b)) && C87412m.m108589b(Float.valueOf(this.f84633c), Float.valueOf(y4Var.f84633c));
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f84631a) * 31) + Float.floatToIntBits(this.f84632b)) * 31) + Float.floatToIntBits(this.f84633c);
    }

    public String toString() {
        return "Alpha(source=" + this.f84631a + ", sourceA=" + this.f84632b + ", destA=" + this.f84633c + ')';
    }
}
