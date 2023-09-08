package com.tencent.p014mm.plugin.appbrand;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.XWebSdk;
import gy3.C87412m;
import js0.C88015a;

/* renamed from: com.tencent.mm.plugin.appbrand.n */
public final class C83702n extends C88015a {
    public void onActivityStarted(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if ((activity instanceof AppBrandUI) && XWebSdk.isXWebView()) {
            MultiProcessMMKV.getMMKV("MicroMsg.AppBrandPersistentRuntimeConfig").putBoolean("KEY_XWEB_INSTALLED", XWebSdk.hasXWebFeature(2003)).commit();
        }
    }
}
