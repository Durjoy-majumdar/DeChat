package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.p026ui.C84560k4;

/* renamed from: com.tencent.mm.plugin.appbrand.x */
public class C85033x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f247802d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntime f247803e;

    public C85033x(AppBrandRuntime appBrandRuntime, int i) {
        this.f247803e = appBrandRuntime;
        this.f247802d = i;
    }

    public void run() {
        C84560k4 k4Var = this.f247803e.f238154s;
        if (k4Var != null) {
            k4Var.setProgress(this.f247802d);
        }
    }
}
