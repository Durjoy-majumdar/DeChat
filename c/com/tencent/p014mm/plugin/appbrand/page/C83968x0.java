package com.tencent.p014mm.plugin.appbrand.page;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.page.x0 */
public class C83968x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f245147d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f245148e;

    /* renamed from: f */
    public final /* synthetic */ C83849m0 f245149f;

    public C83968x0(C83849m0 m0Var, String str, JSONObject jSONObject) {
        this.f245149f = m0Var;
        this.f245147d = str;
        this.f245148e = jSONObject;
    }

    public void run() {
        this.f245149f.mo116380z(this.f245147d, C83817h4.REDIRECT_TO, this.f245148e);
    }
}
