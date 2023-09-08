package com.tencent.p014mm.plugin.appbrand;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeSuspendingWatchDog$watch$1;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.p1 */
public abstract class C83726p1 implements ComponentCallbacks2 {
    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
    }

    public void onTrimMemory(int i) {
        if (i == 5 || i == 10 || i == 15 || i == 80) {
            ((AppBrandRuntimeSuspendingWatchDog$watch$1.C81089a) this).onLowMemory();
        }
    }
}
