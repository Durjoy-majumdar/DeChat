package com.tencent.p014mm.plugin.appbrand;

import p225rc.C89917h;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$j */
public class AppBrandRuntime$$j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Runnable f238180d;

    /* renamed from: e */
    public final /* synthetic */ Object f238181e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandRuntime f238182f;

    public AppBrandRuntime$$j(AppBrandRuntime appBrandRuntime, Runnable runnable, Object obj) {
        this.f238182f = appBrandRuntime;
        this.f238180d = runnable;
        this.f238181e = obj;
    }

    public void run() {
        C89917h.m112458a(this.f238182f.mo113026R());
        if (!this.f238182f.f238116N || this.f238182f.mo113064k0()) {
            AppBrandRuntime appBrandRuntime = this.f238182f;
            C81820e3 e3Var = appBrandRuntime.f238142e;
            if (e3Var == null) {
                appBrandRuntime.mo113082u();
            } else {
                e3Var.mo113134k(appBrandRuntime);
            }
            Runnable runnable = this.f238180d;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        AppBrandRuntime appBrandRuntime2 = this.f238182f;
        C81820e3 e3Var2 = appBrandRuntime2.f238142e;
        if (e3Var2 == null || !e3Var2.mo113124e(appBrandRuntime2)) {
            this.f238182f.mo113086w();
            Runnable runnable2 = this.f238180d;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        AppBrandRuntime appBrandRuntime3 = this.f238182f;
        appBrandRuntime3.f238142e.mo113138s(appBrandRuntime3, this.f238181e, this.f238180d);
    }
}
