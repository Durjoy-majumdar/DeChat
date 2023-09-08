package p241t0;

import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: t0.f */
public final class C110846f extends C110849h {

    /* renamed from: f */
    public final C32226l<Object, C13598b0> f331610f;

    /* renamed from: g */
    public int f331611g = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110846f(int i, C110860k kVar, C32226l<Object, C13598b0> lVar) {
        super(i, kVar, (C8480h) null);
        C87412m.m108594g(kVar, "invalid");
        this.f331610f = lVar;
    }

    /* renamed from: c */
    public void mo162424c() {
        if (!this.f331615c) {
            mo162426k(this);
            super.mo162424c();
        }
    }

    /* renamed from: f */
    public C32226l<Object, C13598b0> mo162432f() {
        return this.f331610f;
    }

    /* renamed from: g */
    public boolean mo162433g() {
        return true;
    }

    /* renamed from: h */
    public C32226l<Object, C13598b0> mo162434h() {
        return null;
    }

    /* renamed from: j */
    public void mo162425j(C110849h hVar) {
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        this.f331611g++;
    }

    /* renamed from: k */
    public void mo162426k(C110849h hVar) {
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        int i = this.f331611g - 1;
        this.f331611g = i;
        if (i == 0) {
            mo162462a();
        }
    }

    /* renamed from: l */
    public void mo162427l() {
    }

    /* renamed from: m */
    public void mo162435m(C110851h0 h0Var) {
        C87412m.m108594g(h0Var, "state");
        C32226l<C110860k, C13598b0> lVar = C110865n.f331649a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    /* renamed from: r */
    public C110849h mo162428r(C32226l<Object, C13598b0> lVar) {
        C110865n.m151141d(this);
        return new C110842d(this.f331614b, this.f331613a, lVar, this);
    }
}
