package a14;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class y2$$a implements ThreadFactory {

    /* renamed from: d */
    public final /* synthetic */ int f151217d;

    /* renamed from: e */
    public final /* synthetic */ String f151218e;

    /* renamed from: f */
    public final /* synthetic */ AtomicInteger f151219f;

    public /* synthetic */ y2$$a(int i, String str, AtomicInteger atomicInteger) {
        this.f151217d = i;
        this.f151218e = str;
        this.f151219f = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        int i = this.f151217d;
        String str = this.f151218e;
        AtomicInteger atomicInteger = this.f151219f;
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
