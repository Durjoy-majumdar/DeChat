package com.tencent.p014mm.plugin.appbrand.debugger;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83033t;
import gy3.C87412m;
import java.util.Map;
import kr0.C88267e;
import p284zb.C91655s;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.f0 */
public final class C81733f0 extends C91655s<C88267e> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81733f0(C88267e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
    }

    /* renamed from: p */
    public Map<String, C82870p> mo114097p() {
        C83033t tVar = new C83033t();
        tVar.mo115291h();
        Map<String, C82870p> map = tVar.f242761c;
        C87412m.m108593f(map, "getServiceApiPool()");
        return map;
    }
}
