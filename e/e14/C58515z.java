package e14;

import c14.C54612b0;
import d14.C45253g;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;

/* renamed from: e14.z */
public final class C58515z<T> implements C45253g<T> {

    /* renamed from: d */
    public final C54612b0<T> f167552d;

    public C58515z(C54612b0<? super T> b0Var) {
        this.f167552d = b0Var;
    }

    public Object emit(T t, C15601d<? super C13598b0> dVar) {
        Object o = this.f167552d.mo75536o(t, dVar);
        return o == C15911a.COROUTINE_SUSPENDED ? o : C13598b0.f38549a;
    }
}
