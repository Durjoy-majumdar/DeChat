package o04;

import gy3.C87412m;
import n04.C25134i1;
import o04.C25320d;
import o04.C25323e;

/* renamed from: o04.a */
public final class C25314a {
    /* renamed from: a */
    public static C25134i1 m32212a(boolean z, boolean z2, C25315b bVar, C25320d dVar, C25323e eVar, int i, Object obj) {
        boolean z3 = (i & 2) != 0 ? true : z2;
        if ((i & 4) != 0) {
            bVar = C25335o.f71846a;
        }
        C25315b bVar2 = bVar;
        if ((i & 8) != 0) {
            dVar = C25320d.C25321a.f71822a;
        }
        C25320d dVar2 = dVar;
        if ((i & 16) != 0) {
            eVar = C25323e.C25324a.f71823a;
        }
        C25323e eVar2 = eVar;
        C87412m.m108594g(bVar2, "typeSystemContext");
        C87412m.m108594g(dVar2, "kotlinTypePreparator");
        C87412m.m108594g(eVar2, "kotlinTypeRefiner");
        return new C25134i1(z, z3, true, bVar2, dVar2, eVar2);
    }
}
