package p267x;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p1140p1.C110096b;
import p1140p1.C110098d;
import p1140p1.C110099e;
import p1140p1.C110100f;
import p631o1.C109857o;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: x.v0 */
public final class C111962v0 implements C110096b, C110098d<C32226l<? super C109857o, ? extends C13598b0>>, C32226l<C109857o, C13598b0> {

    /* renamed from: d */
    public final C32226l<C109857o, C13598b0> f335188d;

    /* renamed from: e */
    public C32226l<? super C109857o, C13598b0> f335189e;

    /* renamed from: f */
    public C109857o f335190f;

    public C111962v0(C32226l<? super C109857o, C13598b0> lVar) {
        C87412m.m108594g(lVar, "handler");
        this.f335188d = lVar;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: U */
    public void mo145808U(C110099e eVar) {
        C87412m.m108594g(eVar, "scope");
        C32226l<? super C109857o, C13598b0> lVar = (C32226l) eVar.mo161499a(C111957s0.f335170a);
        if (!C87412m.m108589b(lVar, this.f335189e)) {
            this.f335189e = lVar;
        }
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

    public C110100f<C32226l<C109857o, C13598b0>> getKey() {
        return C111957s0.f335170a;
    }

    public Object getValue() {
        return this;
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    public Object invoke(Object obj) {
        C109857o oVar = (C109857o) obj;
        this.f335190f = oVar;
        this.f335188d.invoke(oVar);
        C32226l<? super C109857o, C13598b0> lVar = this.f335189e;
        if (lVar != null) {
            lVar.invoke(oVar);
        }
        return C13598b0.f38549a;
    }
}
