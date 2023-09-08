package d14;

import a14.C53973z1;
import c14.C54624g;
import e14.C58490l;
import e14.C58506s;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: d14.w0 */
public final class C58092w0<T> implements C58050i1<T>, C45252f, C58506s<T> {

    /* renamed from: d */
    public final C53973z1 f166141d;

    /* renamed from: e */
    public final /* synthetic */ C58050i1<T> f166142e;

    public C58092w0(C58050i1<? extends T> i1Var, C53973z1 z1Var) {
        this.f166141d = z1Var;
        this.f166142e = i1Var;
    }

    /* renamed from: a */
    public Object mo31880a(C45253g<? super T> gVar, C15601d<?> dVar) {
        return this.f166142e.mo31880a(gVar, dVar);
    }

    /* renamed from: c */
    public C45252f<T> mo82831c(C66212f fVar, int i, C54624g gVar) {
        return ((((i >= 0 && i < 2) || i == -2) && gVar == C54624g.DROP_OLDEST) || ((i == 0 || i == -3) && gVar == C54624g.SUSPEND)) ? this : new C58490l(this, fVar, i, gVar);
    }

    public T getValue() {
        return this.f166142e.getValue();
    }
}
