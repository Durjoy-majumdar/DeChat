package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.c */
public final class C83556c {

    /* renamed from: a */
    public final C83588k f244105a;

    /* renamed from: b */
    public C83596o f244106b;

    public C83556c(C83588k kVar) {
        C87412m.m108594g(kVar, "runtime");
        this.f244105a = kVar;
    }

    /* renamed from: a */
    public final void mo115875a(C1938p pVar, int i, String str) {
        C87412m.m108594g(pVar, "component");
        C87412m.m108594g(str, "data");
        C83596o oVar = this.f244106b;
        if (oVar != null) {
            oVar.mo115856a(pVar, i, str);
        } else {
            C87412m.m108603p("invokeProcess");
            throw null;
        }
    }
}
