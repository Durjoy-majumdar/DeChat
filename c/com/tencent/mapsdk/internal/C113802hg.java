package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.mapsdk.internal.hg */
public final class C113802hg {

    /* renamed from: a */
    private static final C113803a f340526a = new C113803a("sw");

    /* renamed from: b */
    private static final C113803a f340527b = new C113803a("lw");

    /* renamed from: c */
    private static final C113803a f340528c = new C113803a("mlw");

    /* renamed from: d */
    private static final C113803a f340529d = new C113803a("qw");

    /* renamed from: e */
    private static final C113803a f340530e = new C113803a("mqw");

    /* renamed from: f */
    private static ScheduledThreadPoolExecutor f340531f;

    /* renamed from: g */
    private static ThreadPoolExecutor f340532g;

    /* renamed from: h */
    private static ThreadPoolExecutor f340533h;

    /* renamed from: i */
    private static ThreadPoolExecutor f340534i;

    /* renamed from: j */
    private static ThreadPoolExecutor f340535j;

    /* renamed from: com.tencent.mapsdk.internal.hg$a */
    public static class C113803a implements ThreadFactory {

        /* renamed from: a */
        private String f340536a;

        /* renamed from: b */
        private final AtomicInteger f340537b = new AtomicInteger(0);

        public C113803a(String str) {
            this.f340536a = str;
            if (TextUtils.isEmpty(str)) {
                this.f340536a = "def";
            }
        }

        /* renamed from: b */
        private int m157158b() {
            return this.f340537b.get();
        }

        /* renamed from: a */
        public final C113803a mo172175a() {
            this.f340537b.set(0);
            return this;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "tms-" + this.f340536a + "-" + this.f340537b.incrementAndGet());
            String concat = "创建线程：".concat(String.valueOf(thread));
            C113890kn knVar = C113889km.f340717a;
            if (knVar != null) {
                knVar.mo172311c(concat);
            } else {
                System.out.println(concat);
            }
            return thread;
        }
    }

    /* renamed from: a */
    public static synchronized ScheduledThreadPoolExecutor m157151a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (C113802hg.class) {
            if (m157152a(f340531f)) {
                f340531f = new ScheduledThreadPoolExecutor(2, f340526a.mo172175a(), new ThreadPoolExecutor.DiscardPolicy());
            }
            scheduledThreadPoolExecutor = f340531f;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    public static synchronized ThreadPoolExecutor m157153b() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (C113802hg.class) {
            if (m157152a(f340532g)) {
                f340532g = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f340529d.mo172175a(), new ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f340532g;
        }
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static synchronized ThreadPoolExecutor m157154c() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (C113802hg.class) {
            if (m157152a(f340533h)) {
                int max = Math.max(4, Runtime.getRuntime().availableProcessors());
                f340533h = new ThreadPoolExecutor(max / 2, max, 2, TimeUnit.SECONDS, new LinkedBlockingQueue(), f340530e.mo172175a(), new ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f340533h;
        }
        return threadPoolExecutor;
    }

    /* renamed from: d */
    public static synchronized ThreadPoolExecutor m157155d() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (C113802hg.class) {
            if (m157152a(f340534i)) {
                f340534i = new ThreadPoolExecutor(0, 1, 2, TimeUnit.SECONDS, new LinkedBlockingQueue(), f340527b.mo172175a(), new ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f340534i;
        }
        return threadPoolExecutor;
    }

    /* renamed from: e */
    private static synchronized ThreadPoolExecutor m157156e() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (C113802hg.class) {
            if (m157152a(f340535j)) {
                f340535j = new ThreadPoolExecutor(0, Math.max(4, Runtime.getRuntime().availableProcessors()) / 2, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(), f340528c.mo172175a(), new ThreadPoolExecutor.DiscardPolicy());
            }
            threadPoolExecutor = f340535j;
        }
        return threadPoolExecutor;
    }

    /* renamed from: f */
    private static String m157157f() {
        Thread currentThread = Thread.currentThread();
        return currentThread + ";" + currentThread.getState() + ";interrupted=" + Thread.interrupted() + "|" + currentThread.isInterrupted();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001c A[Catch:{ all -> 0x0015 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean m157152a(java.util.concurrent.ExecutorService r5) {
        /*
            java.lang.Class<com.tencent.mapsdk.internal.hg> r0 = com.tencent.mapsdk.internal.C113802hg.class
            monitor-enter(r0)
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x0017
            boolean r3 = r5.isShutdown()     // Catch:{ all -> 0x0015 }
            if (r3 != 0) goto L_0x0017
            boolean r3 = r5.isTerminated()     // Catch:{ all -> 0x0015 }
            if (r3 != 0) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0015:
            r5 = move-exception
            goto L_0x002e
        L_0x0017:
            r3 = 0
        L_0x0018:
            boolean r4 = r5 instanceof java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x0015 }
            if (r4 == 0) goto L_0x0029
            if (r3 == 0) goto L_0x0028
            java.util.concurrent.ThreadPoolExecutor r5 = (java.util.concurrent.ThreadPoolExecutor) r5     // Catch:{ all -> 0x0015 }
            boolean r5 = r5.isTerminating()     // Catch:{ all -> 0x0015 }
            if (r5 != 0) goto L_0x0028
            r3 = 1
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            monitor-exit(r0)
            if (r3 != 0) goto L_0x002d
            return r1
        L_0x002d:
            return r2
        L_0x002e:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113802hg.m157152a(java.util.concurrent.ExecutorService):boolean");
    }
}
