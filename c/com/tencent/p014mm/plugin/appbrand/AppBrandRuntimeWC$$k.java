package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$k */
public class AppBrandRuntimeWC$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f238326d;

    public AppBrandRuntimeWC$$k(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f238326d = appBrandRuntimeWC;
    }

    public void run() {
        AppBrandPerformanceManager.m103493b(this.f238326d);
    }
}
