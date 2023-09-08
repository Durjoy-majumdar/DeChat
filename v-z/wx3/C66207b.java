package wx3;

import fy3.C32226l;
import gy3.C87412m;
import wx3.C66212f;
import wx3.C66212f.C66215b;

/* renamed from: wx3.b */
public abstract class C66207b<B extends C66212f.C66215b, E extends B> implements C66212f.C15602c<E> {

    /* renamed from: d */
    public final C32226l<C66212f.C66215b, E> f190245d;

    /* renamed from: e */
    public final C66212f.C15602c<?> f190246e;

    public C66207b(C66212f.C15602c<B> cVar, C32226l<? super C66212f.C66215b, ? extends E> lVar) {
        C87412m.m108594g(cVar, "baseKey");
        C87412m.m108594g(lVar, "safeCast");
        this.f190245d = lVar;
        this.f190246e = cVar instanceof C66207b ? ((C66207b) cVar).f190246e : cVar;
    }
}
