package n04;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import o04.C25323e;
import yz3.C23393c;
import yz3.C23413j;

/* renamed from: n04.e0 */
public final class C25117e0 extends C25109c0 implements C25191w1 {

    /* renamed from: g */
    public final C25109c0 f71552g;

    /* renamed from: h */
    public final C25143j0 f71553h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25117e0(C25109c0 c0Var, C25143j0 j0Var) {
        super(c0Var.f71540e, c0Var.f71541f);
        C87412m.m108594g(c0Var, FirebaseAnalytics.C113379b.ORIGIN);
        C87412m.m108594g(j0Var, "enhancement");
        this.f71552g = c0Var;
        this.f71553h = j0Var;
    }

    /* renamed from: N */
    public C25143j0 mo52254N() {
        return this.f71553h;
    }

    /* renamed from: O0 */
    public C25198y1 mo37084O0(boolean z) {
        return C25194x1.m32122c(this.f71552g.mo37084O0(z), this.f71553h.mo52229N0().mo37084O0(z));
    }

    /* renamed from: Q0 */
    public C25198y1 mo51873Q0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return C25194x1.m32122c(this.f71552g.mo51873Q0(g1Var), this.f71553h);
    }

    /* renamed from: R0 */
    public C25176s0 mo51874R0() {
        return this.f71552g.mo51874R0();
    }

    /* renamed from: S0 */
    public String mo51875S0(C23393c cVar, C23413j jVar) {
        C87412m.m108594g(cVar, "renderer");
        C87412m.m108594g(jVar, "options");
        return jVar.mo36870a() ? cVar.mo36863u(this.f71553h) : this.f71552g.mo51875S0(cVar, jVar);
    }

    /* renamed from: T0 */
    public C25117e0 mo37085P0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C25143j0 h = eVar.mo52414h(this.f71552g);
        C87412m.m108592e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C25117e0((C25109c0) h, eVar.mo52414h(this.f71553h));
    }

    public C25198y1 getOrigin() {
        return this.f71552g;
    }

    public String toString() {
        return "[@EnhancedForWarnings(" + this.f71553h + ")] " + this.f71552g;
    }
}
