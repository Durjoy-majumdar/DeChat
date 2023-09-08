package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$m */
public class e$$m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f54746d;

    /* renamed from: e */
    public final /* synthetic */ C19391e f54747e;

    public e$$m(C19391e eVar, JSONObject jSONObject) {
        this.f54747e = eVar;
        this.f54746d = jSONObject;
    }

    public void run() {
        C43261a.m46837a(this.f54747e, "notifyNumReddotChange", this.f54746d.toString());
    }
}
