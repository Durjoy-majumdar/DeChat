package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.page.m0$$a0;

/* renamed from: com.tencent.mm.plugin.appbrand.z */
public class C85045z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f247827d;

    /* renamed from: com.tencent.mm.plugin.appbrand.z$a */
    public class C85046a implements m0$$a0 {
        public C85046a() {
        }
    }

    public C85045z(AppBrandRuntime appBrandRuntime) {
        this.f247827d = appBrandRuntime;
    }

    public void run() {
        AppBrandRuntime appBrandRuntime = this.f247827d;
        appBrandRuntime.f238152q = appBrandRuntime.mo113076r();
        this.f247827d.f238152q.setOnReadyListener(new C85046a());
        C81932i4 i4Var = C81932i4.AppBrandPageContainer;
        AppBrandRuntime appBrandRuntime2 = this.f247827d;
        i4Var.mo114355a(appBrandRuntime2, appBrandRuntime2.f238152q);
        this.f247827d.f238152q.mo115883w(this.f247827d.f238149o.f239367i);
    }
}
