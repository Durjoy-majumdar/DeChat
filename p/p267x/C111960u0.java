package p267x;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p1140p1.C110096b;
import p1140p1.C110099e;
import p631o1.C109857o;
import p631o1.C61917g0;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: x.u0 */
public final class C111960u0 implements C110096b, C61917g0 {

    /* renamed from: d */
    public C32226l<? super C109857o, C13598b0> f335180d;

    /* renamed from: e */
    public C109857o f335181e;

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: U */
    public void mo145808U(C110099e eVar) {
        C32226l<? super C109857o, C13598b0> lVar;
        C87412m.m108594g(eVar, "scope");
        C32226l<? super C109857o, C13598b0> lVar2 = (C32226l) eVar.mo161499a(C111957s0.f335170a);
        if (lVar2 == null && (lVar = this.f335180d) != null) {
            lVar.invoke(null);
        }
        this.f335180d = lVar2;
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: a0 */
    public void mo86834a0(C109857o oVar) {
        C32226l<? super C109857o, C13598b0> lVar;
        C87412m.m108594g(oVar, "coordinates");
        this.f335181e = oVar;
        if (oVar.mo161183y()) {
            C109857o oVar2 = this.f335181e;
            if (oVar2 != null && oVar2.mo161183y() && (lVar = this.f335180d) != null) {
                lVar.invoke(this.f335181e);
                return;
            }
            return;
        }
        C32226l<? super C109857o, C13598b0> lVar2 = this.f335180d;
        if (lVar2 != null) {
            lVar2.invoke(null);
        }
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }
}
