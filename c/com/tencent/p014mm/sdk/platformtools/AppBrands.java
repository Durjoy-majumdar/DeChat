package com.tencent.p014mm.sdk.platformtools;

import java.util.concurrent.Callable;

/* renamed from: com.tencent.mm.sdk.platformtools.AppBrands */
public final class AppBrands {
    private static Callable<AppBrandAppInfo> sAppBrandInfoGetterSupplier = new Callable<AppBrandAppInfo>() {
        public AppBrandAppInfo call() {
            return null;
        }
    };

    /* renamed from: com.tencent.mm.sdk.platformtools.AppBrands$AppBrandAppInfo */
    public static final class AppBrandAppInfo {
        public String appId;
        public String appName;
        public int appServiceType;
        public int appType;
        public int appVersion;
        public int renderBackend;
    }

    public static AppBrandAppInfo getAppBrandInfo() {
        try {
            return sAppBrandInfoGetterSupplier.call();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isAppBrandProc() {
        return MMApplicationContext.isAppBrandProcess();
    }

    public static void setAppBrandInfoGetterSupplier(Callable<AppBrandAppInfo> callable) {
        sAppBrandInfoGetterSupplier = callable;
    }
}
