package a14;

import fy3.C32227p;
import gy3.C87412m;
import wx3.C66212f;

/* renamed from: a14.e3 */
public final class C53880e3 implements C66212f.C66215b, C66212f.C15602c<C53880e3> {

    /* renamed from: d */
    public static final C53880e3 f151125d = new C53880e3();

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        return C66212f.C66215b.C66216a.m78145a(this, cVar);
    }

    public C66212f.C15602c<?> getKey() {
        return this;
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        return C66212f.C66215b.C66216a.m78146b(this, cVar);
    }

    public C66212f plus(C66212f fVar) {
        C87412m.m108594g(fVar, "context");
        return C66212f.C66213a.m78144a(this, fVar);
    }
}
