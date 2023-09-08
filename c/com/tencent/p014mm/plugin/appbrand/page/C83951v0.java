package com.tencent.p014mm.plugin.appbrand.page;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.page.v0 */
public class C83951v0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f245095d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f245096e;

    /* renamed from: f */
    public final /* synthetic */ C83849m0 f245097f;

    public C83951v0(C83849m0 m0Var, String str, JSONObject jSONObject) {
        this.f245097f = m0Var;
        this.f245095d = str;
        this.f245096e = jSONObject;
    }

    public void run() {
        this.f245097f.mo116380z(this.f245095d, C83817h4.NAVIGATE_TO, this.f245096e);
    }
}
