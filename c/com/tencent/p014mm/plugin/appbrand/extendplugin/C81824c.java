package com.tencent.p014mm.plugin.appbrand.extendplugin;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import li0.C88508b;
import li0.C88509c;
import p830xc.C91165a;

/* renamed from: com.tencent.mm.plugin.appbrand.extendplugin.c */
public final class C81824c {
    /* renamed from: a */
    public static final boolean m100433a(C91165a aVar) {
        C88509c cVar;
        C87412m.m108594g(aVar, "<this>");
        C82381f g = aVar.mo62544g();
        C88508b bVar = null;
        C83780d1 d1Var = g instanceof C83780d1 ? (C83780d1) g : null;
        if (d1Var == null) {
            Log.m105920e("MicroMsg.AppBrandInvokeContextExt", "isPageInForeground, pageView is null");
            return false;
        }
        boolean z = d1Var.f244563P;
        C88508b bVar2 = C88508b.FOREGROUND;
        AppBrandRuntime runtime = d1Var.getRuntime();
        if (!(runtime == null || (cVar = runtime.f238113K) == null)) {
            bVar = cVar.mo122980c();
        }
        boolean z2 = bVar2 == bVar;
        Log.m105924i("MicroMsg.AppBrandInvokeContextExt", "isPageInForeground, isPageInForeground: " + z + ", isRuntimeInForeground: " + z2);
        return z && z2;
    }
}
