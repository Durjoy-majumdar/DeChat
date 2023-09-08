package n04;

import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C90364q0;
import wy3.C26446d1;

/* renamed from: n04.l1 */
public abstract class C25154l1 extends C25167p1 {

    /* renamed from: b */
    public static final C25155a f71605b = new C25155a((C8480h) null);

    /* renamed from: n04.l1$a */
    public static final class C25155a {
        public C25155a(C8480h hVar) {
        }

        /* renamed from: c */
        public static C25154l1 m31971c(C25155a aVar, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            aVar.getClass();
            C87412m.m108594g(map, "map");
            return new C25151k1(map, z);
        }

        /* renamed from: a */
        public final C25167p1 mo52292a(C25143j0 j0Var) {
            C87412m.m108594g(j0Var, "kotlinType");
            return mo52293b(j0Var.mo37081K0(), j0Var.mo37079I0());
        }

        /* renamed from: b */
        public final C25167p1 mo52293b(C25144j1 j1Var, List<? extends C25158m1> list) {
            C87412m.m108594g(j1Var, "typeConstructor");
            C87412m.m108594g(list, "arguments");
            List<C26446d1> parameters = j1Var.getParameters();
            C87412m.m108593f(parameters, "typeConstructor.parameters");
            C26446d1 d1Var = (C26446d1) C110818d0.m150925W(parameters);
            boolean z = true;
            if (d1Var == null || !d1Var.mo53427x()) {
                z = false;
            }
            if (z) {
                List<C26446d1> parameters2 = j1Var.getParameters();
                C87412m.m108593f(parameters2, "typeConstructor.parameters");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(parameters2, 10));
                for (C26446d1 l : parameters2) {
                    arrayList.add(l.mo36110l());
                }
                return m31971c(this, C90364q0.m113152k(C110818d0.m150908F0(arrayList, list)), false, 2, (Object) null);
            }
            Object[] array = parameters.toArray(new C26446d1[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Object[] array2 = list.toArray(new C25158m1[0]);
            C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new C25121g0((C26446d1[]) array, (C25158m1[]) array2, false);
        }
    }

    /* renamed from: d */
    public C25158m1 mo37099d(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "key");
        return mo52290g(j0Var.mo37081K0());
    }

    /* renamed from: g */
    public abstract C25158m1 mo52290g(C25144j1 j1Var);
}
