package com.tencent.p014mm.plugin.appbrand.launching;

import android.webkit.ValueCallback;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import di0.C86299o;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.g1 */
public final class C40489g1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86299o f108784d;

    /* renamed from: e */
    public final /* synthetic */ IPCInteger f108785e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40489g1(C86299o oVar, IPCInteger iPCInteger) {
        super(0);
        this.f108784d = oVar;
        this.f108785e = iPCInteger;
    }

    public Object invoke() {
        ValueCallback<Integer> valueCallback = this.f108784d.f250944p;
        IPCInteger iPCInteger = this.f108785e;
        valueCallback.onReceiveValue(iPCInteger != null ? Integer.valueOf(iPCInteger.f10313d) : null);
        return C13598b0.f38549a;
    }
}
