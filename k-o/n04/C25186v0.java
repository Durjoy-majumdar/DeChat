package n04;

import gy3.C87412m;
import o04.C25323e;

/* renamed from: n04.v0 */
public final class C25186v0 extends C25185v implements C25191w1 {

    /* renamed from: e */
    public final C25176s0 f71639e;

    /* renamed from: f */
    public final C25143j0 f71640f;

    public C25186v0(C25176s0 s0Var, C25143j0 j0Var) {
        C87412m.m108594g(s0Var, "delegate");
        C87412m.m108594g(j0Var, "enhancement");
        this.f71639e = s0Var;
        this.f71640f = j0Var;
    }

    /* renamed from: N */
    public C25143j0 mo52254N() {
        return this.f71640f;
    }

    /* renamed from: R0 */
    public C25176s0 mo37086R0(boolean z) {
        C25198y1 c = C25194x1.m32122c(this.f71639e.mo37084O0(z), this.f71640f.mo52229N0().mo37084O0(z));
        C87412m.m108592e(c, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (C25176s0) c;
    }

    /* renamed from: S0 */
    public C25176s0 mo37087S0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        C25198y1 c = C25194x1.m32122c(this.f71639e.mo51873Q0(g1Var), this.f71640f);
        C87412m.m108592e(c, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (C25176s0) c;
    }

    /* renamed from: T0 */
    public C25176s0 mo52223T0() {
        return this.f71639e;
    }

    /* renamed from: V0 */
    public C25185v mo52225V0(C25176s0 s0Var) {
        C87412m.m108594g(s0Var, "delegate");
        return new C25186v0(s0Var, this.f71640f);
    }

    /* renamed from: W0 */
    public C25186v0 mo52224U0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C25143j0 h = eVar.mo52414h(this.f71639e);
        C87412m.m108592e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C25186v0((C25176s0) h, eVar.mo52414h(this.f71640f));
    }

    public C25198y1 getOrigin() {
        return this.f71639e;
    }

    public String toString() {
        return "[@EnhancedForWarnings(" + this.f71640f + ")] " + this.f71639e;
    }
}
