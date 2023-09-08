package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86300q;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.a$$a */
public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandInitConfigWC f243765d;

    public /* synthetic */ a$$a(AppBrandInitConfigWC appBrandInitConfigWC) {
        this.f243765d = appBrandInitConfigWC;
    }

    public final void run() {
        AppBrandInitConfigWC appBrandInitConfigWC = this.f243765d;
        Log.m105924i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "finish, dispatch onStartAppBrandUI");
        WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = appBrandInitConfigWC.f239392w1;
        if (weAppOpenUICallbackIPCProxy != null) {
            C86300q qVar = weAppOpenUICallbackIPCProxy.f243389g;
            if (qVar != null) {
                qVar.mo63856d();
            }
            weAppOpenUICallbackIPCProxy.f243389g = null;
        }
    }
}
