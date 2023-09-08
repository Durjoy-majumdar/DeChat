package com.tencent.p014mm.plugin.appbrand;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$i */
public class AppBrandRuntime$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f238179d;

    public AppBrandRuntime$$i(AppBrandRuntime appBrandRuntime) {
        this.f238179d = appBrandRuntime;
    }

    public void run() {
        AppBrandRuntime appBrandRuntime = this.f238179d;
        C81820e3 e3Var = appBrandRuntime.f238142e;
        if (e3Var == null) {
            appBrandRuntime.mo113082u();
        } else {
            e3Var.mo113134k(appBrandRuntime);
        }
    }
}
