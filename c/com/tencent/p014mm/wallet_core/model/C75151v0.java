package com.tencent.p014mm.wallet_core.model;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import java.util.HashSet;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.wallet_core.model.v0 */
public final class C75151v0 extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32224a<Boolean> f221128d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75151v0(C32224a<Boolean> aVar) {
        super(1);
        this.f221128d = aVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        HashSet<String> hashSet = C75142u0.f221109g;
        C32224a<Boolean> aVar = this.f221128d;
        synchronized (hashSet) {
            C75142u0.f221110h.remove(aVar);
        }
        return C13598b0.f38549a;
    }
}
