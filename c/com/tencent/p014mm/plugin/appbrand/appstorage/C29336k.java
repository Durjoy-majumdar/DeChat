package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.k */
public final class C29336k {

    /* renamed from: a */
    public static final C29336k f80092a;

    /* renamed from: b */
    public static volatile boolean f80093b = false;

    /* renamed from: c */
    public static volatile int f80094c = 1;

    static {
        C29336k kVar = new C29336k();
        f80092a = kVar;
        kVar.mo56616b();
    }

    /* renamed from: a */
    public final synchronized boolean mo56615a() {
        C81161g2.vx0().getClass();
        C81161g2.requireAccountInitializedOnDemand();
        return f80094c == 2;
    }

    /* renamed from: b */
    public final synchronized void mo56616b() {
        Log.m105924i("MicroMsg.AppBrandKVStorageTransferABTest", "[load]");
        f80093b = true;
        f80094c = 3;
        Log.m105924i("MicroMsg.AppBrandKVStorageTransferABTest", "[load] isNeedTransfer=" + f80093b + "  phases=" + f80094c);
        Log.m105924i("MicroMsg.AppBrandKVStorageTransferABTest", "[load] isPerformanceReportOn=false");
    }
}
