package a14;

import f14.C58883h;
import kotlin.Result;
import kotlin.ResultKt;
import wx3.C15601d;

/* renamed from: a14.r0 */
public final class C53942r0 {
    /* renamed from: a */
    public static final String m60572a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: b */
    public static final String m60573b(C15601d<?> dVar) {
        Object obj;
        if (dVar instanceof C58883h) {
            return dVar.toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(dVar + '@' + m60572a(dVar));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        Throwable r2 = Result.m168117exceptionOrNullimpl(obj);
        String str = obj;
        if (r2 != null) {
            str = dVar.getClass().getName() + '@' + m60572a(dVar);
        }
        return (String) str;
    }
}
