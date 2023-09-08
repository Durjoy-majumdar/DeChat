package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81414g0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81420m0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fl0.C86920e;
import fl0.C86922g;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p1039tb.C90388a;
import p224ra.C89909e;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.a */
public final class C83002a {

    /* renamed from: a */
    public static final C83002a f242693a = new C83002a();

    /* renamed from: a */
    public final String mo115263a(C82870p pVar, C82554k kVar, JSONObject jSONObject) {
        int i;
        String str;
        int i2;
        C82870p pVar2 = pVar;
        JSONObject jSONObject2 = jSONObject;
        C87412m.m108594g(pVar2, "jsapi");
        if (kVar == null) {
            return "";
        }
        if (jSONObject2 == null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            String p = pVar2.mo115115p("fail:jsapi invalid request data", jSONObject3);
            C87412m.m108593f(p, "jsapi.makeReturnJson(App…ral.INVALID_REQUEST_DATA)");
            return p;
        }
        int optInt = jSONObject2.optInt("storageId");
        if (C81420m0.m99897c(optInt)) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 800001, "fail:nonexistent storage space");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("errno", 800001);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            String p2 = pVar2.mo115115p("fail:nonexistent storage space", jSONObject4);
            C87412m.m108593f(p2, "jsapi.makeReturnJson(App…ONEXISTENT_STORAGE_SPACE)");
            return p2;
        }
        String appId = kVar.getAppId();
        C87412m.m108593f(appId, "env.appId");
        if (Util.isNullOrNil(appId)) {
            String j = pVar2.mo115109j("fail:appID is empty");
            C87412m.m108593f(j, "jsapi.makeReturnJson(App…yncJsApi.API_APPID_EMPTY)");
            return j;
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("keyList");
        if (optJSONArray == null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
            }
            JSONObject jSONObject5 = new JSONObject();
            try {
                jSONObject5.put("errno", 101);
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
            }
            String p3 = pVar2.mo115115p("fail:jsapi invalid request data", jSONObject5);
            C87412m.m108593f(p3, "jsapi.makeReturnJson(App…ral.INVALID_REQUEST_DATA)");
            return p3;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = optJSONArray.length();
        int i3 = 0;
        while (i3 < length) {
            String string = optJSONArray.getString(i3);
            C87412m.m108593f(string, "keyJSonArray.getString(index)");
            arrayList2.add(string);
            i3++;
            optJSONArray = optJSONArray;
        }
        AppBrandRuntime runtime = kVar.getRuntime();
        C90988l d0 = runtime != null ? runtime.mo113051d0() : null;
        if (d0 == null) {
            if (BuildInfo.DEBUG) {
                i2 = 101;
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
            } else {
                i2 = 101;
            }
            JSONObject jSONObject6 = new JSONObject();
            try {
                jSONObject6.put("errno", i2);
            } catch (Exception e4) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
            }
            String p4 = pVar2.mo115115p("fail:jsapi invalid request data", jSONObject6);
            C87412m.m108593f(p4, "jsapi.makeReturnJson(App…ral.INVALID_REQUEST_DATA)");
            return p4;
        }
        for (Object[] next : ((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(kVar.getAppId(), d0.f261073s, d0.f261075u).mo56594g5(optInt, appId, arrayList2)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object obj = next[0];
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appstorage.IAppBrandKVStorage.ErrorType");
            C81414g0.C29326a aVar = (C81414g0.C29326a) obj;
            C81414g0.C29326a aVar2 = C81414g0.C29326a.NONE;
            if (aVar == aVar2) {
                Object obj2 = next[1];
                if (obj2 == null) {
                    obj2 = "";
                }
                str = (String) obj2;
            } else {
                str = "";
            }
            linkedHashMap.put("data", str);
            String str2 = "Null";
            if (aVar == aVar2) {
                Object obj3 = next[2];
                if (obj3 != null) {
                    str2 = obj3;
                }
                str2 = str2;
            }
            linkedHashMap.put("dataType", str2);
            arrayList.add(linkedHashMap);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dataList", arrayList);
        if (BuildInfo.DEBUG) {
            i = 0;
            Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 0, "ok");
        } else {
            i = 0;
        }
        hashMap.put("errno", Integer.valueOf(i));
        String o = pVar2.mo115114o("ok", hashMap);
        C87412m.m108593f(o, "jsapi.makeReturnJson(App…dErrors.General.OK, this)");
        return o;
    }

    /* renamed from: b */
    public final String mo115264b(C82870p pVar, C82554k kVar, JSONObject jSONObject) {
        C82870p pVar2 = pVar;
        JSONObject jSONObject2 = jSONObject;
        C87412m.m108594g(pVar2, "jsapi");
        if (kVar == null) {
            return "";
        }
        if (jSONObject2 == null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e);
            }
            String p = pVar2.mo115115p("fail:jsapi invalid request data", jSONObject3);
            C87412m.m108593f(p, "jsapi.makeReturnJson(App…ral.INVALID_REQUEST_DATA)");
            return p;
        }
        int optInt = jSONObject2.optInt("storageId");
        if (C81420m0.m99897c(optInt)) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 800001, "fail:nonexistent storage space");
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("errno", 800001);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e2);
            }
            String p2 = pVar2.mo115115p("fail:nonexistent storage space", jSONObject4);
            C87412m.m108593f(p2, "jsapi.makeReturnJson(App…ONEXISTENT_STORAGE_SPACE)");
            return p2;
        }
        String appId = kVar.getAppId();
        C87412m.m108593f(appId, "env.appId");
        if (Util.isNullOrNil(appId)) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 1005, "fail:invalid appid");
            }
            JSONObject jSONObject5 = new JSONObject();
            try {
                jSONObject5.put("errno", 1005);
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e3);
            }
            String p3 = pVar2.mo115115p("fail:invalid appid", jSONObject5);
            C87412m.m108593f(p3, "jsapi.makeReturnJson(App…API_SERVER_INVALID_APPID)");
            return p3;
        }
        C90988l d0 = kVar.getRuntime().mo113051d0();
        if (d0 == null) {
            Log.m105921e("MicroMsg.AppBrandBatchStorageApiOp", "invoke with appId[%s] , NULL sysConfig", kVar.getAppId());
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 4, "fail:internal error");
            }
            JSONObject jSONObject6 = new JSONObject();
            try {
                jSONObject6.put("errno", 4);
            } catch (Exception e4) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e4);
            }
            String p4 = pVar2.mo115115p("fail:internal error", jSONObject6);
            C87412m.m108593f(p4, "jsapi.makeReturnJson(App…s.General.INTERNAL_ERROR)");
            return p4;
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("kvList");
        if (optJSONArray == null) {
            if (BuildInfo.DEBUG) {
                Log.m105919d("MicroMsg.AppBrandJsApi", "makeReturnJson, errno: %d, reason: %s", 101, "fail:jsapi invalid request data");
            }
            JSONObject jSONObject7 = new JSONObject();
            try {
                jSONObject7.put("errno", 101);
            } catch (Exception e5) {
                Log.m105921e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e5);
            }
            String p5 = pVar2.mo115115p("fail:jsapi invalid request data", jSONObject7);
            C87412m.m108593f(p5, "jsapi.makeReturnJson(App…ral.INVALID_REQUEST_DATA)");
            return p5;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject8 = optJSONArray.getJSONObject(i);
            String optString = jSONObject8.optString("key");
            String optString2 = jSONObject8.optString("data");
            String optString3 = jSONObject8.optString("dataType");
            if (optString == null) {
                optString = "";
            }
            if (optString2 == null) {
                optString2 = "";
            }
            if (optString3 == null) {
                optString3 = "";
            }
            arrayList.add(new C81414g0.C29327b(optString, optString2, optString3));
        }
        C81414g0.C29326a T0 = ((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(kVar.getAppId(), d0.f261073s, d0.f261075u).mo56591T0(optInt, appId, arrayList);
        String l = pVar2.mo115111l((String) null, T0 == C81414g0.C29326a.NONE ? C86920e.f252311a : T0 == C81414g0.C29326a.QUOTA_REACHED ? C86922g.f252341b : C86922g.f252340a, (JSONObject) null);
        C87412m.m108593f(l, "jsapi.makeReturnJson(result)");
        return l;
    }
}
