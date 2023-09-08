package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.d0 */
public final class C82418d0 extends C82268c<C81879g> {
    @Deprecated
    private static final int CTRL_INDEX = 908;
    @Deprecated
    private static final String NAME = "loadWAFile";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        C87412m.m108594g(gVar, "env");
        C82870p.C82871a a = C82424e0.f241513g.mo114809a(gVar, "Luggage.JsApiLoadWAFile", jSONObject);
        gVar.mo109647a(i, C87412m.m108589b(a.f242317b, "ok") ? mo115117r(gVar, a.f242317b, a.f242316a) : mo115112m(a.f242317b, a.f242316a));
    }
}
