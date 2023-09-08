package a14;

import java.lang.Thread;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C90107a;
import wx3.C66212f;
import y04.C112349m;
import y04.C112354s;

/* renamed from: a14.k0 */
public final class C53909k0 {

    /* renamed from: a */
    public static final List<C53901i0> f151161a = C112354s.m153296s(C112349m.m153278a(C53905j0.m60481a()));

    /* renamed from: a */
    public static final void m60490a(C66212f fVar, Throwable th) {
        Throwable th4;
        for (C53901i0 handleException : f151161a) {
            try {
                handleException.handleException(fVar, th);
            } catch (Throwable th5) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th5) {
                    th4 = th;
                } else {
                    th4 = new RuntimeException("Exception while trying to handle coroutine exception", th5);
                    C90107a.m112735a(th4, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th4);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            Result.Companion companion = Result.Companion;
            C90107a.m112735a(th, new C53970y0(fVar));
            Result.m168114constructorimpl(C13598b0.f38549a);
        } catch (Throwable th6) {
            Result.Companion companion2 = Result.Companion;
            Result.m168114constructorimpl(ResultKt.createFailure(th6));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
