package com.tencent.mapsdk.internal;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mapsdk.internal.z */
public final class C114375z implements C113533bb, C114008ob {

    /* renamed from: a */
    public static final int f342851a = 60;

    /* renamed from: l */
    private static final int f342852l = 200;

    /* renamed from: b */
    public ArrayList<C113831iz> f342853b = new ArrayList<>();

    /* renamed from: c */
    public final byte[] f342854c = new byte[0];

    /* renamed from: d */
    public C114376a f342855d;

    /* renamed from: e */
    public int f342856e = 60;

    /* renamed from: f */
    public C113835jc f342857f;

    /* renamed from: g */
    public long f342858g;

    /* renamed from: h */
    public boolean f342859h;

    /* renamed from: i */
    public C113726fk f342860i;

    /* renamed from: j */
    private ArrayList<C113831iz> f342861j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C113831iz> f342862k = new ArrayList<>();

    /* renamed from: com.tencent.mapsdk.internal.z$a */
    public class C114376a extends Thread {

        /* renamed from: b */
        private boolean f342864b;

        /* renamed from: c */
        private boolean f342865c;

        public C114376a() {
            super("tms-act");
        }

        /* renamed from: a */
        public final synchronized void mo173101a() {
            this.f342865c = true;
        }

        /* renamed from: b */
        public final synchronized void mo173102b() {
            this.f342865c = false;
        }

        public final synchronized void destroy() {
            this.f342864b = false;
            interrupt();
        }

        public final void run() {
            while (this.f342864b) {
                if (!this.f342865c) {
                    C113835jc jcVar = C114375z.this.f342857f;
                    if (jcVar != null) {
                        jcVar.mo171240c(C113831iz.f340582G);
                    }
                    if (C114375z.this.f342859h) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        C114375z zVar = C114375z.this;
                        if (elapsedRealtime - zVar.f342858g > 50) {
                            zVar.f342859h = false;
                            C113889km.m157545b(C0949kl.f2236f, "notify onStable");
                            C113726fk fkVar = C114375z.this.f342860i;
                            if (fkVar != null) {
                                fkVar.mo171258u();
                            }
                        }
                    }
                }
                try {
                    synchronized (this) {
                        wait(C114375z.this.mo173097c());
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        public final synchronized void start() {
            this.f342864b = true;
            super.start();
        }
    }

    public C114375z(C113835jc jcVar) {
        this.f342857f = jcVar;
        C24237iy.m30296d(mo173097c());
    }

    /* renamed from: h */
    private void m160656h() {
        C114376a aVar = this.f342855d;
        if (aVar != null) {
            aVar.destroy();
        }
        C114376a aVar2 = new C114376a();
        this.f342855d = aVar2;
        aVar2.start();
    }

    /* renamed from: i */
    private void m160657i() {
        C114376a aVar = this.f342855d;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    /* renamed from: j */
    private void m160658j() {
        this.f342856e = 60;
    }

    /* renamed from: k */
    private int m160659k() {
        return this.f342856e;
    }

    /* renamed from: l */
    private void m160660l() {
    }

    /* renamed from: d */
    public final void mo171241d() {
    }

    /* renamed from: f */
    public final boolean mo173099f() {
        boolean z;
        synchronized (this.f342854c) {
            z = !this.f342853b.isEmpty();
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1.mo172218a(r4.f342857f) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r0 = r4.f342854c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f342853b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        r1 = r4.f342854c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0 = r4.f342853b.isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0038, code lost:
        if (r0 != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r1 == null) goto L_0x002e;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo173100g() {
        /*
            r4 = this;
            byte[] r0 = r4.f342854c
            monitor-enter(r0)
            java.util.ArrayList<com.tencent.mapsdk.internal.iz> r1 = r4.f342853b     // Catch:{ all -> 0x0040 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0040 }
            r2 = 0
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return r2
        L_0x000e:
            java.util.ArrayList<com.tencent.mapsdk.internal.iz> r1 = r4.f342853b     // Catch:{ all -> 0x0040 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0040 }
            com.tencent.mapsdk.internal.iz r1 = (com.tencent.mapsdk.internal.C113831iz) r1     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            if (r1 == 0) goto L_0x002e
            com.tencent.mapsdk.internal.jc r0 = r4.f342857f
            boolean r0 = r1.mo172218a((com.tencent.mapsdk.internal.C113835jc) r0)
            if (r0 == 0) goto L_0x002e
            byte[] r0 = r4.f342854c
            monitor-enter(r0)
            java.util.ArrayList<com.tencent.mapsdk.internal.iz> r3 = r4.f342853b     // Catch:{ all -> 0x002b }
            r3.remove(r1)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            goto L_0x002e
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r1
        L_0x002e:
            byte[] r1 = r4.f342854c
            monitor-enter(r1)
            java.util.ArrayList<com.tencent.mapsdk.internal.iz> r0 = r4.f342853b     // Catch:{ all -> 0x003d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003d }
            monitor-exit(r1)     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x003c
            r0 = 1
            return r0
        L_0x003c:
            return r2
        L_0x003d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003d }
            throw r0
        L_0x0040:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114375z.mo173100g():boolean");
    }

    /* renamed from: a */
    public final void mo173093a() {
        C114376a aVar = this.f342855d;
        if (aVar != null) {
            aVar.mo173101a();
        }
        mo173098e();
    }

    /* renamed from: b */
    public final void mo173096b() {
        C114376a aVar = this.f342855d;
        if (aVar != null) {
            aVar.mo173102b();
        }
    }

    /* renamed from: c */
    public final long mo173097c() {
        long j = 1000 / ((long) this.f342856e);
        if (j == 0) {
            return 1;
        }
        return j;
    }

    /* renamed from: e */
    public final void mo173098e() {
        synchronized (this.f342854c) {
            this.f342862k.clear();
            this.f342861j.clear();
            boolean z = false;
            Iterator<C113831iz> it = this.f342853b.iterator();
            while (it.hasNext()) {
                C113831iz next = it.next();
                if (next.f340604D) {
                    z = true;
                    this.f342861j.add(next);
                } else {
                    this.f342862k.add(next);
                }
            }
            this.f342853b.clear();
            if (z) {
                ArrayList<C113831iz> arrayList = this.f342853b;
                this.f342853b = this.f342861j;
                this.f342861j = arrayList;
            }
            if (this.f342862k.size() > 0) {
                Iterator<C113831iz> it4 = this.f342862k.iterator();
                while (it4.hasNext()) {
                    it4.next().mo172219b();
                }
            }
        }
    }

    /* renamed from: b */
    private void m160651b(int i) {
        synchronized (this.f342854c) {
            for (int size = this.f342853b.size() - 1; size >= 0; size--) {
                C113831iz izVar = this.f342853b.get(size);
                if (izVar.f340607z == i) {
                    this.f342853b.remove(size);
                    izVar.mo172219b();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo173094a(int i) {
        if (i > 0) {
            this.f342856e = i;
        }
    }

    /* renamed from: a */
    private void m160650a(C113726fk fkVar) {
        this.f342860i = fkVar;
    }

    /* renamed from: a */
    public final void mo173095a(C113831iz izVar) {
        synchronized (this.f342854c) {
            if (this.f342853b.size() > 200) {
                this.f342853b.clear();
            }
            this.f342853b.add(izVar);
        }
    }

    /* renamed from: a */
    private void m160649a(double d, double d2) {
        synchronized (this.f342854c) {
            while (!this.f342853b.isEmpty()) {
                ArrayList<C113831iz> arrayList = this.f342853b;
                if (arrayList.get(arrayList.size() - 1).f340607z != 3) {
                    break;
                }
                ArrayList<C113831iz> arrayList2 = this.f342853b;
                double[] dArr = arrayList2.remove(arrayList2.size() - 1).f340601A;
                d += dArr[0];
                d2 += dArr[1];
            }
            mo173095a(new C113831iz(3, new double[]{d, d2}));
        }
    }

    /* renamed from: a */
    public final void mo171628a(C114367v vVar) {
        this.f342859h = true;
        this.f342858g = SystemClock.elapsedRealtime();
    }
}
