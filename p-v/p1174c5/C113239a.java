package p1174c5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: c5.a */
public final class C113239a {

    /* renamed from: b */
    public static final C113239a f338838b = new C113239a();

    /* renamed from: c */
    public static final int f338839c;

    /* renamed from: d */
    public static final int f338840d;

    /* renamed from: a */
    public final Executor f338841a = new C113241b((C113240a) null);

    /* renamed from: c5.a$b */
    public static class C113241b implements Executor {
        public C113241b(C113240a aVar) {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f338839c = availableProcessors + 1;
        f338840d = (availableProcessors * 2) + 1;
    }
}
