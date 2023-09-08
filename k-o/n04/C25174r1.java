package n04;

import gy3.C87412m;
import java.util.List;
import o04.C25323e;
import rx3.C13603j;
import xy3.C26571h;
import xy3.C26581m;

/* renamed from: n04.r1 */
public final class C25174r1 {
    /* renamed from: a */
    public static final C25176s0 m32014a(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        C25198y1 N0 = j0Var.mo52229N0();
        C25176s0 s0Var = N0 instanceof C25176s0 ? (C25176s0) N0 : null;
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + j0Var).toString());
    }

    /* renamed from: b */
    public static final C25176s0 m32015b(C25176s0 s0Var, List<? extends C25158m1> list, C25122g1 g1Var) {
        C87412m.m108594g(s0Var, "<this>");
        C87412m.m108594g(list, "newArguments");
        C87412m.m108594g(g1Var, "newAttributes");
        return (!list.isEmpty() || g1Var != s0Var.mo37080J0()) ? list.isEmpty() ? s0Var.mo51873Q0(g1Var) : C25146k0.m31960f(g1Var, s0Var.mo37081K0(), list, s0Var.mo37082L0(), (C25323e) null) : s0Var;
    }

    /* renamed from: c */
    public static C25143j0 m32016c(C25143j0 j0Var, List<C25158m1> list, C26571h hVar, List<C25158m1> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = j0Var.mo37079I0();
        }
        if ((i & 2) != 0) {
            hVar = j0Var.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        C87412m.m108594g(j0Var, "<this>");
        C87412m.m108594g(list, "newArguments");
        C87412m.m108594g(hVar, "newAnnotations");
        C87412m.m108594g(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == j0Var.mo37079I0()) && hVar == j0Var.getAnnotations()) {
            return j0Var;
        }
        C25122g1 J0 = j0Var.mo37080J0();
        if ((hVar instanceof C26581m) && hVar.isEmpty()) {
            int i2 = C26571h.f73936P0;
            hVar = C26571h.C26572a.f73937a;
        }
        C25122g1 a = C25126h1.m31917a(J0, hVar);
        C25198y1 N0 = j0Var.mo52229N0();
        if (N0 instanceof C25109c0) {
            C25109c0 c0Var = (C25109c0) N0;
            return C25146k0.m31957c(m32015b(c0Var.f71540e, list, a), m32015b(c0Var.f71541f, list2, a));
        } else if (N0 instanceof C25176s0) {
            return m32015b((C25176s0) N0, list, a);
        } else {
            throw new C13603j();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ C25176s0 m32017d(C25176s0 s0Var, List<C25158m1> list, C25122g1 g1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            list = s0Var.mo37079I0();
        }
        if ((i & 2) != 0) {
            g1Var = s0Var.mo37080J0();
        }
        return m32015b(s0Var, list, g1Var);
    }
}
