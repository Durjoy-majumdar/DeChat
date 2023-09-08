package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;

/* renamed from: com.tencent.mm.plugin.appbrand.page.e$$a */
public final /* synthetic */ class e$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83787e f244627d;

    public /* synthetic */ e$$a(C83787e eVar, C83853m4 m4Var) {
        this.f244627d = eVar;
    }

    public final void run() {
        C83780d1 d1Var = (C83780d1) this.f244627d.f244625d;
        AppBrandRuntime appBrandRuntime = d1Var.f244549A;
        if (appBrandRuntime != null && appBrandRuntime.mo113042Z() != null) {
            C83970x2 x2Var = appBrandRuntime.mo113042Z().f244753x;
            long D0 = d1Var.mo116149D0();
            x2Var.f245153c.remove(D0);
            x2Var.f245151a.remove(D0);
            x2Var.f245152b.remove(D0);
        }
    }
}
