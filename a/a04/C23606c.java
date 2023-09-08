package a04;

import gy3.C87412m;
import java.util.Collection;
import java.util.List;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25158m1;
import n04.C25202z1;
import o04.C25323e;
import o04.C25327i;
import sx3.C26236u;
import sx3.C64186f0;
import ty3.C26336h;
import wy3.C22935h;
import wy3.C26446d1;

/* renamed from: a04.c */
public final class C23606c implements C23605b {

    /* renamed from: a */
    public final C25158m1 f67745a;

    /* renamed from: b */
    public C25327i f67746b;

    public C23606c(C25158m1 m1Var) {
        C87412m.m108594g(m1Var, "projection");
        this.f67745a = m1Var;
        m1Var.mo52295a();
    }

    public List<C26446d1> getParameters() {
        return C64186f0.f181907d;
    }

    public C25158m1 getProjection() {
        return this.f67745a;
    }

    /* renamed from: m */
    public C26336h mo37092m() {
        C26336h m = this.f67745a.getType().mo37081K0().mo37092m();
        C87412m.m108593f(m, "projection.type.constructor.builtIns");
        return m;
    }

    /* renamed from: n */
    public C25144j1 mo37093n(C25323e eVar) {
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C25158m1 n = this.f67745a.mo52298n(eVar);
        C87412m.m108593f(n, "projection.refine(kotlinTypeRefiner)");
        return new C23606c(n);
    }

    /* renamed from: o */
    public /* bridge */ /* synthetic */ C22935h mo37094o() {
        return null;
    }

    /* renamed from: p */
    public boolean mo37095p() {
        return false;
    }

    /* renamed from: r */
    public Collection<C25143j0> mo37096r() {
        Object type = this.f67745a.mo52295a() == C25202z1.OUT_VARIANCE ? this.f67745a.getType() : mo37092m().mo53324p();
        C87412m.m108593f(type, "if (projection.projectio… builtIns.nullableAnyType");
        return C26236u.m33719b(type);
    }

    public String toString() {
        return "CapturedTypeConstructor(" + this.f67745a + ')';
    }
}
