package p856m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m.b */
public class C61420b extends C61422c {

    /* renamed from: a */
    public final Object f174668a = new Object();

    /* renamed from: b */
    public final ExecutorService f174669b = Executors.newFixedThreadPool(4, new C61421a(this));

    /* renamed from: c */
    public volatile Handler f174670c;

    /* renamed from: m.b$a */
    public class C61421a implements ThreadFactory {

        /* renamed from: d */
        public final AtomicInteger f174671d = new AtomicInteger(0);

        public C61421a(C61420b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f174671d.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    public static Handler m72120a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
