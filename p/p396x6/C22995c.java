package p396x6;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import p295b8.C16774g;
import p300c8.C16870b;
import p300c8.C16873k;
import p333e8.C20551y;
import p370p7.C21962v;

/* renamed from: x6.c */
public final class C22995c implements C23012l {

    /* renamed from: a */
    public final C16873k f66072a;

    /* renamed from: b */
    public final long f66073b;

    /* renamed from: c */
    public final long f66074c;

    /* renamed from: d */
    public final long f66075d;

    /* renamed from: e */
    public final long f66076e;

    /* renamed from: f */
    public int f66077f;

    /* renamed from: g */
    public boolean f66078g;

    public C22995c() {
        this(new C16873k(true, 65536));
    }

    /* renamed from: a */
    public boolean mo36251a(long j) {
        int i;
        boolean z = false;
        char c = j > this.f66074c ? 0 : j < this.f66073b ? (char) 2 : 1;
        C16873k kVar = this.f66072a;
        synchronized (kVar) {
            i = kVar.f45603e * kVar.f45600b;
        }
        boolean z2 = i >= this.f66077f;
        boolean z3 = this.f66078g;
        if (c == 2 || (c == 1 && z3 && !z2)) {
            z = true;
        }
        this.f66078g = z;
        return z;
    }

    /* renamed from: b */
    public boolean mo36252b(long j, boolean z) {
        long j2 = z ? this.f66076e : this.f66075d;
        return j2 <= 0 || j >= j2;
    }

    /* renamed from: c */
    public C16870b mo36253c() {
        return this.f66072a;
    }

    /* renamed from: d */
    public void mo36254d() {
        mo36256f(true);
    }

    /* renamed from: e */
    public void mo36255e(C23019q[] qVarArr, C21962v vVar, C16774g gVar) {
        int i;
        boolean z = false;
        this.f66077f = 0;
        for (int i2 = 0; i2 < qVarArr.length; i2++) {
            if (gVar.f45335b[i2] != null) {
                int i3 = this.f66077f;
                int j = qVarArr[i2].mo36239j();
                int i4 = C20551y.f57835a;
                if (j == 0) {
                    i = TPMediaCodecProfileLevel.HEVCMainTierLevel62;
                } else if (j == 1) {
                    i = 3538944;
                } else if (j != 2) {
                    i = 131072;
                    if (!(j == 3 || j == 4)) {
                        throw new IllegalStateException();
                    }
                } else {
                    i = 13107200;
                }
                this.f66077f = i3 + i;
            }
        }
        C16873k kVar = this.f66072a;
        int i5 = this.f66077f;
        synchronized (kVar) {
            if (i5 < kVar.f45602d) {
                z = true;
            }
            kVar.f45602d = i5;
            if (z) {
                kVar.mo17929b();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
    /* renamed from: f */
    public final void mo36256f(boolean r3) {
        /*
            r2 = this;
            r0 = 0
            r2.f66077f = r0
            r2.f66078g = r0
            if (r3 == 0) goto L_0x0027
            c8.k r3 = r2.f66072a
            monitor-enter(r3)
            boolean r1 = r3.f45599a     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0022
            monitor-enter(r3)     // Catch:{ all -> 0x0024 }
            int r1 = r3.f45602d     // Catch:{ all -> 0x001f }
            if (r1 <= 0) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            r3.f45602d = r0     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001d
            r3.mo17929b()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            goto L_0x0022
        L_0x001f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r3)
            goto L_0x0027
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p396x6.C22995c.mo36256f(boolean):void");
    }

    public void onPrepared() {
        mo36256f(false);
    }

    public void onReleased() {
        mo36256f(true);
    }

    public C22995c(C16873k kVar) {
        this(kVar, 15000, 30000, 2500, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }

    public C22995c(C16873k kVar, int i, int i2, long j, long j2) {
        this.f66072a = kVar;
        this.f66073b = ((long) i) * 1000;
        this.f66074c = ((long) i2) * 1000;
        this.f66075d = j * 1000;
        this.f66076e = j2 * 1000;
    }
}
