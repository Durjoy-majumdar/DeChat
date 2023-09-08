package com.tencent.p014mm.plugin.appbrand.menu;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.l */
public final class C83681l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f244306d;

    public C83681l(C83928t1 t1Var) {
        this.f244306d = t1Var;
    }

    public final void run() {
        this.f244306d.getRuntime().mo113015J0((AppBrandInitConfig) null, "MenuDelegate_Restart");
    }
}
