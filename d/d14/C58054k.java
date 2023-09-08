package d14;

import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;

/* renamed from: d14.k */
public final class C58054k implements C45252f<Object> {

    /* renamed from: d */
    public final /* synthetic */ Object f166050d;

    public C58054k(Object obj) {
        this.f166050d = obj;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g<Object> gVar, C15601d<? super C13598b0> dVar) {
        Object emit = gVar.emit(this.f166050d, dVar);
        return emit == C15911a.COROUTINE_SUSPENDED ? emit : C13598b0.f38549a;
    }
}
