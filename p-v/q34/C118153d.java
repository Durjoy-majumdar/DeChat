package q34;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p34.C117942d;
import p34.C117954j;
import p418rx.internal.util.unsafe.MpmcArrayQueue;
import p418rx.internal.util.unsafe.UnsafeAccess;
import t34.C118375m;

/* renamed from: q34.d */
public abstract class C118153d<T> implements C117954j {

    /* renamed from: d */
    public Queue<T> f353178d;

    /* renamed from: e */
    public final int f353179e = 0;

    /* renamed from: f */
    public final int f353180f = 0;

    /* renamed from: g */
    public final long f353181g = 67;

    /* renamed from: h */
    public final AtomicReference<Future<?>> f353182h = new AtomicReference<>();

    /* renamed from: q34.d$a */
    public class C118154a implements Runnable {
        public C118154a() {
        }

        public void run() {
            int size = C118153d.this.f353178d.size();
            C118153d dVar = C118153d.this;
            int i = 0;
            if (size < dVar.f353179e) {
                int i2 = dVar.f353180f - size;
                while (i < i2) {
                    C118153d dVar2 = C118153d.this;
                    dVar2.f353178d.add(dVar2.mo182950a());
                    i++;
                }
                return;
            }
            int i3 = dVar.f353180f;
            if (size > i3) {
                int i4 = size - i3;
                while (i < i4) {
                    C118153d.this.f353178d.poll();
                    i++;
                }
            }
        }
    }

    public C118153d() {
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.f353178d = new MpmcArrayQueue(Math.max(0, 1024));
        } else {
            this.f353178d = new ConcurrentLinkedQueue();
        }
        start();
    }

    /* renamed from: a */
    public abstract T mo182950a();

    public void shutdown() {
        Future andSet = this.f353182h.getAndSet((Object) null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    public void start() {
        boolean z;
        while (this.f353182h.get() == null) {
            ScheduledExecutorService a = C117942d.m166326a();
            try {
                C118154a aVar = new C118154a();
                long j = this.f353181g;
                ScheduledFuture<?> scheduleAtFixedRate = a.scheduleAtFixedRate(aVar, j, j, TimeUnit.SECONDS);
                AtomicReference<Future<?>> atomicReference = this.f353182h;
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, scheduleAtFixedRate)) {
                        if (atomicReference.get() != null) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    scheduleAtFixedRate.cancel(false);
                } else {
                    return;
                }
            } catch (RejectedExecutionException e) {
                C118375m.m166985a(e);
                return;
            }
        }
    }
}
