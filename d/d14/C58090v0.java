package d14;

import a14.C53973z1;
import c14.C54624g;
import e14.C58490l;
import e14.C58506s;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: d14.v0 */
public final class C58090v0<T> implements C58097y0<T>, C45252f, C58506s<T> {

    /* renamed from: d */
    public final /* synthetic */ C58097y0<T> f166138d;

    public C58090v0(C58097y0<? extends T> y0Var, C53973z1 z1Var) {
        this.f166138d = y0Var;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g<? super T> gVar, C15601d<?> dVar) {
        return this.f166138d.mo31880a(gVar, dVar);
    }

    /* renamed from: c */
    public C45252f<T> mo82831c(C66212f fVar, int i, C54624g gVar) {
        return ((i == 0 || i == -3) && gVar == C54624g.SUSPEND) ? this : new C58490l(this, fVar, i, gVar);
    }
}
