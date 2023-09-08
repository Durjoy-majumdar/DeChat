package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Build;
import com.eclipsesource.mmv8.Platform;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.d3 */
public class C82368d3 extends C82016a0<C81879g> {
    private static final int CTRL_INDEX = 97;
    private static final String NAME = "getPublicLibVersion";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C81879g gVar = (C81879g) fVar;
        return !gVar.isRunning() ? mo115109j("fail js context not running") : mo115112m("ok", mo114774v(gVar));
    }

    /* renamed from: v */
    public Map<String, Object> mo114774v(C81879g gVar) {
        HashMap hashMap = new HashMap();
        AppBrandSysConfigLU appBrandSysConfigLU = (AppBrandSysConfigLU) gVar.mo109671p(AppBrandSysConfigLU.class);
        boolean z = true;
        hashMap.put("appDebug", Boolean.valueOf(appBrandSysConfigLU.f261072r.f238585d != 0));
        hashMap.put("appMd5", Util.nullAsNil(appBrandSysConfigLU.f261072r.md5));
        hashMap.put("appVersion", Integer.valueOf(appBrandSysConfigLU.f261072r.pkgVersion));
        ICommLibReader k = gVar.mo114272k();
        if (k != null) {
            WxaPkgWrappingInfo wxaPkgWrappingInfo = (WxaPkgWrappingInfo) k.mo113379c();
            if (wxaPkgWrappingInfo.f238585d == 0) {
                z = false;
            }
            hashMap.put("libDebug", Boolean.valueOf(z));
            hashMap.put("libMd5", Util.nullAsNil(wxaPkgWrappingInfo.md5));
            hashMap.put("libVersion", Integer.valueOf(wxaPkgWrappingInfo.pkgVersion));
        }
        hashMap.put("system", Platform.ANDROID);
        hashMap.put("systemVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        return hashMap;
    }
}
