package p463c0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p1140p1.C110096b;
import p1140p1.C110099e;
import p631o1.C109847j0;
import p631o1.C109857o;
import p721v0.C65503j;

/* renamed from: c0.b */
public abstract class C104190b implements C110096b, C109847j0 {

    /* renamed from: d */
    public final C104192d f308454d;

    /* renamed from: e */
    public C104192d f308455e;

    /* renamed from: f */
    public C109857o f308456f;

    public C104190b(C104192d dVar) {
        C87412m.m108594g(dVar, "defaultParent");
        this.f308454d = dVar;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: U */
    public void mo145808U(C110099e eVar) {
        C87412m.m108594g(eVar, "scope");
        this.f308455e = (C104192d) eVar.mo161499a(C104191c.f308457a);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
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

    /* renamed from: y */
    public void mo145809y(C109857o oVar) {
        C87412m.m108594g(oVar, "coordinates");
        this.f308456f = oVar;
    }
}
