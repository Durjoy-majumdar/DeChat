package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.x6 */
public final class C83125x6<ENV extends C82381f> {

    /* renamed from: a */
    public final C40482o f242915a;

    /* renamed from: b */
    public final ENV f242916b;

    /* renamed from: c */
    public final JSONObject f242917c;

    /* renamed from: d */
    public final JSONObject f242918d;

    /* renamed from: e */
    public final int f242919e;

    public C83125x6(C40482o oVar, ENV env, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        C87412m.m108594g(env, "invokeEnv");
        C87412m.m108594g(jSONObject, "data");
        this.f242915a = oVar;
        this.f242916b = env;
        this.f242917c = jSONObject;
        this.f242918d = jSONObject2;
        this.f242919e = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C83125x6)) {
            return false;
        }
        C83125x6 x6Var = (C83125x6) obj;
        return C87412m.m108589b(this.f242915a, x6Var.f242915a) && C87412m.m108589b(this.f242916b, x6Var.f242916b) && C87412m.m108589b(this.f242917c, x6Var.f242917c) && C87412m.m108589b(this.f242918d, x6Var.f242918d) && this.f242919e == x6Var.f242919e;
    }

    public int hashCode() {
        C40482o oVar = this.f242915a;
        int i = 0;
        int hashCode = (((((oVar == null ? 0 : oVar.hashCode()) * 31) + this.f242916b.hashCode()) * 31) + this.f242917c.hashCode()) * 31;
        JSONObject jSONObject = this.f242918d;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return ((hashCode + i) * 31) + this.f242919e;
    }

    public String toString() {
        return "JsInvokeContext(jsRuntime=" + this.f242915a + ", invokeEnv=" + this.f242916b + ", data=" + this.f242917c + ", privateData=" + this.f242918d + ", callbackId=" + this.f242919e + ')';
    }
}
