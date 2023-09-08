package com.tencent.p014mm.plugin.webview.luggage;

import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.o */
public class C43664o extends C53099d {

    /* renamed from: a */
    public final /* synthetic */ String f118034a;

    public C43664o(C43667p pVar, String str) {
        this.f118034a = str;
    }

    /* renamed from: a */
    public JSONObject mo14701a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("smiley", this.f118034a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public String mo14702b() {
        return "onGetSmiley";
    }
}
