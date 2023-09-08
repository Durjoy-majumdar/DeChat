package p748xd;

import fy3.C32224a;
import gy3.C87412m;
import ny3.C89102i;
import ny3.C89104m;

/* renamed from: xd.a */
public class C91168a<R, T> {

    /* renamed from: a */
    public R f261399a = null;

    /* renamed from: b */
    public C32224a<? extends R> f261400b;

    /* renamed from: c */
    public final C89102i<R, T> f261401c;

    public C91168a(C32224a<? extends R> aVar, C89102i<R, T> iVar) {
        C87412m.m108594g(aVar, "receiver");
        C87412m.m108594g(iVar, "backingProperty");
        this.f261400b = aVar;
        this.f261401c = iVar;
    }

    /* renamed from: a */
    public final T mo125227a(Object obj, C89104m<?> mVar) {
        C87412m.m108594g(mVar, "property");
        C89102i<R, T> iVar = this.f261401c;
        R r = this.f261399a;
        if (r == null) {
            C32224a aVar = this.f261400b;
            C87412m.m108591d(aVar);
            r = aVar.invoke();
        }
        return iVar.get(r);
    }

    /* renamed from: b */
    public final void mo125228b(Object obj, C89104m<?> mVar, T t) {
        C87412m.m108594g(mVar, "property");
        C89102i<R, T> iVar = this.f261401c;
        R r = this.f261399a;
        if (r == null) {
            C32224a aVar = this.f261400b;
            C87412m.m108591d(aVar);
            r = aVar.invoke();
        }
        iVar.mo51289J(r, t);
    }
}
