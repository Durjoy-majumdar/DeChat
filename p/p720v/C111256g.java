package p720v;

import fy3.C32226l;
import gy3.C87412m;
import p257w.C37892b0;
import p560i2.C33181m;
import p721v0.C111294a;

/* renamed from: v.g */
public final class C111256g {

    /* renamed from: a */
    public final C111294a f333136a;

    /* renamed from: b */
    public final C32226l<C33181m, C33181m> f333137b;

    /* renamed from: c */
    public final C37892b0<C33181m> f333138c;

    /* renamed from: d */
    public final boolean f333139d;

    public C111256g(C111294a aVar, C32226l<? super C33181m, C33181m> lVar, C37892b0<C33181m> b0Var, boolean z) {
        C87412m.m108594g(aVar, "alignment");
        C87412m.m108594g(lVar, "size");
        C87412m.m108594g(b0Var, "animationSpec");
        this.f333136a = aVar;
        this.f333137b = lVar;
        this.f333138c = b0Var;
        this.f333139d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111256g)) {
            return false;
        }
        C111256g gVar = (C111256g) obj;
        return C87412m.m108589b(this.f333136a, gVar.f333136a) && C87412m.m108589b(this.f333137b, gVar.f333137b) && C87412m.m108589b(this.f333138c, gVar.f333138c) && this.f333139d == gVar.f333139d;
    }

    public int hashCode() {
        int hashCode = ((((this.f333136a.hashCode() * 31) + this.f333137b.hashCode()) * 31) + this.f333138c.hashCode()) * 31;
        boolean z = this.f333139d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f333136a + ", size=" + this.f333137b + ", animationSpec=" + this.f333138c + ", clip=" + this.f333139d + ')';
    }
}
