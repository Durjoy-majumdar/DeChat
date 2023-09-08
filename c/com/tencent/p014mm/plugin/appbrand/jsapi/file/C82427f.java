package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82430g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.f */
public abstract class C82427f<T extends C82430g> extends C82016a0 {

    /* renamed from: g */
    public final T f241515g;

    public C82427f(T t) {
        this.f241515g = t;
        t.f241517a = this;
    }

    /* renamed from: h */
    public boolean mo114532h() {
        return true;
    }

    /* renamed from: t */
    public final String mo1731t(C82381f fVar, JSONObject jSONObject) {
        return mo114482u(fVar, jSONObject, fVar.getJsRuntime());
    }

    /* renamed from: u */
    public String mo114482u(C82381f fVar, JSONObject jSONObject, C40482o oVar) {
        C82446i a = this.f241515g.mo114811a(fVar, oVar, jSONObject);
        return mo115117r(fVar, a.f242317b, a.f242316a);
    }
}
