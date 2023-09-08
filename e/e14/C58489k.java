package e14;

import c14.C54624g;
import c14.C54647v;
import d14.C45252f;
import d14.C45253g;
import f14.C58878f0;
import gy3.C87412m;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66210e;
import wx3.C66212f;
import xx3.C15911a;

/* renamed from: e14.k */
public abstract class C58489k<S, T> extends C58482g<T> {

    /* renamed from: g */
    public final C45252f<S> f167494g;

    public C58489k(C45252f<? extends S> fVar, C66212f fVar2, int i, C54624g gVar) {
        super(fVar2, i, gVar);
        this.f167494g = fVar;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g<? super T> gVar, C15601d<? super C13598b0> dVar) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        if (this.f167474e == -3) {
            C66212f context = dVar.getContext();
            C66212f plus = context.plus(this.f167473d);
            if (C87412m.m108589b(plus, context)) {
                Object k = mo83428k(gVar, dVar);
                return k == aVar ? k : C13598b0.f38549a;
            }
            int i = C66210e.f190250O0;
            C66210e.C66211a aVar2 = C66210e.C66211a.f190251d;
            if (C87412m.m108589b(plus.get(aVar2), context.get(aVar2))) {
                C66212f context2 = dVar.getContext();
                if (!(gVar instanceof C58515z ? true : gVar instanceof C58508u)) {
                    gVar = new C58477c0<>(gVar, context2);
                }
                Object a = C58483h.m67917a(plus, gVar, C58878f0.m68715b(plus), new C58488j(this, (C15601d<? super C58488j>) null), dVar);
                if (a != aVar) {
                    a = C13598b0.f38549a;
                }
                return a == aVar ? a : C13598b0.f38549a;
            }
        }
        Object a2 = super.mo31880a(gVar, dVar);
        return a2 == aVar ? a2 : C13598b0.f38549a;
    }

    /* renamed from: g */
    public Object mo82812g(C54647v<? super T> vVar, C15601d<? super C13598b0> dVar) {
        Object k = mo83428k(new C58515z(vVar), dVar);
        return k == C15911a.COROUTINE_SUSPENDED ? k : C13598b0.f38549a;
    }

    /* renamed from: k */
    public abstract Object mo83428k(C45253g<? super T> gVar, C15601d<? super C13598b0> dVar);

    public String toString() {
        return this.f167494g + " -> " + super.toString();
    }
}
