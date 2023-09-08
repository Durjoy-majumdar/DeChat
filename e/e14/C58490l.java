package e14;

import c14.C54624g;
import d14.C45252f;
import d14.C45253g;
import gy3.C8480h;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66217g;
import xx3.C15911a;

/* renamed from: e14.l */
public final class C58490l<T> extends C58489k<T, T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58490l(C45252f fVar, C66212f fVar2, int i, C54624g gVar, int i2, C8480h hVar) {
        super(fVar, (i2 & 2) != 0 ? C66217g.f190253d : fVar2, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? C54624g.SUSPEND : gVar);
    }

    /* renamed from: h */
    public C58482g<T> mo82813h(C66212f fVar, int i, C54624g gVar) {
        return new C58490l(this.f167494g, fVar, i, gVar);
    }

    /* renamed from: i */
    public C45252f<T> mo82817i() {
        return this.f167494g;
    }

    /* renamed from: k */
    public Object mo83428k(C45253g<? super T> gVar, C15601d<? super C13598b0> dVar) {
        Object a = this.f167494g.mo31880a(gVar, dVar);
        return a == C15911a.COROUTINE_SUSPENDED ? a : C13598b0.f38549a;
    }

    public C58490l(C45252f<? extends T> fVar, C66212f fVar2, int i, C54624g gVar) {
        super(fVar, fVar2, i, gVar);
    }
}
