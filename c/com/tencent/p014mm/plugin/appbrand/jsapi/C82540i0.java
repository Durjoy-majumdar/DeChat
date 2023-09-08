package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import gy3.C87412m;
import js0.C88020k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.i0 */
public final class C82540i0 extends C82926s {
    public static final int CTRL_INDEX = 590;
    public static final String NAME = "onKeyboardHeightChange";

    /* renamed from: s */
    public final void mo114873s(int i, C81925i2 i2Var, C83780d1 d1Var, Integer num) {
        C87412m.m108594g(i2Var, "service");
        C87412m.m108594g(d1Var, "page");
        mo115164n("height", Integer.valueOf(C88020k.m109555f(i)));
        if (num != null) {
            mo115164n("inputId", Integer.valueOf(num.intValue()));
        }
        mo115194p(i2Var);
        mo115158h();
        mo115194p(d1Var);
        mo115158h();
    }

    /* renamed from: t */
    public final void mo114874t(int i, C82381f fVar, C82381f fVar2, Integer num) {
        C87412m.m108594g(fVar, "service");
        C87412m.m108594g(fVar2, "page");
        mo115164n("height", Integer.valueOf(C88020k.m109555f(i)));
        if (num != null) {
            mo115164n("viewId", Integer.valueOf(num.intValue()));
        }
        mo115194p(fVar);
        mo115158h();
        mo115194p(fVar2);
        mo115158h();
    }
}
