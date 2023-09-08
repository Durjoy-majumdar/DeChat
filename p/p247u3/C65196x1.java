package p247u3;

import a14.C0000n0;
import c14.C54612b0;
import gy3.C87412m;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: u3.x1 */
public final class C65196x1<T> implements C65189w1<T>, C0000n0, C54612b0<T> {

    /* renamed from: d */
    public final C54612b0<T> f187695d;

    /* renamed from: e */
    public final /* synthetic */ C0000n0 f187696e;

    public C65196x1(C0000n0 n0Var, C54612b0<? super T> b0Var) {
        C87412m.m108594g(n0Var, "scope");
        C87412m.m108594g(b0Var, "channel");
        this.f187696e = n0Var;
        this.f187695d = b0Var;
    }

    public C66212f getCoroutineContext() {
        return this.f187696e.getCoroutineContext();
    }

    /* renamed from: o */
    public Object mo75536o(T t, C15601d<? super C13598b0> dVar) {
        return this.f187695d.mo75536o(t, dVar);
    }

    /* renamed from: w */
    public boolean mo75540w(Throwable th) {
        return this.f187695d.mo75540w(th);
    }
}
