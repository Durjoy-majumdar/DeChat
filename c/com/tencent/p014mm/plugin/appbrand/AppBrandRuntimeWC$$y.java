package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.ipc.C1537g;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$y */
public class AppBrandRuntimeWC$$y extends AppBrandRuntime$$z {

    /* renamed from: b */
    public final /* synthetic */ AppBrandRuntimeWC f238351b;

    public AppBrandRuntimeWC$$y(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f238351b = appBrandRuntimeWC;
    }

    /* renamed from: b */
    public void mo54191b() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f238351b;
        boolean z = AppBrandRuntimeWC.f238264Q1;
        C83226n.m102130g(appBrandRuntimeWC.f238147j, KSProcessWeAppLaunch.stepPrepareMainProcess);
        C1537g.m1524a(new C84347u1(appBrandRuntimeWC, this), appBrandRuntimeWC);
    }
}
