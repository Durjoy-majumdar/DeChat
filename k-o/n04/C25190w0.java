package n04;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import sx3.C36907w;

/* renamed from: n04.w0 */
public final class C25190w0 {
    /* renamed from: a */
    public static final C25198y1 m32110a(C25198y1 y1Var, boolean z) {
        C87412m.m108594g(y1Var, "<this>");
        C25177t a = C25177t.f71623g.mo52310a(y1Var, z);
        if (a != null) {
            return a;
        }
        C25176s0 b = m32111b(y1Var);
        return b != null ? b : y1Var.mo37084O0(false);
    }

    /* renamed from: b */
    public static final C25176s0 m32111b(C25143j0 j0Var) {
        C25124h0 h0Var;
        C25144j1 K0 = j0Var.mo37081K0();
        C25124h0 h0Var2 = K0 instanceof C25124h0 ? (C25124h0) K0 : null;
        if (h0Var2 == null) {
            return null;
        }
        LinkedHashSet<C25143j0> linkedHashSet = h0Var2.f71561b;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedHashSet, 10));
        boolean z = false;
        for (C25143j0 next : linkedHashSet) {
            if (C25187v1.m32087g(next)) {
                next = m32110a(next.mo52229N0(), false);
                z = true;
            }
            arrayList.add(next);
        }
        if (!z) {
            h0Var = null;
        } else {
            C25143j0 j0Var2 = h0Var2.f71560a;
            if (j0Var2 == null) {
                j0Var2 = null;
            } else if (C25187v1.m32087g(j0Var2)) {
                j0Var2 = m32110a(j0Var2.mo52229N0(), false);
            }
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            h0Var = new C25124h0(linkedHashSet2);
            h0Var.f71560a = j0Var2;
        }
        if (h0Var == null) {
            return null;
        }
        return h0Var.mo52269b();
    }

    /* renamed from: c */
    public static final C25176s0 m32112c(C25176s0 s0Var, C25176s0 s0Var2) {
        C87412m.m108594g(s0Var, "<this>");
        C87412m.m108594g(s0Var2, "abbreviatedType");
        return C25153l0.m31968a(s0Var) ? s0Var : new C25101a(s0Var, s0Var2);
    }
}
