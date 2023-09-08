package n04;

import fy3.C32224a;
import gy3.C87412m;
import m04.C21480i;
import m04.C24959e;
import m04.C24980n;
import o04.C25323e;

/* renamed from: n04.n0 */
public final class C25160n0 extends C25104a2 {

    /* renamed from: e */
    public final C24980n f71609e;

    /* renamed from: f */
    public final C32224a<C25143j0> f71610f;

    /* renamed from: g */
    public final C21480i<C25143j0> f71611g;

    public C25160n0(C24980n nVar, C32224a<? extends C25143j0> aVar) {
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(aVar, "computation");
        this.f71609e = nVar;
        this.f71610f = aVar;
        this.f71611g = nVar.mo52006g(aVar);
    }

    /* renamed from: M0 */
    public C25143j0 mo37083M0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        return new C25160n0(this.f71609e, new C25157m0(eVar, this));
    }

    /* renamed from: O0 */
    public C25143j0 mo52230O0() {
        return (C25143j0) this.f71611g.invoke();
    }

    /* renamed from: P0 */
    public boolean mo52231P0() {
        C24959e.C24967h hVar = (C24959e.C24967h) this.f71611g;
        return (hVar.f71127f == C24959e.C24973n.NOT_COMPUTED || hVar.f71127f == C24959e.C24973n.COMPUTING) ? false : true;
    }
}
