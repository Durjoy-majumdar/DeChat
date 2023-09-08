package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$m */
public class AppBrandRuntime$$m implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f238185d;

    public AppBrandRuntime$$m(AppBrandRuntime appBrandRuntime) {
        this.f238185d = appBrandRuntime;
    }

    public boolean onTimerExpired() {
        this.f238185d.mo113052e("onResourcePrepareTimeout", new Object[0]);
        this.f238185d.mo113005D0();
        return false;
    }
}
