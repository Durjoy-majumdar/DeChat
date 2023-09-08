package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81559o;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$b0 */
public final /* synthetic */ class AppBrandRuntimeWC$$b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f74765d;

    /* renamed from: e */
    public final /* synthetic */ long f74766e;

    /* renamed from: f */
    public final /* synthetic */ C81559o f74767f;

    public /* synthetic */ AppBrandRuntimeWC$$b0(AppBrandRuntimeWC appBrandRuntimeWC, long j, C81559o oVar) {
        this.f74765d = appBrandRuntimeWC;
        this.f74766e = j;
        this.f74767f = oVar;
    }

    public final void run() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f74765d;
        long j = this.f74766e;
        C81559o oVar = this.f74767f;
        if (appBrandRuntimeWC.f238271G1.indexOfKey(j) >= 0) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "notifyBackgroundFetchDataThrottling timestamp:%d dispatched, skip", Long.valueOf(j));
            return;
        }
        oVar.mo115194p((C88267e) appBrandRuntimeWC.f238150p);
        oVar.mo115158h();
        appBrandRuntimeWC.f238271G1.put(j, appBrandRuntimeWC);
    }
}
