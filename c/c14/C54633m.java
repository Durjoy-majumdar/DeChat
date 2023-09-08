package c14;

import a14.C53927n1;
import java.util.concurrent.CancellationException;

/* renamed from: c14.m */
public final class C54633m {
    /* renamed from: a */
    public static final void m61481a(C54649x<?> xVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C53927n1.m60552a("Channel was consumed, consumer had failed", th);
            }
        }
        xVar.mo75512b(cancellationException);
    }
}
