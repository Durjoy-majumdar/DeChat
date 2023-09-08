package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.p */
public final class C1937p extends C82268c<C81879g> {
    @Deprecated
    public static final int CTRL_INDEX = 201;
    @Deprecated
    public static final String NAME = "openUrl";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        boolean z = true;
        if (jSONObject == null || !jSONObject.has("url")) {
            z = false;
        }
        if (z) {
            C83571d.m102592a(gVar != null ? gVar.getContext() : null, new C1936o(this, gVar, i, jSONObject.getString("url")));
        } else if (gVar != null) {
            gVar.mo109647a(i, mo115109j("fail:invalid data"));
        }
    }
}
