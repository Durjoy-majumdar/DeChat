package com.tencent.p014mm.plugin.appbrand;

/* renamed from: com.tencent.mm.plugin.appbrand.f1 */
public class C81830f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81812e1 f240097d;

    public C81830f1(C81812e1 e1Var) {
        this.f240097d = e1Var;
    }

    public void run() {
        AppBrandRuntime activeRuntime = this.f240097d.getActiveRuntime();
        if (activeRuntime != null) {
            activeRuntime.mo113000A();
        }
    }
}
