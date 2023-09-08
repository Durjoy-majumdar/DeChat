package bp3;

import java.util.Collection;
import java.util.concurrent.Future;

/* renamed from: bp3.e */
public final class C79753e {
    /* renamed from: a */
    public static void m96889a(Collection<? extends Future<?>> collection) {
        if (collection != null) {
            for (Future future : collection) {
                if (future != null) {
                    try {
                        future.get();
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        throw new IllegalStateException(th);
                    }
                }
            }
        }
    }
}
