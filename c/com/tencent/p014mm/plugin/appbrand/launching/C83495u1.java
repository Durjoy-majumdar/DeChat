package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.u1 */
public class C83495u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f243962d;

    /* renamed from: e */
    public final /* synthetic */ ILaunchWxaAppInfoNotify.AppidABTestIpcWrapper f243963e;

    public C83495u1(AppBrandRuntimeWC appBrandRuntimeWC, ILaunchWxaAppInfoNotify.AppidABTestIpcWrapper appidABTestIpcWrapper) {
        this.f243962d = appBrandRuntimeWC;
        this.f243963e = appidABTestIpcWrapper;
    }

    public void run() {
        this.f243962d.f251968f1.mo125134i(this.f243963e.f243340f);
    }
}
