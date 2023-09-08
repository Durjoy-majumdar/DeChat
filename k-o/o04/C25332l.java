package o04;

import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import n04.C25123h;
import n04.C25134i1;
import n04.C25143j0;
import n04.C25198y1;
import o04.C25320d;
import zz3.C26802n;

/* renamed from: o04.l */
public final class C25332l implements C25330k {

    /* renamed from: c */
    public final C25323e f71843c;

    /* renamed from: d */
    public final C25320d f71844d;

    /* renamed from: e */
    public final C26802n f71845e;

    public C25332l(C25323e eVar, C25320d dVar, int i, C8480h hVar) {
        dVar = (i & 2) != 0 ? C25320d.C25321a.f71822a : dVar;
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C87412m.m108594g(dVar, "kotlinTypePreparator");
        this.f71843c = eVar;
        this.f71844d = dVar;
        this.f71845e = new C26802n(C26802n.f74535g, eVar, C25320d.C25321a.f71822a, (C32227p<C25143j0, C25143j0, Boolean>) null);
    }

    /* renamed from: a */
    public boolean mo52404a(C25143j0 j0Var, C25143j0 j0Var2) {
        C87412m.m108594g(j0Var, "a");
        C87412m.m108594g(j0Var2, "b");
        C25134i1 a = C25314a.m32212a(false, false, (C25315b) null, this.f71844d, this.f71843c, 6, (Object) null);
        C25198y1 N0 = j0Var.mo52229N0();
        C25198y1 N02 = j0Var2.mo52229N0();
        C87412m.m108594g(N0, "a");
        C87412m.m108594g(N02, "b");
        return C25123h.f71559a.mo52264e(a, N0, N02);
    }

    /* renamed from: b */
    public C25323e mo52421b() {
        return this.f71843c;
    }

    /* renamed from: c */
    public C26802n mo52422c() {
        return this.f71845e;
    }

    /* renamed from: d */
    public boolean mo52423d(C25143j0 j0Var, C25143j0 j0Var2) {
        C87412m.m108594g(j0Var, "subtype");
        C87412m.m108594g(j0Var2, "supertype");
        C25134i1 a = C25314a.m32212a(true, false, (C25315b) null, this.f71844d, this.f71843c, 6, (Object) null);
        C25198y1 N0 = j0Var.mo52229N0();
        C25198y1 N02 = j0Var2.mo52229N0();
        C87412m.m108594g(N0, "subType");
        C87412m.m108594g(N02, "superType");
        return C25123h.m31901i(C25123h.f71559a, a, N0, N02, false, 8, (Object) null);
    }
}
