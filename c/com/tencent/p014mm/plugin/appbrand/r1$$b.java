package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.r1$$b */
public final /* synthetic */ class r1$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84090r1 f245510d;

    public /* synthetic */ r1$$b(C84090r1 r1Var) {
        this.f245510d = r1Var;
    }

    public final void run() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f245510d.f245506c;
        Log.m105925i("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForAttrAsyncUpdated appId:%s, isSplashing:%b", appBrandRuntimeWC.f238147j, Boolean.valueOf(appBrandRuntimeWC.f238155t));
        appBrandRuntimeWC.f238157v.mo121778b(new C81901h4(appBrandRuntimeWC.f238141d, appBrandRuntimeWC));
    }
}
