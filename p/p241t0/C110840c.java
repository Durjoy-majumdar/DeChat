package p241t0;

import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: t0.c */
public final class C110840c extends C110838b {

    /* renamed from: m */
    public final C110838b f331596m;

    /* renamed from: n */
    public boolean f331597n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110840c(int i, C110860k kVar, C32226l<Object, C13598b0> lVar, C32226l<Object, C13598b0> lVar2, C110838b bVar) {
        super(i, kVar, lVar, lVar2);
        C87412m.m108594g(kVar, "invalid");
        C87412m.m108594g(bVar, "parent");
        this.f331596m = bVar;
        bVar.mo162425j(this);
    }

    /* renamed from: c */
    public void mo162424c() {
        if (!this.f331615c) {
            super.mo162424c();
            if (!this.f331597n) {
                this.f331597n = true;
                this.f331596m.mo162426k(this);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: t */
    public p241t0.C110853i mo162429t() {
        /*
            r9 = this;
            t0.b r0 = r9.f331596m
            boolean r1 = r0.f331592l
            if (r1 != 0) goto L_0x00fd
            boolean r1 = r0.f331615c
            if (r1 == 0) goto L_0x000c
            goto L_0x00fd
        L_0x000c:
            java.util.Set<t0.h0> r1 = r9.f331588h
            int r2 = r9.f331614b
            if (r1 == 0) goto L_0x001b
            t0.k r3 = r0.mo162464e()
            java.util.Map r0 = p241t0.C110865n.m151140c(r0, r9, r3)
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            java.lang.Object r3 = p241t0.C110865n.f331651c
            monitor-enter(r3)
            p241t0.C110865n.m151141d(r9)     // Catch:{ all -> 0x00fa }
            if (r1 == 0) goto L_0x005b
            int r4 = r1.size()     // Catch:{ all -> 0x00fa }
            if (r4 != 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            t0.b r4 = r9.f331596m     // Catch:{ all -> 0x00fa }
            int r4 = r4.mo162463d()     // Catch:{ all -> 0x00fa }
            t0.b r5 = r9.f331596m     // Catch:{ all -> 0x00fa }
            t0.k r5 = r5.mo162464e()     // Catch:{ all -> 0x00fa }
            t0.i r0 = r9.mo162439v(r4, r0, r5)     // Catch:{ all -> 0x00fa }
            t0.i$b r4 = p241t0.C110853i.C110855b.f331617a     // Catch:{ all -> 0x00fa }
            boolean r4 = gy3.C87412m.m108589b(r0, r4)     // Catch:{ all -> 0x00fa }
            if (r4 != 0) goto L_0x0045
            monitor-exit(r3)
            return r0
        L_0x0045:
            t0.b r0 = r9.f331596m     // Catch:{ all -> 0x00fa }
            java.util.Set r0 = r0.mo162438u()     // Catch:{ all -> 0x00fa }
            if (r0 != 0) goto L_0x0057
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x00fa }
            r0.<init>()     // Catch:{ all -> 0x00fa }
            t0.b r4 = r9.f331596m     // Catch:{ all -> 0x00fa }
            r4.mo162441x(r0)     // Catch:{ all -> 0x00fa }
        L_0x0057:
            r0.addAll(r1)     // Catch:{ all -> 0x00fa }
            goto L_0x005e
        L_0x005b:
            r9.mo162462a()     // Catch:{ all -> 0x00fa }
        L_0x005e:
            t0.b r0 = r9.f331596m     // Catch:{ all -> 0x00fa }
            int r0 = r0.mo162463d()     // Catch:{ all -> 0x00fa }
            if (r0 >= r2) goto L_0x006b
            t0.b r0 = r9.f331596m     // Catch:{ all -> 0x00fa }
            r0.mo162437s()     // Catch:{ all -> 0x00fa }
        L_0x006b:
            t0.b r0 = r9.f331596m     // Catch:{ all -> 0x00fa }
            t0.k r1 = r0.mo162464e()     // Catch:{ all -> 0x00fa }
            t0.k r1 = r1.mo162506i(r2)     // Catch:{ all -> 0x00fa }
            t0.k r4 = r9.f331589i     // Catch:{ all -> 0x00fa }
            t0.k r1 = r1.mo162505f(r4)     // Catch:{ all -> 0x00fa }
            r0.mo162468q(r1)     // Catch:{ all -> 0x00fa }
            t0.b r0 = r9.f331596m     // Catch:{ all -> 0x00fa }
            r0.mo162440w(r2)     // Catch:{ all -> 0x00fa }
            t0.b r0 = r9.f331596m     // Catch:{ all -> 0x00fa }
            int r1 = r9.f331616d     // Catch:{ all -> 0x00fa }
            r2 = -1
            r9.f331616d = r2     // Catch:{ all -> 0x00fa }
            if (r1 < 0) goto L_0x0095
            int[] r2 = r0.f331590j     // Catch:{ all -> 0x00fa }
            int[] r1 = sx3.C110821n.m150971r(r2, r1)     // Catch:{ all -> 0x00fa }
            r0.f331590j = r1     // Catch:{ all -> 0x00fa }
            goto L_0x0098
        L_0x0095:
            r0.getClass()     // Catch:{ all -> 0x00fa }
        L_0x0098:
            t0.b r0 = r9.f331596m     // Catch:{ all -> 0x00fa }
            t0.k r1 = r9.f331589i     // Catch:{ all -> 0x00fa }
            r0.getClass()     // Catch:{ all -> 0x00fa }
            java.lang.String r2 = "snapshots"
            gy3.C87412m.m108594g(r1, r2)     // Catch:{ all -> 0x00fa }
            monitor-enter(r3)     // Catch:{ all -> 0x00fa }
            t0.k r2 = r0.f331589i     // Catch:{ all -> 0x00f7 }
            t0.k r1 = r2.mo162509l(r1)     // Catch:{ all -> 0x00f7 }
            r0.f331589i = r1     // Catch:{ all -> 0x00f7 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00f7 }
            monitor-exit(r3)     // Catch:{ all -> 0x00fa }
            t0.b r0 = r9.f331596m     // Catch:{ all -> 0x00fa }
            int[] r1 = r9.f331590j     // Catch:{ all -> 0x00fa }
            r0.getClass()     // Catch:{ all -> 0x00fa }
            java.lang.String r2 = "handles"
            gy3.C87412m.m108594g(r1, r2)     // Catch:{ all -> 0x00fa }
            int r2 = r1.length     // Catch:{ all -> 0x00fa }
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x00c3
            r2 = 1
            goto L_0x00c4
        L_0x00c3:
            r2 = 0
        L_0x00c4:
            if (r2 == 0) goto L_0x00c7
            goto L_0x00e6
        L_0x00c7:
            int[] r2 = r0.f331590j     // Catch:{ all -> 0x00fa }
            int r6 = r2.length     // Catch:{ all -> 0x00fa }
            if (r6 != 0) goto L_0x00ce
            r6 = 1
            goto L_0x00cf
        L_0x00ce:
            r6 = 0
        L_0x00cf:
            if (r6 == 0) goto L_0x00d4
            r0.f331590j = r1     // Catch:{ all -> 0x00fa }
            goto L_0x00e6
        L_0x00d4:
            int r6 = r2.length     // Catch:{ all -> 0x00fa }
            int r7 = r1.length     // Catch:{ all -> 0x00fa }
            int r8 = r6 + r7
            int[] r2 = java.util.Arrays.copyOf(r2, r8)     // Catch:{ all -> 0x00fa }
            java.lang.System.arraycopy(r1, r4, r2, r6, r7)     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = "result"
            gy3.C87412m.m108593f(r2, r1)     // Catch:{ all -> 0x00fa }
            r0.f331590j = r2     // Catch:{ all -> 0x00fa }
        L_0x00e6:
            monitor-exit(r3)
            r9.f331592l = r5
            boolean r0 = r9.f331597n
            if (r0 != 0) goto L_0x00f4
            r9.f331597n = r5
            t0.b r0 = r9.f331596m
            r0.mo162426k(r9)
        L_0x00f4:
            t0.i$b r0 = p241t0.C110853i.C110855b.f331617a
            return r0
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00fa }
            throw r0     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00fd:
            t0.i$a r0 = new t0.i$a
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p241t0.C110840c.mo162429t():t0.i");
    }
}
