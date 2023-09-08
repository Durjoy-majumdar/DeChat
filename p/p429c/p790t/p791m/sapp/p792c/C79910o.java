package p429c.p790t.p791m.sapp.p792c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: c.t.m.sapp.c.o */
public class C79910o {
    /* renamed from: a */
    public static boolean m97070a(Handler handler) {
        return m97073a(handler == null ? null : handler.getLooper());
    }

    /* renamed from: a */
    public static boolean m97073a(Looper looper) {
        return looper != null && looper.getThread().isAlive();
    }

    /* renamed from: a */
    public static boolean m97071a(Handler handler, Message message) {
        return m97072a(handler, message, 0);
    }

    /* renamed from: a */
    public static boolean m97072a(Handler handler, Message message, long j) {
        if (message == null || !m97070a(handler)) {
            return false;
        }
        return handler.sendMessageDelayed(message, j);
    }
}
