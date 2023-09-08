package a04;

import g04.C20770i;
import gy3.C87412m;
import java.util.List;
import n04.C25122g1;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25158m1;
import n04.C25176s0;
import n04.C25198y1;
import o04.C25323e;
import p04.C25413f;
import p04.C25417j;
import q04.C25521d;
import sx3.C64186f0;

/* renamed from: a04.a */
public final class C23604a extends C25176s0 implements C25521d {

    /* renamed from: e */
    public final C25158m1 f67741e;

    /* renamed from: f */
    public final C23605b f67742f;

    /* renamed from: g */
    public final boolean f67743g;

    /* renamed from: h */
    public final C25122g1 f67744h;

    public C23604a(C25158m1 m1Var, C23605b bVar, boolean z, C25122g1 g1Var) {
        C87412m.m108594g(m1Var, "typeProjection");
        C87412m.m108594g(bVar, "constructor");
        C87412m.m108594g(g1Var, "attributes");
        this.f67741e = m1Var;
        this.f67742f = bVar;
        this.f67743g = z;
        this.f67744h = g1Var;
    }

    /* renamed from: I0 */
    public List<C25158m1> mo37079I0() {
        return C64186f0.f181907d;
    }

    /* renamed from: J0 */
    public C25122g1 mo37080J0() {
        return this.f67744h;
    }

    /* renamed from: K0 */
    public C25144j1 mo37081K0() {
        return this.f67742f;
    }

    /* renamed from: L0 */
    public boolean mo37082L0() {
        return this.f67743g;
    }

    /* renamed from: M0 */
    public C25143j0 mo37083M0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C25158m1 n = this.f67741e.mo52298n(eVar);
        C87412m.m108593f(n, "typeProjection.refine(kotlinTypeRefiner)");
        return new C23604a(n, this.f67742f, this.f67743g, this.f67744h);
    }

    /* renamed from: O0 */
    public C25198y1 mo37084O0(boolean z) {
        return z == this.f67743g ? this : new C23604a(this.f67741e, this.f67742f, z, this.f67744h);
    }

    /* renamed from: P0 */
    public C25198y1 mo37085P0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C25158m1 n = this.f67741e.mo52298n(eVar);
        C87412m.m108593f(n, "typeProjection.refine(kotlinTypeRefiner)");
        return new C23604a(n, this.f67742f, this.f67743g, this.f67744h);
    }

    /* renamed from: R0 */
    public C25176s0 mo37086R0(boolean z) {
        return z == this.f67743g ? this : new C23604a(this.f67741e, this.f67742f, z, this.f67744h);
    }

    /* renamed from: S0 */
    public C25176s0 mo37087S0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return new C23604a(this.f67741e, this.f67742f, this.f67743g, g1Var);
    }

    /* renamed from: n */
    public C20770i mo37088n() {
        return C25417j.m32696a(C25413f.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.f67741e);
        sb.append(')');
        sb.append(this.f67743g ? "?" : "");
        return sb.toString();
    }
}
