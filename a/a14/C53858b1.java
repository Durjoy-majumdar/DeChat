package a14;

import f14.C58878f0;
import f14.C58883h;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: a14.b1 */
public final class C53858b1 {
    /* renamed from: a */
    public static final <T> void m60372a(C53853a1<? super T> a1Var, C15601d<? super T> dVar, boolean z) {
        Object obj;
        Object h = a1Var.mo74480h();
        Throwable e = a1Var.mo74477e(h);
        if (e != null) {
            Result.Companion companion = Result.Companion;
            obj = ResultKt.createFailure(e);
        } else {
            Result.Companion companion2 = Result.Companion;
            obj = a1Var.mo74478f(h);
        }
        Object r3 = Result.m168114constructorimpl(obj);
        if (z) {
            C58883h hVar = (C58883h) dVar;
            C15601d<T> dVar2 = hVar.f168526h;
            Object obj2 = hVar.f168528j;
            C66212f context = dVar2.getContext();
            Object c = C58878f0.m68716c(context, obj2);
            C53874d3<?> c2 = c != C58878f0.f168516a ? C53876e0.m60399c(dVar2, context, c) : null;
            try {
                hVar.f168526h.resumeWith(r3);
                C13598b0 b0Var = C13598b0.f38549a;
            } finally {
                if (c2 == null || c2.mo74501z0()) {
                    C58878f0.m68714a(context, c);
                }
            }
        } else {
            dVar.resumeWith(r3);
        }
    }
}
