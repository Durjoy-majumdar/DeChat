package n04;

import gy3.C87412m;
import o04.C25323e;
import r04.C26094c;
import rx3.C13603j;
import wy3.C26446d1;
import yz3.C23393c;
import yz3.C23413j;

/* renamed from: n04.d0 */
public final class C25113d0 extends C25109c0 implements C25172r {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25113d0(C25176s0 s0Var, C25176s0 s0Var2) {
        super(s0Var, s0Var2);
        C87412m.m108594g(s0Var, "lowerBound");
        C87412m.m108594g(s0Var2, "upperBound");
    }

    /* renamed from: D */
    public C25143j0 mo52247D(C25143j0 j0Var) {
        C25198y1 y1Var;
        C87412m.m108594g(j0Var, "replacement");
        C25198y1 N0 = j0Var.mo52229N0();
        if (N0 instanceof C25109c0) {
            y1Var = N0;
        } else if (N0 instanceof C25176s0) {
            C25176s0 s0Var = (C25176s0) N0;
            y1Var = C25146k0.m31957c(s0Var, s0Var.mo37084O0(true));
        } else {
            throw new C13603j();
        }
        return C25194x1.m32121b(y1Var, N0);
    }

    /* renamed from: O0 */
    public C25198y1 mo37084O0(boolean z) {
        return C25146k0.m31957c(this.f71540e.mo37084O0(z), this.f71541f.mo37084O0(z));
    }

    /* renamed from: Q0 */
    public C25198y1 mo51873Q0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return C25146k0.m31957c(this.f71540e.mo51873Q0(g1Var), this.f71541f.mo51873Q0(g1Var));
    }

    /* renamed from: R0 */
    public C25176s0 mo51874R0() {
        return this.f71540e;
    }

    /* renamed from: S0 */
    public String mo51875S0(C23393c cVar, C23413j jVar) {
        C87412m.m108594g(cVar, "renderer");
        C87412m.m108594g(jVar, "options");
        if (!jVar.mo36877h()) {
            return cVar.mo36860r(cVar.mo36863u(this.f71540e), cVar.mo36863u(this.f71541f), C26094c.m33425e(this));
        }
        return '(' + cVar.mo36863u(this.f71540e) + ".." + cVar.mo36863u(this.f71541f) + ')';
    }

    /* renamed from: T0 */
    public C25109c0 mo37085P0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C25143j0 h = eVar.mo52414h(this.f71540e);
        C87412m.m108592e(h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        C25143j0 h2 = eVar.mo52414h(this.f71541f);
        C87412m.m108592e(h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C25113d0((C25176s0) h, (C25176s0) h2);
    }

    /* renamed from: U */
    public boolean mo52249U() {
        return (this.f71540e.mo37081K0().mo37094o() instanceof C26446d1) && C87412m.m108589b(this.f71540e.mo37081K0(), this.f71541f.mo37081K0());
    }

    public String toString() {
        return '(' + this.f71540e + ".." + this.f71541f + ')';
    }
}
