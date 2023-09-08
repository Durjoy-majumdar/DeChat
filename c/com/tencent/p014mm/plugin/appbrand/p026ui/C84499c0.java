package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.c0 */
public final class C84499c0 {
    /* renamed from: a */
    public static final long m104087a() {
        if (!m104089c()) {
            return 500;
        }
        return PluginAppBrand.getProcessSharedPrefs().getLong("AppBrandDebugUI.PAGE_CONTAINER_NAVIGATION_PUSH_TIMEOUT", 500);
    }

    /* renamed from: b */
    public static final boolean m104088b() {
        if (!m104089c()) {
            return false;
        }
        return PluginAppBrand.getProcessSharedPrefs().getBoolean("AppBrandDebugUI.WEAPP_ALL_CONTACT_TRANSPARENT_BACKGROUND_ENABLED", false);
    }

    /* renamed from: c */
    public static final boolean m104089c() {
        return (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger()) && !WeChatEnvironment.isMonkeyEnv();
    }
}
