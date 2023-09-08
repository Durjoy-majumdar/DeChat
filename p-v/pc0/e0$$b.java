package pc0;

public final /* synthetic */ class e0$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118002e0 f352719d;

    /* renamed from: e */
    public final /* synthetic */ C118010i f352720e;

    public /* synthetic */ e0$$b(C118002e0 e0Var, C118010i iVar) {
        this.f352719d = e0Var;
        this.f352720e = iVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r30 = this;
            r1 = r30
            pc0.e0 r0 = r1.f352719d
            pc0.i r2 = r1.f352720e
            r0.getClass()
            boolean r3 = f40.C86718e.m107551r()
            if (r3 != 0) goto L_0x041d
            boolean r3 = f40.C86709a0.m107522a()
            if (r3 != 0) goto L_0x0017
            goto L_0x041d
        L_0x0017:
            r3 = 0
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L_0x013f
            java.lang.String r10 = "MicroMsg.SyncService"
            java.lang.String r11 = "finish proc:%s running:%s RunTime:%s "
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r8] = r2
            pc0.i r13 = r0.f352709e
            r12[r9] = r13
            long r13 = r0.f352710f
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r13)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12[r7] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r12)
            pc0.i r10 = r0.f352709e
            if (r10 == 0) goto L_0x00b0
            int r10 = r2.hashCode()
            pc0.i r11 = r0.f352709e
            int r11 = r11.hashCode()
            if (r10 == r11) goto L_0x00b0
            java.util.HashMap<java.lang.Integer, java.lang.Long> r3 = r0.f352708d
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0055:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r5 = "MicroMsg.SyncService"
            java.lang.String r6 = "check unfinish proc :%s timediff:%s"
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r10[r8] = r4
            java.util.HashMap<java.lang.Integer, java.lang.Long> r11 = r0.f352708d
            java.lang.Object r4 = r11.get(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r11 = r4.longValue()
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r11)
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r10[r9] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r6, r10)
            goto L_0x0055
        L_0x0083:
            java.util.HashMap<java.lang.Integer, java.lang.Long> r0 = r0.f352708d
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.remove(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r2 = -1
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Long) r0, (long) r2)
            java.lang.String r0 = "MicroMsg.SyncService"
            java.lang.String r6 = "oldproc timeout, should in timeoutMap: %s"
            java.lang.Object[] r7 = new java.lang.Object[r9]
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r9 = 0
        L_0x00a5:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r7[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r7)
            goto L_0x0424
        L_0x00b0:
            long r10 = r0.f352710f
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r10)
            int r2 = (int) r10
            r10 = 10
            int[] r11 = new int[r10]
            r11 = {200, 500, 800, 1500, 3000, 5000, 10000, 30000, 60000, 90000} // fill-array
            r12 = 11
            java.lang.Integer[] r12 = new java.lang.Integer[r12]
            r13 = 70
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r8] = r13
            r13 = 71
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r9] = r13
            r13 = 72
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r7] = r13
            r13 = 73
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r6] = r13
            r13 = 4
            r14 = 74
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12[r13] = r14
            r13 = 5
            r14 = 75
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12[r13] = r14
            r13 = 6
            r14 = 76
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12[r13] = r14
            r13 = 7
            r14 = 77
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12[r13] = r14
            r13 = 8
            r14 = 78
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12[r13] = r14
            r13 = 9
            r14 = 79
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12[r13] = r14
            r13 = 80
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r10] = r13
            java.lang.Object r2 = kj2.C117407d.m165560t(r2, r11, r12)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r2)
            kj2.d r10 = kj2.C117407d.INSTANCE
            r11 = 99
            long r13 = (long) r2
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            r0.f352709e = r5
            r0.f352710f = r3
            r0.mo182768l()
        L_0x013f:
            pc0.i r2 = r0.f352709e
            if (r2 == 0) goto L_0x02b6
            long r10 = r0.f352710f
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r10)
            r12 = 90000(0x15f90, double:4.4466E-319)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x02a0
            java.lang.String r2 = "MicroMsg.SyncService"
            java.lang.String r12 = "tryStart last proc:%s TIMEOUT:%s Run Next Now."
            java.lang.Object[] r13 = new java.lang.Object[r7]
            pc0.i r14 = r0.f352709e
            r13[r8] = r14
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r13[r9] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r12, r13)
            pc0.i r2 = r0.f352709e
            boolean r10 = r2 instanceof pc0.e0$$g
            java.lang.String r11 = ";"
            java.lang.String r12 = ""
            r13 = 11098(0x2b5a, float:1.5552E-41)
            if (r10 != 0) goto L_0x0245
            boolean r10 = r2 instanceof pc0.C118011j
            if (r10 == 0) goto L_0x0176
            goto L_0x0245
        L_0x0176:
            boolean r10 = r2 instanceof pc0.e0$$h
            if (r10 == 0) goto L_0x01bc
            kj2.d r14 = kj2.C117407d.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r10 = 3572(0xdf4, float:5.005E-42)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2[r8] = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            boolean r12 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            r10.append(r12)
            r10.append(r11)
            boolean r11 = r0.mo182764h()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r2[r9] = r10
            r14.mo160131h(r13, r2)
            r15 = 99
            boolean r2 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            if (r2 == 0) goto L_0x01af
            r10 = 31
            goto L_0x01b1
        L_0x01af:
            r10 = 35
        L_0x01b1:
            r17 = r10
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)
            goto L_0x0283
        L_0x01bc:
            boolean r2 = r2 instanceof pc0.e0$$f
            if (r2 == 0) goto L_0x0202
            kj2.d r14 = kj2.C117407d.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r10 = 3573(0xdf5, float:5.007E-42)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r2[r8] = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            boolean r12 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            r10.append(r12)
            r10.append(r11)
            boolean r11 = r0.mo182764h()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r2[r9] = r10
            r14.mo160131h(r13, r2)
            r15 = 99
            boolean r2 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            if (r2 == 0) goto L_0x01f5
            r10 = 32
            goto L_0x01f7
        L_0x01f5:
            r10 = 36
        L_0x01f7:
            r17 = r10
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)
            goto L_0x0283
        L_0x0202:
            kj2.d r2 = kj2.C117407d.INSTANCE
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r14 = 3574(0xdf6, float:5.008E-42)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r10[r8] = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            boolean r12 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            r14.append(r12)
            r14.append(r11)
            boolean r11 = r0.mo182764h()
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r10[r9] = r11
            r2.mo160131h(r13, r10)
            r23 = 99
            boolean r10 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            if (r10 == 0) goto L_0x0237
            r10 = 33
            goto L_0x0239
        L_0x0237:
            r10 = 37
        L_0x0239:
            r25 = r10
            r27 = 1
            r29 = 0
            r22 = r2
            r22.idkeyStat(r23, r25, r27, r29)
            goto L_0x0283
        L_0x0245:
            kj2.d r10 = kj2.C117407d.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r14 = 3571(0xdf3, float:5.004E-42)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r2[r8] = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            boolean r12 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            r14.append(r12)
            r14.append(r11)
            boolean r11 = r0.mo182764h()
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r2[r9] = r11
            r10.mo160131h(r13, r2)
            r11 = 99
            boolean r2 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
            if (r2 == 0) goto L_0x027a
            r13 = 30
            goto L_0x027c
        L_0x027a:
            r13 = 34
        L_0x027c:
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
        L_0x0283:
            java.util.HashMap<java.lang.Integer, java.lang.Long> r2 = r0.f352708d
            pc0.i r10 = r0.f352709e
            int r10 = r10.hashCode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            long r11 = r0.f352710f
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r2.put(r10, r11)
            r0.f352709e = r5
            r0.f352710f = r3
            r0.mo182768l()
            goto L_0x02b6
        L_0x02a0:
            java.lang.String r2 = "MicroMsg.SyncService"
            java.lang.String r3 = "tryStart last proc:%s running:%s "
            java.lang.Object[] r4 = new java.lang.Object[r7]
            pc0.i r0 = r0.f352709e
            r4[r8] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r4[r9] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            goto L_0x0424
        L_0x02b6:
            java.lang.Class<lc3.c> r2 = lc3.C117474c.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            lc3.c r2 = (lc3.C117474c) r2
            eb0.u5 r3 = r2.Rk0()
            monitor-enter(r3)
            monitor-enter(r3)     // Catch:{ all -> 0x0416 }
            int r4 = r3.f350063e     // Catch:{ all -> 0x0418 }
            if (r4 == r9) goto L_0x02d8
            long r10 = r3.f350060b     // Catch:{ all -> 0x0418 }
            long r12 = r3.f350061c     // Catch:{ all -> 0x0418 }
            long r10 = r10 + r12
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x0418 }
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x02d8
            r3.mo180730a()     // Catch:{ all -> 0x0418 }
        L_0x02d8:
            monitor-exit(r3)     // Catch:{ all -> 0x0416 }
            int r4 = r3.f350063e     // Catch:{ all -> 0x0416 }
            if (r4 != r7) goto L_0x02df
            r4 = 1
            goto L_0x02e0
        L_0x02df:
            r4 = 0
        L_0x02e0:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x02f3
            java.lang.String r0 = "MicroMsg.SyncService"
            java.lang.String r3 = "Warning: Set SyncService Pause Now."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)
            eb0.u5 r0 = r2.Rk0()
            r0.mo180731b()
            goto L_0x0424
        L_0x02f3:
            eb0.u5 r2 = r2.Rk0()
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x040f }
            int r3 = r2.f350063e     // Catch:{ all -> 0x0411 }
            if (r3 == r9) goto L_0x030d
            long r3 = r2.f350060b     // Catch:{ all -> 0x0411 }
            long r10 = r2.f350061c     // Catch:{ all -> 0x0411 }
            long r3 = r3 + r10
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x0411 }
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x030d
            r2.mo180730a()     // Catch:{ all -> 0x0411 }
        L_0x030d:
            monitor-exit(r2)     // Catch:{ all -> 0x040f }
            int r3 = r2.f350063e     // Catch:{ all -> 0x040f }
            if (r3 != r6) goto L_0x0314
            r3 = 1
            goto L_0x0315
        L_0x0314:
            r3 = 0
        L_0x0315:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0321
            java.lang.String r0 = "MicroMsg.SyncService"
            java.lang.String r2 = "Warning: SyncService is Paused."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            goto L_0x0424
        L_0x0321:
            pc0.e0$$f r2 = new pc0.e0$$f
            r2.<init>(r0)
            boolean r3 = r2.mo72839G0(r5)
            if (r3 == 0) goto L_0x033b
            java.lang.String r3 = "LightPush"
            r0.mo182769m(r3)
            r0.f352709e = r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f352710f = r2
            goto L_0x0424
        L_0x033b:
            java.util.Queue<pc0.i> r2 = r0.f352707c
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0380
            java.util.Queue<pc0.i> r2 = r0.f352707c
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            java.lang.Object r2 = r2.poll()
            pc0.i r2 = (pc0.C118010i) r2
            java.lang.String r3 = "MicroMsg.SyncService"
            java.lang.String r4 = "tryStart check NotifyData ListSize:%s proc:%s"
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.util.Queue<pc0.i> r11 = r0.f352707c
            java.util.concurrent.ConcurrentLinkedQueue r11 = (java.util.concurrent.ConcurrentLinkedQueue) r11
            int r11 = r11.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r8] = r11
            r10[r9] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r10)
            if (r2 == 0) goto L_0x033b
            boolean r3 = r2.mo72839G0(r5)
            if (r3 == 0) goto L_0x033b
            java.lang.String r3 = "NotifyData"
            r0.mo182769m(r3)
            r0.f352709e = r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f352710f = r2
            goto L_0x0424
        L_0x0380:
            java.util.Queue<pc0.i> r2 = r0.f352706b
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x03c6
            java.util.Queue<pc0.i> r2 = r0.f352706b
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            java.lang.Object r2 = r2.poll()
            pc0.i r2 = (pc0.C118010i) r2
            java.lang.String r3 = "MicroMsg.SyncService"
            java.lang.String r4 = "tryStart check Sync ListSize:%s proc:%s"
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.util.Queue<pc0.i> r10 = r0.f352706b
            java.util.concurrent.ConcurrentLinkedQueue r10 = (java.util.concurrent.ConcurrentLinkedQueue) r10
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r5[r8] = r10
            r5[r9] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            if (r2 == 0) goto L_0x03c6
            java.util.Queue<pc0.i> r3 = r0.f352706b
            boolean r3 = r2.mo72839G0(r3)
            if (r3 == 0) goto L_0x03c6
            java.lang.String r3 = "NetSync"
            r0.mo182769m(r3)
            r0.f352709e = r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f352710f = r2
            goto L_0x0424
        L_0x03c6:
            java.lang.String r2 = "MicroMsg.SyncService"
            java.lang.String r3 = "tryStart FINISH Check running:%s sync:%s notify:%s"
            java.lang.Object[] r4 = new java.lang.Object[r6]
            pc0.i r5 = r0.f352709e
            r4[r8] = r5
            java.util.Queue<pc0.i> r5 = r0.f352706b
            java.util.concurrent.ConcurrentLinkedQueue r5 = (java.util.concurrent.ConcurrentLinkedQueue) r5
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r9] = r5
            java.util.Queue<pc0.i> r5 = r0.f352707c
            java.util.concurrent.ConcurrentLinkedQueue r5 = (java.util.concurrent.ConcurrentLinkedQueue) r5
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r7] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            java.lang.String r2 = ""
            pc0.i r3 = r0.f352709e
            if (r3 != 0) goto L_0x040b
            java.util.Queue<pc0.i> r3 = r0.f352706b
            java.util.concurrent.ConcurrentLinkedQueue r3 = (java.util.concurrent.ConcurrentLinkedQueue) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x040b
            java.util.Queue<pc0.i> r3 = r0.f352707c
            java.util.concurrent.ConcurrentLinkedQueue r3 = (java.util.concurrent.ConcurrentLinkedQueue) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x040b
            r8 = 1
        L_0x040b:
            r0.mo182760d(r2, r8)
            goto L_0x0424
        L_0x040f:
            r0 = move-exception
            goto L_0x0414
        L_0x0411:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x040f }
            throw r0     // Catch:{ all -> 0x040f }
        L_0x0414:
            monitor-exit(r2)
            throw r0
        L_0x0416:
            r0 = move-exception
            goto L_0x041b
        L_0x0418:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0416 }
            throw r0     // Catch:{ all -> 0x0416 }
        L_0x041b:
            monitor-exit(r3)
            throw r0
        L_0x041d:
            java.lang.String r0 = "MicroMsg.SyncService"
            java.lang.String r2 = "begin to doLoop but MMCore account has not ready or MMCore is hold."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
        L_0x0424:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pc0.e0$$b.run():void");
    }
}
