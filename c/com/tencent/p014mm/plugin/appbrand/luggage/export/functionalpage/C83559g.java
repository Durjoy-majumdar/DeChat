package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81831f2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.g */
public final class C83559g implements C81831f2 {

    /* renamed from: a */
    public static final C83559g f244110a = new C83559g();

    /* renamed from: b */
    public static final boolean m102556b(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        C87412m.m108594g(appBrandInitConfigWC, "config");
        C87412m.m108594g(appBrandStatObject, "stat");
        return 1111 == appBrandStatObject.f245533f;
    }

    /* renamed from: a */
    public AppBrandRuntimeWC mo114226a(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandRuntimeContainerWC appBrandRuntimeContainerWC) {
        C87412m.m108594g(appBrandInitConfigWC, "config");
        C87412m.m108594g(appBrandRuntimeContainerWC, "container");
        AppBrandStatObject appBrandStatObject = appBrandInitConfigWC.f234834c1;
        C87412m.m108593f(appBrandStatObject, "config.statObject");
        if (m102556b(appBrandInitConfigWC, appBrandStatObject)) {
            return new C83588k(appBrandRuntimeContainerWC);
        }
        return null;
    }
}
