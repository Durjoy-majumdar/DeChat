package p720v;

import fy3.C32226l;
import gy3.C87412m;
import p257w.C37892b0;
import p560i2.C33177j;
import p560i2.C33181m;

/* renamed from: v.k0 */
public final class C37629k0 {

    /* renamed from: a */
    public final C32226l<C33181m, C33177j> f99768a;

    /* renamed from: b */
    public final C37892b0<C33177j> f99769b;

    public C37629k0(C32226l<? super C33181m, C33177j> lVar, C37892b0<C33177j> b0Var) {
        C87412m.m108594g(lVar, "slideOffset");
        C87412m.m108594g(b0Var, "animationSpec");
        this.f99768a = lVar;
        this.f99769b = b0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37629k0)) {
            return false;
        }
        C37629k0 k0Var = (C37629k0) obj;
        return C87412m.m108589b(this.f99768a, k0Var.f99768a) && C87412m.m108589b(this.f99769b, k0Var.f99769b);
    }

    public int hashCode() {
        return (this.f99768a.hashCode() * 31) + this.f99769b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f99768a + ", animationSpec=" + this.f99769b + ')';
    }
}
