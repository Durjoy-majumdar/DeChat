package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81648d;
import com.tencent.p014mm.plugin.appbrand.launching.C83316f1;
import com.tencent.p014mm.plugin.appbrand.launching.C83323g;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84274b0;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import di0.C86297n;
import di0.C86299o;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import ky2.C10432i;
import lg3.C76695c;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.t */
public final class C83436t {

    /* renamed from: a */
    public final int f243815a;

    /* renamed from: b */
    public final C86299o f243816b;

    /* renamed from: c */
    public final C32228q<AppBrandInitConfigWC, AppBrandStatObject, C84310k, C13598b0> f243817c;

    /* renamed from: d */
    public final C86297n f243818d;

    /* renamed from: e */
    public final boolean f243819e;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.t$a */
    public static final class C83437a extends C87413o implements C32226l<C84310k, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandInitConfigWC f243820d;

        /* renamed from: e */
        public final /* synthetic */ C83436t f243821e;

        /* renamed from: f */
        public final /* synthetic */ LaunchParcel f243822f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83437a(AppBrandInitConfigWC appBrandInitConfigWC, C83436t tVar, LaunchParcel launchParcel) {
            super(1);
            this.f243820d = appBrandInitConfigWC;
            this.f243821e = tVar;
            this.f243822f = launchParcel;
        }

        public Object invoke(Object obj) {
            C84310k kVar = (C84310k) obj;
            C87412m.m108594g(kVar, "process");
            this.f243820d.f239377h1 = kVar.mo111367l();
            this.f243820d.f234811P = AppBrandProcessesManager.f246131g.mo116962a().mo111403q(kVar);
            C32228q<AppBrandInitConfigWC, AppBrandStatObject, C84310k, C13598b0> qVar = this.f243821e.f243817c;
            if (qVar != null) {
                AppBrandInitConfigWC appBrandInitConfigWC = this.f243820d;
                C87412m.m108593f(appBrandInitConfigWC, "config");
                AppBrandStatObject appBrandStatObject = this.f243822f.f243738o;
                C87412m.m108593f(appBrandStatObject, "parcel.statObj");
                qVar.invoke(appBrandInitConfigWC, appBrandStatObject, kVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.t$b */
    public static final class C83438b extends C87413o implements C32227p<AppBrandInitConfigWC, AppBrandStatObject, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C83436t f243823d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83438b(C83436t tVar) {
            super(2);
            this.f243823d = tVar;
        }

        public Object invoke(Object obj, Object obj2) {
            AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) obj;
            AppBrandStatObject appBrandStatObject = (AppBrandStatObject) obj2;
            C87412m.m108594g(appBrandInitConfigWC, "config");
            C87412m.m108594g(appBrandStatObject, "stat");
            C84274b0 b0Var = new C84274b0(appBrandInitConfigWC, appBrandStatObject, (ActivityStarterIpcDelegate) null);
            AppBrandProcessesManager.f246131g.mo116962a().mo116949M(b0Var.f234998a, b0Var, new C83439u(appBrandInitConfigWC, this.f243823d, appBrandStatObject));
            return C13598b0.f38549a;
        }
    }

    public C83436t(int i, C86299o oVar, C32228q<? super AppBrandInitConfigWC, ? super AppBrandStatObject, ? super C84310k, C13598b0> qVar, C86297n nVar, boolean z) {
        C87412m.m108594g(oVar, "bundle");
        this.f243815a = i;
        this.f243816b = oVar;
        this.f243817c = qVar;
        this.f243818d = nVar;
        this.f243819e = z;
    }

    /* renamed from: a */
    public final void mo115726a() {
        try {
            C83316f1.f243478a.mo115607a(this.f243816b);
        } catch (Exception e) {
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                throw e;
            }
            C86297n nVar = this.f243818d;
            if (nVar != null) {
                C86297n.C86298a.m106900a(nVar, -1, (String) null, 2, (Object) null);
            }
        }
        LaunchParcel f = C83316f1.f243478a.mo115612f(this.f243816b);
        f.f243720L = C80247h.PRE_RENDER;
        f.mo115684d();
        String str = this.f243816b.f250930b;
        boolean z = true;
        String g = !(str == null || str.length() == 0) ? this.f243816b.f250930b : C83435s.m102390g(f);
        String e2 = C84201i.m103808e(f, g, false);
        if (!(g == null || g.length() == 0)) {
            z = false;
        }
        if (!z && C81289m.C81290a.m99664b(this.f243816b.f250931c)) {
            AppBrandProcessesManager.C84268b bVar = AppBrandProcessesManager.f246131g;
            AppBrandProcessesManager a = bVar.mo116962a();
            C87412m.m108593f(g, "appId");
            if (a.mo111385G(g, this.f243816b.f250931c)) {
                AppBrandInitConfigWC h = C81648d.m100144g().mo113992b(g);
                f.mo115681b(h);
                h.f234807K = f.f243743t;
                h.f234809M = f.f243744u;
                h.f239384o1 = f.f243712D;
                h.f239390u1 = f.f243719K;
                LaunchParamsOptional launchParamsOptional = f.f243740q;
                h.f234819T0 = launchParamsOptional != null ? launchParamsOptional.f237922h : 0;
                h.f234799C = launchParamsOptional != null ? launchParamsOptional.f237923i : null;
                h.f234813Q0 = f.f243711C;
                h.f239379j1 = new QualitySession(e2, h, f.f243738o);
                h.mo111298i(e2);
                h.f239379j1.f245839n = false;
                h.f234825W0 = false;
                h.f234836p0 = f.f243722N;
                h.f234845x0 = C76695c.m92341b();
                h.f234847y0 = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
                C83323g.m102275a(h, f.f243738o);
                AppBrandStatObject appBrandStatObject = f.f243738o;
                C87412m.m108593f(appBrandStatObject, "parcel.statObj");
                bVar.mo116962a().mo116949M(g, new C84274b0(h, appBrandStatObject, (ActivityStarterIpcDelegate) null), new C83437a(h, this, f));
                return;
            }
        }
        ((C119157j) C119157j.f356862d).mo183870a(new C83431r(this.f243815a, f, e2, new C83438b(this), this.f243818d, this.f243819e));
    }
}
