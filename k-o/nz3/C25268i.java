package nz3;

import gy3.C87412m;
import n04.C25109c0;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25146k0;
import n04.C25166p0;
import n04.C25176s0;
import n04.C25185v;
import n04.C25187v1;
import n04.C25194x1;
import n04.C25198y1;

/* renamed from: nz3.i */
public final class C25268i extends C25185v implements C25166p0 {

    /* renamed from: e */
    public final C25176s0 f71747e;

    public C25268i(C25176s0 s0Var) {
        C87412m.m108594g(s0Var, "delegate");
        this.f71747e = s0Var;
    }

    /* renamed from: D */
    public C25143j0 mo52247D(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "replacement");
        C25198y1 N0 = j0Var.mo52229N0();
        C87412m.m108594g(N0, "<this>");
        if (!C25187v1.m32088h(N0) && !C25187v1.m32087g(N0)) {
            return N0;
        }
        if (N0 instanceof C25176s0) {
            return mo52382W0((C25176s0) N0);
        }
        if (N0 instanceof C25109c0) {
            C25109c0 c0Var = (C25109c0) N0;
            return C25194x1.m32122c(C25146k0.m31957c(mo52382W0(c0Var.f71540e), mo52382W0(c0Var.f71541f)), C25194x1.m32120a(N0));
        }
        throw new IllegalStateException(("Incorrect type: " + N0).toString());
    }

    /* renamed from: L0 */
    public boolean mo37082L0() {
        return false;
    }

    /* renamed from: Q0 */
    public C25198y1 mo51873Q0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return new C25268i(this.f71747e.mo51873Q0(g1Var));
    }

    /* renamed from: R0 */
    public C25176s0 mo37086R0(boolean z) {
        return z ? this.f71747e.mo37084O0(true) : this;
    }

    /* renamed from: S0 */
    public C25176s0 mo37087S0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return new C25268i(this.f71747e.mo51873Q0(g1Var));
    }

    /* renamed from: T0 */
    public C25176s0 mo52223T0() {
        return this.f71747e;
    }

    /* renamed from: U */
    public boolean mo52249U() {
        return true;
    }

    /* renamed from: V0 */
    public C25185v mo52225V0(C25176s0 s0Var) {
        C87412m.m108594g(s0Var, "delegate");
        return new C25268i(s0Var);
    }

    /* renamed from: W0 */
    public final C25176s0 mo52382W0(C25176s0 s0Var) {
        C25176s0 R0 = s0Var.mo37084O0(false);
        return !C25187v1.m32088h(s0Var) ? R0 : new C25268i(R0);
    }
}
