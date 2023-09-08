package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.c0 */
public final class C81235c0 implements Runnable {

    /* renamed from: d */
    public static final C81235c0 f238622d = new C81235c0();

    public final void run() {
        Log.m105924i("MicroMsg.IHugeAppBrandDataCleanupLogic.TestLogic", "run test clean logic");
        C81228b0.f238600a.run();
        AppBrandGlobalSystemConfig.m100099b().f239312p = C81238d0.f238635c;
        AppBrandGlobalSystemConfig.m100099b().f239311o = C81238d0.f238633a;
        Log.m105924i("MicroMsg.IHugeAppBrandDataCleanupLogic.TestLogic", "test clean logic finished");
    }
}
