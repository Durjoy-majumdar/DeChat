package com.tencent.p014mm.plugin.appbrand.page;

/* renamed from: com.tencent.mm.plugin.appbrand.page.t1$$c */
public final /* synthetic */ class t1$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f245034d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f245035e;

    public /* synthetic */ t1$$c(C83928t1 t1Var, Runnable runnable) {
        this.f245034d = t1Var;
        this.f245035e = runnable;
    }

    public final void run() {
        C83928t1 t1Var = this.f245034d;
        Runnable runnable = this.f245035e;
        if (runnable != null) {
            t1Var.getClass();
            runnable.run();
        }
        t1Var.f245023g1 = null;
    }
}
