package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import di0.C86300q;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.n4 */
public final class C83394n4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86300q f243663d;

    /* renamed from: e */
    public final /* synthetic */ IPCBoolean f243664e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83394n4(C86300q qVar, IPCBoolean iPCBoolean) {
        super(0);
        this.f243663d = qVar;
        this.f243664e = iPCBoolean;
    }

    public Object invoke() {
        C86300q qVar = this.f243663d;
        IPCBoolean iPCBoolean = this.f243664e;
        boolean z = true;
        if (iPCBoolean == null || !iPCBoolean.f10312d) {
            z = false;
        }
        qVar.mo63858f(z);
        return C13598b0.f38549a;
    }
}
