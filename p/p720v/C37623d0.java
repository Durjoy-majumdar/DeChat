package p720v;

import gy3.C87412m;
import p257w.C37892b0;

/* renamed from: v.d0 */
public final class C37623d0 {

    /* renamed from: a */
    public final float f99753a;

    /* renamed from: b */
    public final C37892b0<Float> f99754b;

    public C37623d0(float f, C37892b0<Float> b0Var) {
        C87412m.m108594g(b0Var, "animationSpec");
        this.f99753a = f;
        this.f99754b = b0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37623d0)) {
            return false;
        }
        C37623d0 d0Var = (C37623d0) obj;
        return C87412m.m108589b(Float.valueOf(this.f99753a), Float.valueOf(d0Var.f99753a)) && C87412m.m108589b(this.f99754b, d0Var.f99754b);
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f99753a) * 31) + this.f99754b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f99753a + ", animationSpec=" + this.f99754b + ')';
    }
}
