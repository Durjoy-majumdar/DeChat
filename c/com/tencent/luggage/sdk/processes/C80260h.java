package com.tencent.luggage.sdk.processes;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.luggage.sdk.processes.h */
public final class C80260h extends C87413o implements C32226l<C80264l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C80254f<C80250c<Object>, C80278n> f234959d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80260h(C80254f<C80250c<Object>, C80278n> fVar) {
        super(1);
        this.f234959d = fVar;
    }

    public Object invoke(Object obj) {
        C80264l lVar = (C80264l) obj;
        C87412m.m108594g(lVar, "record");
        this.f234959d.mo111380B(lVar);
        return C13598b0.f38549a;
    }
}
