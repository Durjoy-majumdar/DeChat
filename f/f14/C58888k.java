package f14;

import a14.C53883f1;
import a14.C53896h0;
import a14.C53916l;
import a14.C53949t0;
import a14.C53960w0;
import rx3.C13598b0;
import wx3.C66212f;

/* renamed from: f14.k */
public final class C58888k extends C53896h0 implements Runnable, C53960w0 {

    /* renamed from: e */
    public final C53896h0 f168535e;

    /* renamed from: f */
    public final int f168536f;

    /* renamed from: g */
    public final /* synthetic */ C53960w0 f168537g;

    /* renamed from: h */
    public final C58895o<Runnable> f168538h;

    /* renamed from: i */
    public final Object f168539i;
    private volatile int runningWorkers;

    public C58888k(C53896h0 h0Var, int i) {
        this.f168535e = h0Var;
        this.f168536f = i;
        C53960w0 w0Var = h0Var instanceof C53960w0 ? (C53960w0) h0Var : null;
        this.f168537g = w0Var == null ? C53949t0.f151198a : w0Var;
        this.f168538h = new C58895o<>(false);
        this.f168539i = new Object();
    }

    /* renamed from: I */
    public void mo74578I(long j, C53916l<? super C13598b0> lVar) {
        this.f168537g.mo74578I(j, lVar);
    }

    /* renamed from: Q */
    public C53883f1 mo74579Q(long j, Runnable runnable, C66212f fVar) {
        return this.f168537g.mo74579Q(j, runnable, fVar);
    }

    /* renamed from: S */
    public void mo74497S(C66212f fVar, Runnable runnable) {
        this.f168538h.mo84084a(runnable);
        boolean z = true;
        if (!(this.runningWorkers >= this.f168536f)) {
            synchronized (this.f168539i) {
                if (this.runningWorkers >= this.f168536f) {
                    z = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z) {
                this.f168535e.mo74497S(this, this);
            }
        }
    }

    /* renamed from: f0 */
    public void mo74564f0(C66212f fVar, Runnable runnable) {
        this.f168538h.mo84084a(runnable);
        boolean z = true;
        if (!(this.runningWorkers >= this.f168536f)) {
            synchronized (this.f168539i) {
                if (this.runningWorkers >= this.f168536f) {
                    z = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z) {
                this.f168535e.mo74564f0(this, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f168539i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f168538h.mo84086c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = rx3.C13598b0.f38549a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            f14.o<java.lang.Runnable> r2 = r4.f168538h
            java.lang.Object r2 = r2.mo84087d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            wx3.g r3 = wx3.C66217g.f190253d
            a14.C53918l0.m60515a(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            a14.h0 r2 = r4.f168535e
            boolean r2 = r2.mo74565h0(r4)
            if (r2 == 0) goto L_0x0002
            a14.h0 r0 = r4.f168535e
            r0.mo74497S(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f168539i
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            f14.o<java.lang.Runnable> r2 = r4.f168538h     // Catch:{ all -> 0x0047 }
            int r2 = r2.mo84086c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f14.C58888k.run():void");
    }
}
