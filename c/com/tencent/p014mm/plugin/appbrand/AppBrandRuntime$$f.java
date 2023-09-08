package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$f */
public class AppBrandRuntime$$f implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f238175d;

    public AppBrandRuntime$$f(AppBrandRuntime appBrandRuntime) {
        this.f238175d = appBrandRuntime;
    }

    public Object invoke() {
        Log.m105925i("MicroMsg.AppBrandRuntime", "hideSplash complete, appId:%s", this.f238175d.f238147j);
        this.f238175d.f238154s = null;
        return null;
    }
}
