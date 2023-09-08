package wx3;

import fy3.C32227p;
import gy3.C87412m;
import wx3.C66212f;

/* renamed from: wx3.a */
public abstract class C66206a implements C66212f.C66215b {
    private final C66212f.C15602c<?> key;

    public C66206a(C66212f.C15602c<?> cVar) {
        C87412m.m108594g(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        return C66212f.C66215b.C66216a.m78145a(this, cVar);
    }

    public C66212f.C15602c<?> getKey() {
        return this.key;
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        return C66212f.C66215b.C66216a.m78146b(this, cVar);
    }

    public C66212f plus(C66212f fVar) {
        C87412m.m108594g(fVar, "context");
        return C66212f.C66213a.m78144a(this, fVar);
    }
}
