package n04;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C90364q0;
import wy3.C26443c1;
import wy3.C26446d1;

/* renamed from: n04.c1 */
public final class C25110c1 {

    /* renamed from: e */
    public static final C25111a f71542e = new C25111a((C8480h) null);

    /* renamed from: a */
    public final C25110c1 f71543a;

    /* renamed from: b */
    public final C26443c1 f71544b;

    /* renamed from: c */
    public final List<C25158m1> f71545c;

    /* renamed from: d */
    public final Map<C26446d1, C25158m1> f71546d;

    /* renamed from: n04.c1$a */
    public static final class C25111a {
        public C25111a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C25110c1 mo52244a(C25110c1 c1Var, C26443c1 c1Var2, List<? extends C25158m1> list) {
            C87412m.m108594g(c1Var2, "typeAliasDescriptor");
            C87412m.m108594g(list, "arguments");
            List<C26446d1> parameters = c1Var2.mo36110l().getParameters();
            C87412m.m108593f(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(parameters, 10));
            for (C26446d1 a : parameters) {
                arrayList.add(a.mo36109a());
            }
            return new C25110c1(c1Var, c1Var2, list, C90364q0.m113152k(C110818d0.m150908F0(arrayList, list)), (C8480h) null);
        }
    }

    public C25110c1(C25110c1 c1Var, C26443c1 c1Var2, List list, Map map, C8480h hVar) {
        this.f71543a = c1Var;
        this.f71544b = c1Var2;
        this.f71545c = list;
        this.f71546d = map;
    }

    /* renamed from: a */
    public final boolean mo52243a(C26443c1 c1Var) {
        C87412m.m108594g(c1Var, "descriptor");
        if (!C87412m.m108589b(this.f71544b, c1Var)) {
            C25110c1 c1Var2 = this.f71543a;
            return c1Var2 != null ? c1Var2.mo52243a(c1Var) : false;
        }
    }
}
