package au3;

import fy3.C32227p;
import gy3.C87412m;
import wx3.C66212f;

/* renamed from: au3.e */
public final class C54332e implements C66212f.C66215b {

    /* renamed from: d */
    public static final C66212f.C15602c<C54332e> f152466d = new C54333a();

    /* renamed from: au3.e$a */
    public static final class C54333a implements C66212f.C15602c<C54332e> {
    }

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        C87412m.m108595h(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        C87412m.m108595h(cVar, "key");
        return C66212f.C66215b.C66216a.m78145a(this, cVar);
    }

    public C66212f.C15602c<?> getKey() {
        return f152466d;
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        C87412m.m108595h(cVar, "key");
        return C66212f.C66215b.C66216a.m78146b(this, cVar);
    }

    public C66212f plus(C66212f fVar) {
        C87412m.m108595h(fVar, "context");
        return C66212f.C66213a.m78144a(this, fVar);
    }
}
