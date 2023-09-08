package q34;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: q34.h */
public final class C118160h extends AtomicLong implements ThreadFactory {

    /* renamed from: e */
    public static final ThreadFactory f353190e = new C118161a();

    /* renamed from: d */
    public final String f353191d;

    /* renamed from: q34.h$a */
    public static class C118161a implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    }

    public C118160h(String str) {
        this.f353191d = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f353191d + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
