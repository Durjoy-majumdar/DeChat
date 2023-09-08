package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.x */
public final class C82207x extends C82268c<C81879g> {
    public static final int CTRL_INDEX = 1041;
    public static final String NAME = "chooseLicensePlate";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81879g gVar = (C81879g) fVar;
        C87412m.m108594g(gVar, "env");
        C87412m.m108594g(jSONObject, "data");
        ((C119157j) C119157j.f356862d).mo183895z(new C82205w(gVar, i, this));
    }
}
