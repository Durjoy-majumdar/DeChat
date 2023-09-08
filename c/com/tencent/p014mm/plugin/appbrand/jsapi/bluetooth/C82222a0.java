package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.a0 */
public final class C82222a0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f241096d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<AppBrandRuntime, C13598b0> f241097e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82222a0(String str, C32226l<? super AppBrandRuntime, C13598b0> lVar) {
        super(0);
        this.f241096d = str;
        this.f241097e = lVar;
    }

    public Object invoke() {
        AppBrandRuntimeWC b = C81682d.m100222b(this.f241096d);
        if (b != null) {
            b.mo113020N0(new C82267z(this.f241097e, b));
        }
        return C13598b0.f38549a;
    }
}
