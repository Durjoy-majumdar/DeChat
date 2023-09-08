package com.tencent.p014mm.plugin.appbrand.utils;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.r0 */
public final class C84780r0 {
    /* renamed from: a */
    public static final int m104449a(C82381f fVar) {
        C87412m.m108594g(fVar, "component");
        Context context = fVar.getContext();
        ActivityManager activityManager = (ActivityManager) (context != null ? context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME) : null);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        long j = (long) 1024;
        return (int) ((memoryInfo.totalMem / j) / j);
    }
}
