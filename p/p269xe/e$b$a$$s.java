package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import p1177ce.C113287a;
import p933be.C113173i;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$s */
public final /* synthetic */ class e$b$a$$s implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C113287a f355692a;

    /* renamed from: b */
    public final /* synthetic */ String f355693b;

    /* renamed from: c */
    public final /* synthetic */ C113173i f355694c;

    /* renamed from: d */
    public final /* synthetic */ C114467i f355695d;

    /* renamed from: e */
    public final /* synthetic */ boolean f355696e;

    public /* synthetic */ e$b$a$$s(C113287a aVar, String str, C113173i iVar, C114467i iVar2, boolean z) {
        this.f355692a = aVar;
        this.f355693b = str;
        this.f355694c = iVar;
        this.f355695d = iVar2;
        this.f355696e = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: ie.w$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v49, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: ie.w$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: ie.w$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: ie.w$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: ie.w$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: ie.w$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: ie.w$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: ie.w$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v111, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v113, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v115, resolved type: ie.w$d} */
    /* JADX WARNING: type inference failed for: r1v80, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v81, types: [java.lang.String] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x063a A[Catch:{ Exception -> 0x0616 }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r48) {
        /*
            r47 = this;
            r1 = r47
            ce.a r0 = r1.f355692a
            java.lang.String r2 = r1.f355693b
            be.i r3 = r1.f355694c
            com.tencent.matrix.batterycanary.monitor.feature.i r4 = r1.f355695d
            boolean r5 = r1.f355696e
            r12 = r48
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r12 = (com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114492a) r12
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.x$e> r13 = com.tencent.matrix.batterycanary.monitor.feature.C114536x.C114541e.class
            boolean r6 = r0.f338975m
            if (r6 != 0) goto L_0x002e
            java.lang.String r2 = "Matrix.battery.BatteryReporter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "skip, appstats = "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x0acf
        L_0x002e:
            int r6 = r0.f338967e
            r7 = 20
            if (r6 < r7) goto L_0x004e
            java.lang.String r2 = "Matrix.battery.BatteryReporter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "skip, devChargingRatio = "
            r3.append(r4)
            int r0 = r0.f338967e
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x0acf
        L_0x004e:
            int r6 = r0.f338964b
            if (r6 >= r7) goto L_0x007c
            java.lang.String r6 = "canary"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x007c
            ce.g r3 = r3.f338613h
            ce.f r3 = r3.f339057d
            boolean r3 = r3.f339041l
            if (r3 != 0) goto L_0x007c
            java.lang.String r2 = "Matrix.battery.BatteryReporter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "skip, appBgRatio = "
            r3.append(r4)
            int r0 = r0.f338964b
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x0acf
        L_0x007c:
            RECORD r3 = r12.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r3 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r3
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r3 = r3.f343063h
            java.util.List<ITEM> r3 = r3.f343212a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x009f
            java.lang.String r0 = "Matrix.battery.BatteryReporter"
            java.lang.String r2 = "skip, thread list is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 1540(0x604, double:7.61E-321)
            r6 = 15
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            goto L_0x0acf
        L_0x009f:
            r6 = 1
            long r8 = r12.f343208d
            r10 = 60000(0xea60, double:2.9644E-319)
            long r8 = r8 / r10
            long r27 = java.lang.Math.max(r6, r8)
            int r18 = r0.mo165839c()
            int r19 = r0.mo165840d()
            int r3 = r0.f338972j
            java.lang.String r16 = p269xe.C118872b.m167609f()
            d3.c r6 = p269xe.C118872b.m167611h(r0)
            F r7 = r6.f166179a
            r29 = r7
            java.lang.String r29 = (java.lang.String) r29
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            RECORD r7 = r12.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r7 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r7
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r7 = r7.f343062g
            DIGIT r7 = r7.f343211a
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            long r21 = r7 / r27
            java.lang.String r7 = ""
            r23 = 0
            r8 = -1
            r17 = 1
            r20 = 0
            r9 = r7
            r37 = r23
            r7 = 1
            r8 = 0
            r10 = -1
        L_0x00eb:
            RECORD r1 = r12.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r1 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r1
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r1 = r1.f343063h
            java.util.List<ITEM> r1 = r1.f343212a
            int r1 = r1.size()
            if (r7 >= r1) goto L_0x01bb
            r1 = 3
            if (r8 < r1) goto L_0x00fe
            goto L_0x01bb
        L_0x00fe:
            RECORD r1 = r12.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r1 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r1
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r1 = r1.f343063h
            java.util.List<ITEM> r1 = r1.f343212a
            java.lang.Object r1 = r1.get(r7)
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r1 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r1
            r48 = r14
            boolean r14 = r1.f343068d
            if (r14 == 0) goto L_0x011c
            r30 = r3
            r26 = r5
            r33 = r13
            r25 = r15
            goto L_0x01ad
        L_0x011c:
            java.lang.String r14 = r1.f343067c
            r25 = r15
            int r15 = r1.f343066b
            r30 = r3
            DIGIT r3 = r1.f343211a
            java.lang.Long r3 = (java.lang.Long) r3
            long r31 = r3.longValue()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r26 = r5
            java.lang.String r5 = "top"
            r3.append(r5)
            int r5 = r8 + 1
            r3.append(r5)
            r33 = r13
            java.lang.String r13 = "-thread"
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            java.lang.String r13 = p269xe.C118872b.m167612i(r14, r15)
            r11.put(r3, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r13 = "top"
            r3.append(r13)
            r3.append(r5)
            java.lang.String r13 = "-jiffy"
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            long r31 = r31 / r27
            java.lang.Long r13 = java.lang.Long.valueOf(r31)
            r11.put(r3, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r13 = "top"
            r3.append(r13)
            r3.append(r5)
            java.lang.String r13 = "-stat"
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = r1.f343069e
            r11.put(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "top"
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = "-tid"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r11.put(r1, r3)
            if (r8 != 0) goto L_0x01ac
            r9 = r14
            r10 = r15
            r37 = r31
        L_0x01ac:
            r8 = r5
        L_0x01ad:
            int r7 = r7 + 1
            r14 = r48
            r15 = r25
            r5 = r26
            r3 = r30
            r13 = r33
            goto L_0x00eb
        L_0x01bb:
            r30 = r3
            r26 = r5
            r33 = r13
            r48 = r14
            r25 = r15
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto L_0x01cd
            goto L_0x0acf
        L_0x01cd:
            java.lang.String r1 = "scene-ratio"
            S r3 = r6.f166180b
            r11.put(r1, r3)
            java.lang.String r1 = "float-ratio"
            int r3 = r0.f338966d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.put(r1, r3)
            java.lang.String r1 = "bat-temp-cur"
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r3 = p981ie.C117159b.m165207h(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.put(r1, r3)
            java.lang.String r1 = "dump-count"
            int r3 = p212oe.C117750b.m166044b()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.put(r1, r3)
            android.util.SparseArray<java.lang.Integer> r1 = p269xe.C91179e.C91181b.f261436a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Object r3 = r1.get(r10, r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r3 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r1.put(r10, r5)
            java.lang.String r1 = "report-count"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.put(r1, r3)
            r1 = r4
            oe.s r1 = (p212oe.C117776s) r1
            java.util.List<ie.w$b> r3 = r1.f352271q
            java.lang.Runnable r5 = r1.f352273s
            monitor-enter(r5)
            r13 = 0
            r14 = 2
            if (r3 == 0) goto L_0x0255
            ce.a r6 = r1.f343163l     // Catch:{ all -> 0x0ad0 }
            if (r6 != 0) goto L_0x0230
            goto L_0x0255
        L_0x0230:
            monitor-exit(r5)     // Catch:{ all -> 0x0ad0 }
            com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner r5 = com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE
            boolean r5 = r5.isBackground()
            if (r5 == 0) goto L_0x023b
            r5 = 2
            goto L_0x023c
        L_0x023b:
            r5 = 1
        L_0x023c:
            ce.a r1 = r1.f343163l
            long r6 = r1.f338976n
            android.os.SystemClock.uptimeMillis()
            r42 = 10
            oe.s$$j r1 = new oe.s$$j
            r1.<init>(r5)
            r39 = r3
            r40 = r6
            r44 = r1
            ie.w$d r1 = p981ie.C117187w.m165273a(r39, r40, r42, r44)
            goto L_0x027b
        L_0x0255:
            java.lang.String r6 = "MicroMsg.battery.MMCompositeMonitors"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ad0 }
            r7.<init>()     // Catch:{ all -> 0x0ad0 }
            int r1 = r1.hashCode()     // Catch:{ all -> 0x0ad0 }
            r7.append(r1)     // Catch:{ all -> 0x0ad0 }
            java.lang.String r1 = " get DeepBg failed: "
            r7.append(r1)     // Catch:{ all -> 0x0ad0 }
            if (r3 != 0) goto L_0x026d
            java.lang.String r1 = "statList null"
            goto L_0x026f
        L_0x026d:
            java.lang.String r1 = "appStats null"
        L_0x026f:
            r7.append(r1)     // Catch:{ all -> 0x0ad0 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x0ad0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)     // Catch:{ all -> 0x0ad0 }
            monitor-exit(r5)     // Catch:{ all -> 0x0ad0 }
            r1 = r13
        L_0x027b:
            if (r1 == 0) goto L_0x02b5
            java.lang.String r3 = "deepBg-top1"
            ie.w$d$a r5 = r1.mo181114b()
            r11.put(r3, r5)
            java.lang.String r3 = "deepBg-top2"
            ie.w$d$a r5 = r1.mo181115c()
            r11.put(r3, r5)
            java.lang.String r3 = "deepBg-total"
            long r5 = r1.f351074a
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r11.put(r3, r5)
            boolean r3 = r1.f351076c
            if (r3 == 0) goto L_0x02ae
            java.lang.String r3 = "deepBg-ratio"
            java.lang.String r5 = "2"
            int r1 = r1.mo181113a(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.put(r3, r1)
            goto L_0x02b5
        L_0x02ae:
            java.lang.String r1 = "deepBg-state"
            java.lang.String r3 = "invalid"
            r11.put(r1, r3)
        L_0x02b5:
            android.os.Bundle r1 = r4.f343160i
            java.lang.String r3 = "extra_running_app_task"
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L_0x02d0
            java.lang.String r1 = "app-run-task"
            android.os.Bundle r3 = r4.f343160i
            java.lang.String r5 = "extra_running_app_task"
            boolean r3 = r3.getBoolean(r5)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r11.put(r1, r3)
        L_0x02d0:
            java.lang.String r1 = "cpu-load-prc"
            int r3 = r4.mo173666j()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.put(r1, r3)
            java.lang.String r1 = "cpu-load-dev"
            int r3 = r4.mo173669m()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.put(r1, r3)
            java.lang.String r1 = "cpu-load-nor"
            int r3 = r4.mo173672p()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.put(r1, r3)
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$b> r1 = com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature.C114427b.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r7 = r4.mo173667k(r1)
            if (r7 == 0) goto L_0x0313
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature> r1 = com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature.class
            xe.e$b$a$$j r3 = new xe.e$b$a$$j
            r6 = r3
            r8 = r11
            r5 = r9
            r15 = r10
            r9 = r27
            r45 = r11
            r11 = r12
            r6.<init>(r7, r8, r9, r11)
            r4.mo173671o(r1, r3)
            goto L_0x0317
        L_0x0313:
            r5 = r9
            r15 = r10
            r45 = r11
        L_0x0317:
            RECORD r1 = r12.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r1 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r1
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r1 = r1.f343063h
            java.util.List<ITEM> r1 = r1.f343212a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0330
            d3.c r1 = new d3.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r1.<init>(r13, r3)
            goto L_0x0592
        L_0x0330:
            java.lang.String[] r1 = new java.lang.String[r14]
            java.lang.String r3 = "HeapTaskDaemon"
            r1[r20] = r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r1[r17] = r3
            java.util.List r1 = java.util.Arrays.asList(r1)
            RECORD r3 = r12.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r3 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r3
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r3 = r3.f343063h
            java.util.List<ITEM> r3 = r3.f343212a
            java.util.Iterator r3 = r3.iterator()
        L_0x034c:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0376
            java.lang.Object r6 = r3.next()
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r6 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r6
            java.util.Iterator r7 = r1.iterator()
        L_0x035c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0372
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r6.f343067c
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x035c
            r7 = 0
            goto L_0x0373
        L_0x0372:
            r7 = 1
        L_0x0373:
            if (r7 == 0) goto L_0x034c
            goto L_0x0377
        L_0x0376:
            r6 = r13
        L_0x0377:
            if (r6 != 0) goto L_0x0384
            d3.c r1 = new d3.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r1.<init>(r13, r3)
            goto L_0x0592
        L_0x0384:
            java.lang.String r1 = r6.f343067c
            int r3 = r6.f343066b
            DIGIT r7 = r6.f343211a
            java.lang.Long r7 = (java.lang.Long) r7
            long r41 = r7.longValue()
            DIGIT r6 = r6.f343211a
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            int r8 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r8 > 0) goto L_0x03a7
            d3.c r1 = new d3.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r1.<init>(r13, r3)
            goto L_0x0592
        L_0x03a7:
            RECORD r6 = r12.f343206b
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r6 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r6
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r6 = r6.f343063h
            java.util.List<ITEM> r6 = r6.f343212a
            java.util.Iterator r6 = r6.iterator()
        L_0x03b3:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x03d6
            java.lang.Object r7 = r6.next()
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot r7 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) r7
            java.lang.String r8 = r7.f343067c
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x03b3
            int r8 = r7.f343066b
            if (r8 != r3) goto L_0x03b3
            DIGIT r6 = r7.f343211a
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r43 = r6
            goto L_0x03d8
        L_0x03d6:
            r43 = r23
        L_0x03d8:
            int r6 = (r43 > r23 ? 1 : (r43 == r23 ? 0 : -1))
            if (r6 <= 0) goto L_0x0586
            java.lang.String r6 = "[D]#worker"
            boolean r7 = r6.equalsIgnoreCase(r1)
            if (r7 != 0) goto L_0x03ed
            boolean r6 = r1.startsWith(r6)
            if (r6 == 0) goto L_0x03eb
            goto L_0x03ed
        L_0x03eb:
            r6 = 0
            goto L_0x03ee
        L_0x03ed:
            r6 = 1
        L_0x03ee:
            if (r6 == 0) goto L_0x0414
            java.lang.Class<oe.u> r1 = p212oe.C117778u.class
            com.tencent.matrix.batterycanary.monitor.feature.k0 r1 = p933be.C79691a.m96804a(r1)
            oe.u r1 = (p212oe.C117778u) r1
            if (r1 == 0) goto L_0x040f
            java.util.ArrayList r6 = r1.mo173636m(r3)
            if (r6 == 0) goto L_0x040c
            r39 = r1
            r40 = r3
            ie.w$d r1 = r39.mo173635l(r40, r41, r43)
            java.lang.String r3 = "mmhandler"
            goto L_0x0500
        L_0x040c:
            java.lang.String r1 = "mmhandler-stamps-empty"
            goto L_0x0411
        L_0x040f:
            java.lang.String r1 = "mmhandler-disabled"
        L_0x0411:
            r3 = r13
            goto L_0x0508
        L_0x0414:
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 != 0) goto L_0x042c
            java.lang.String r6 = "[GT]ColdPool#"
            boolean r6 = r1.contains(r6)
            if (r6 != 0) goto L_0x042a
            java.lang.String r6 = "[GT]HotPool#"
            boolean r6 = r1.contains(r6)
            if (r6 == 0) goto L_0x042c
        L_0x042a:
            r6 = 1
            goto L_0x042d
        L_0x042c:
            r6 = 0
        L_0x042d:
            if (r6 == 0) goto L_0x044b
            java.lang.Class<oe.c0> r1 = p212oe.C117754c0.class
            com.tencent.matrix.batterycanary.monitor.feature.k0 r1 = p933be.C79691a.m96804a(r1)
            oe.c0 r1 = (p212oe.C117754c0) r1
            if (r1 == 0) goto L_0x04d3
            java.util.ArrayList r6 = r1.mo173636m(r3)
            if (r6 == 0) goto L_0x04d3
            r39 = r1
            r40 = r3
            ie.w$d r1 = r39.mo173635l(r40, r41, r43)
            java.lang.String r3 = "threadPool"
            goto L_0x0500
        L_0x044b:
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 != 0) goto L_0x04b5
            be.i r6 = p212oe.C117750b.m166047e()
            if (r6 == 0) goto L_0x04b5
            ce.g r6 = r6.f338613h
            ce.f r6 = r6.f339057d
            java.util.List<java.lang.String> r6 = r6.f339051v
            int r7 = android.os.Process.myPid()
            java.lang.String r8 = "all"
            if (r3 != r7) goto L_0x0474
            boolean r7 = r6.contains(r8)
            if (r7 != 0) goto L_0x04b3
            java.lang.String r7 = "main"
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x04b5
            goto L_0x04b3
        L_0x0474:
            boolean r7 = r6.contains(r8)
            if (r7 == 0) goto L_0x049d
            java.util.Map r6 = java.lang.Thread.getAllStackTraces()
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0486:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x04b5
            java.lang.Object r7 = r6.next()
            java.lang.Thread r7 = (java.lang.Thread) r7
            java.lang.String r7 = r7.getName()
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L_0x0486
            goto L_0x04b3
        L_0x049d:
            java.util.Iterator r6 = r6.iterator()
        L_0x04a1:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x04b5
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto L_0x04a1
        L_0x04b3:
            r6 = 1
            goto L_0x04b6
        L_0x04b5:
            r6 = 0
        L_0x04b6:
            if (r6 == 0) goto L_0x04d6
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.j0> r1 = com.tencent.matrix.batterycanary.monitor.feature.C114486j0.class
            com.tencent.matrix.batterycanary.monitor.feature.k0 r1 = p933be.C79691a.m96804a(r1)
            com.tencent.matrix.batterycanary.monitor.feature.j0 r1 = (com.tencent.matrix.batterycanary.monitor.feature.C114486j0) r1
            if (r1 == 0) goto L_0x04d3
            java.util.ArrayList r6 = r1.mo173636m(r3)
            if (r6 == 0) goto L_0x04d3
            r39 = r1
            r40 = r3
            ie.w$d r1 = r39.mo173635l(r40, r41, r43)
            java.lang.String r3 = "looperTask"
            goto L_0x0500
        L_0x04d3:
            r1 = r13
            r3 = r1
            goto L_0x0500
        L_0x04d6:
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 != 0) goto L_0x04e3
            java.lang.String r6 = "IPCThreadPool#"
            boolean r1 = r1.contains(r6)
            goto L_0x04e4
        L_0x04e3:
            r1 = 0
        L_0x04e4:
            if (r1 == 0) goto L_0x0506
            java.lang.Class<oe.r> r1 = p212oe.C117775r.class
            com.tencent.matrix.batterycanary.monitor.feature.k0 r1 = p933be.C79691a.m96804a(r1)
            oe.r r1 = (p212oe.C117775r) r1
            if (r1 == 0) goto L_0x0506
            java.util.ArrayList r6 = r1.mo173636m(r3)
            if (r6 == 0) goto L_0x0506
            r39 = r1
            r40 = r3
            ie.w$d r1 = r39.mo173635l(r40, r41, r43)
            java.lang.String r3 = "ipcTask"
        L_0x0500:
            r46 = r13
            r13 = r1
            r1 = r46
            goto L_0x0508
        L_0x0506:
            r1 = r13
            r3 = r1
        L_0x0508:
            if (r13 == 0) goto L_0x0585
            boolean r6 = r13.f351076c
            if (r6 == 0) goto L_0x0585
            ie.w$d$a r6 = r13.mo181114b()
            if (r6 == 0) goto L_0x054f
            java.lang.String r7 = r6.f351077a
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r8 = "thread_pool@idle"
            if (r7 != 0) goto L_0x052f
            java.lang.String r7 = r6.f351077a
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x052f
            java.lang.String r1 = r6.f351077a
            int r7 = r6.f351078b
            long r8 = r6.f351079c
        L_0x052c:
            r23 = r8
            goto L_0x054c
        L_0x052f:
            ie.w$d$a r6 = r13.mo181115c()
            if (r6 == 0) goto L_0x054f
            java.lang.String r7 = r6.f351077a
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x054f
            java.lang.String r7 = r6.f351077a
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x054f
            java.lang.String r1 = r6.f351077a
            int r7 = r6.f351078b
            long r8 = r6.f351079c
            goto L_0x052c
        L_0x054c:
            r8 = r23
            goto L_0x0554
        L_0x054f:
            r8 = r23
            r7 = 0
            r17 = 0
        L_0x0554:
            if (r17 == 0) goto L_0x0588
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = " #overHeat reportJiffies found task: name = "
            r6.append(r10)
            r6.append(r1)
            java.lang.String r10 = ", ratio = "
            r6.append(r10)
            r6.append(r7)
            java.lang.String r10 = ", statMillis = "
            r6.append(r10)
            r6.append(r8)
            java.lang.String r8 = ", from = "
            r6.append(r8)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r6 = "Matrix.battery.BatteryReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            goto L_0x0588
        L_0x0585:
            r13 = r1
        L_0x0586:
            r1 = r13
            r7 = 0
        L_0x0588:
            d3.c r3 = new d3.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r3.<init>(r1, r6)
            r1 = r3
        L_0x0592:
            F r3 = r1.f166179a
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x05bb
            java.lang.String r3 = "task-name"
            F r6 = r1.f166179a
            r7 = r45
            r7.put(r3, r6)
            java.lang.String r3 = "task-ratio"
            S r1 = r1.f166180b
            if (r1 != 0) goto L_0x05ad
            r1 = 0
            goto L_0x05b3
        L_0x05ad:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L_0x05b3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.put(r3, r1)
            goto L_0x05bd
        L_0x05bb:
            r7 = r45
        L_0x05bd:
            r1 = r4
            oe.s r1 = (p212oe.C117776s) r1
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.f343161j
            java.lang.String r6 = java.lang.String.valueOf(r15)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L_0x05d6
            java.lang.String r3 = ""
        L_0x05d6:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x05fd
            java.lang.String r6 = p269xe.C91178c.m114428a(r3)
            java.lang.String r8 = "Java "
            boolean r8 = r6.startsWith(r8)
            if (r8 == 0) goto L_0x05ed
            java.lang.String r8 = p269xe.C91178c.m114430c(r3)
            goto L_0x05ef
        L_0x05ed:
            r8 = r25
        L_0x05ef:
            java.lang.String r9 = "Native "
            boolean r9 = r6.startsWith(r9)
            if (r9 == 0) goto L_0x05fb
            java.lang.String r8 = p269xe.C91178c.m114431d(r3)
        L_0x05fb:
            r3 = r8
            goto L_0x064d
        L_0x05fd:
            boolean r3 = p212oe.C117750b.f352138q
            if (r3 == 0) goto L_0x0649
            java.lang.String r3 = "canary"
            boolean r3 = r2.equals(r3)     // Catch:{ Exception -> 0x0616 }
            if (r3 == 0) goto L_0x062c
            int r3 = android.os.Process.myPid()     // Catch:{ Exception -> 0x0616 }
            if (r15 == r3) goto L_0x0618
            java.lang.String r3 = "com.tencent.mm"
            boolean r20 = r5.startsWith(r3)     // Catch:{ Exception -> 0x0616 }
            goto L_0x0618
        L_0x0616:
            goto L_0x0649
        L_0x0618:
            if (r20 == 0) goto L_0x061d
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0616 }
            goto L_0x0634
        L_0x061d:
            r8 = 5
            int r3 = (r27 > r8 ? 1 : (r27 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x062c
            r8 = 3000(0xbb8, double:1.482E-320)
            int r3 = (r37 > r8 ? 1 : (r37 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x062c
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0616 }
            goto L_0x0634
        L_0x062c:
            boolean r3 = p212oe.C117750b.m166052j(r2, r4)     // Catch:{ Exception -> 0x0616 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0616 }
        L_0x0634:
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0616 }
            if (r3 == 0) goto L_0x0649
            d3.c r3 = p269xe.C91178c.m114429b(r15)     // Catch:{ Exception -> 0x0616 }
            F r6 = r3.f166179a     // Catch:{ Exception -> 0x0616 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0616 }
            S r3 = r3.f166180b     // Catch:{ Exception -> 0x0647 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0647 }
            goto L_0x064d
        L_0x0647:
            goto L_0x064b
        L_0x0649:
            r6 = r48
        L_0x064b:
            r3 = r25
        L_0x064d:
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L_0x0671
            java.lang.String r8 = "Matrix.battery.BatteryReporter"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = " #overHeat bg looping thread found: name = "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r10 = ", stack = \n"
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
        L_0x0671:
            r8 = r33
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r9 = r4.mo173673q(r8)
            if (r9 == 0) goto L_0x06cf
            java.lang.String r10 = "bat-temp-min"
            double r11 = r9.f343235g
            double r11 = p1195ge.C116951c.m165015p(r11, r14)
            java.lang.Double r11 = java.lang.Double.valueOf(r11)
            r7.put(r10, r11)
            java.lang.String r10 = "bat-temp-max"
            double r11 = r9.f343234f
            double r11 = p1195ge.C116951c.m165015p(r11, r14)
            java.lang.Double r11 = java.lang.Double.valueOf(r11)
            r7.put(r10, r11)
            java.lang.String r10 = "bat-temp-avg"
            double r11 = r9.f343236h
            double r11 = p1195ge.C116951c.m165015p(r11, r14)
            java.lang.Double r11 = java.lang.Double.valueOf(r11)
            r7.put(r10, r11)
            java.lang.String r10 = "bat-temp-inc"
            double r11 = r9.f343234f
            r13 = r5
            r48 = r6
            double r5 = r9.f343232d
            double r11 = r11 - r5
            double r5 = p1195ge.C116951c.m165015p(r11, r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r7.put(r10, r5)
            java.lang.String r5 = "bat-temp-dif"
            double r10 = r9.f343234f
            r6 = r13
            double r12 = r9.f343235g
            double r10 = r10 - r12
            double r9 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            r7.put(r5, r9)
            goto L_0x06d2
        L_0x06cf:
            r48 = r6
            r6 = r5
        L_0x06d2:
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.x$g> r5 = com.tencent.matrix.batterycanary.monitor.feature.C114536x.C114543g.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r5 = r4.mo173673q(r5)
            if (r5 == 0) goto L_0x072b
            java.lang.String r9 = "cpu-freq-min"
            double r10 = r5.f343235g
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "cpu-freq-max"
            double r10 = r5.f343234f
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "cpu-freq-avg"
            double r10 = r5.f343236h
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "cpu-freq-inc"
            double r10 = r5.f343234f
            double r12 = r5.f343232d
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "cpu-freq-dif"
            double r10 = r5.f343234f
            double r12 = r5.f343235g
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r10)
            r7.put(r9, r5)
        L_0x072b:
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.x$k> r5 = com.tencent.matrix.batterycanary.monitor.feature.C114536x.C114548k.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r5 = r4.mo173673q(r5)
            if (r5 == 0) goto L_0x0784
            java.lang.String r9 = "dev-thermal-min"
            double r10 = r5.f343235g
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-thermal-max"
            double r10 = r5.f343234f
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-thermal-avg"
            double r10 = r5.f343236h
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-thermal-inc"
            double r10 = r5.f343234f
            double r12 = r5.f343232d
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-thermal-dif"
            double r10 = r5.f343234f
            double r12 = r5.f343235g
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r10)
            r7.put(r9, r5)
        L_0x0784:
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.x$j> r5 = com.tencent.matrix.batterycanary.monitor.feature.C114536x.C114547j.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r5 = r4.mo173673q(r5)
            if (r5 == 0) goto L_0x07dd
            java.lang.String r9 = "dev-headroom-min"
            double r10 = r5.f343235g
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-headroom-max"
            double r10 = r5.f343234f
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-headroom-avg"
            double r10 = r5.f343236h
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-headroom-inc"
            double r10 = r5.f343234f
            double r12 = r5.f343232d
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-headroom-dif"
            double r10 = r5.f343234f
            double r12 = r5.f343235g
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r10)
            r7.put(r9, r5)
        L_0x07dd:
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.x$f> r5 = com.tencent.matrix.batterycanary.monitor.feature.C114536x.C114542f.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r5 = r4.mo173673q(r5)
            if (r5 == 0) goto L_0x0836
            java.lang.String r9 = "dev-watt-min"
            double r10 = r5.f343235g
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-watt-max"
            double r10 = r5.f343234f
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-watt-avg"
            double r10 = r5.f343236h
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-watt-inc"
            double r10 = r5.f343234f
            double r12 = r5.f343232d
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-watt-dif"
            double r10 = r5.f343234f
            double r12 = r5.f343235g
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r10)
            r7.put(r9, r5)
        L_0x0836:
            java.lang.Class<oe.b$$h> r5 = p212oe.b$$h.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r5 = r4.mo173673q(r5)
            if (r5 == 0) goto L_0x088f
            java.lang.String r9 = "dev-light-min"
            double r10 = r5.f343235g
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-light-max"
            double r10 = r5.f343234f
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-light-avg"
            double r10 = r5.f343236h
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-light-inc"
            double r10 = r5.f343234f
            double r12 = r5.f343232d
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "dev-light-dif"
            double r10 = r5.f343234f
            double r12 = r5.f343235g
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r10)
            r7.put(r9, r5)
        L_0x088f:
            java.lang.Class<oe.b$$k> r5 = p212oe.b$$k.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r5 = r4.mo173673q(r5)
            if (r5 == 0) goto L_0x08e8
            java.lang.String r9 = "net-radio-min"
            double r10 = r5.f343235g
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "net-radio-max"
            double r10 = r5.f343234f
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "net-radio-avg"
            double r10 = r5.f343236h
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "net-radio-inc"
            double r10 = r5.f343234f
            double r12 = r5.f343232d
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "net-radio-dif"
            double r10 = r5.f343234f
            double r12 = r5.f343235g
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r10)
            r7.put(r9, r5)
        L_0x08e8:
            java.lang.Class<oe.b$$l> r5 = p212oe.b$$l.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r5 = r4.mo173673q(r5)
            if (r5 == 0) goto L_0x0941
            java.lang.String r9 = "net-wifi-min"
            double r10 = r5.f343235g
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "net-wifi-max"
            double r10 = r5.f343234f
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "net-wifi-avg"
            double r10 = r5.f343236h
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "net-wifi-inc"
            double r10 = r5.f343234f
            double r12 = r5.f343232d
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "net-wifi-dif"
            double r10 = r5.f343234f
            double r12 = r5.f343235g
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r10)
            r7.put(r9, r5)
        L_0x0941:
            java.lang.Class<oe.b$$i> r5 = p212oe.b$$i.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r5 = r4.mo173673q(r5)
            if (r5 == 0) goto L_0x099a
            java.lang.String r9 = "oppo-thermal-min"
            double r10 = r5.f343235g
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "oppo-thermal-max"
            double r10 = r5.f343234f
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "oppo-thermal-avg"
            double r10 = r5.f343236h
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "oppo-thermal-inc"
            double r10 = r5.f343234f
            double r12 = r5.f343232d
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "oppo-thermal-dif"
            double r10 = r5.f343234f
            double r12 = r5.f343235g
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r10)
            r7.put(r9, r5)
        L_0x099a:
            java.lang.Class<oe.b$$j> r5 = p212oe.b$$j.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r5 = r4.mo173673q(r5)
            if (r5 == 0) goto L_0x09f3
            java.lang.String r9 = "oppo-thermalstat-min"
            double r10 = r5.f343235g
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "oppo-thermalstat-max"
            double r10 = r5.f343234f
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "oppo-thermalstat-avg"
            double r10 = r5.f343236h
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "oppo-thermalstat-inc"
            double r10 = r5.f343234f
            double r12 = r5.f343232d
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "oppo-thermalstat-dif"
            double r10 = r5.f343234f
            double r12 = r5.f343235g
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r10)
            r7.put(r9, r5)
        L_0x09f3:
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.x$d> r5 = com.tencent.matrix.batterycanary.monitor.feature.C114536x.C114540d.class
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r5 = r4.mo173673q(r5)
            if (r5 == 0) goto L_0x0a4c
            java.lang.String r9 = "batt-curr-min"
            double r10 = r5.f343235g
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "batt-curr-max"
            double r10 = r5.f343234f
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "batt-curr-avg"
            double r10 = r5.f343236h
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "batt-curr-inc"
            double r10 = r5.f343234f
            double r12 = r5.f343232d
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            r7.put(r9, r10)
            java.lang.String r9 = "batt-curr-dif"
            double r10 = r5.f343234f
            double r12 = r5.f343235g
            double r10 = r10 - r12
            double r10 = p1195ge.C116951c.m165015p(r10, r14)
            java.lang.Double r5 = java.lang.Double.valueOf(r10)
            r7.put(r9, r5)
        L_0x0a4c:
            xe.e$b$a$$c r5 = new xe.e$b$a$$c
            r5.<init>(r7)
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b r8 = r4.mo173673q(r8)
            if (r8 == 0) goto L_0x0a5a
            r5.accept(r8)
        L_0x0a5a:
            xe.e$b$a$$d r5 = new xe.e$b$a$$d
            r5.<init>(r7, r0)
            java.util.List r1 = r1.mo173663g()
            if (r1 == 0) goto L_0x0a68
            r5.accept(r1)
        L_0x0a68:
            java.lang.String r1 = ""
            java.lang.String r5 = "avgJiffies"
            java.lang.String r8 = "Exception"
            java.lang.String r9 = "canary"
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0a7b
            if (r26 == 0) goto L_0x0a7f
            java.lang.String r1 = "Long"
            goto L_0x0a7f
        L_0x0a7b:
            java.lang.String r1 = p269xe.C118872b.m167605b(r4)
        L_0x0a7f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            r20 = r1
            java.lang.String r2 = "Matrix.battery.BatteryReporter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "#reportJiffiesException: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r14 = 1
            r1 = 5
            r8 = r15
            r15 = r1
            java.lang.String r17 = p269xe.C91179e.C91181b.m114438b(r7)
            java.lang.String r23 = p269xe.C118872b.m167612i(r6, r8)
            java.lang.String r26 = "duringMin"
            int r1 = r0.f338964b
            long r1 = (long) r1
            r31 = r1
            int r0 = r0.f338967e
            long r0 = (long) r0
            r33 = r0
            r0 = r30
            long r0 = (long) r0
            r35 = r0
            r24 = r37
            r30 = r48
            r37 = r3
            p269xe.C91179e.C91181b.m114437a(r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r26, r27, r29, r30, r31, r33, r35, r37)
        L_0x0acf:
            return
        L_0x0ad0:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0ad0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p269xe.e$b$a$$s.accept(java.lang.Object):void");
    }
}
