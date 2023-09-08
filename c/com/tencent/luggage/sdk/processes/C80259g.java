package com.tencent.luggage.sdk.processes;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.luggage.sdk.processes.g */
public final class C80259g extends C87413o implements C32226l<C80264l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C80254f<C80250c<Object>, C80278n> f234957d;

    /* renamed from: e */
    public final /* synthetic */ int f234958e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80259g(C80254f<C80250c<Object>, C80278n> fVar, int i) {
        super(1);
        this.f234957d = fVar;
        this.f234958e = i;
    }

    public Object invoke(Object obj) {
        C80264l lVar = (C80264l) obj;
        C87412m.m108594g(lVar, "record");
        try {
            C80250c<Object> d = this.f234957d.mo111389d(lVar);
            if (this.f234957d.mo111403q(d) != this.f234958e) {
                this.f234957d.mo111381C(lVar);
                this.f234957d.getClass();
                d.mo111358c(lVar);
            }
        } catch (C80280p unused) {
        }
        return C13598b0.f38549a;
    }
}
