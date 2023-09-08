package f14;

import fy3.C32226l;
import rx3.C13598b0;
import rx3.C90107a;

/* renamed from: f14.u */
public final class C58903u {
    /* renamed from: a */
    public static final <E> C58887j0 m68763a(C32226l<? super E, C13598b0> lVar, E e, C58887j0 j0Var) {
        try {
            lVar.invoke(e);
        } catch (Throwable th) {
            if (j0Var == null || j0Var.getCause() == th) {
                return new C58887j0("Exception in undelivered element handler for " + e, th);
            }
            C90107a.m112735a(j0Var, th);
        }
        return j0Var;
    }
}
