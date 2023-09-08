package p834a3;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;

/* renamed from: a3.d */
public final class C103298d {

    /* renamed from: a3.d$a */
    public static class C103299a {
        /* renamed from: a */
        public static Handler m136812a(Looper looper) {
            return Handler.createAsync(looper);
        }

        /* renamed from: b */
        public static boolean m136813b(Handler handler, Runnable runnable, Object obj, long j) {
            return handler.postDelayed(runnable, obj, j);
        }
    }

    /* renamed from: a */
    public static Handler m136811a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C103299a.m136812a(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(cause);
            }
        }
    }
}
