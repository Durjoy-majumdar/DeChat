package com.tencent.p014mm.plugin.appbrand.task.preload;

import com.tencent.p014mm.plugin.appbrand.task.preload.C84327g;
import com.tencent.p014mm.plugin.appbrand.utils.C84753j0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.mm.plugin.appbrand.task.preload.h */
public final class C84330h extends C84753j0 {

    /* renamed from: d */
    public static final C84330h f246220d = new C84330h();

    public void onTrimMemory(int i) {
        if (i == 5 || i == 10 || i == 15) {
            C84327g.C84329b bVar = C84327g.f246215a;
            Log.m105924i("MicroMsg.AppBrand.PreloadIntervalLimiter", "onTrimMemory level=" + i + ", process=" + MMApplicationContext.getProcessName());
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175912v(915, 21);
            if (i == 5) {
                nVar.mo175912v(915, 24);
            } else if (i == 10) {
                nVar.mo175912v(915, 25);
            } else if (i == 15) {
                nVar.mo175912v(915, 26);
            } else if (i == 40) {
                nVar.mo175912v(915, 27);
            } else if (i == 60) {
                nVar.mo175912v(915, 28);
            } else if (i == 80) {
                nVar.mo175912v(915, 29);
            }
            MultiProcessMMKV.getMMKV("__appbrand__preload__interval__limiter__").edit().putLong("hold_until_ms", TimeUnit.MINUTES.toMillis(10) + Util.nowMilliSecond()).apply();
        }
    }
}
