package e14;

import fy3.C32227p;
import wx3.C66212f;

/* renamed from: e14.q */
public final class C58504q implements C66212f {

    /* renamed from: d */
    public final Throwable f167538d;

    /* renamed from: e */
    public final /* synthetic */ C66212f f167539e;

    public C58504q(Throwable th, C66212f fVar) {
        this.f167538d = th;
        this.f167539e = fVar;
    }

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        return this.f167539e.fold(r, pVar);
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        return this.f167539e.get(cVar);
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        return this.f167539e.minusKey(cVar);
    }

    public C66212f plus(C66212f fVar) {
        return this.f167539e.plus(fVar);
    }
}
