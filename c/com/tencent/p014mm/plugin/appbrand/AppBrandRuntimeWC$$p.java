package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$p */
public class AppBrandRuntimeWC$$p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AppBrandRuntimeWC f238333b;

    /* renamed from: d */
    public final /* synthetic */ AppBrandInitConfigWC f238334d;

    public AppBrandRuntimeWC$$p(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f238333b = appBrandRuntimeWC;
        this.f238334d = appBrandInitConfigWC;
    }

    public void run() {
        AppBrandRuntimeWC.m99215F1(this.f238334d);
    }
}
