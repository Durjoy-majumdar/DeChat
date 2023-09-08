package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81419l0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import p1039tb.C90388a;
import p224ra.C89909e;
import p963fc.C86812g;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.b0 */
public class C83009b0 extends C82016a0<C82554k> {
    public static final int CTRL_INDEX = 16;
    public static final String NAME = "setStorageSync";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        String str;
        C82554k kVar = (C82554k) fVar;
        String optString = jSONObject.optString("key");
        String optString2 = jSONObject.optString("data");
        String optString3 = jSONObject.optString("dataType");
        int i = 0;
        int optInt = jSONObject.optInt("storageId", 0);
        if (Util.isNullOrNil(optString)) {
            return mo115109j("fail:key is empty");
        }
        if (C81420m0.m99897c(optInt)) {
            return mo115109j("fail:nonexistent storage space");
        }
        if (Util.isNullOrNil(kVar.getAppId())) {
            return mo115109j("fail:appID is empty");
        }
        int i2 = ((C86812g) kVar.getRuntime()).mo113051d0().f234876S0.f239308i;
        int length = optString.length();
        if (optString2 != null) {
            i = optString2.length();
        }
        if (length + i > i2) {
            return mo115109j("fail:entry size limit reached");
        }
        int i3 = kVar.getRuntime().mo113051d0().f261073s;
        if (C90988l.m114155a(i3)) {
            str = mo115271w(kVar, optString, optString2, optString3, optInt);
        } else if (i3 == 3) {
            C82554k kVar2 = kVar;
            String str2 = optString;
            String str3 = optString2;
            String str4 = optString3;
            int i4 = optInt;
            String w = mo115271w(kVar2, str2, str3, str4, i4);
            mo115270v(kVar2, str2, str3, str4, i4);
            str = w;
        } else {
            str = mo115270v(kVar, optString, optString2, optString3, optInt);
        }
        return mo115109j(str);
    }

    /* renamed from: v */
    public final String mo115270v(C82554k kVar, String str, String str2, String str3, int i) {
        String str4;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JsApiSetStorageTask jsApiSetStorageTask = new JsApiSetStorageTask();
            jsApiSetStorageTask.f242681f = kVar.getAppId();
            jsApiSetStorageTask.f242682g = i;
            jsApiSetStorageTask.mo115260t(str, str2, str3);
            if (jsApiSetStorageTask.mo114396f()) {
                str4 = jsApiSetStorageTask.f242692t;
            } else {
                Log.m105921e("Luggage.FULL.JsApiSetStorageSync", "invokeWithDB appId[%s] key[%s] execSync failed", kVar.getAppId(), str);
                str4 = "fail";
            }
            return str4;
        } finally {
            C81419l0.m99894a(1, 1, C81420m0.m99896b(str, str2), 1, System.currentTimeMillis() - currentTimeMillis, kVar);
        }
    }

    /* renamed from: w */
    public final String mo115271w(C82554k kVar, String str, String str2, String str3, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return C83011c0.m101819d(((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(kVar.getAppId(), kVar.getRuntime().mo113051d0().f261073s, kVar.getRuntime().mo113051d0().f261075u).mo56595j0(i, kVar.getAppId(), str, str2, str3));
        } finally {
            C81419l0.m99894a(2, 1, C81420m0.m99896b(str, str2), 1, System.currentTimeMillis() - currentTimeMillis, kVar);
        }
    }
}
