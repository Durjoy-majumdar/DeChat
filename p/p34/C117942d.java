package p34;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: p34.d */
public final class C117942d implements C117954j {

    /* renamed from: e */
    public static final ScheduledExecutorService[] f352514e = new ScheduledExecutorService[0];

    /* renamed from: f */
    public static final ScheduledExecutorService f352515f;

    /* renamed from: g */
    public static final C117942d f352516g = new C117942d();

    /* renamed from: h */
    public static int f352517h;

    /* renamed from: d */
    public final AtomicReference<ScheduledExecutorService[]> f352518d = new AtomicReference<>(f352514e);

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f352515f = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public C117942d() {
        start();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m166326a() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = f352516g.f352518d.get();
        if (scheduledExecutorServiceArr == f352514e) {
            return f352515f;
        }
        int i = f352517h + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        f352517h = i;
        return scheduledExecutorServiceArr[i];
    }

    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        int i;
        boolean z;
        do {
            scheduledExecutorServiceArr = this.f352518d.get();
            ScheduledExecutorService[] scheduledExecutorServiceArr2 = f352514e;
            if (scheduledExecutorServiceArr != scheduledExecutorServiceArr2) {
                AtomicReference<ScheduledExecutorService[]> atomicReference = this.f352518d;
                while (true) {
                    if (!atomicReference.compareAndSet(scheduledExecutorServiceArr, scheduledExecutorServiceArr2)) {
                        if (atomicReference.get() != scheduledExecutorServiceArr) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z);
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            C117948h.f352527h.remove(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    public void start() {
        boolean z;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[availableProcessors];
        int i = 0;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= availableProcessors) {
                break;
            }
            scheduledExecutorServiceArr[i2] = Executors.newScheduledThreadPool(1, C117943e.f352519d);
            i2++;
        }
        AtomicReference<ScheduledExecutorService[]> atomicReference = this.f352518d;
        ScheduledExecutorService[] scheduledExecutorServiceArr2 = f352514e;
        while (true) {
            if (!atomicReference.compareAndSet(scheduledExecutorServiceArr2, scheduledExecutorServiceArr)) {
                if (atomicReference.get() != scheduledExecutorServiceArr2) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            while (i < availableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!C117948h.m166333i(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    C117948h.m166332g((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
            return;
        }
        while (i < availableProcessors) {
            scheduledExecutorServiceArr[i].shutdownNow();
            i++;
        }
    }
}
