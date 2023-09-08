package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.g2 */
public final class C81882g2 extends C87413o implements C32226l<AppBrandRuntimeWC, C13598b0> {

    /* renamed from: d */
    public static final C81882g2 f240175d = new C81882g2();

    public C81882g2() {
        super(1);
    }

    public Object invoke(Object obj) {
        AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) obj;
        C87412m.m108594g(appBrandRuntimeWC, LocaleUtil.ITALIAN);
        C81820e3 e3Var = appBrandRuntimeWC.f238142e;
        boolean z = true;
        if (e3Var == null || !e3Var.mo113124e(appBrandRuntimeWC)) {
            z = false;
        }
        if (!z) {
            appBrandRuntimeWC.mo113175G1();
        }
        return C13598b0.f38549a;
    }
}
