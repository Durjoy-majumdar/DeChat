package com.tencent.p014mm.plugin.appbrand;

import com.tencent.luggage.sdk.launching.C80247h;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.s3 */
public final class C84252s3 implements C81691d3 {

    /* renamed from: a */
    public AppBrandInitConfigWC f246091a;

    /* renamed from: b */
    public final AppBrandRuntimeWC f246092b;

    public C84252s3(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandRuntimeWC appBrandRuntimeWC) {
        C87412m.m108594g(appBrandInitConfigWC, "updatedConfig");
        C87412m.m108594g(appBrandRuntimeWC, "rt");
        this.f246091a = appBrandInitConfigWC;
        this.f246092b = appBrandRuntimeWC;
    }

    /* renamed from: a */
    public void mo113277a(AppBrandInitConfigWC appBrandInitConfigWC) {
        C87412m.m108594g(appBrandInitConfigWC, "newConfig");
        this.f246091a = appBrandInitConfigWC;
    }

    /* renamed from: b */
    public Boolean mo113278b(AppBrandInitConfigWC appBrandInitConfigWC) {
        C87412m.m108594g(appBrandInitConfigWC, "newConfig");
        C83928t1 J1 = this.f246092b.mo113178J1();
        String str = J1 != null ? J1.f244582x0 : null;
        String str2 = appBrandInitConfigWC.f239367i;
        AppBrandInitConfigWC appBrandInitConfigWC2 = this.f246091a;
        int i = appBrandInitConfigWC2.f234834c1.f245533f;
        int i2 = appBrandInitConfigWC.f234834c1.f245533f;
        C80247h hVar = appBrandInitConfigWC2.f234829Y0;
        if (hVar != C80247h.PRE_RENDER || hVar == appBrandInitConfigWC.f234829Y0 || !C87412m.m108589b(str, str2) || i != i2) {
            return null;
        }
        Log.m105924i("MicroMsg.AppBrand.PreRenderAutoRelaunchLogicInterceptor", "shouldReLaunchOnConfigWillUpdate returns false, appId:" + this.f246092b.f238147j + ", currentOriginRouteUrl:" + str + ", newRouteUrl:" + str2 + ", oldScene:" + i + ", newScene:" + i2);
        return Boolean.FALSE;
    }
}
