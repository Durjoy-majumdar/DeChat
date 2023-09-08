package com.tencent.p014mm.plugin.webview.luggage;

import org.json.JSONObject;
import p828wa.C53099d;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n$$k */
public class n$$k extends C53099d {

    /* renamed from: a */
    public final /* synthetic */ String f117979a;

    public n$$k(C43658n nVar, String str) {
        this.f117979a = str;
    }

    /* renamed from: a */
    public JSONObject mo14701a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", this.f117979a);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public String mo14702b() {
        return "activity:state_change";
    }
}
