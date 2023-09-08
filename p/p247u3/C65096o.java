package p247u3;

import d14.C45252f;
import d14.C58052j1;
import d14.C58056k1;
import d14.C58087u0;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13604l;

/* renamed from: u3.o */
public final class C65096o<T> {

    /* renamed from: a */
    public final C58087u0<C13604l<Integer, T>> f187365a;

    /* renamed from: b */
    public final C45252f<T> f187366b;

    public C65096o(Object obj, int i, C8480h hVar) {
        C58087u0<C13604l<Integer, T>> a = C58056k1.m67214a(new C13604l(Integer.MIN_VALUE, (i & 1) != 0 ? null : obj));
        this.f187365a = a;
        this.f187366b = new C65083n(a);
    }

    /* renamed from: a */
    public final void mo89296a(T t) {
        C87412m.m108594g(t, "data");
        C58087u0<C13604l<Integer, T>> u0Var = this.f187365a;
        ((C58052j1) u0Var).setValue(new C13604l(Integer.valueOf(((Number) ((C13604l) ((C58052j1) u0Var).getValue()).f38555d).intValue() + 1), t));
    }
}
