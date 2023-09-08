package com.tencent.p014mm.plugin.appbrand.launching;

import android.webkit.ValueCallback;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import di0.C86299o;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.e1 */
public final class C1925e1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86299o f11798d;

    /* renamed from: e */
    public final /* synthetic */ IPCString f11799e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1925e1(C86299o oVar, IPCString iPCString) {
        super(0);
        this.f11798d = oVar;
        this.f11799e = iPCString;
    }

    public Object invoke() {
        ValueCallback<String> valueCallback = this.f11798d.f250943o;
        IPCString iPCString = this.f11799e;
        valueCallback.onReceiveValue(iPCString != null ? iPCString.f10315d : null);
        return C13598b0.f38549a;
    }
}
