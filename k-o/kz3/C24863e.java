package kz3;

import gy3.C8480h;
import gy3.C87412m;
import gz3.C24597k;
import n04.C25158m1;
import n04.C25164o1;
import n04.C25176s0;
import n04.C25196y0;
import n04.C25200z0;
import sx3.C22415w0;
import vz3.C22826c;
import wy3.C26446d1;

/* renamed from: kz3.e */
public final class C24863e {

    /* renamed from: a */
    public static final C22826c f70862a = new C22826c("java.lang.Class");

    /* renamed from: a */
    public static final C25158m1 m31345a(C26446d1 d1Var, C24859a aVar) {
        C87412m.m108594g(d1Var, "typeParameter");
        C87412m.m108594g(aVar, "attr");
        return aVar.f70844a == C24597k.SUPERTYPE ? new C25164o1(C25200z0.m32144b(d1Var)) : new C25196y0(d1Var);
    }

    /* renamed from: b */
    public static C24859a m31346b(C24597k kVar, boolean z, C26446d1 d1Var, int i, Object obj) {
        boolean z2 = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            d1Var = null;
        }
        C87412m.m108594g(kVar, "<this>");
        return new C24859a(kVar, (C24860b) null, z2, d1Var != null ? C22415w0.m26092a(d1Var) : null, (C25176s0) null, 18, (C8480h) null);
    }
}
