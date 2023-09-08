package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.y */
public final class C82266y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32226l<AppBrandRuntime, C13598b0> f241176d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeWC f241177e;

    public C82266y(C32226l<? super AppBrandRuntime, C13598b0> lVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f241176d = lVar;
        this.f241177e = appBrandRuntimeWC;
    }

    public final void run() {
        C32226l<AppBrandRuntime, C13598b0> lVar = this.f241176d;
        AppBrandRuntimeWC appBrandRuntimeWC = this.f241177e;
        C87412m.m108593f(appBrandRuntimeWC, "this");
        lVar.invoke(appBrandRuntimeWC);
    }
}
