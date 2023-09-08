package n04;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import rx3.C13603j;

/* renamed from: n04.x1 */
public final class C25194x1 {
    /* renamed from: a */
    public static final C25143j0 m32120a(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        if (j0Var instanceof C25191w1) {
            return ((C25191w1) j0Var).mo52254N();
        }
        return null;
    }

    /* renamed from: b */
    public static final C25198y1 m32121b(C25198y1 y1Var, C25143j0 j0Var) {
        C87412m.m108594g(y1Var, "<this>");
        C87412m.m108594g(j0Var, FirebaseAnalytics.C113379b.ORIGIN);
        return m32122c(y1Var, m32120a(j0Var));
    }

    /* renamed from: c */
    public static final C25198y1 m32122c(C25198y1 y1Var, C25143j0 j0Var) {
        C87412m.m108594g(y1Var, "<this>");
        if (y1Var instanceof C25191w1) {
            return m32122c(((C25191w1) y1Var).getOrigin(), j0Var);
        }
        if (j0Var == null || C87412m.m108589b(j0Var, y1Var)) {
            return y1Var;
        }
        if (y1Var instanceof C25176s0) {
            return new C25186v0((C25176s0) y1Var, j0Var);
        }
        if (y1Var instanceof C25109c0) {
            return new C25117e0((C25109c0) y1Var, j0Var);
        }
        throw new C13603j();
    }
}
