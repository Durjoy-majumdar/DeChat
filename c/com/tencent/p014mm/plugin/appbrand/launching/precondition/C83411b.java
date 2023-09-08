package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.b */
public class C83411b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83410a f243766d;

    public C83411b(C83410a aVar) {
        this.f243766d = aVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "finishUiEnv InUiEnv");
        if (this.f243766d.getBaseContext() instanceof AppBrandLaunchProxyUI) {
            ((AppBrandLaunchProxyUI) this.f243766d.getBaseContext()).finish();
        }
        this.f243766d.setBaseContext(MMApplicationContext.getContext());
        this.f243766d.f243760d = true;
    }
}
