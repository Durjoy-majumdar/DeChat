package n04;

import fy3.C32226l;
import g04.C20770i;
import gy3.C87412m;
import java.util.List;
import o04.C25323e;
import p04.C25412e;
import p04.C25418k;

/* renamed from: n04.t0 */
public final class C25179t0 extends C25176s0 {

    /* renamed from: e */
    public final C25144j1 f71626e;

    /* renamed from: f */
    public final List<C25158m1> f71627f;

    /* renamed from: g */
    public final boolean f71628g;

    /* renamed from: h */
    public final C20770i f71629h;

    /* renamed from: i */
    public final C32226l<C25323e, C25176s0> f71630i;

    public C25179t0(C25144j1 j1Var, List<? extends C25158m1> list, boolean z, C20770i iVar, C32226l<? super C25323e, ? extends C25176s0> lVar) {
        C87412m.m108594g(j1Var, "constructor");
        C87412m.m108594g(list, "arguments");
        C87412m.m108594g(iVar, "memberScope");
        C87412m.m108594g(lVar, "refinedTypeFactory");
        this.f71626e = j1Var;
        this.f71627f = list;
        this.f71628g = z;
        this.f71629h = iVar;
        this.f71630i = lVar;
        if ((iVar instanceof C25412e) && !(iVar instanceof C25418k)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + iVar + 10 + j1Var);
        }
    }

    /* renamed from: I0 */
    public List<C25158m1> mo37079I0() {
        return this.f71627f;
    }

    /* renamed from: J0 */
    public C25122g1 mo37080J0() {
        C25122g1.f71557e.getClass();
        return C25122g1.f71558f;
    }

    /* renamed from: K0 */
    public C25144j1 mo37081K0() {
        return this.f71626e;
    }

    /* renamed from: L0 */
    public boolean mo37082L0() {
        return this.f71628g;
    }

    /* renamed from: M0 */
    public C25143j0 mo37083M0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C25176s0 invoke = this.f71630i.invoke(eVar);
        return invoke == null ? this : invoke;
    }

    /* renamed from: P0 */
    public C25198y1 mo37085P0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C25176s0 invoke = this.f71630i.invoke(eVar);
        return invoke == null ? this : invoke;
    }

    /* renamed from: R0 */
    public C25176s0 mo37086R0(boolean z) {
        return z == this.f71628g ? this : z ? new C25170q0(this) : new C25163o0(this);
    }

    /* renamed from: S0 */
    public C25176s0 mo37087S0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return g1Var.isEmpty() ? this : new C25183u0(this, g1Var);
    }

    /* renamed from: n */
    public C20770i mo37088n() {
        return this.f71629h;
    }
}
