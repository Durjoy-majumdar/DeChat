package com.tencent.p014mm.plugin.vlog.model;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.vlog.model.g */
public final class C30515g extends C87413o implements C32226l<C96553q, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C32226l<C96553q, C13598b0>> f82222d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30515g(C8479f0<C32226l<C96553q, C13598b0>> f0Var) {
        super(1);
        this.f82222d = f0Var;
    }

    public Object invoke(Object obj) {
        C96553q qVar = (C96553q) obj;
        C87412m.m108594g(qVar, LocaleUtil.ITALIAN);
        C32226l lVar = (C32226l) this.f82222d.f27484d;
        if (lVar != null) {
            lVar.invoke(qVar);
        }
        return C13598b0.f38549a;
    }
}
