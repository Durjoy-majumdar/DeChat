package p241t0;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: t0.p */
public final class C110866p extends C87413o implements C32226l<C110860k, C110849h> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C110860k, C110849h> f331658d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110866p(C32226l<? super C110860k, C110849h> lVar) {
        super(1);
        this.f331658d = lVar;
    }

    public Object invoke(Object obj) {
        C110860k kVar = (C110860k) obj;
        C87412m.m108594g(kVar, "invalid");
        C110849h invoke = this.f331658d.invoke(kVar);
        synchronized (C110865n.f331651c) {
            C110865n.f331652d = C110865n.f331652d.mo162510m(invoke.mo162463d());
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return invoke;
    }
}
