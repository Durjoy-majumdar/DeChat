package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.page.C83818i;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.page.z1 */
public final class C83981z1 implements C83782d3 {

    /* renamed from: d */
    public final AppBrandRuntimeWC f245168d;

    public C83981z1(AppBrandRuntimeWC appBrandRuntimeWC) {
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        this.f245168d = appBrandRuntimeWC;
    }

    public <WIDGET extends View> WIDGET G90(Class<WIDGET> cls, Context context) {
        C87412m.m108594g(cls, "clazz");
        C87412m.m108594g(context, "ctx");
        C83818i K1 = this.f245168d.mo113028S();
        Context context2 = this.f245168d.f238141d;
        K1.getClass();
        C83818i.C83819a aVar = K1.f244674c;
        if (context2 == null) {
            context2 = MMApplicationContext.getContext();
        }
        C87412m.m108593f(context2, "ctx ?: MMApplicationContext.getContext()");
        return aVar.mo116282a(cls, K1.mo116280c(context2, cls));
    }
}
