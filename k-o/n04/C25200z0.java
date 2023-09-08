package n04;

import d04.C24442a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C110818d0;
import sx3.C36907w;
import ty3.C26336h;
import wy3.C22935h;
import wy3.C26446d1;
import wy3.C26464i;
import wy3.C26469k;
import wy3.C26516w;

/* renamed from: n04.z0 */
public final class C25200z0 {

    /* renamed from: n04.z0$a */
    public static final class C25201a extends C25154l1 {

        /* renamed from: c */
        public final /* synthetic */ List<C25144j1> f71655c;

        public C25201a(List<? extends C25144j1> list) {
            this.f71655c = list;
        }

        /* renamed from: g */
        public C25158m1 mo52290g(C25144j1 j1Var) {
            C87412m.m108594g(j1Var, "key");
            if (!this.f71655c.contains(j1Var)) {
                return null;
            }
            C22935h o = j1Var.mo37094o();
            C87412m.m108592e(o, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return C25187v1.m32093m((C26446d1) o);
        }
    }

    /* renamed from: a */
    public static final C25143j0 m32143a(List<? extends C25144j1> list, List<? extends C25143j0> list2, C26336h hVar) {
        C25143j0 k = C25180t1.m32044e(new C25201a(list)).mo52314k((C25143j0) C110818d0.m150914L(list2), C25202z1.OUT_VARIANCE);
        if (k == null) {
            k = hVar.mo53322n();
        }
        C87412m.m108593f(k, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return k;
    }

    /* renamed from: b */
    public static final C25143j0 m32144b(C26446d1 d1Var) {
        C87412m.m108594g(d1Var, "<this>");
        C26469k b = d1Var.mo51892b();
        C87412m.m108593f(b, "this.containingDeclaration");
        if (b instanceof C26464i) {
            List<C26446d1> parameters = ((C26464i) b).mo36110l().getParameters();
            C87412m.m108593f(parameters, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(parameters, 10));
            for (C26446d1 l : parameters) {
                C25144j1 l2 = l.mo36110l();
                C87412m.m108593f(l2, "it.typeConstructor");
                arrayList.add(l2);
            }
            List<C25143j0> upperBounds = d1Var.getUpperBounds();
            C87412m.m108593f(upperBounds, "upperBounds");
            return m32143a(arrayList, upperBounds, C24442a.m30538e(d1Var));
        } else if (b instanceof C26516w) {
            List<C26446d1> typeParameters = ((C26516w) b).getTypeParameters();
            C87412m.m108593f(typeParameters, "descriptor.typeParameters");
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(typeParameters, 10));
            for (C26446d1 l3 : typeParameters) {
                C25144j1 l4 = l3.mo36110l();
                C87412m.m108593f(l4, "it.typeConstructor");
                arrayList2.add(l4);
            }
            List<C25143j0> upperBounds2 = d1Var.getUpperBounds();
            C87412m.m108593f(upperBounds2, "upperBounds");
            return m32143a(arrayList2, upperBounds2, C24442a.m30538e(d1Var));
        } else {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
    }
}
