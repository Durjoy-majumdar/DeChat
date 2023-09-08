package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.appbrand.c2 */
public class C81599c2 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f239263d;

    public C81599c2(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f239263d = appBrandRuntimeWC;
    }

    public boolean onTimerExpired() {
        AppBrandPerformanceManager.m103493b(this.f239263d);
        return true;
    }
}
