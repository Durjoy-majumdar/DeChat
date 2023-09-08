package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z */
public final class C82267z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32226l<AppBrandRuntime, C13598b0> f241178d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeWC f241179e;

    public C82267z(C32226l<? super AppBrandRuntime, C13598b0> lVar, AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f241178d = lVar;
        this.f241179e = appBrandRuntimeWC;
    }

    public final void run() {
        C32226l<AppBrandRuntime, C13598b0> lVar = this.f241178d;
        AppBrandRuntimeWC appBrandRuntimeWC = this.f241179e;
        C87412m.m108593f(appBrandRuntimeWC, "this");
        lVar.invoke(appBrandRuntimeWC);
    }
}
