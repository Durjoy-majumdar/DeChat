package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.d */
public final class C29501d implements C82164h {

    /* renamed from: d */
    public final /* synthetic */ String f80373d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f80374e;

    public C29501d(String str, C32224a<C13598b0> aVar) {
        this.f80373d = str;
        this.f80374e = aVar;
    }

    /* renamed from: d */
    public final void mo56741d() {
        Log.m105924i("MicroMsg.AppBrandAuthJSAPIConcurrentQueue", "runTask() done, " + this.f80373d);
        this.f80374e.invoke();
    }
}
