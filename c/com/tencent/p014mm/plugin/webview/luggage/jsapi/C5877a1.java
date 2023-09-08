package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C60216z4;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.a1 */
public class C5877a1 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "openFinderView";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject jSONObject;
        Log.m105918d("MicroMsg.JsApiOpenFinderView", "invokeInMM");
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            bVar.mo6945a("data is null", (JSONObject) null);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("extInfo", new JSONObject(jSONObject.optString("extInfo")));
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76898xr(context, jSONObject2.toString(), (C60216z4.C8821a<Object>) null);
            bVar.mo6945a((String) null, (JSONObject) null);
        } catch (JSONException unused2) {
            bVar.mo6945a("fail", (JSONObject) null);
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }
}
