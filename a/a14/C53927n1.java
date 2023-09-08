package a14;

import java.util.concurrent.CancellationException;

/* renamed from: a14.n1 */
public final class C53927n1 {
    /* renamed from: a */
    public static final CancellationException m60552a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
