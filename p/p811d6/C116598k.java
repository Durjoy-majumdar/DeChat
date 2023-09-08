package p811d6;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: d6.k */
public class C116598k {

    /* renamed from: a */
    public final C116601n f349649a;

    /* renamed from: b */
    public final C116587a f349650b;

    /* renamed from: c */
    public final Object f349651c = new Object();

    /* renamed from: d */
    public final Object f349652d = new Object();

    /* renamed from: e */
    public final AtomicInteger f349653e;

    /* renamed from: f */
    public volatile Thread f349654f;

    /* renamed from: g */
    public volatile boolean f349655g;

    /* renamed from: h */
    public volatile int f349656h = -1;

    /* renamed from: d6.k$b */
    public class C116600b implements Runnable {
        public C116600b(C116599a aVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
            r3 = r3 + ((long) r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
            r5 = r0.f349652d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
            monitor-enter(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
            if (java.lang.Thread.currentThread().isInterrupted() != false) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
            if (r0.f349655g == false) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0064, code lost:
            r8 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0065, code lost:
            if (r8 != false) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0075, code lost:
            if (r0.f349650b.available() != r0.f349649a.length()) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0077, code lost:
            r0.f349650b.mo120864a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x007c, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            r0.f349656h = 100;
            r0.mo180566c(r0.f349656h);
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[Catch:{ all -> 0x0062, all -> 0x003b, all -> 0x0089 }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0040 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                d6.k r0 = p811d6.C116598k.this
                r0.getClass()
                r1 = -1
                r3 = 0
                d6.a r5 = r0.f349650b     // Catch:{ all -> 0x0089 }
                long r3 = r5.available()     // Catch:{ all -> 0x0089 }
                d6.n r5 = r0.f349649a     // Catch:{ all -> 0x0089 }
                r5.mo180577a(r3)     // Catch:{ all -> 0x0089 }
                d6.n r5 = r0.f349649a     // Catch:{ all -> 0x0089 }
                long r1 = r5.length()     // Catch:{ all -> 0x0089 }
                r5 = 8192(0x2000, float:1.14794E-41)
                byte[] r5 = new byte[r5]     // Catch:{ all -> 0x0089 }
            L_0x001e:
                d6.n r6 = r0.f349649a     // Catch:{ all -> 0x0089 }
                int r6 = r6.read(r5)     // Catch:{ all -> 0x0089 }
                r7 = -1
                r8 = 0
                r9 = 1
                if (r6 == r7) goto L_0x0050
                java.lang.Object r7 = r0.f349652d     // Catch:{ all -> 0x0089 }
                monitor-enter(r7)     // Catch:{ all -> 0x0089 }
                java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003b }
                boolean r10 = r10.isInterrupted()     // Catch:{ all -> 0x003b }
                if (r10 != 0) goto L_0x003d
                boolean r10 = r0.f349655g     // Catch:{ all -> 0x003b }
                if (r10 == 0) goto L_0x003e
                goto L_0x003d
            L_0x003b:
                r5 = move-exception
                goto L_0x004e
            L_0x003d:
                r8 = 1
            L_0x003e:
                if (r8 == 0) goto L_0x0042
                monitor-exit(r7)     // Catch:{ all -> 0x003b }
                goto L_0x0091
            L_0x0042:
                d6.a r8 = r0.f349650b     // Catch:{ all -> 0x003b }
                r8.mo120866b(r5, r6)     // Catch:{ all -> 0x003b }
                monitor-exit(r7)     // Catch:{ all -> 0x003b }
                long r6 = (long) r6
                long r3 = r3 + r6
                r0.mo180587b(r3, r1)     // Catch:{ all -> 0x0089 }
                goto L_0x001e
            L_0x004e:
                monitor-exit(r7)     // Catch:{ all -> 0x003b }
                throw r5     // Catch:{ all -> 0x0089 }
            L_0x0050:
                java.lang.Object r5 = r0.f349652d     // Catch:{ all -> 0x0089 }
                monitor-enter(r5)     // Catch:{ all -> 0x0089 }
                java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0062 }
                boolean r6 = r6.isInterrupted()     // Catch:{ all -> 0x0062 }
                if (r6 != 0) goto L_0x0064
                boolean r6 = r0.f349655g     // Catch:{ all -> 0x0062 }
                if (r6 == 0) goto L_0x0065
                goto L_0x0064
            L_0x0062:
                r6 = move-exception
                goto L_0x0087
            L_0x0064:
                r8 = 1
            L_0x0065:
                if (r8 != 0) goto L_0x007c
                d6.a r6 = r0.f349650b     // Catch:{ all -> 0x0062 }
                long r6 = r6.available()     // Catch:{ all -> 0x0062 }
                d6.n r8 = r0.f349649a     // Catch:{ all -> 0x0062 }
                long r8 = r8.length()     // Catch:{ all -> 0x0062 }
                int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r10 != 0) goto L_0x007c
                d6.a r6 = r0.f349650b     // Catch:{ all -> 0x0062 }
                r6.mo120864a()     // Catch:{ all -> 0x0062 }
            L_0x007c:
                monitor-exit(r5)     // Catch:{ all -> 0x0062 }
                r5 = 100
                r0.f349656h = r5     // Catch:{ all -> 0x0089 }
                int r5 = r0.f349656h     // Catch:{ all -> 0x0089 }
                r0.mo180566c(r5)     // Catch:{ all -> 0x0089 }
                goto L_0x0091
            L_0x0087:
                monitor-exit(r5)     // Catch:{ all -> 0x0062 }
                throw r6     // Catch:{ all -> 0x0089 }
            L_0x0089:
                r5 = move-exception
                java.util.concurrent.atomic.AtomicInteger r6 = r0.f349653e     // Catch:{ all -> 0x0098 }
                r6.incrementAndGet()     // Catch:{ all -> 0x0098 }
                boolean r5 = r5 instanceof p811d6.C116597j     // Catch:{ all -> 0x0098 }
            L_0x0091:
                r0.mo180586a()
                r0.mo180587b(r3, r1)
                return
            L_0x0098:
                r5 = move-exception
                r0.mo180586a()
                r0.mo180587b(r3, r1)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p811d6.C116598k.C116600b.run():void");
        }
    }

    public C116598k(C116601n nVar, C116587a aVar) {
        nVar.getClass();
        this.f349649a = nVar;
        aVar.getClass();
        this.f349650b = aVar;
        this.f349653e = new AtomicInteger();
    }

    /* renamed from: a */
    public final void mo180586a() {
        try {
            this.f349649a.close();
        } catch (C86197l e) {
            new C86197l("Error closing source " + this.f349649a, e);
        }
    }

    /* renamed from: b */
    public final void mo180587b(long j, long j2) {
        boolean z = false;
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        int i2 = i == 0 ? 100 : (int) ((((float) j) / ((float) j2)) * 100.0f);
        boolean z2 = i2 != this.f349656h;
        if (i >= 0) {
            z = true;
        }
        if (z && z2) {
            mo180566c(i2);
        }
        this.f349656h = i2;
        synchronized (this.f349651c) {
            this.f349651c.notifyAll();
        }
    }

    /* renamed from: c */
    public void mo180566c(int i) {
        throw null;
    }
}
