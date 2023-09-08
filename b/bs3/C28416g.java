package bs3;

import android.os.Handler;
import android.os.Looper;

/* renamed from: bs3.g */
public class C28416g {

    /* renamed from: a */
    public static Handler f78144a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m38191a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f78144a.post(runnable);
        }
    }
}
