package com.tencent.p014mm.plugin.appbrand;

import br0.C79778e;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$e */
public final /* synthetic */ class AppBrandRuntimeWC$$e implements C79778e.C79779a {

    /* renamed from: a */
    public final /* synthetic */ AppBrandRuntimeWC f238318a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f238319b;

    public /* synthetic */ AppBrandRuntimeWC$$e(AppBrandRuntimeWC appBrandRuntimeWC, Runnable runnable) {
        this.f238318a = appBrandRuntimeWC;
        this.f238319b = runnable;
    }

    /* renamed from: g */
    public final void mo109919g(C79778e.C79780b bVar, boolean z) {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f238318a;
        Runnable runnable = this.f238319b;
        boolean z2 = AppBrandRuntimeWC.f238264Q1;
        Log.m105925i("MicroMsg.AppBrandRuntimeWC", "startPrepareOrientation, onOrientationChanged appId[%s], orientation[%s] success[%b]", appBrandRuntimeWC.f238147j, bVar, Boolean.valueOf(z));
        appBrandRuntimeWC.mo113052e("mayRequestOrientation [END]", new Object[0]);
        appBrandRuntimeWC.mo113052e("startPrepareOrientation [END]", new Object[0]);
        if (runnable != null) {
            runnable.run();
        }
    }
}
