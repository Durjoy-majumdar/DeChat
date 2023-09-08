package p1167z8;

import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: z8.h */
public final class C119085h implements ThreadFactory {

    /* renamed from: d */
    public final /* synthetic */ ThreadFactory f356629d;

    /* renamed from: e */
    public final /* synthetic */ String f356630e;

    /* renamed from: f */
    public final /* synthetic */ AtomicLong f356631f;

    /* renamed from: g */
    public final /* synthetic */ Integer f356632g;

    public C119085h(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f356629d = threadFactory;
        this.f356630e = str;
        this.f356631f = atomicLong;
        this.f356632g = num;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f356629d.newThread(runnable);
        String str = this.f356630e;
        if (str != null) {
            newThread.setName(String.format(Locale.ROOT, str, new Object[]{Long.valueOf(this.f356631f.getAndIncrement())}));
        }
        Integer num = this.f356632g;
        if (num != null) {
            newThread.setPriority(num.intValue());
        }
        return newThread;
    }
}
