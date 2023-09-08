package n04;

import g04.C20770i;
import gy3.C87412m;
import java.util.List;
import o04.C25323e;
import o04.C25333m;
import p04.C25413f;
import p04.C25417j;
import sx3.C64186f0;

/* renamed from: n04.e */
public abstract class C25116e extends C25176s0 {

    /* renamed from: e */
    public final C25333m f71549e;

    /* renamed from: f */
    public final boolean f71550f;

    /* renamed from: g */
    public final C20770i f71551g;

    public C25116e(C25333m mVar, boolean z) {
        C87412m.m108594g(mVar, "originalTypeVariable");
        this.f71549e = mVar;
        this.f71550f = z;
        this.f71551g = C25417j.m32697b(C25413f.STUB_TYPE_SCOPE, mVar.toString());
    }

    /* renamed from: I0 */
    public List<C25158m1> mo37079I0() {
        return C64186f0.f181907d;
    }

    /* renamed from: J0 */
    public C25122g1 mo37080J0() {
        C25122g1.f71557e.getClass();
        return C25122g1.f71558f;
    }

    /* renamed from: L0 */
    public boolean mo37082L0() {
        return this.f71550f;
    }

    /* renamed from: M0 */
    public C25143j0 mo37083M0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: P0 */
    public C25198y1 mo37085P0(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: Q0 */
    public C25198y1 mo51873Q0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return this;
    }

    /* renamed from: R0 */
    public C25176s0 mo37086R0(boolean z) {
        return z == this.f71550f ? this : mo52228T0(z);
    }

    /* renamed from: S0 */
    public C25176s0 mo37087S0(C25122g1 g1Var) {
        C87412m.m108594g(g1Var, "newAttributes");
        return this;
    }

    /* renamed from: T0 */
    public abstract C25116e mo52228T0(boolean z);

    /* renamed from: n */
    public C20770i mo37088n() {
        return this.f71551g;
    }
}
