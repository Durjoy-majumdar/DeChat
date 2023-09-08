package com.tencent.p014mm.plugin.appbrand.debugger;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import org.json.JSONObject;
import p284zb.C91635f;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.j */
public class C81739j extends C82016a0<C81879g> {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "remoteDebugInfo";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C81925i2 b = C82644m7.m101431b((C81879g) fVar);
        C81740p pVar = b instanceof C91635f ? (C81740p) ((C91635f) b).mo125517G0(C81740p.class) : null;
        if (pVar == null) {
            return mo115109j("fail:not debug");
        }
        pVar.mo114091I(jSONObject.toString());
        return mo115109j("ok");
    }
}
