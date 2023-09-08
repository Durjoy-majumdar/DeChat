package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.j2 */
public final class C83348j2 extends C87413o implements C32226l<C83368m1.C83374d, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83399o2 f243562d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83348j2(C83399o2 o2Var) {
        super(1);
        this.f243562d = o2Var;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C83368m1.C83374d) obj, LocaleUtil.ITALIAN);
        C83399o2 o2Var = this.f243562d;
        if (!o2Var.f243687r) {
            o2Var.mo115674c();
            o2Var.f243687r = true;
        }
        return C13598b0.f38549a;
    }
}
