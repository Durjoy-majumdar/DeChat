package zx2;

import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: zx2.c */
public enum C79437c implements Choreographer.FrameCallback {
    INSTANCE;
    

    /* renamed from: d */
    public Choreographer f232971d;

    /* renamed from: e */
    public long f232972e;

    /* renamed from: f */
    public int f232973f;

    /* renamed from: g */
    public double f232974g;

    /* renamed from: h */
    public boolean f232975h;

    /* renamed from: i */
    public final Object f232976i;

    /* renamed from: zx2.c$a */
    public class C79438a implements Runnable {
        public C79438a() {
        }

        public void run() {
            C79437c.this.f232971d = Choreographer.getInstance();
            synchronized (C79437c.this.f232976i) {
                C79437c.this.f232976i.notify();
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final android.view.Choreographer mo109415a() {
        /*
            r2 = this;
            android.view.Choreographer r0 = r2.f232971d
            if (r0 != 0) goto L_0x0040
            monitor-enter(r2)
            android.view.Choreographer r0 = r2.f232971d     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x003b
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003d }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x003d }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0035
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x003d }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x003d }
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            zx2.c$a r1 = new zx2.c$a     // Catch:{ all -> 0x003d }
            r1.<init>()     // Catch:{ all -> 0x003d }
            r0.post(r1)     // Catch:{ all -> 0x003d }
            java.lang.Object r0 = r2.f232976i     // Catch:{ InterruptedException -> 0x003b }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x003b }
            java.lang.Object r1 = r2.f232976i     // Catch:{ all -> 0x0032 }
            r1.wait()     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x003b
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ InterruptedException -> 0x003b }
        L_0x0035:
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()     // Catch:{ all -> 0x003d }
            r2.f232971d = r0     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r0
        L_0x0040:
            android.view.Choreographer r0 = r2.f232971d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zx2.C79437c.mo109415a():android.view.Choreographer");
    }

    public void doFrame(long j) {
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        long j2 = this.f232972e;
        if (j2 > 0) {
            long j3 = millis - j2;
            int i = this.f232973f + 1;
            this.f232973f = i;
            if (j3 > ((long) 500)) {
                this.f232974g = ((double) (i * 1000)) / ((double) j3);
                this.f232972e = millis;
                this.f232973f = 0;
            }
        } else {
            this.f232972e = millis;
        }
        mo109415a().postFrameCallback(this);
    }
}
