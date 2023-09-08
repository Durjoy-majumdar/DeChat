package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$k */
public class e$$k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f54740d;

    /* renamed from: e */
    public final /* synthetic */ boolean f54741e;

    /* renamed from: f */
    public final /* synthetic */ String f54742f;

    /* renamed from: g */
    public final /* synthetic */ C19391e f54743g;

    public e$$k(C19391e eVar, boolean z, boolean z2, String str) {
        this.f54743g = eVar;
        this.f54740d = z;
        this.f54741e = z2;
        this.f54742f = str;
    }

    public void run() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("granted", this.f54740d);
            jSONObject.put("retCode", 0);
            jSONObject.put("dialogShowed", this.f54741e);
        } catch (JSONException unused) {
        }
        C43261a.m46837a(this.f54743g, this.f54742f, jSONObject.toString());
    }
}
