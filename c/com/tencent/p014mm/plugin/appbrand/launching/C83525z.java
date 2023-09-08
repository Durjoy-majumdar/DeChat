package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.launching.C83499v;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.z */
public final class C83525z extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83499v.C83502c f244037d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeWC f244038e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83525z(C83499v.C83502c cVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(0);
        this.f244037d = cVar;
        this.f244038e = appBrandRuntimeWC;
    }

    public Object invoke() {
        this.f244037d.mo115797a();
        C83499v.f243973a.mo115795b(this.f244038e);
        Log.m105924i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", "task(" + this.f244037d.hashCode() + ") interrupted, appId=" + this.f244038e.f238147j);
        return C13598b0.f38549a;
    }
}
