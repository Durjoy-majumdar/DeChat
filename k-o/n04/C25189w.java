package n04;

import gy3.C87412m;

/* renamed from: n04.w */
public abstract class C25189w extends C25185v {

    /* renamed from: e */
    public final C25176s0 f71646e;

    public C25189w(C25176s0 s0Var) {
        C87412m.m108594g(s0Var, "delegate");
        this.f71646e = s0Var;
    }

    /* renamed from: R0 */
    public C25176s0 mo37086R0(boolean z) {
        return z == mo37082L0() ? this : this.f71646e.mo37084O0(z).mo51873Q0(mo37080J0());
    }

    /* renamed from: S0 */
    public C25176s0 mo37087S0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return g1Var != mo37080J0() ? new C25183u0(this, g1Var) : this;
    }

    /* renamed from: T0 */
    public C25176s0 mo52223T0() {
        return this.f71646e;
    }
}
