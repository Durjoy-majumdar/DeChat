package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.launching.C83499v;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p170ic.C87692f;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.a0 */
public final class C83286a0 extends C87413o implements C32226l<C87692f, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83499v.C83502c f243394d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeWC f243395e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83286a0(C83499v.C83502c cVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(1);
        this.f243394d = cVar;
        this.f243395e = appBrandRuntimeWC;
    }

    public Object invoke(Object obj) {
        C87692f fVar = (C87692f) obj;
        C87412m.m108594g(fVar, "$this$lifecycle");
        fVar.mo122119a(new C83525z(this.f243394d, this.f243395e));
        return C13598b0.f38549a;
    }
}
