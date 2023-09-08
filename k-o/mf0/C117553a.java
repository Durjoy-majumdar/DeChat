package mf0;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: mf0.a */
public class C117553a implements C117554b {

    /* renamed from: a */
    public final ScheduledExecutorService f351697a = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    public Future<?> mo109820a(Runnable runnable, long j, long j2) {
        return this.f351697a.scheduleWithFixedDelay(runnable, j, j2, TimeUnit.MILLISECONDS);
    }
}
