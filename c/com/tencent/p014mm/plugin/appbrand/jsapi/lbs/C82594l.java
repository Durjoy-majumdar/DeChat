package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.l */
public class C82594l<CONTEXT extends C82381f> extends C82576b<CONTEXT> {
    private static final int CTRL_INDEX = 340;
    private static final String NAME = "enableLocationUpdate";

    /* renamed from: h */
    public C82581d0 f241719h;

    /* renamed from: x */
    public void mo114896x(CONTEXT context, JSONObject jSONObject, int i) {
        Log.m105925i("MicroMsg.AppBrand.JsApiEnableLocationUpdate", "enableLocationUpdate:%s", jSONObject);
        C82581d0 d0Var = (C82581d0) context.mo109666h(C82581d0.class);
        this.f241719h = d0Var;
        if (d0Var == null) {
            C82581d0 z = mo114902z(context);
            this.f241719h = z;
            z.start();
            context.mo109672s(this.f241719h);
        }
        this.f241719h.f241698g = mo114901y(context, jSONObject);
        String optString = jSONObject.optString("type", "gcj02");
        C82581d0 d0Var2 = this.f241719h;
        d0Var2.f241699h = optString;
        d0Var2.f241700i = false;
        d0Var2.sendMessage(1);
        context.mo109647a(i, mo115109j("ok"));
    }

    /* renamed from: y */
    public Bundle mo114901y(CONTEXT context, JSONObject jSONObject) {
        throw null;
    }

    /* renamed from: z */
    public C82581d0 mo114902z(CONTEXT context) {
        throw null;
    }
}
