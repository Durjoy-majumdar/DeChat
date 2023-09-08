package cy3;

import java.io.Closeable;
import rx3.C90107a;

/* renamed from: cy3.b */
public final class C58003b {
    /* renamed from: a */
    public static final void m67160a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th4) {
            C90107a.m112735a(th, th4);
        }
    }
}
