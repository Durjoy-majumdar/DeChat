package n04;

import g04.C20770i;
import gy3.C87412m;
import o04.C25333m;

/* renamed from: n04.a1 */
public final class C25103a1 extends C25116e {

    /* renamed from: h */
    public final C25144j1 f71535h;

    /* renamed from: i */
    public final C20770i f71536i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25103a1(C25333m mVar, boolean z, C25144j1 j1Var) {
        super(mVar, z);
        C87412m.m108594g(mVar, "originalTypeVariable");
        C87412m.m108594g(j1Var, "constructor");
        this.f71535h = j1Var;
        this.f71536i = mVar.mo37092m().mo53314f().mo37088n();
    }

    /* renamed from: K0 */
    public C25144j1 mo37081K0() {
        return this.f71535h;
    }

    /* renamed from: T0 */
    public C25116e mo52228T0(boolean z) {
        return new C25103a1(this.f71549e, z, this.f71535h);
    }

    /* renamed from: n */
    public C20770i mo37088n() {
        return this.f71536i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stub (BI): ");
        sb.append(this.f71549e);
        sb.append(this.f71550f ? "?" : "");
        return sb.toString();
    }
}
