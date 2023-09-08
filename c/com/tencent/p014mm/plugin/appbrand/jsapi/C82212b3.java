package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import li0.C88508b;
import org.json.JSONArray;
import org.json.JSONObject;
import p963fc.C86812g;
import wq0.C91065g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b3 */
public class C82212b3 extends C82016a0<C81879g> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "getPermissionBytes";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C81879g gVar = (C81879g) fVar;
        int i = 0;
        Log.m105925i("MicroMsg.JsApiGetPermissionBytes", "invoke jsapi: %s", NAME);
        if (gVar == null) {
            Log.m105924i("MicroMsg.JsApiGetPermissionBytes", "fail:service is nil");
            return mo115109j("fail:service is nil");
        } else if (jSONObject == null) {
            Log.m105924i("MicroMsg.JsApiGetPermissionBytes", "fail:data is nil");
            return mo115109j("fail:data is nil");
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("indexes");
            if (optJSONArray == null) {
                Log.m105924i("MicroMsg.JsApiGetPermissionBytes", "fail:indexes is nil");
                return mo115109j("fail:indexes is nil");
            }
            C86812g gVar2 = gVar.getRuntime() instanceof C86812g ? (C86812g) gVar.getRuntime() : null;
            if (gVar2 == null) {
                Log.m105924i("MicroMsg.JsApiGetPermissionBytes", "fail:runtime is nil");
                return mo115109j("fail:runtime is nil");
            }
            C91065g gVar3 = gVar2.f251968f1;
            if (gVar3 == null) {
                Log.m105921e("MicroMsg.JsApiGetPermissionBytes", "invoke failed, NULL permissionController with appId:%s", gVar2.f238147j);
                return mo115109j("fail:internal error");
            }
            byte[] e = gVar3.mo125131e(gVar, gVar.getAppId(), (C88508b[]) null);
            if (e == null || e.length <= 0) {
                Log.m105924i("MicroMsg.JsApiGetPermissionBytes", "fail:ctrlBytes is empty");
                return mo115109j("fail:ctrlBytes is empty");
            }
            JSONArray jSONArray = new JSONArray();
            if (optJSONArray.length() == 0) {
                while (i < e.length) {
                    jSONArray.put(gVar3.mo125129b(e, i));
                    i++;
                }
            } else {
                while (i < optJSONArray.length()) {
                    jSONArray.put(gVar3.mo125129b(e, optJSONArray.optInt(i, -1)));
                    i++;
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("permissionBytes", jSONArray);
            Log.m105924i("MicroMsg.JsApiGetPermissionBytes", "invoke getPermissionBytes ok");
            return mo115112m("ok", hashMap);
        }
    }
}
