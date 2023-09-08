package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.m2 */
public final class C82738m2 implements C82729j0 {

    /* renamed from: d */
    public static final C82738m2 f242059d = new C82738m2();

    /* renamed from: i2 */
    public C82724i0 mo56770i2(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C82724i0 i0Var = (C82724i0) appBrandRuntime.mo113032U(C82724i0.class);
        if (i0Var != null) {
            return i0Var;
        }
        Context context = appBrandRuntime.f238141d;
        C87412m.m108593f(context, "runtime.appContext");
        C29523j2 j2Var = new C29523j2(context);
        appBrandRuntime.mo113059i(j2Var);
        return j2Var;
    }
}
