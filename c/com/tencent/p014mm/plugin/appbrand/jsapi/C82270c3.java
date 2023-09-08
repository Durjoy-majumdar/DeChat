package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p963fc.C86812g;
import wq0.C91065g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.c3 */
public class C82270c3 extends C82016a0<C81879g> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "getPluginPermissionBytes";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C81879g gVar = (C81879g) fVar;
        char c = 0;
        Log.m105925i("MicroMsg.JsApiGetPluginPermissionBytes", "invoke jsapi: %s", NAME);
        if (gVar == null) {
            Log.m105924i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:service is nil");
            return mo115109j("fail:service is nil");
        } else if (jSONObject2 == null) {
            Log.m105924i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:data is nil");
            return mo115109j("fail:data is nil");
        } else {
            C86812g gVar2 = gVar.getRuntime() instanceof C86812g ? (C86812g) gVar.getRuntime() : null;
            if (gVar2 == null) {
                Log.m105924i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:runtime is nil");
                return mo115109j("fail:runtime is nil");
            }
            C91065g gVar3 = gVar2.f251968f1;
            if (gVar3 == null) {
                Log.m105921e("MicroMsg.JsApiGetPluginPermissionBytes", "invoke failed, NULL permissionController with appId:%s", gVar2.f238147j);
                return mo115109j("fail:internal error");
            }
            try {
                JSONArray jSONArray = new JSONArray(jSONObject2.optString("pluginList"));
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                int i = 0;
                while (i < jSONArray.length()) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("pluginId");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("indexes");
                    Object[] objArr = new Object[2];
                    objArr[c] = optString;
                    objArr[1] = optJSONArray;
                    Log.m105925i("MicroMsg.JsApiGetPluginPermissionBytes", "pluginId:%s,indexes:%s", objArr);
                    if (optJSONArray == null) {
                        Log.m105924i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:indexes is nil");
                        return mo115109j("fail:indexes is nil");
                    }
                    byte[] g = gVar3.mo125132g(gVar, optString);
                    if (g != null) {
                        if (g.length > 0) {
                            Object[] objArr2 = new Object[2];
                            objArr2[c] = optString;
                            objArr2[1] = Integer.valueOf(g.length);
                            Log.m105925i("MicroMsg.JsApiGetPluginPermissionBytes", "pluginId:%s ctrlBytes:%d", objArr2);
                            JSONArray jSONArray2 = new JSONArray();
                            if (optJSONArray.length() == 0) {
                                for (int i2 = 0; i2 < g.length; i2++) {
                                    jSONArray2.put(gVar3.mo125129b(g, i2));
                                }
                            } else {
                                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                    jSONArray2.put(gVar3.mo125129b(g, optJSONArray.optInt(i3, -1)));
                                }
                            }
                            hashMap2.put(optString, jSONArray2);
                            i++;
                            c = 0;
                        }
                    }
                    Log.m105925i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:pluginId:%s ctrlBytes is empty", optString);
                    i++;
                    c = 0;
                }
                hashMap.put("pluginPermissionMap", hashMap2);
                Log.m105924i("MicroMsg.JsApiGetPluginPermissionBytes", "invoke JsApiGetPluginPermissionBytes ok");
                return mo115112m("ok", hashMap);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.JsApiGetPluginPermissionBytes", "parse pluginList error:%s", e);
                return mo115109j("fail:parse pluginList error");
            }
        }
    }
}
