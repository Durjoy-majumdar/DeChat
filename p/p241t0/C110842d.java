package p241t0;

import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: t0.d */
public final class C110842d extends C110849h {

    /* renamed from: f */
    public final C110849h f331601f;

    /* renamed from: g */
    public final C32226l<Object, C13598b0> f331602g;

    /* renamed from: t0.d$a */
    public static final class C110843a extends C87413o implements C32226l<Object, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Object, C13598b0> f331603d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Object, C13598b0> f331604e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110843a(C32226l<Object, C13598b0> lVar, C32226l<Object, C13598b0> lVar2) {
            super(1);
            this.f331603d = lVar;
            this.f331604e = lVar2;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g(obj, "state");
            this.f331603d.invoke(obj);
            this.f331604e.invoke(obj);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110842d(int i, C110860k kVar, C32226l<Object, C13598b0> lVar, C110849h hVar) {
        super(i, kVar, (C8480h) null);
        C87412m.m108594g(kVar, "invalid");
        C87412m.m108594g(hVar, "parent");
        this.f331601f = hVar;
        hVar.mo162425j(this);
        if (lVar != null) {
            C32226l<Object, C13598b0> f = hVar.mo162432f();
            if (f != null) {
                lVar = new C110843a(lVar, f);
            }
        } else {
            lVar = hVar.mo162432f();
        }
        this.f331602g = lVar;
    }

    /* renamed from: c */
    public void mo162424c() {
        if (!this.f331615c) {
            if (this.f331614b != this.f331601f.mo162463d()) {
                mo162462a();
            }
            this.f331601f.mo162426k(this);
            super.mo162424c();
        }
    }

    /* renamed from: f */
    public C32226l<Object, C13598b0> mo162432f() {
        return this.f331602g;
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
        C110878y.m151177a();
        throw null;
    }

    /* renamed from: k */
    public void mo162426k(C110849h hVar) {
        C87412m.m108594g(hVar, AppBrandFileCleaner.f238098c);
        C110878y.m151177a();
        throw null;
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
    public C110849h mo162428r(C32226l lVar) {
        return new C110842d(this.f331614b, this.f331613a, lVar, this.f331601f);
    }
}
