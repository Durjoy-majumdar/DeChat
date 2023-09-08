package p247u3;

import c14.C54612b0;
import d14.C45253g;
import gy3.C87412m;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;

/* renamed from: u3.l */
public final class C65076l<T> implements C45253g<T> {

    /* renamed from: d */
    public final C54612b0<T> f187294d;

    public C65076l(C54612b0<? super T> b0Var) {
        C87412m.m108594g(b0Var, "channel");
        this.f187294d = b0Var;
    }

    public Object emit(T t, C15601d<? super C13598b0> dVar) {
        Object o = this.f187294d.mo75536o(t, dVar);
        return o == C15911a.COROUTINE_SUSPENDED ? o : C13598b0.f38549a;
    }
}
