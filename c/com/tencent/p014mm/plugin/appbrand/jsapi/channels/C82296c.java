package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82366d;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83125x6;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.c */
public abstract class C82296c extends C82268c<C82381f> implements C82366d<C82381f> {
    /* renamed from: c */
    public final void mo114544c(C83125x6<C82381f> x6Var) {
        C87412m.m108594g(x6Var, "invokeContext");
        mo114706w(x6Var.f242916b, x6Var.f242917c, x6Var.f242918d, x6Var.f242919e);
    }

    /* renamed from: u */
    public final void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
    }

    /* renamed from: w */
    public abstract void mo114706w(C82381f fVar, JSONObject jSONObject, JSONObject jSONObject2, int i);
}
