package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import lg3.C76695c;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53096b;
import xi3.C78844a;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.i0 */
public class C5928i0 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "getUserConfig";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 1;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        Log.m105918d("MicroMsg.JsApiGetUserConfig", "invokeInMM");
        JSONObject jSONObject = new JSONObject();
        try {
            boolean h = C78844a.C15689b.f42385a.mo108842h(true);
            boolean b = C76695c.m92341b();
            jSONObject.put("isAccessibilityMode", h);
            jSONObject.put("isCareMode", b);
            Log.m105925i("MicroMsg.JsApiGetUserConfig", "isAccessibilityMode:%b, isCareMode:%b", Boolean.valueOf(h), Boolean.valueOf(b));
        } catch (JSONException unused) {
        }
        bVar.mo6945a((String) null, jSONObject);
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }
}
