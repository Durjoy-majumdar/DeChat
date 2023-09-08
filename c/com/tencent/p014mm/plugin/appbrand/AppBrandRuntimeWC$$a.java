package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$a */
public final /* synthetic */ class AppBrandRuntimeWC$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f238301d;

    /* renamed from: e */
    public final /* synthetic */ long f238302e;

    public /* synthetic */ AppBrandRuntimeWC$$a(AppBrandRuntimeWC appBrandRuntimeWC, long j) {
        this.f238301d = appBrandRuntimeWC;
        this.f238302e = j;
    }

    public final void run() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f238301d;
        long j = this.f238302e;
        boolean z = AppBrandRuntimeWC.f238264Q1;
        appBrandRuntimeWC.getClass();
        QualitySessionRuntime a = C84185b.m103768a(appBrandRuntimeWC);
        if (a != null && a.f245860u <= 0) {
            a.f245860u = j;
        }
    }
}
