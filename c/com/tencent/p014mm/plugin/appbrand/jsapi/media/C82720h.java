package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import gy3.C87412m;
import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.h */
public final class C82720h implements C82732k0 {

    /* renamed from: a */
    public static final C82720h f242037a = new C82720h();

    /* renamed from: a */
    public boolean mo114992a(C82381f fVar, C83231l.C83235e eVar) {
        AppBrandRuntime runtime;
        C88509c cVar;
        C87412m.m108594g(eVar, "appPauseType");
        if (C83231l.C83235e.HIDE != eVar) {
            return true;
        }
        C88508b bVar = C88508b.FOREGROUND;
        C88508b bVar2 = null;
        C81879g gVar = fVar instanceof C81879g ? (C81879g) fVar : null;
        if (!(gVar == null || (runtime = gVar.getRuntime()) == null || (cVar = runtime.f238113K) == null)) {
            bVar2 = cVar.mo122980c();
        }
        return bVar != bVar2;
    }

    /* renamed from: b */
    public C82732k0 mo114993b(C82732k0 k0Var) {
        return C82732k0.C82733a.m101507a(this, k0Var);
    }

    public String toString() {
        return "AutoPauseIfNotNavigateStrategyLU";
    }
}
