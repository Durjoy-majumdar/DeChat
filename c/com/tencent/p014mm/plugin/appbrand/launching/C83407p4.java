package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.ipcinvoker.type.IPCString;
import di0.C86300q;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.p4 */
public final class C83407p4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86300q f243707d;

    /* renamed from: e */
    public final /* synthetic */ IPCString f243708e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83407p4(C86300q qVar, IPCString iPCString) {
        super(0);
        this.f243707d = qVar;
        this.f243708e = iPCString;
    }

    public Object invoke() {
        C86300q qVar = this.f243707d;
        IPCString iPCString = this.f243708e;
        String str = iPCString != null ? iPCString.f10315d : null;
        if (str == null) {
            str = "";
        }
        qVar.mo63854b(str);
        return C13598b0.f38549a;
    }
}
