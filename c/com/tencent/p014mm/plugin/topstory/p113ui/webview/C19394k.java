package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.k */
public class C19394k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f54754d;

    /* renamed from: e */
    public final /* synthetic */ C19391e f54755e;

    public C19394k(C19391e eVar, JSONObject jSONObject) {
        this.f54755e = eVar;
        this.f54754d = jSONObject;
    }

    public void run() {
        C43261a.m46837a(this.f54755e, "onVideoPlayInfo", this.f54754d.toString());
    }
}
