package p175j0;

import fy3.C32226l;
import gy3.C87412m;
import p175j0.C60683t0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: j0.u0 */
public final class C60685u0 {
    /* renamed from: a */
    public static final C60683t0 m70963a(C66212f fVar) {
        C87412m.m108594g(fVar, "<this>");
        int i = C60683t0.f172854u0;
        C60683t0 t0Var = (C60683t0) fVar.get(C60683t0.C60684a.f172855d);
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    /* renamed from: b */
    public static final <R> Object m70964b(C32226l<? super Long, ? extends R> lVar, C15601d<? super R> dVar) {
        return m70963a(dVar.getContext()).mo74976d(lVar, dVar);
    }
}
