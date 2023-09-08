package jz3;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import iz3.C24651h;
import java.util.Collection;
import java.util.List;
import jz3.C24832l;
import mz3.C25065q;
import n04.C25143j0;
import sx3.C64186f0;
import vz3.C22830f;
import wy3.C26446d1;
import wy3.C26463h1;
import wy3.C26504r0;
import wy3.C26509u0;

/* renamed from: jz3.u */
public abstract class C24850u extends C24832l {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24850u(C24651h hVar) {
        super(hVar, (C24832l) null);
        C87412m.m108594g(hVar, "c");
    }

    /* renamed from: n */
    public void mo51835n(C22830f fVar, Collection<C26504r0> collection) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(collection, "result");
    }

    /* renamed from: p */
    public C26509u0 mo51837p() {
        return null;
    }

    /* renamed from: s */
    public C24832l.C24833a mo51840s(C25065q qVar, List<? extends C26446d1> list, C25143j0 j0Var, List<? extends C26463h1> list2) {
        C87412m.m108594g(qVar, FirebaseAnalytics.C113379b.METHOD);
        C87412m.m108594g(list, "methodTypeParameters");
        C87412m.m108594g(j0Var, "returnType");
        C87412m.m108594g(list2, "valueParameters");
        return new C24832l.C24833a(j0Var, (C25143j0) null, list2, list, false, C64186f0.f181907d);
    }
}
