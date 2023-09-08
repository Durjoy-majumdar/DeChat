package p34;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l34.C117456i;
import l34.C117459k;
import n34.C117603a;
import p34.C117950i;
import q34.C118160h;
import v34.C118646b;
import v34.C118649d;

/* renamed from: p34.a */
public final class C117925a extends C117456i implements C117954j {

    /* renamed from: g */
    public static final TimeUnit f352466g = TimeUnit.SECONDS;

    /* renamed from: h */
    public static final C117931c f352467h;

    /* renamed from: i */
    public static final C117926a f352468i;

    /* renamed from: e */
    public final ThreadFactory f352469e;

    /* renamed from: f */
    public final AtomicReference<C117926a> f352470f = new AtomicReference<>(f352468i);

    /* renamed from: p34.a$a */
    public static final class C117926a {

        /* renamed from: a */
        public final ThreadFactory f352471a;

        /* renamed from: b */
        public final long f352472b;

        /* renamed from: c */
        public final ConcurrentLinkedQueue<C117931c> f352473c;

        /* renamed from: d */
        public final C118646b f352474d;

        /* renamed from: e */
        public final ScheduledExecutorService f352475e;

        /* renamed from: f */
        public final Future<?> f352476f;

        /* renamed from: p34.a$a$a */
        public class C117927a implements ThreadFactory {

            /* renamed from: d */
            public final /* synthetic */ ThreadFactory f352477d;

            public C117927a(C117926a aVar, ThreadFactory threadFactory) {
                this.f352477d = threadFactory;
            }

            public Thread newThread(Runnable runnable) {
                Thread newThread = this.f352477d.newThread(runnable);
                newThread.setName(newThread.getName() + " (Evictor)");
                return newThread;
            }
        }

        /* renamed from: p34.a$a$b */
        public class C117928b implements Runnable {
            public C117928b() {
            }

            public void run() {
                C117926a aVar = C117926a.this;
                if (!aVar.f352473c.isEmpty()) {
                    long nanoTime = System.nanoTime();
                    Iterator<C117931c> it = aVar.f352473c.iterator();
                    while (it.hasNext()) {
                        C117931c next = it.next();
                        if (next.f352485o > nanoTime) {
                            return;
                        }
                        if (aVar.f352473c.remove(next)) {
                            aVar.f352474d.mo183372e(next);
                        }
                    }
                }
            }
        }

        public C117926a(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledFuture<?> scheduledFuture;
            this.f352471a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f352472b = nanos;
            this.f352473c = new ConcurrentLinkedQueue<>();
            this.f352474d = new C118646b();
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new C117927a(this, threadFactory));
                C117948h.m166333i(scheduledExecutorService);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new C117928b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f352475e = scheduledExecutorService;
            this.f352476f = scheduledFuture;
        }

        /* renamed from: a */
        public void mo182710a() {
            try {
                Future<?> future = this.f352476f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f352475e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } finally {
                this.f352474d.mo182165d();
            }
        }
    }

    /* renamed from: p34.a$b */
    public static final class C117929b extends C117456i.C117457a {

        /* renamed from: d */
        public final C118646b f352479d = new C118646b();

        /* renamed from: e */
        public final C117926a f352480e;

        /* renamed from: f */
        public final C117931c f352481f;

        /* renamed from: g */
        public final AtomicBoolean f352482g;

        /* renamed from: p34.a$b$a */
        public class C117930a implements C117603a {

            /* renamed from: d */
            public final /* synthetic */ C117603a f352483d;

            public C117930a(C117603a aVar) {
                this.f352483d = aVar;
            }

            public void call() {
                if (!C117929b.this.f352479d.f355036e) {
                    this.f352483d.call();
                }
            }
        }

        public C117929b(C117926a aVar) {
            C117931c cVar;
            C117931c cVar2;
            this.f352480e = aVar;
            this.f352482g = new AtomicBoolean();
            if (aVar.f352474d.f355036e) {
                cVar = C117925a.f352467h;
            } else {
                while (true) {
                    if (aVar.f352473c.isEmpty()) {
                        cVar2 = new C117931c(aVar.f352471a);
                        aVar.f352474d.mo183370a(cVar2);
                        break;
                    }
                    cVar2 = aVar.f352473c.poll();
                    if (cVar2 != null) {
                        break;
                    }
                }
                cVar = cVar2;
            }
            this.f352481f = cVar;
        }

        /* renamed from: b */
        public C117459k mo182162b(C117603a aVar) {
            return mo182163e(aVar, 0, (TimeUnit) null);
        }

        /* renamed from: c */
        public boolean mo182164c() {
            return this.f352479d.f355036e;
        }

        /* renamed from: d */
        public void mo182165d() {
            if (this.f352482g.compareAndSet(false, true)) {
                C117926a aVar = this.f352480e;
                C117931c cVar = this.f352481f;
                aVar.getClass();
                cVar.f352485o = System.nanoTime() + aVar.f352472b;
                aVar.f352473c.offer(cVar);
            }
            this.f352479d.mo182165d();
        }

        /* renamed from: e */
        public C117459k mo182163e(C117603a aVar, long j, TimeUnit timeUnit) {
            if (this.f352479d.f355036e) {
                return C118649d.f355040a;
            }
            C117950i h = this.f352481f.mo182714h(new C117930a(aVar), j, timeUnit);
            this.f352479d.mo183370a(h);
            h.f352533d.mo182955a(new C117950i.C117953c(h, this.f352479d));
            return h;
        }
    }

    /* renamed from: p34.a$c */
    public static final class C117931c extends C117948h {

        /* renamed from: o */
        public long f352485o = 0;

        public C117931c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C117931c cVar = new C117931c(C118160h.f353190e);
        f352467h = cVar;
        cVar.mo182165d();
        C117926a aVar = new C117926a((ThreadFactory) null, 0, (TimeUnit) null);
        f352468i = aVar;
        aVar.mo182710a();
    }

    public C117925a(ThreadFactory threadFactory) {
        this.f352469e = threadFactory;
        start();
    }

    public C117456i.C117457a createWorker() {
        return new C117929b(this.f352470f.get());
    }

    public void shutdown() {
        C117926a aVar;
        boolean z;
        do {
            aVar = this.f352470f.get();
            C117926a aVar2 = f352468i;
            if (aVar != aVar2) {
                AtomicReference<C117926a> atomicReference = this.f352470f;
                while (true) {
                    if (!atomicReference.compareAndSet(aVar, aVar2)) {
                        if (atomicReference.get() != aVar) {
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
        aVar.mo182710a();
    }

    public void start() {
        boolean z;
        C117926a aVar = new C117926a(this.f352469e, 60, f352466g);
        AtomicReference<C117926a> atomicReference = this.f352470f;
        C117926a aVar2 = f352468i;
        while (true) {
            if (!atomicReference.compareAndSet(aVar2, aVar)) {
                if (atomicReference.get() != aVar2) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            aVar.mo182710a();
        }
    }
}
