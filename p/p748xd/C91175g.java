package p748xd;

import android.os.Handler;
import android.os.Looper;
import gy3.C87412m;

/* renamed from: xd.g */
public final class C91175g {

    /* renamed from: a */
    public static final Handler f261413a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static final boolean m114414a() {
        return C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread());
    }

    /* renamed from: b */
    public static final void m114415b(Runnable runnable) {
        C87412m.m108594g(runnable, "run");
        if (m114414a()) {
            runnable.run();
        } else {
            f261413a.post(runnable);
        }
    }
}
