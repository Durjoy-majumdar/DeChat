package com.tencent.p014mm.plugin.appbrand.page;

import org.json.JSONObject;
import sq0.C13773f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$u */
public class m0$$u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f244825d;

    /* renamed from: e */
    public final /* synthetic */ String f244826e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f244827f;

    /* renamed from: g */
    public final /* synthetic */ C13773f f244828g;

    /* renamed from: h */
    public final /* synthetic */ C83849m0 f244829h;

    public m0$$u(C83849m0 m0Var, int i, String str, JSONObject jSONObject, C13773f fVar) {
        this.f244829h = m0Var;
        this.f244825d = i;
        this.f244826e = str;
        this.f244827f = jSONObject;
        this.f244828g = fVar;
    }

    public void run() {
        C83849m0.m103129f(this.f244829h, this.f244825d, this.f244826e, this.f244827f, this.f244828g);
    }
}
