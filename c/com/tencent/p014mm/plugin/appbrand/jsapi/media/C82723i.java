package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82732k0;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.i */
public final class C82723i implements C82732k0 {

    /* renamed from: a */
    public static final C82723i f242038a = new C82723i();

    /* renamed from: a */
    public boolean mo114992a(C82381f fVar, C83231l.C83235e eVar) {
        C87412m.m108594g(eVar, "appPauseType");
        return C83231l.C83235e.LAUNCH_NATIVE_PAGE != eVar;
    }

    /* renamed from: b */
    public C82732k0 mo114993b(C82732k0 k0Var) {
        return C82732k0.C82733a.m101507a(this, k0Var);
    }

    public String toString() {
        return "AutoPauseIfNotOpenNativeStrategy";
    }
}
