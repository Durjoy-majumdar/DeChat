package com.tencent.p014mm.plugin.appbrand.performance;

import com.tencent.p014mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask;
import com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.performance.b */
public class C83993b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GetStorageSizeTask f245224d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandPerformanceManager.C83989b f245225e;

    public C83993b(AppBrandPerformanceManager.C83989b bVar, GetStorageSizeTask getStorageSizeTask) {
        this.f245225e = bVar;
        this.f245224d = getStorageSizeTask;
    }

    public void run() {
        AppBrandPerformanceManager.m103496e(this.f245225e.f245209d, 401, Util.getSizeKB((long) this.f245224d.f242657g));
        this.f245224d.mo114397h();
    }
}
