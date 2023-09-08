package com.tencent.mapsdk.internal;

import android.content.Context;

/* renamed from: com.tencent.mapsdk.internal.mk */
public class C113958mk extends C113955mh {

    /* renamed from: b */
    private static volatile C113958mk f340844b = null;

    /* renamed from: c */
    private static final String f340845c = "com.tencent.tencentmap.mapsdk.maps.offlinemap";

    private C113958mk(Context context) {
        if (context != null) {
            this.f340836a = context.getSharedPreferences(f340845c, 0);
            if (f340844b != null) {
                mo172396a(new String[]{"taiwanClearCacheVersion", "taiwanStyle", "taiwanVersion", "mapPoiIcon", "worldTileCount", "rttConfigVersion", "rttConfigMd5", "closeRoadSytleNomalModeVersion", "closeRoadSytleNomalModeMd5", "closeRoadStyleTrafficModeVersion", "closeRoadStyleTrafficModeMd5", "offlineCityListVersion", "offlineCityListMd5"});
                String a = mo172391a(C0939el.f2175e);
                if (a != null && C113798hb.m157079b("4.1.0", a) > 0) {
                    mo172392a();
                }
            }
        }
    }

    /* renamed from: a */
    public static C113958mk m157962a(Context context) {
        if (f340844b == null) {
            synchronized (C113958mk.class) {
                if (f340844b == null) {
                    f340844b = new C113958mk(context);
                }
            }
        }
        return f340844b;
    }

    /* renamed from: b */
    private void m157963b() {
        if (f340844b != null) {
            mo172396a(new String[]{"taiwanClearCacheVersion", "taiwanStyle", "taiwanVersion", "mapPoiIcon", "worldTileCount", "rttConfigVersion", "rttConfigMd5", "closeRoadSytleNomalModeVersion", "closeRoadSytleNomalModeMd5", "closeRoadStyleTrafficModeVersion", "closeRoadStyleTrafficModeMd5", "offlineCityListVersion", "offlineCityListMd5"});
            String a = mo172391a(C0939el.f2175e);
            if (a != null && C113798hb.m157079b("4.1.0", a) > 0) {
                mo172392a();
            }
        }
    }
}
