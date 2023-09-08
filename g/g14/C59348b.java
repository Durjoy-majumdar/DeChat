package g14;

import a14.C53899h2;
import a14.C53969y;
import f14.C58907y;
import fy3.C32227p;
import gy3.C24564k0;
import gy3.C8480h;
import wx3.C15601d;
import xx3.C15911a;

/* renamed from: g14.b */
public final class C59348b {
    /* renamed from: a */
    public static final <T, R> Object m69267a(C58907y<? super T> yVar, R r, C32227p<? super R, ? super C15601d<? super T>, ? extends Object> pVar) {
        Object obj;
        Object k0;
        try {
            C24564k0.m30741e(pVar, 2);
            obj = pVar.invoke(r, yVar);
        } catch (Throwable th) {
            obj = new C53969y(th, false, 2, (C8480h) null);
        }
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        if (obj == aVar || (k0 = yVar.mo74538k0(obj)) == C53899h2.f151146b) {
            return aVar;
        }
        if (!(k0 instanceof C53969y)) {
            return C53899h2.m60476a(k0);
        }
        throw ((C53969y) k0).f151214a;
    }
}
