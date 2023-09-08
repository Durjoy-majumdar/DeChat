package fz3;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hz3.C24610e;
import java.util.List;
import kz3.C24864f;
import kz3.C24866g;
import kz3.C24867h;
import n04.C25143j0;
import n04.C25180t1;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C64197v;
import wy3.C26434a;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26463h1;
import wy3.C26509u0;
import wy3.C26520x0;
import y04.C112354s;
import y04.C15925h;
import y04.C91365f;
import zz3.C26795i;
import zz3.C26802n;

/* renamed from: fz3.p */
public final class C24509p implements C26795i {

    /* renamed from: fz3.p$a */
    public /* synthetic */ class C24510a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70070a;

        static {
            int[] iArr = new int[C26802n.C26805c.C26806a.values().length];
            iArr[0] = 1;
            f70070a = iArr;
        }
    }

    /* renamed from: fz3.p$b */
    public static final class C24511b extends C87413o implements C32226l<C26463h1, C25143j0> {

        /* renamed from: d */
        public static final C24511b f70071d = new C24511b();

        public C24511b() {
            super(1);
        }

        public Object invoke(Object obj) {
            return ((C26463h1) obj).getType();
        }
    }

    /* renamed from: a */
    public C26795i.C26797b mo51196a(C26434a aVar, C26434a aVar2, C26447e eVar) {
        boolean z;
        C26434a aVar3;
        boolean z2;
        C26795i.C26797b bVar = C26795i.C26797b.UNKNOWN;
        C87412m.m108594g(aVar, "superDescriptor");
        C87412m.m108594g(aVar2, "subDescriptor");
        if (!(aVar2 instanceof C24610e)) {
            return bVar;
        }
        C24610e eVar2 = (C24610e) aVar2;
        if (!eVar2.getTypeParameters().isEmpty()) {
            return bVar;
        }
        C26802n.C26805c i = C26802n.m35257i(aVar, aVar2);
        if ((i != null ? i.mo53767c() : null) != null) {
            return bVar;
        }
        List<C26463h1> h = eVar2.mo52639h();
        C87412m.m108593f(h, "subDescriptor.valueParameters");
        C15925h<R> m = C112354s.m153290m(C110818d0.m150897A(h), C24511b.f70071d);
        C25143j0 j0Var = eVar2.f74460j;
        C87412m.m108591d(j0Var);
        C15925h<R> q = C112354s.m153294q(m, j0Var);
        C26509u0 u0Var = eVar2.f74462o;
        C91365f.C91366a aVar4 = new C91365f.C91366a((C91365f) C112354s.m153293p(q, C64197v.m75538g(u0Var != null ? u0Var.getType() : null)));
        while (true) {
            if (!aVar4.mo125334a()) {
                z = false;
                break;
            }
            C25143j0 j0Var2 = (C25143j0) aVar4.next();
            if (!(!j0Var2.mo37079I0().isEmpty()) || (j0Var2.mo52229N0() instanceof C24866g)) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z || (aVar3 = (C26434a) aVar.mo51921c(C25180t1.m32044e(new C24864f((C24867h) null, 1, (C8480h) null)))) == null) {
            return bVar;
        }
        if (aVar3 instanceof C26520x0) {
            C26520x0 x0Var = (C26520x0) aVar3;
            List<C26446d1> typeParameters = x0Var.getTypeParameters();
            C87412m.m108593f(typeParameters, "erasedSuper.typeParameters");
            if (!typeParameters.isEmpty()) {
                aVar3 = x0Var.mo52597p().mo52610k(C64186f0.f181907d).build();
                C87412m.m108591d(aVar3);
            }
        }
        C26802n.C26805c.C26806a c = C26802n.f74534f.mo53766n(aVar3, aVar2, false).mo53767c();
        C87412m.m108593f(c, "DEFAULT.isOverridableByW…Descriptor, false).result");
        return C24510a.f70070a[c.ordinal()] == 1 ? C26795i.C26797b.OVERRIDABLE : bVar;
    }

    /* renamed from: b */
    public C26795i.C26796a mo51197b() {
        return C26795i.C26796a.SUCCESS_ONLY;
    }
}
