package dy3;

import rx3.C90107a;

/* renamed from: dy3.a */
public final class C86417a {
    /* renamed from: a */
    public static final void m107084a(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable == null) {
            return;
        }
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th4) {
            C90107a.m112735a(th, th4);
        }
    }
}
