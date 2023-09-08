package vy3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import n04.C25154l1;
import n04.C25176s0;
import r04.C26094c;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C90364q0;
import wy3.C26446d1;
import wy3.C26447e;

/* renamed from: vy3.t */
public final class C26407t {
    /* renamed from: a */
    public static final C25154l1 m33988a(C26447e eVar, C26447e eVar2) {
        C87412m.m108594g(eVar, "from");
        C87412m.m108594g(eVar2, "to");
        eVar.mo51805t().size();
        eVar2.mo51805t().size();
        C25154l1.C25155a aVar = C25154l1.f71605b;
        List<C26446d1> t = eVar.mo51805t();
        C87412m.m108593f(t, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(t, 10));
        for (C26446d1 l : t) {
            arrayList.add(l.mo36110l());
        }
        List<C26446d1> t2 = eVar2.mo51805t();
        C87412m.m108593f(t2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(t2, 10));
        for (C26446d1 s : t2) {
            C25176s0 s2 = s.mo36111s();
            C87412m.m108593f(s2, "it.defaultType");
            arrayList2.add(C26094c.m33421a(s2));
        }
        return C25154l1.C25155a.m31971c(aVar, C90364q0.m113152k(C110818d0.m150908F0(arrayList, arrayList2)), false, 2, (Object) null);
    }
}
