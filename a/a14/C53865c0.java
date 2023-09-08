package a14;

import kotlin.Result;
import kotlin.ResultKt;
import wx3.C15601d;

/* renamed from: a14.c0 */
public final class C53865c0 {
    /* renamed from: a */
    public static final <T> Object m60381a(Object obj, C15601d<? super T> dVar) {
        if (!(obj instanceof C53969y)) {
            return Result.m168114constructorimpl(obj);
        }
        Result.Companion companion = Result.Companion;
        return Result.m168114constructorimpl(ResultKt.createFailure(((C53969y) obj).f151214a));
    }
}
