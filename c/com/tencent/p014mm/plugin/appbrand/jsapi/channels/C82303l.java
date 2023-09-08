package com.tencent.p014mm.plugin.appbrand.jsapi.channels;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;
import kr0.C88267e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.l */
public final class C82303l<CONTEXT extends C88267e> extends C55486k<CONTEXT> {
    /* renamed from: w */
    public String mo77021w(C82381f fVar) {
        C87412m.m108594g(fVar, "env");
        if (!(fVar instanceof C88267e)) {
            return "";
        }
        AppBrandRuntimeWC N0 = ((C88267e) fVar).getRuntime();
        String I1 = N0 != null ? N0.mo113177I1() : null;
        return I1 == null ? "" : I1;
    }
}
