package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import eb0.C31543z5;
import org.json.JSONObject;
import t03.C22426h;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$l */
public class e$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f54744d;

    /* renamed from: e */
    public final /* synthetic */ C19391e f54745e;

    public e$$l(C19391e eVar, JSONObject jSONObject) {
        this.f54745e = eVar;
        this.f54744d = jSONObject;
    }

    public void run() {
        C43261a.m46837a(this.f54745e, "onSearchDataReady", this.f54744d.toString());
        C22426h.m26099a(this.f54745e.f54732e, "dataReady", C31543z5.m39453c());
    }
}
