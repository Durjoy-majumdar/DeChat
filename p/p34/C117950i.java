package p34;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l34.C117459k;
import m34.C88695f;
import n34.C117603a;
import q34.C118165m;
import t34.C118375m;
import v34.C118646b;

/* renamed from: p34.i */
public final class C117950i extends AtomicReference<Thread> implements Runnable, C117459k {

    /* renamed from: d */
    public final C118165m f352533d;

    /* renamed from: e */
    public final C117603a f352534e;

    /* renamed from: p34.i$a */
    public final class C117951a implements C117459k {

        /* renamed from: d */
        public final Future<?> f352535d;

        public C117951a(Future<?> future) {
            this.f352535d = future;
        }

        /* renamed from: c */
        public boolean mo182164c() {
            return this.f352535d.isCancelled();
        }

        /* renamed from: d */
        public void mo182165d() {
            if (C117950i.this.get() != Thread.currentThread()) {
                this.f352535d.cancel(true);
            } else {
                this.f352535d.cancel(false);
            }
        }
    }

    /* renamed from: p34.i$b */
    public static final class C117952b extends AtomicBoolean implements C117459k {

        /* renamed from: d */
        public final C117950i f352537d;

        /* renamed from: e */
        public final C118165m f352538e;

        public C117952b(C117950i iVar, C118165m mVar) {
            this.f352537d = iVar;
            this.f352538e = mVar;
        }

        /* renamed from: c */
        public boolean mo182164c() {
            return this.f352537d.f352533d.f353197e;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
            if (r2 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            r1.mo182165d();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo182165d() {
            /*
                r4 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r4.compareAndSet(r0, r1)
                if (r0 == 0) goto L_0x002a
                q34.m r0 = r4.f352538e
                p34.i r1 = r4.f352537d
                boolean r2 = r0.f353197e
                if (r2 != 0) goto L_0x002a
                monitor-enter(r0)
                java.util.List<l34.k> r2 = r0.f353196d     // Catch:{ all -> 0x0027 }
                boolean r3 = r0.f353197e     // Catch:{ all -> 0x0027 }
                if (r3 != 0) goto L_0x0025
                if (r2 != 0) goto L_0x001a
                goto L_0x0025
            L_0x001a:
                boolean r2 = r2.remove(r1)     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r2 == 0) goto L_0x002a
                r1.mo182165d()
                goto L_0x002a
            L_0x0025:
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                goto L_0x002a
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p34.C117950i.C117952b.mo182165d():void");
        }
    }

    /* renamed from: p34.i$c */
    public static final class C117953c extends AtomicBoolean implements C117459k {

        /* renamed from: d */
        public final C117950i f352539d;

        /* renamed from: e */
        public final C118646b f352540e;

        public C117953c(C117950i iVar, C118646b bVar) {
            this.f352539d = iVar;
            this.f352540e = bVar;
        }

        /* renamed from: c */
        public boolean mo182164c() {
            return this.f352539d.f352533d.f353197e;
        }

        /* renamed from: d */
        public void mo182165d() {
            if (compareAndSet(false, true)) {
                this.f352540e.mo183372e(this.f352539d);
            }
        }
    }

    public C117950i(C117603a aVar) {
        this.f352534e = aVar;
        this.f352533d = new C118165m();
    }

    /* renamed from: a */
    public void mo182716a(Future<?> future) {
        this.f352533d.mo182955a(new C117951a(future));
    }

    /* renamed from: c */
    public boolean mo182164c() {
        return this.f352533d.f353197e;
    }

    /* renamed from: d */
    public void mo182165d() {
        if (!this.f352533d.f353197e) {
            this.f352533d.mo182165d();
        }
    }

    public void run() {
        try {
            lazySet(Thread.currentThread());
            this.f352534e.call();
        } catch (C88695f e) {
            IllegalStateException illegalStateException = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e);
            C118375m.m166985a(illegalStateException);
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
        } catch (Throwable th) {
            mo182165d();
            throw th;
        }
        mo182165d();
    }

    public C117950i(C117603a aVar, C118646b bVar) {
        this.f352534e = aVar;
        this.f352533d = new C118165m((C117459k) new C117953c(this, bVar));
    }

    public C117950i(C117603a aVar, C118165m mVar) {
        this.f352534e = aVar;
        this.f352533d = new C118165m((C117459k) new C117952b(this, mVar));
    }
}
