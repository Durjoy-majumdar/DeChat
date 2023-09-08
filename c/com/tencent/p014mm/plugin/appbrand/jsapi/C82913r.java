package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r */
public abstract class C82913r {

    /* renamed from: a */
    public C81925i2 f242395a;

    /* renamed from: b */
    public C83780d1 f242396b;

    /* renamed from: c */
    public JSONObject f242397c;

    /* renamed from: d */
    public int f242398d;

    /* renamed from: e */
    public C82870p f242399e;

    public C82913r(C82870p pVar, C81925i2 i2Var, C83780d1 d1Var, JSONObject jSONObject, int i) {
        if (pVar == null || i2Var == null || jSONObject == null) {
            throw new IllegalArgumentException("JsApiAsyncRequest");
        }
        this.f242399e = pVar;
        this.f242395a = i2Var;
        this.f242396b = d1Var;
        this.f242398d = i;
        this.f242397c = jSONObject;
    }
}
