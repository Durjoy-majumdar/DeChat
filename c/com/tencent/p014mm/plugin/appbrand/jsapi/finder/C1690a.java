package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.a */
public class C1690a {
    /* renamed from: a */
    public static final String m1745a(String str, int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("errMsg", str);
            jSONObject2.put("errCode", i);
            jSONObject2.put("data", jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject2.toString();
    }
}
