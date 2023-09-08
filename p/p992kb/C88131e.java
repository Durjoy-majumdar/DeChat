package p992kb;

/* renamed from: kb.e */
public class C88131e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88127c f254899d;

    public C88131e(C88127c cVar) {
        this.f254899d = cVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109  */
    public void run() {
        /*
            r38 = this;
            r1 = r38
            kb.c r0 = r1.f254899d
            long r2 = r0.f254887c
            long r4 = r0.f254886b
            long r2 = r2 - r4
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            kb.c r0 = r1.f254899d
            long r6 = r0.f254887c
            long r4 = r4 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0042
            r8 = 10
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0042
            od.e r4 = r0.f254890f
            if (r4 == 0) goto L_0x003f
            int r0 = r0.f254891g
            int r5 = r4.mo123499b()
            int r5 = r5 - r0
            float r5 = (float) r5
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 * r8
            android.util.SparseLongArray r4 = r4.f256899b
            long r8 = r4.get(r0)
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 - r8
            float r0 = (float) r10
            float r5 = r5 / r0
            goto L_0x0044
        L_0x003f:
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x0045
        L_0x0042:
            float r5 = r0.f254892h
        L_0x0044:
            double r4 = (double) r5
        L_0x0045:
            kb.c r0 = r1.f254899d
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Long> r0 = r0.f254893i
            int r0 = r0.size()
            r10 = 0
            if (r0 <= 0) goto L_0x008e
            kb.c r0 = r1.f254899d
            int r11 = r0.f254885a
            if (r11 <= 0) goto L_0x008e
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Long> r11 = r0.f254893i
            int r12 = r11.size()
            int r13 = r0.f254885a
            if (r12 >= r13) goto L_0x0061
            goto L_0x008e
        L_0x0061:
            java.lang.Long[] r12 = new java.lang.Long[r10]
            java.lang.Object[] r11 = r11.toArray(r12)
            java.lang.Long[] r11 = (java.lang.Long[]) r11
            int r0 = r0.f254885a
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r11, r0)
            java.lang.Long[] r0 = (java.lang.Long[]) r0
            if (r0 == 0) goto L_0x008e
            int r11 = r0.length
            if (r11 > 0) goto L_0x0077
            goto L_0x008e
        L_0x0077:
            int r11 = r0.length
            r12 = 0
            r13 = 0
        L_0x007b:
            if (r12 >= r11) goto L_0x0088
            r15 = r0[r12]
            long r8 = r15.longValue()
            double r8 = (double) r8
            double r13 = r13 + r8
            int r12 = r12 + 1
            goto L_0x007b
        L_0x0088:
            double r8 = (double) r11
            double r8 = r13 / r8
            int r0 = r0.length
            long r11 = (long) r13
            goto L_0x0092
        L_0x008e:
            r11 = r6
            r0 = 0
            r8 = 0
        L_0x0092:
            kb.c r13 = r1.f254899d
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Long> r13 = r13.f254893i
            int r13 = r13.size()
            r14 = 1
            if (r13 <= 0) goto L_0x0109
            kb.c r13 = r1.f254899d
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Long> r13 = r13.f254893i
            int r15 = r13.size()
            java.lang.Object[] r6 = new java.lang.Object[r14]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r6[r10] = r7
            java.lang.String r7 = "MicroMsg.MBNiReporter"
            java.lang.String r14 = "hy: calculateAverageCost size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r14, r6)
            java.lang.Long[] r6 = new java.lang.Long[r10]
            java.lang.Object[] r6 = r13.toArray(r6)
            java.lang.Long[] r6 = (java.lang.Long[]) r6
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r15)
            java.lang.Long[] r6 = (java.lang.Long[]) r6
            if (r6 == 0) goto L_0x00ff
            int r13 = r6.length
            if (r13 > 0) goto L_0x00c8
            goto L_0x00ff
        L_0x00c8:
            int r13 = r6.length
            r14 = 0
        L_0x00cb:
            if (r10 >= r13) goto L_0x00f1
            r16 = r6[r10]
            if (r16 != 0) goto L_0x00e4
            r19 = r8
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r16 = 0
            r9[r16] = r8
            java.lang.String r8 = "calculateAverageCost tempArray[%d] null!"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r7, r8, r9)
            goto L_0x00ec
        L_0x00e4:
            r19 = r8
            long r8 = r16.longValue()
            double r8 = (double) r8
            double r14 = r14 + r8
        L_0x00ec:
            int r10 = r10 + 1
            r8 = r19
            goto L_0x00cb
        L_0x00f1:
            r19 = r8
            double r7 = (double) r13
            double r7 = r14 / r7
            int r6 = r6.length
            long r9 = (long) r14
            r36 = r9
            r10 = r6
            r8 = r7
            r6 = r36
            goto L_0x0106
        L_0x00ff:
            r19 = r8
            r6 = 0
            r8 = 0
            r10 = 0
        L_0x0106:
            r16 = r10
            goto L_0x0111
        L_0x0109:
            r19 = r8
            r6 = 0
            r8 = 0
            r16 = 0
        L_0x0111:
            kb.c r10 = r1.f254899d
            r13 = 0
            r10.f254885a = r13
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Long> r10 = r10.f254893i
            r10.clear()
            kb.c r10 = r1.f254899d
            kb.c$b r13 = r10.f254894j
            monitor-enter(r13)
            r14 = 0
        L_0x0121:
            kb.c$b r15 = r10.f254894j     // Catch:{ all -> 0x021d }
            int r15 = r15.size()     // Catch:{ all -> 0x021d }
            r21 = r8
            if (r14 >= r15) goto L_0x0178
            kb.c$b r9 = r10.f254894j     // Catch:{ all -> 0x021d }
            int r9 = r9.keyAt(r14)     // Catch:{ all -> 0x021d }
            kb.c$b r15 = r10.f254894j     // Catch:{ all -> 0x021d }
            int r15 = r15.valueAt(r14)     // Catch:{ all -> 0x021d }
            java.lang.String r8 = "MicroMsg.MBNiReporter"
            r23 = r10
            java.lang.String r10 = "hy: picSize level:%d,num:%d"
            r24 = r6
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x021d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x021d }
            r17 = 0
            r6[r17] = r7     // Catch:{ all -> 0x021d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x021d }
            r26 = r11
            r11 = 1
            r6[r11] = r7     // Catch:{ all -> 0x021d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r6)     // Catch:{ all -> 0x021d }
            java.lang.Class<hr0.a> r6 = hr0.C87583a.class
            ra.d r6 = p224ra.C89909e.m112439d(r6, r11)     // Catch:{ all -> 0x021d }
            r28 = r6
            hr0.a r28 = (hr0.C87583a) r28     // Catch:{ all -> 0x021d }
            r29 = 936(0x3a8, double:4.624E-321)
            long r6 = (long) r9     // Catch:{ all -> 0x021d }
            long r8 = (long) r15     // Catch:{ all -> 0x021d }
            r35 = 0
            r31 = r6
            r33 = r8
            r28.idkeyStat(r29, r31, r33, r35)     // Catch:{ all -> 0x021d }
            int r14 = r14 + 1
            r8 = r21
            r10 = r23
            r6 = r24
            r11 = r26
            goto L_0x0121
        L_0x0178:
            r24 = r6
            r26 = r11
            monitor-exit(r13)     // Catch:{ all -> 0x021d }
            java.lang.String r6 = "MicroMsg.MBNiReporter"
            java.lang.String r7 = "hy: decode performance appid:%s,inject2firstDraw:%d,firstFps:%f,PreDecodeNum:%d,PreDecodeTotalTime:%d,preDecodeAvgTime:%f,totalDecodeNum:%d,totalDecodeTime:%d,totalDecodeAvgTime:%f"
            r8 = 9
            java.lang.Object[] r9 = new java.lang.Object[r8]
            kb.c r10 = r1.f254899d
            java.lang.String r10 = r10.f254888d
            r11 = 0
            r9[r11] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            r11 = 1
            r9[r11] = r10
            java.lang.Double r10 = java.lang.Double.valueOf(r4)
            r11 = 2
            r9[r11] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r11 = 3
            r9[r11] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r26)
            r12 = 4
            r9[r12] = r10
            java.lang.Double r10 = java.lang.Double.valueOf(r19)
            r13 = 5
            r9[r13] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
            r14 = 6
            r9[r14] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r24)
            r15 = 7
            r9[r15] = r10
            java.lang.Double r10 = java.lang.Double.valueOf(r21)
            r23 = 8
            r9[r23] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r9)
            r6 = 0
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0217
            java.lang.Class<hr0.b> r6 = hr0.C87584b.class
            r7 = 1
            ra.d r6 = p224ra.C89909e.m112439d(r6, r7)
            hr0.b r6 = (hr0.C87584b) r6
            r9 = 16136(0x3f08, float:2.2611E-41)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            kb.c r10 = r1.f254899d
            java.lang.String r10 = r10.f254888d
            r18 = 0
            r8[r18] = r10
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8[r7] = r2
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r3 = 2
            r8[r3] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8[r11] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r26)
            r8[r12] = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r19)
            r8[r13] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r8[r14] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r24)
            r8[r15] = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r21)
            r8[r23] = r0
            r6.mo121691h(r9, r8)
        L_0x0217:
            kb.c r0 = r1.f254899d
            r2 = 1
            r0.f254889e = r2
            return
        L_0x021d:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x021d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p992kb.C88131e.run():void");
    }
}
