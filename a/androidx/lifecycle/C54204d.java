package androidx.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.d */
public abstract class C54204d<T> {

    /* renamed from: a */
    public final Executor f152169a;

    /* renamed from: b */
    public final LiveData<T> f152170b;

    /* renamed from: c */
    public final AtomicBoolean f152171c = new AtomicBoolean(true);

    /* renamed from: d */
    public final AtomicBoolean f152172d = new AtomicBoolean(false);

    /* renamed from: e */
    public final Runnable f152173e = new C54206b();

    /* renamed from: f */
    public final Runnable f152174f = new C54207c();

    /* renamed from: androidx.lifecycle.d$a */
    public class C54205a extends LiveData<T> {
        public C54205a() {
        }

        public void onActive() {
            C54204d dVar = C54204d.this;
            dVar.f152169a.execute(dVar.f152173e);
        }
    }

    /* renamed from: androidx.lifecycle.d$b */
    public class C54206b implements Runnable {
        public C54206b() {
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
            L_0x0000:
                androidx.lifecycle.d r0 = androidx.lifecycle.C54204d.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f152172d
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x003b
                r0 = 0
                r3 = 0
            L_0x000e:
                androidx.lifecycle.d r4 = androidx.lifecycle.C54204d.this     // Catch:{ all -> 0x0032 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f152171c     // Catch:{ all -> 0x0032 }
                boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0032 }
                if (r4 == 0) goto L_0x0020
                androidx.lifecycle.d r0 = androidx.lifecycle.C54204d.this     // Catch:{ all -> 0x0032 }
                java.lang.Object r0 = r0.mo74998a()     // Catch:{ all -> 0x0032 }
                r3 = 1
                goto L_0x000e
            L_0x0020:
                if (r3 == 0) goto L_0x0029
                androidx.lifecycle.d r2 = androidx.lifecycle.C54204d.this     // Catch:{ all -> 0x0032 }
                androidx.lifecycle.LiveData<T> r2 = r2.f152170b     // Catch:{ all -> 0x0032 }
                r2.postValue(r0)     // Catch:{ all -> 0x0032 }
            L_0x0029:
                androidx.lifecycle.d r0 = androidx.lifecycle.C54204d.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f152172d
                r0.set(r1)
                r1 = r3
                goto L_0x003b
            L_0x0032:
                r0 = move-exception
                androidx.lifecycle.d r2 = androidx.lifecycle.C54204d.this
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f152172d
                r2.set(r1)
                throw r0
            L_0x003b:
                if (r1 == 0) goto L_0x0047
                androidx.lifecycle.d r0 = androidx.lifecycle.C54204d.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f152171c
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x0000
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C54204d.C54206b.run():void");
        }
    }

    /* renamed from: androidx.lifecycle.d$c */
    public class C54207c implements Runnable {
        public C54207c() {
        }

        public void run() {
            boolean hasActiveObservers = C54204d.this.f152170b.hasActiveObservers();
            if (C54204d.this.f152171c.compareAndSet(false, true) && hasActiveObservers) {
                C54204d dVar = C54204d.this;
                dVar.f152169a.execute(dVar.f152173e);
            }
        }
    }

    public C54204d(Executor executor) {
        this.f152169a = executor;
        this.f152170b = new C54205a();
    }

    /* renamed from: a */
    public abstract T mo74998a();
}
