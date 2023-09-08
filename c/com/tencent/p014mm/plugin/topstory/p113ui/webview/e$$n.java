package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$n */
public class e$$n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f54748d;

    /* renamed from: e */
    public final /* synthetic */ C19391e f54749e;

    public e$$n(C19391e eVar, JSONObject jSONObject) {
        this.f54749e = eVar;
        this.f54748d = jSONObject;
    }

    public void run() {
        C43261a.m46837a(this.f54749e, "notifyReddot", this.f54748d.toString());
    }
}
