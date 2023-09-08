package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.u */
public final class C83439u extends C87413o implements C32226l<C84310k, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandInitConfigWC f243824d;

    /* renamed from: e */
    public final /* synthetic */ C83436t f243825e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandStatObject f243826f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83439u(AppBrandInitConfigWC appBrandInitConfigWC, C83436t tVar, AppBrandStatObject appBrandStatObject) {
        super(1);
        this.f243824d = appBrandInitConfigWC;
        this.f243825e = tVar;
        this.f243826f = appBrandStatObject;
    }

    public Object invoke(Object obj) {
        C84310k kVar = (C84310k) obj;
        C87412m.m108594g(kVar, "process");
        this.f243824d.f239377h1 = kVar.mo111367l();
        this.f243824d.f234811P = AppBrandProcessesManager.f246131g.mo116962a().mo111403q(kVar);
        C32228q<AppBrandInitConfigWC, AppBrandStatObject, C84310k, C13598b0> qVar = this.f243825e.f243817c;
        if (qVar != null) {
            qVar.invoke(this.f243824d, this.f243826f, kVar);
        }
        return C13598b0.f38549a;
    }
}
