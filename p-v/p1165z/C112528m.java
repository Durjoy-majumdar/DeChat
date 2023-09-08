package p1165z;

import c14.C54624g;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import d14.C58100z0;
import gy3.C87412m;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;

/* renamed from: z.m */
public final class C112528m implements C112527l {

    /* renamed from: a */
    public final C58085t0<C112525j> f336940a = C58017a1.m67173b(0, 16, C54624g.DROP_OLDEST, 1, (Object) null);

    /* renamed from: a */
    public Object mo164252a(C112525j jVar, C15601d<? super C13598b0> dVar) {
        Object emit = ((C58100z0) this.f336940a).emit(jVar, dVar);
        return emit == C15911a.COROUTINE_SUSPENDED ? emit : C13598b0.f38549a;
    }

    /* renamed from: b */
    public boolean mo164253b(C112525j jVar) {
        C87412m.m108594g(jVar, "interaction");
        return ((C58100z0) this.f336940a).mo82832d(jVar);
    }

    /* renamed from: c */
    public C45252f mo164251c() {
        return this.f336940a;
    }
}
