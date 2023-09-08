package zt3;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import lu3.C88656g;
import zt3.C119146d;

/* renamed from: zt3.b */
public class C119143b extends AbstractExecutorService {

    /* renamed from: s */
    public static ConcurrentLinkedQueue<WeakReference<C119143b>> f356830s = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    public final AtomicInteger f356831d;

    /* renamed from: e */
    public final BlockingQueue<Runnable> f356832e;

    /* renamed from: f */
    public final ReentrantLock f356833f;

    /* renamed from: g */
    public final HashSet<C119144b> f356834g;

    /* renamed from: h */
    public final LinkedList<C119144b> f356835h;

    /* renamed from: i */
    public final Condition f356836i;

    /* renamed from: j */
    public int f356837j;

    /* renamed from: n */
    public long f356838n;

    /* renamed from: o */
    public volatile C103084e f356839o;

    /* renamed from: p */
    public volatile int f356840p;

    /* renamed from: q */
    public volatile int f356841q;

    /* renamed from: r */
    public volatile String f356842r;

    /* renamed from: zt3.b$a */
    public static class C91935a implements C103084e {
        /* renamed from: a */
        public void mo125763a(Runnable runnable, C119143b bVar) {
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + bVar.toString());
        }
    }

    /* renamed from: zt3.b$b */
    public final class C119144b extends AbstractQueuedSynchronizer implements C88656g {

        /* renamed from: d */
        public Runnable f356843d;

        /* renamed from: e */
        public String f356844e;

        /* renamed from: f */
        public AtomicLong f356845f = new AtomicLong(0);

        /* renamed from: g */
        public AtomicBoolean f356846g = new AtomicBoolean(false);

        /* renamed from: h */
        public Future f356847h;

        public C119144b(Runnable runnable) {
            setState(-1);
            mo183862b(runnable);
        }

        /* renamed from: a */
        public void mo183861a() {
            C119146d.C91936b bVar = C119146d.f356851c;
            bVar.mo125765i("ForkThreadPoolExecutor", "[releaseWork] name=" + C119143b.this.f356842r, new Object[0]);
            Future future = this.f356847h;
            if (future != null && !future.isDone()) {
                this.f356847h.cancel(true);
            }
        }

        /* renamed from: b */
        public void mo183862b(Runnable runnable) {
            this.f356843d = runnable;
            if (runnable == null) {
                this.f356844e = C119143b.this.f356842r + "#Worker";
            } else if (runnable instanceof C88656g) {
                this.f356844e = ((C88656g) runnable).getKey();
            } else {
                this.f356844e = C119143b.this.f356842r + "#" + runnable.getClass().getName();
            }
        }

        public String getKey() {
            return this.f356844e;
        }

        public boolean isHeldExclusively() {
            return getState() != 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.Throwable} */
        /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Throwable] */
        /* JADX WARNING: type inference failed for: r1v19 */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
            if (r2 != null) goto L_0x001b;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00ab  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                zt3.b r0 = zt3.C119143b.this
                r0.getClass()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.Runnable r2 = r8.f356843d
                r3 = 0
                r8.f356843d = r3
                r4 = 1
                r8.release(r4)
                r5 = 0
                if (r2 != 0) goto L_0x001b
                java.lang.Runnable r2 = r0.mo183851f()     // Catch:{ all -> 0x00a6 }
                if (r2 == 0) goto L_0x0067
            L_0x001b:
                r8.acquire(r4)     // Catch:{ all -> 0x00a6 }
                java.util.concurrent.atomic.AtomicInteger r6 = r0.f356831d     // Catch:{ all -> 0x00a6 }
                int r6 = r6.get()     // Catch:{ all -> 0x00a6 }
                r7 = 536870912(0x20000000, float:1.0842022E-19)
                if (r6 < r7) goto L_0x002a
                r6 = 1
                goto L_0x002b
            L_0x002a:
                r6 = 0
            L_0x002b:
                if (r6 == 0) goto L_0x003a
                boolean r6 = r1.isInterrupted()     // Catch:{ all -> 0x00a6 }
                if (r6 != 0) goto L_0x003a
                r8.mo183861a()     // Catch:{ all -> 0x00a6 }
                r0.mo183856j(r8, r4)
                goto L_0x006c
            L_0x003a:
                r6 = 0
                r0.mo72174c(r1, r2)     // Catch:{ all -> 0x007f }
                r2.run()     // Catch:{ RuntimeException -> 0x0078, Error -> 0x0076, all -> 0x006f }
                r0.mo72173b(r2, r3)     // Catch:{ all -> 0x007f }
                java.util.concurrent.atomic.AtomicLong r1 = r8.f356845f     // Catch:{ all -> 0x00a6 }
                r1.getAndIncrement()     // Catch:{ all -> 0x00a6 }
                java.lang.Runnable r1 = r0.mo183851f()     // Catch:{ all -> 0x00a6 }
                if (r1 == 0) goto L_0x0062
                r8.mo183862b(r1)     // Catch:{ all -> 0x009c }
                zt3.t r1 = zt3.C119157j.f356862d     // Catch:{ all -> 0x009c }
                zt3.j r1 = (zt3.C119157j) r1     // Catch:{ all -> 0x009c }
                r1.getClass()     // Catch:{ all -> 0x009c }
                lu3.c r1 = r1.mo183878i(r8, r6)     // Catch:{ all -> 0x009c }
                r8.f356847h = r1     // Catch:{ all -> 0x009c }
                r1 = 0
                goto L_0x0063
            L_0x0062:
                r1 = 1
            L_0x0063:
                r8.release(r4)     // Catch:{ all -> 0x006d }
                r4 = r1
            L_0x0067:
                if (r4 == 0) goto L_0x006c
                r0.mo183856j(r8, r5)
            L_0x006c:
                return
            L_0x006d:
                r2 = move-exception
                goto L_0x00a9
            L_0x006f:
                r1 = move-exception
                java.lang.Error r3 = new java.lang.Error     // Catch:{ all -> 0x007a }
                r3.<init>(r1)     // Catch:{ all -> 0x007a }
                throw r3     // Catch:{ all -> 0x007a }
            L_0x0076:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x007a }
            L_0x0078:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x007a }
            L_0x007a:
                r3 = move-exception
                r0.mo72173b(r2, r1)     // Catch:{ all -> 0x007f }
                throw r3     // Catch:{ all -> 0x007f }
            L_0x007f:
                r1 = move-exception
                java.util.concurrent.atomic.AtomicLong r2 = r8.f356845f     // Catch:{ all -> 0x00a6 }
                r2.getAndIncrement()     // Catch:{ all -> 0x00a6 }
                java.lang.Runnable r2 = r0.mo183851f()     // Catch:{ all -> 0x00a6 }
                if (r2 == 0) goto L_0x009e
                r8.mo183862b(r2)     // Catch:{ all -> 0x009c }
                zt3.t r2 = zt3.C119157j.f356862d     // Catch:{ all -> 0x009c }
                zt3.j r2 = (zt3.C119157j) r2     // Catch:{ all -> 0x009c }
                r2.getClass()     // Catch:{ all -> 0x009c }
                lu3.c r2 = r2.mo183878i(r8, r6)     // Catch:{ all -> 0x009c }
                r8.f356847h = r2     // Catch:{ all -> 0x009c }
                goto L_0x009f
            L_0x009c:
                r1 = move-exception
                goto L_0x00a3
            L_0x009e:
                r5 = 1
            L_0x009f:
                r8.release(r4)     // Catch:{ all -> 0x009c }
                throw r1     // Catch:{ all -> 0x009c }
            L_0x00a3:
                r2 = r1
                r1 = r5
                goto L_0x00a9
            L_0x00a6:
                r1 = move-exception
                r2 = r1
                r1 = 1
            L_0x00a9:
                if (r1 == 0) goto L_0x00ae
                r0.mo183856j(r8, r4)
            L_0x00ae:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: zt3.C119143b.C119144b.run():void");
        }

        public boolean tryAcquire(int i) {
            if (!compareAndSetState(0, 1)) {
                return false;
            }
            setExclusiveOwnerThread(Thread.currentThread());
            return true;
        }

        public boolean tryRelease(int i) {
            setExclusiveOwnerThread((Thread) null);
            setState(0);
            return true;
        }
    }

    public C119143b(String str, int i, int i2, BlockingQueue<Runnable> blockingQueue, C103084e eVar) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        eVar = eVar == null ? new C91935a() : eVar;
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        this.f356831d = new AtomicInteger(-536870912);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f356833f = reentrantLock;
        this.f356834g = new HashSet<>();
        this.f356835h = new LinkedList<>();
        this.f356836i = reentrantLock.newCondition();
        if (i < 0 || i2 <= 0 || i2 < i) {
            throw new IllegalArgumentException();
        } else if (blockingQueue == null || defaultThreadFactory == null || eVar == null) {
            throw null;
        } else {
            this.f356840p = i;
            this.f356841q = i2;
            this.f356832e = blockingQueue;
            timeUnit.toNanos(MAlarmHandler.NEXT_FIRE_INTERVAL);
            this.f356839o = eVar;
            this.f356842r = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d2, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076 A[Catch:{ all -> 0x00a2, all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2 A[SYNTHETIC, Splitter:B:56:0x00b2] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo183848a(java.lang.Runnable r7, boolean r8) {
        /*
            r6 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f356831d
            int r0 = r0.get()
            r1 = -536870912(0xffffffffe0000000, float:-3.6893488E19)
            r2 = r0 & r1
            zt3.t r3 = zt3.C119157j.f356862d
            zt3.j r3 = (zt3.C119157j) r3
            java.util.concurrent.atomic.AtomicBoolean r3 = r3.f356864a
            boolean r3 = r3.get()
            r4 = 0
            if (r3 == 0) goto L_0x0018
            return r4
        L_0x0018:
            if (r2 < 0) goto L_0x0027
            if (r2 != 0) goto L_0x0026
            if (r7 != 0) goto L_0x0026
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r3 = r6.f356832e
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0027
        L_0x0026:
            return r4
        L_0x0027:
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r5 = r0 & r3
            if (r5 >= r3) goto L_0x00d2
            if (r8 == 0) goto L_0x0033
            int r3 = r6.f356840p
            goto L_0x0035
        L_0x0033:
            int r3 = r6.f356841q
        L_0x0035:
            if (r5 < r3) goto L_0x0039
            goto L_0x00d2
        L_0x0039:
            java.util.concurrent.atomic.AtomicInteger r3 = r6.f356831d
            int r5 = r0 + 1
            boolean r0 = r3.compareAndSet(r0, r5)
            if (r0 == 0) goto L_0x00c6
            r8 = 0
            zt3.b$b r0 = new zt3.b$b     // Catch:{ all -> 0x00aa }
            r0.<init>(r7)     // Catch:{ all -> 0x00aa }
            java.util.concurrent.locks.ReentrantLock r8 = r6.f356833f     // Catch:{ all -> 0x00a7 }
            r8.lock()     // Catch:{ all -> 0x00a7 }
            java.util.concurrent.atomic.AtomicInteger r2 = r6.f356831d     // Catch:{ all -> 0x00a2 }
            int r2 = r2.get()     // Catch:{ all -> 0x00a2 }
            r1 = r1 & r2
            r2 = 1
            if (r1 < 0) goto L_0x005f
            if (r1 != 0) goto L_0x005d
            if (r7 != 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r7 = 0
            goto L_0x0071
        L_0x005f:
            java.util.HashSet<zt3.b$b> r7 = r6.f356834g     // Catch:{ all -> 0x00a2 }
            r7.add(r0)     // Catch:{ all -> 0x00a2 }
            java.util.HashSet<zt3.b$b> r7 = r6.f356834g     // Catch:{ all -> 0x00a2 }
            int r7 = r7.size()     // Catch:{ all -> 0x00a2 }
            int r1 = r6.f356837j     // Catch:{ all -> 0x00a2 }
            if (r7 <= r1) goto L_0x0070
            r6.f356837j = r7     // Catch:{ all -> 0x00a2 }
        L_0x0070:
            r7 = 1
        L_0x0071:
            r8.unlock()     // Catch:{ all -> 0x00a7 }
            if (r7 == 0) goto L_0x0086
            zt3.t r7 = zt3.C119157j.f356862d     // Catch:{ all -> 0x00a7 }
            zt3.j r7 = (zt3.C119157j) r7     // Catch:{ all -> 0x00a7 }
            r7.getClass()     // Catch:{ all -> 0x00a7 }
            r3 = 0
            lu3.c r7 = r7.mo183878i(r0, r3)     // Catch:{ all -> 0x00a7 }
            r0.f356847h = r7     // Catch:{ all -> 0x00a7 }
            r4 = 1
        L_0x0086:
            if (r4 != 0) goto L_0x00a1
            java.util.concurrent.locks.ReentrantLock r7 = r6.f356833f
            r7.lock()
            java.util.HashSet<zt3.b$b> r8 = r6.f356834g     // Catch:{ all -> 0x009c }
            r8.remove(r0)     // Catch:{ all -> 0x009c }
            r6.mo183850d()     // Catch:{ all -> 0x009c }
            r6.mo183857l()     // Catch:{ all -> 0x009c }
            r7.unlock()
            goto L_0x00a1
        L_0x009c:
            r8 = move-exception
            r7.unlock()
            throw r8
        L_0x00a1:
            return r4
        L_0x00a2:
            r7 = move-exception
            r8.unlock()     // Catch:{ all -> 0x00a7 }
            throw r7     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r7 = move-exception
            r8 = r0
            goto L_0x00ab
        L_0x00aa:
            r7 = move-exception
        L_0x00ab:
            java.util.concurrent.locks.ReentrantLock r0 = r6.f356833f
            r0.lock()
            if (r8 == 0) goto L_0x00b7
            java.util.HashSet<zt3.b$b> r1 = r6.f356834g     // Catch:{ all -> 0x00c1 }
            r1.remove(r8)     // Catch:{ all -> 0x00c1 }
        L_0x00b7:
            r6.mo183850d()     // Catch:{ all -> 0x00c1 }
            r6.mo183857l()     // Catch:{ all -> 0x00c1 }
            r0.unlock()
            throw r7
        L_0x00c1:
            r7 = move-exception
            r0.unlock()
            throw r7
        L_0x00c6:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f356831d
            int r0 = r0.get()
            r3 = r0 & r1
            if (r3 == r2) goto L_0x0027
            goto L_0x0000
        L_0x00d2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zt3.C119143b.mo183848a(java.lang.Runnable, boolean):boolean");
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f356833f;
        reentrantLock.lock();
        while (true) {
            try {
                if (this.f356831d.get() >= 1610612736) {
                    reentrantLock.unlock();
                    return true;
                } else if (nanos <= 0) {
                    return false;
                } else {
                    nanos = this.f356836i.awaitNanos(nanos);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: b */
    public void mo72173b(Runnable runnable, Throwable th) {
    }

    /* renamed from: c */
    public void mo72174c(Thread thread, Runnable runnable) {
    }

    /* renamed from: d */
    public final void mo183850d() {
        int i;
        do {
            i = this.f356831d.get();
        } while (!this.f356831d.compareAndSet(i, i - 1));
    }

    public void execute(Runnable runnable) {
        runnable.getClass();
        int i = this.f356831d.get();
        boolean z = true;
        if ((i & 536870911) < this.f356840p) {
            if (!mo183848a(runnable, true)) {
                i = this.f356831d.get();
            } else {
                return;
            }
        }
        if ((i < 0) && this.f356832e.offer(runnable)) {
            int i2 = this.f356831d.get();
            if (i2 >= 0) {
                z = false;
            }
            if (!z) {
                boolean remove = this.f356832e.remove(runnable);
                mo183857l();
                if (remove) {
                    this.f356839o.mo125763a(runnable, this);
                    return;
                }
            }
            if ((i2 & 536870911) == 0) {
                mo183848a((Runnable) null, false);
            } else {
                mo183854i((Runnable) null);
            }
        } else if (!mo183848a(runnable, false)) {
            this.f356839o.mo125763a(runnable, this);
        }
    }

    /* renamed from: f */
    public final Runnable mo183851f() {
        int i = this.f356831d.get() & -536870912;
        if (i < 0 || (i < 536870912 && !this.f356832e.isEmpty())) {
            return this.f356832e.poll();
        }
        mo183850d();
        return null;
    }

    public void finalize() {
        shutdown();
    }

    /* renamed from: h */
    public final void mo183853h(boolean z) {
        ReentrantLock reentrantLock = this.f356833f;
        reentrantLock.lock();
        try {
            Iterator<C119144b> it = this.f356834g.iterator();
            while (it.hasNext()) {
                it.next().mo183861a();
                if (z) {
                    break;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: i */
    public final boolean mo183854i(Runnable runnable) {
        if ((this.f356831d.get() & -536870912) >= 0) {
            return false;
        }
        ReentrantLock reentrantLock = this.f356833f;
        reentrantLock.lock();
        try {
            C119144b remove = this.f356835h.isEmpty() ? null : this.f356835h.remove();
            if (remove != null) {
                remove.f356846g.compareAndSet(true, false);
                remove.mo183862b(runnable);
                C119157j jVar = (C119157j) C119157j.f356862d;
                jVar.getClass();
                remove.f356847h = jVar.mo183878i(remove, 0);
                return true;
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean isShutdown() {
        return !(this.f356831d.get() < 0);
    }

    public boolean isTerminated() {
        return this.f356831d.get() >= 1610612736;
    }

    /* renamed from: j */
    public final void mo183856j(C119144b bVar, boolean z) {
        bVar.release(1);
        if (z) {
            mo183850d();
        }
        ReentrantLock reentrantLock = this.f356833f;
        reentrantLock.lock();
        if (z) {
            try {
                this.f356838n += bVar.f356845f.get();
                this.f356834g.remove(bVar);
                bVar.f356843d = null;
                bVar.f356847h = null;
            } catch (Throwable th) {
                reentrantLock.unlock();
                mo183857l();
                throw th;
            }
        } else if (bVar.f356846g.compareAndSet(false, true)) {
            this.f356835h.add(bVar);
            Runnable f = mo183851f();
            if (f != null) {
                mo183854i(f);
            }
        }
        reentrantLock.unlock();
        mo183857l();
    }

    /* renamed from: k */
    public void mo72175k() {
        Iterator<WeakReference<C119143b>> it = f356830s.iterator();
        while (it.hasNext()) {
            if (this == ((C119143b) it.next().get())) {
                it.remove();
            }
        }
    }

    /* renamed from: l */
    public final void mo183857l() {
        while (true) {
            int i = this.f356831d.get();
            boolean z = false;
            if (!(i < 0)) {
                if (i >= 1073741824) {
                    z = true;
                }
                if (z) {
                    return;
                }
                if ((-536870912 & i) == 0 && !this.f356832e.isEmpty()) {
                    return;
                }
                if ((536870911 & i) != 0) {
                    mo183853h(true);
                    return;
                }
                ReentrantLock reentrantLock = this.f356833f;
                reentrantLock.lock();
                try {
                    if (this.f356831d.compareAndSet(i, 1073741824)) {
                        mo72175k();
                        this.f356831d.set(1610612736);
                        this.f356836i.signalAll();
                        reentrantLock.unlock();
                        return;
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000e A[Catch:{ all -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0010 A[Catch:{ all -> 0x002a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void shutdown() {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.f356833f
            r0.lock()
        L_0x0005:
            java.util.concurrent.atomic.AtomicInteger r1 = r5.f356831d     // Catch:{ all -> 0x002a }
            int r1 = r1.get()     // Catch:{ all -> 0x002a }
            r2 = 0
            if (r1 < 0) goto L_0x0010
            r3 = 1
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            if (r3 != 0) goto L_0x0020
            java.util.concurrent.atomic.AtomicInteger r3 = r5.f356831d     // Catch:{ all -> 0x002a }
            r4 = 536870911(0x1fffffff, float:1.0842021E-19)
            r4 = r4 & r1
            r4 = r4 | r2
            boolean r1 = r3.compareAndSet(r1, r4)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0005
        L_0x0020:
            r5.mo183853h(r2)     // Catch:{ all -> 0x002a }
            r0.unlock()
            r5.mo183857l()
            return
        L_0x002a:
            r1 = move-exception
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zt3.C119143b.shutdown():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010 A[Catch:{ all -> 0x0070, all -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0012 A[Catch:{ all -> 0x0070, all -> 0x0075 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.Runnable> shutdownNow() {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f356833f
            r0.lock()
        L_0x0005:
            java.util.concurrent.atomic.AtomicInteger r1 = r8.f356831d     // Catch:{ all -> 0x0075 }
            int r1 = r1.get()     // Catch:{ all -> 0x0075 }
            r2 = 0
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 < r3) goto L_0x0012
            r4 = 1
            goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            if (r4 != 0) goto L_0x0022
            java.util.concurrent.atomic.AtomicInteger r4 = r8.f356831d     // Catch:{ all -> 0x0075 }
            r5 = 536870911(0x1fffffff, float:1.0842021E-19)
            r5 = r5 & r1
            r3 = r3 | r5
            boolean r1 = r4.compareAndSet(r1, r3)     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0005
        L_0x0022:
            java.util.concurrent.locks.ReentrantLock r1 = r8.f356833f     // Catch:{ all -> 0x0075 }
            r1.lock()     // Catch:{ all -> 0x0075 }
            java.util.HashSet<zt3.b$b> r3 = r8.f356834g     // Catch:{ all -> 0x0070 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0070 }
        L_0x002d:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0070 }
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0070 }
            zt3.b$b r4 = (zt3.C119143b.C119144b) r4     // Catch:{ all -> 0x0070 }
            r4.mo183861a()     // Catch:{ all -> 0x0070 }
            goto L_0x002d
        L_0x003d:
            r1.unlock()     // Catch:{ all -> 0x0075 }
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r1 = r8.f356832e     // Catch:{ all -> 0x0075 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0075 }
            r3.<init>()     // Catch:{ all -> 0x0075 }
            r1.drainTo(r3)     // Catch:{ all -> 0x0075 }
            boolean r4 = r1.isEmpty()     // Catch:{ all -> 0x0075 }
            if (r4 != 0) goto L_0x0069
            java.lang.Runnable[] r4 = new java.lang.Runnable[r2]     // Catch:{ all -> 0x0075 }
            java.lang.Object[] r4 = r1.toArray(r4)     // Catch:{ all -> 0x0075 }
            java.lang.Runnable[] r4 = (java.lang.Runnable[]) r4     // Catch:{ all -> 0x0075 }
            int r5 = r4.length     // Catch:{ all -> 0x0075 }
        L_0x0059:
            if (r2 >= r5) goto L_0x0069
            r6 = r4[r2]     // Catch:{ all -> 0x0075 }
            boolean r7 = r1.remove(r6)     // Catch:{ all -> 0x0075 }
            if (r7 == 0) goto L_0x0066
            r3.add(r6)     // Catch:{ all -> 0x0075 }
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x0059
        L_0x0069:
            r0.unlock()
            r8.mo183857l()
            return r3
        L_0x0070:
            r2 = move-exception
            r1.unlock()     // Catch:{ all -> 0x0075 }
            throw r2     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r1 = move-exception
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zt3.C119143b.shutdownNow():java.util.List");
    }

    /* JADX INFO: finally extract failed */
    public String toString() {
        String str;
        ReentrantLock reentrantLock = this.f356833f;
        StringBuilder sb = new StringBuilder();
        reentrantLock.lock();
        try {
            long j = this.f356838n;
            int size = this.f356834g.size();
            Iterator<C119144b> it = this.f356834g.iterator();
            boolean z = false;
            int i = 0;
            while (it.hasNext()) {
                C119144b next = it.next();
                j += next.f356845f.get();
                if (next.isHeldExclusively()) {
                    i++;
                    sb.append(next.f356844e);
                }
            }
            reentrantLock.unlock();
            int i2 = this.f356831d.get();
            if (i2 < 0) {
                str = "Running";
            } else {
                if (i2 >= 1610612736) {
                    z = true;
                }
                str = z ? "Terminated" : "Shutting down";
            }
            return super.toString() + "[" + str + ", pool size = " + size + ", active threads = " + i + ", queued tasks = " + this.f356832e.size() + ", completed tasks = " + j + ", running tasks = " + sb + "]";
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public C119143b(String str, int i, int i2, BlockingQueue<Runnable> blockingQueue) {
        this(str, i, i2, blockingQueue, (C103084e) null);
    }
}
