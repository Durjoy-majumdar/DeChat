package e20;

import android.view.Choreographer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.TimeUnit;

/* renamed from: e20.d */
public enum C116637d implements Choreographer.FrameCallback {
    INSTANCE;
    

    /* renamed from: d */
    public Choreographer f349737d;

    /* renamed from: e */
    public long f349738e;

    /* renamed from: f */
    public final Object f349739f;

    /* renamed from: g */
    public boolean f349740g;

    /* renamed from: e20.d$a */
    public class C116638a implements Runnable {
        public C116638a() {
        }

        public void run() {
            C116637d.this.f349737d = Choreographer.getInstance();
            synchronized (C116637d.this.f349739f) {
                C116637d.this.f349739f.notify();
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
    public final android.view.Choreographer mo180637a() {
        /*
            r2 = this;
            android.view.Choreographer r0 = r2.f349737d
            if (r0 != 0) goto L_0x0040
            monitor-enter(r2)
            android.view.Choreographer r0 = r2.f349737d     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x003b
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003d }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x003d }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0035
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x003d }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x003d }
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            e20.d$a r1 = new e20.d$a     // Catch:{ all -> 0x003d }
            r1.<init>()     // Catch:{ all -> 0x003d }
            r0.post(r1)     // Catch:{ all -> 0x003d }
            java.lang.Object r0 = r2.f349739f     // Catch:{ InterruptedException -> 0x003b }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x003b }
            java.lang.Object r1 = r2.f349739f     // Catch:{ all -> 0x0032 }
            r1.wait()     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x003b
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1     // Catch:{ InterruptedException -> 0x003b }
        L_0x0035:
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()     // Catch:{ all -> 0x003d }
            r2.f349737d = r0     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r0
        L_0x0040:
            android.view.Choreographer r0 = r2.f349737d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e20.C116637d.mo180637a():android.view.Choreographer");
    }

    /* renamed from: b */
    public void mo180638b() {
        this.f349738e = 0;
        this.f349740g = false;
        Log.m105925i("MicroMsg.Metronome", "[stop] stack:%s", Util.getStack());
        mo180637a().removeFrameCallback(this);
    }

    public void doFrame(long j) {
        long millis = TimeUnit.NANOSECONDS.toMillis(j);
        long j2 = this.f349738e;
        if (j2 <= 0) {
            this.f349738e = millis;
        } else if (millis - j2 > ((long) 500)) {
            this.f349738e = millis;
        }
        mo180637a().postFrameCallback(this);
    }
}
