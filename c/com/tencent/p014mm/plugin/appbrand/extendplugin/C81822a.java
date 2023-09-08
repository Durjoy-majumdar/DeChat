package com.tencent.p014mm.plugin.appbrand.extendplugin;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.extendplugin.a */
public class C81822a {
    /* renamed from: a */
    public static void m100417a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SameLayer.AppBrandExtendPluginUtil", "build json object fail", e);
        }
    }
}
