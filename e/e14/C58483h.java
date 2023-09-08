package e14;

import f14.C58878f0;
import fy3.C32227p;
import gy3.C24564k0;
import gy3.C87412m;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;

/* renamed from: e14.h */
public final class C58483h {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final <T, V> Object m67917a(C66212f fVar, V v, Object obj, C32227p<? super V, ? super C15601d<? super T>, ? extends Object> pVar, C15601d<? super T> dVar) {
        Object c = C58878f0.m68716c(fVar, obj);
        try {
            C58473a0 a0Var = new C58473a0(dVar, fVar);
            C24564k0.m30741e(pVar, 2);
            Object invoke = pVar.invoke(v, a0Var);
            C58878f0.m68714a(fVar, c);
            if (invoke == C15911a.COROUTINE_SUSPENDED) {
                C87412m.m108594g(dVar, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            C58878f0.m68714a(fVar, c);
            throw th;
        }
    }
}
