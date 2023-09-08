package com.tencent.p014mm.plugin.appbrand;

/* renamed from: com.tencent.mm.plugin.appbrand.g1 */
public class C81881g1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81812e1 f240174d;

    public C81881g1(C81812e1 e1Var) {
        this.f240174d = e1Var;
    }

    public void run() {
        AppBrandRuntime activeRuntime = this.f240174d.getActiveRuntime();
        if (activeRuntime != null) {
            activeRuntime.mo113086w();
        }
    }
}
