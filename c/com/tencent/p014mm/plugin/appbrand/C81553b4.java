package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.b4 */
public final class C81553b4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C81820e3 f239175d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandInitConfigWC f239176e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandRuntimeWC f239177f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81553b4(C81820e3 e3Var, AppBrandInitConfigWC appBrandInitConfigWC, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(0);
        this.f239175d = e3Var;
        this.f239176e = appBrandInitConfigWC;
        this.f239177f = appBrandRuntimeWC;
    }

    public Object invoke() {
        this.f239175d.mo113121c((AppBrandRuntime) null, this.f239176e);
        this.f239177f.mo113175G1();
        return C13598b0.f38549a;
    }
}
