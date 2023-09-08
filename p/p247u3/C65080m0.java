package p247u3;

import gy3.C87412m;
import p247u3.C65060g0;

/* renamed from: u3.m0 */
public final class C65080m0 {

    /* renamed from: a */
    public C65060g0 f187309a;

    /* renamed from: b */
    public C65060g0 f187310b;

    /* renamed from: c */
    public C65060g0 f187311c;

    /* renamed from: d */
    public C65066h0 f187312d = C65066h0.f187268d;

    /* renamed from: e */
    public C65066h0 f187313e;

    public C65080m0() {
        C65060g0.C65063c cVar = C65060g0.C65063c.f187265c;
        this.f187309a = cVar;
        this.f187310b = cVar;
        this.f187311c = cVar;
        C65066h0 h0Var = C65066h0.f187268d;
    }

    /* renamed from: a */
    public final C65060g0 mo89278a(C65060g0 g0Var, C65060g0 g0Var2, C65060g0 g0Var3, C65060g0 g0Var4) {
        return g0Var4 == null ? g0Var3 : (!(g0Var instanceof C65060g0.C65062b) || ((g0Var2 instanceof C65060g0.C65063c) && (g0Var4 instanceof C65060g0.C65063c)) || (g0Var4 instanceof C65060g0.C65061a)) ? g0Var4 : g0Var;
    }

    /* renamed from: b */
    public final boolean mo89279b(C65069i0 i0Var, boolean z, C65060g0 g0Var) {
        boolean z2;
        C65066h0 h0Var;
        C87412m.m108594g(i0Var, "type");
        C87412m.m108594g(g0Var, "state");
        if (z) {
            C65066h0 h0Var2 = this.f187313e;
            if (h0Var2 != null) {
                h0Var = h0Var2;
            } else {
                C65066h0 h0Var3 = C65066h0.f187268d;
                h0Var = C65066h0.f187268d;
            }
            C65066h0 c = h0Var.mo89265c(i0Var, g0Var);
            this.f187313e = c;
            z2 = C87412m.m108589b(c, h0Var2);
        } else {
            C65066h0 h0Var4 = this.f187312d;
            C65066h0 c2 = h0Var4.mo89265c(i0Var, g0Var);
            this.f187312d = c2;
            z2 = C87412m.m108589b(c2, h0Var4);
        }
        boolean z3 = !z2;
        mo89281d();
        return z3;
    }

    /* renamed from: c */
    public final C65079m mo89280c() {
        return new C65079m(this.f187309a, this.f187310b, this.f187311c, this.f187312d, this.f187313e);
    }

    /* renamed from: d */
    public final void mo89281d() {
        C65060g0 g0Var = this.f187309a;
        C65060g0 g0Var2 = this.f187312d.f187269a;
        C65066h0 h0Var = this.f187313e;
        C65060g0 g0Var3 = null;
        this.f187309a = mo89278a(g0Var, g0Var2, g0Var2, h0Var != null ? h0Var.f187269a : null);
        C65060g0 g0Var4 = this.f187310b;
        C65066h0 h0Var2 = this.f187312d;
        C65060g0 g0Var5 = h0Var2.f187269a;
        C65060g0 g0Var6 = h0Var2.f187270b;
        C65066h0 h0Var3 = this.f187313e;
        this.f187310b = mo89278a(g0Var4, g0Var5, g0Var6, h0Var3 != null ? h0Var3.f187270b : null);
        C65060g0 g0Var7 = this.f187311c;
        C65066h0 h0Var4 = this.f187312d;
        C65060g0 g0Var8 = h0Var4.f187269a;
        C65060g0 g0Var9 = h0Var4.f187271c;
        C65066h0 h0Var5 = this.f187313e;
        if (h0Var5 != null) {
            g0Var3 = h0Var5.f187271c;
        }
        this.f187311c = mo89278a(g0Var7, g0Var8, g0Var9, g0Var3);
    }
}
