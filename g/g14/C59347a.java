package g14;

import f14.C58885i;
import fy3.C32226l;
import fy3.C32227p;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: g14.a */
public final class C59347a {
    /* renamed from: a */
    public static void m69266a(C32227p pVar, Object obj, C15601d dVar, C32226l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        try {
            C15601d<C13598b0> b = C66447b.m78392b(C66447b.m78391a(pVar, obj, dVar));
            Result.Companion companion = Result.Companion;
            C58885i.m68732a(b, Result.m168114constructorimpl(C13598b0.f38549a), lVar);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(th)));
            throw th;
        }
    }
}
