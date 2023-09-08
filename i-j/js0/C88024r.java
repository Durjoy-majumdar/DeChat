package js0;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import zt3.C119157j;

/* renamed from: js0.r */
public class C88024r {

    /* renamed from: a */
    public static volatile C88025a f254634a;

    @Deprecated
    /* renamed from: js0.r$a */
    public static final class C88025a extends MMHandler {
        public C88025a(String str) {
            super(str);
        }

        /* renamed from: a */
        public final boolean mo122468a(Runnable runnable, long j) {
            return super.postDelayed(runnable, j);
        }

        public Looper getLooper() {
            throw new UnsupportedOperationException();
        }
    }

    @Deprecated
    /* renamed from: a */
    public static C88025a m109571a() {
        if (f254634a == null) {
            synchronized (C88024r.class) {
                if (f254634a == null) {
                    f254634a = new C88025a("Luggage.Common.ThreadUtil.WORKER_THREAD");
                }
            }
        }
        return f254634a;
    }

    /* renamed from: b */
    public static void m109572b(Runnable runnable) {
        if (runnable != null) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(runnable);
            }
        }
    }
}
