package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.launching.C83499v;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import p170ic.C87692f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.b0 */
public final class C83290b0 extends C87413o implements C32224a<C83499v.C83502c> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f243405d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83290b0(AppBrandRuntimeWC appBrandRuntimeWC) {
        super(0);
        this.f243405d = appBrandRuntimeWC;
    }

    public Object invoke() {
        C83499v.C83502c cVar = new C83499v.C83502c();
        AppBrandRuntimeWC appBrandRuntimeWC = this.f243405d;
        Log.m105924i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", "obtainTask create new instance(" + cVar.hashCode() + ") with appId(" + appBrandRuntimeWC.f238147j + ')');
        cVar.mo115798b(new C83522y(appBrandRuntimeWC));
        C83286a0 a0Var = new C83286a0(cVar, appBrandRuntimeWC);
        C87692f fVar = new C87692f();
        a0Var.invoke(fVar);
        appBrandRuntimeWC.f238113K.mo122978a(fVar);
        return cVar;
    }
}
