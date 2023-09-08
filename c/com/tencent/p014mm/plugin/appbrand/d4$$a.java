package com.tencent.p014mm.plugin.appbrand;

import bp0.C79745a;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask$$e;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.d4$$a */
public final /* synthetic */ class d4$$a implements AppBrandPreInitTask$$e {

    /* renamed from: a */
    public final /* synthetic */ AppBrandRuntimeWC f239769a;

    public /* synthetic */ d4$$a(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f239769a = appBrandRuntimeWC;
    }

    /* renamed from: a */
    public final void mo114042a(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f239769a;
        Log.m105925i("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForAttrAsyncUpdated AppBrandPreInitTask callback %s", appBrandInitConfigWC);
        if (appBrandInitConfigWC == null) {
            Log.m105921e("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForAttrAsyncUpdated preInitTask callback with null config, appId:%s", appBrandRuntimeWC.f238147j);
            appBrandRuntimeWC.mo113006E();
        } else if (!appBrandRuntimeWC.f238117P && !appBrandRuntimeWC.mo113064k0()) {
            appBrandInitConfigWC.f234834c1 = appBrandStatObject;
            appBrandRuntimeWC.mo113024P0(new C81821e4(appBrandRuntimeWC, C79745a.NeedLatestVersion, appBrandInitConfigWC));
        }
    }
}
