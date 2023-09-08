package t04;

import d04.C24442a;
import gy3.C87412m;
import java.util.List;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25146k0;
import n04.C25176s0;
import n04.C25187v1;
import n04.C25196y0;
import r04.C26094c;
import sx3.C110818d0;
import sx3.C26236u;
import t04.C26255f;
import ty3.C26339k;
import ty3.C26343l;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26448e0;
import wy3.C26463h1;
import wy3.C26510v;
import wy3.C26516w;

/* renamed from: t04.k */
public final class C26266k implements C26255f {

    /* renamed from: a */
    public static final C26266k f73200a = new C26266k();

    /* renamed from: a */
    public String mo53156a(C26516w wVar) {
        return C26255f.C26256a.m33748a(this, wVar);
    }

    /* renamed from: b */
    public boolean mo53157b(C26516w wVar) {
        C25176s0 s0Var;
        C87412m.m108594g(wVar, "functionDescriptor");
        C26463h1 h1Var = wVar.mo52639h().get(1);
        C26339k.C26341b bVar = C26339k.f73361d;
        C87412m.m108593f(h1Var, "secondParameter");
        C26448e0 j = C24442a.m30543j(h1Var);
        bVar.getClass();
        C26447e a = C26510v.m34216a(j, C26343l.C26344a.f73398R);
        if (a == null) {
            s0Var = null;
        } else {
            C25122g1.f71557e.getClass();
            C25122g1 g1Var = C25122g1.f71558f;
            List<C26446d1> parameters = a.mo36110l().getParameters();
            C87412m.m108593f(parameters, "kPropertyClass.typeConstructor.parameters");
            Object j0 = C110818d0.m150938j0(parameters);
            C87412m.m108593f(j0, "kPropertyClass.typeConstructor.parameters.single()");
            s0Var = C25146k0.m31959e(g1Var, a, C26236u.m33719b(new C25196y0((C26446d1) j0)));
        }
        if (s0Var == null) {
            return false;
        }
        C25143j0 type = h1Var.getType();
        C87412m.m108593f(type, "secondParameter.type");
        C25143j0 i = C25187v1.m32089i(type);
        C87412m.m108593f(i, "makeNotNullable(this)");
        return C26094c.m33429i(s0Var, i);
    }

    public String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
