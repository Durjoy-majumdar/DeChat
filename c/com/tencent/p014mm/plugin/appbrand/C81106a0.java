package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;

/* renamed from: com.tencent.mm.plugin.appbrand.a0 */
public class C81106a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f238372d;

    public C81106a0(AppBrandRuntime appBrandRuntime) {
        this.f238372d = appBrandRuntime;
    }

    public void run() {
        C83226n.m102130g(this.f238372d.f238147j, KSProcessWeAppLaunch.stepServiceInit);
        C83226n.m102130g(this.f238372d.f238147j, KSProcessWeAppLaunch.stepServiceInit_Game);
        this.f238372d.f238150p.mo114348s0();
    }
}
