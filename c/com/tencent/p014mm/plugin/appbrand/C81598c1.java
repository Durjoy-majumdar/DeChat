package com.tencent.p014mm.plugin.appbrand;

/* renamed from: com.tencent.mm.plugin.appbrand.c1 */
public class C81598c1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeContainer f239262d;

    public C81598c1(AppBrandRuntimeContainer appBrandRuntimeContainer) {
        this.f239262d = appBrandRuntimeContainer;
    }

    public void run() {
        AppBrandRuntime activeRuntime = this.f239262d.getActiveRuntime();
        if (activeRuntime != null) {
            activeRuntime.mo113086w();
        }
    }
}
