package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.u1 */
public class C84347u1 implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime$$z f246280d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeWC f246281e;

    public C84347u1(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandRuntime$$z appBrandRuntime$$z) {
        this.f246281e = appBrandRuntimeWC;
        this.f246280d = appBrandRuntime$$z;
    }

    public Object invoke() {
        this.f246280d.mo113114c();
        C83226n.m102128e(this.f246281e.f238147j, KSProcessWeAppLaunch.stepPrepareMainProcess);
        return C13598b0.f38549a;
    }
}
