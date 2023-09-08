package n04;

import gy3.C87412m;
import rx3.C13603j;

/* renamed from: n04.f0 */
public final class C25119f0 {
    /* renamed from: a */
    public static final C25109c0 m31891a(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        C25198y1 N0 = j0Var.mo52229N0();
        C87412m.m108592e(N0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (C25109c0) N0;
    }

    /* renamed from: b */
    public static final boolean m31892b(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        return j0Var.mo52229N0() instanceof C25109c0;
    }

    /* renamed from: c */
    public static final C25176s0 m31893c(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        C25198y1 N0 = j0Var.mo52229N0();
        if (N0 instanceof C25109c0) {
            return ((C25109c0) N0).f71540e;
        }
        if (N0 instanceof C25176s0) {
            return (C25176s0) N0;
        }
        throw new C13603j();
    }

    /* renamed from: d */
    public static final C25176s0 m31894d(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        C25198y1 N0 = j0Var.mo52229N0();
        if (N0 instanceof C25109c0) {
            return ((C25109c0) N0).f71541f;
        }
        if (N0 instanceof C25176s0) {
            return (C25176s0) N0;
        }
        throw new C13603j();
    }
}
