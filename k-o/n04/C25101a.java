package n04;

import gy3.C87412m;
import o04.C25323e;

/* renamed from: n04.a */
public final class C25101a extends C25185v {

    /* renamed from: e */
    public final C25176s0 f71533e;

    /* renamed from: f */
    public final C25176s0 f71534f;

    public C25101a(C25176s0 s0Var, C25176s0 s0Var2) {
        C87412m.m108594g(s0Var, "delegate");
        C87412m.m108594g(s0Var2, "abbreviation");
        this.f71533e = s0Var;
        this.f71534f = s0Var2;
    }

    /* renamed from: S0 */
    public C25176s0 mo37087S0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return new C25101a(this.f71533e.mo51873Q0(g1Var), this.f71534f);
    }

    /* renamed from: T0 */
    public C25176s0 mo52223T0() {
        return this.f71533e;
    }

    /* renamed from: V0 */
    public C25185v mo52225V0(C25176s0 s0Var) {
        C87412m.m108594g(s0Var, "delegate");
        return new C25101a(s0Var, this.f71534f);
    }

    /* renamed from: W0 */
    public C25101a mo37086R0(boolean z) {
        return new C25101a(this.f71533e.mo37084O0(z), this.f71534f.mo37084O0(z));
    }

    /* renamed from: X0 */
    public C25101a mo52224U0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C25143j0 h = eVar.mo52414h(this.f71533e);
        C87412m.m108592e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        C25143j0 h2 = eVar.mo52414h(this.f71534f);
        C87412m.m108592e(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C25101a((C25176s0) h, (C25176s0) h2);
    }
}
