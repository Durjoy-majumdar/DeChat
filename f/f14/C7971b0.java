package f14;

import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: f14.b0 */
public final class C7971b0 {

    /* renamed from: a */
    public static final /* synthetic */ int f26651a = 0;

    static {
        Object obj;
        Object obj2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(Class.forName("yx3.a").getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m168117exceptionOrNullimpl(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) obj;
        try {
            obj2 = Result.m168114constructorimpl(C7971b0.class.getCanonicalName());
        } catch (Throwable th4) {
            Result.Companion companion3 = Result.Companion;
            obj2 = Result.m168114constructorimpl(ResultKt.createFailure(th4));
        }
        if (Result.m168117exceptionOrNullimpl(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) obj2;
    }
}
