package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.d0 */
public final class C84731d0 {

    /* renamed from: a */
    public static final C84731d0 f247132a = new C84731d0();

    /* renamed from: a */
    public static final C84732d1 m104389a(C82381f fVar) {
        C84732d1 d1Var;
        C87412m.m108594g(fVar, "component");
        synchronized (f247132a) {
            d1Var = (C84732d1) fVar.mo109666h(C84732d1.class);
            if (d1Var == null) {
                d1Var = new C104815f2();
                fVar.mo109672s(d1Var);
            }
        }
        return d1Var;
    }
}
