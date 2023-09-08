package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import p981ie.C87705i;

/* renamed from: xe.d$$j$$d */
public final /* synthetic */ class d$$j$$d implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ d$$j f355620a;

    /* renamed from: b */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355621b;

    /* renamed from: c */
    public final /* synthetic */ C114467i f355622c;

    public /* synthetic */ d$$j$$d(d$$j d__j, C114490k0.C114491a.C114492a aVar, C114467i iVar) {
        this.f355620a = d__j;
        this.f355621b = aVar;
        this.f355622c = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01aa, code lost:
        if (com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess() != false) goto L_0x01af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r45) {
        /*
            r44 = this;
            r0 = r44
            xe.d$$j r1 = r0.f355620a
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r2 = r0.f355621b
            com.tencent.matrix.batterycanary.monitor.feature.i r3 = r0.f355622c
            r4 = r45
            ce.a r4 = (p1177ce.C113287a) r4
            r1.getClass()
            long r5 = r2.f343208d
            long r7 = p212oe.C117750b.m166045c()
            java.lang.String r9 = "alertBatt"
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x0025
            java.lang.String r5 = r1.f355663a
            boolean r5 = r5.equals(r9)
            if (r5 != 0) goto L_0x0025
            goto L_0x03fe
        L_0x0025:
            boolean r5 = r2.mo173690b()
            if (r5 != 0) goto L_0x002d
            goto L_0x03fe
        L_0x002d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "#onReportJiffies, scope = "
            r5.append(r6)
            java.lang.String r6 = r1.f355663a
            r5.append(r6)
            java.lang.String r6 = ", fg = "
            r5.append(r6)
            boolean r6 = r4.mo165844h()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Matrix.battery.listener"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            long r7 = r2.f343208d
            r10 = 60000(0xea60, double:2.9644E-319)
            long r7 = r7 / r10
            r12 = 1
            long r7 = java.lang.Math.max(r12, r7)
            RECORD r5 = r2.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r5 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r5
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r5 = r5.f343062g
            DIGIT r5 = r5.f343211a
            java.lang.Long r5 = (java.lang.Long) r5
            long r14 = r5.longValue()
            long r14 = r14 / r7
            java.lang.String r5 = r1.f355663a
            java.lang.String r7 = "canary"
            boolean r5 = r5.equals(r7)
            r7 = 0
            if (r5 == 0) goto L_0x039a
            boolean r5 = r4.mo165844h()
            r9 = 2
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 1
            if (r5 != 0) goto L_0x01c2
            RECORD r5 = r2.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r5 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r5
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r5 = r5.f343062g
            DIGIT r5 = r5.f343211a
            java.lang.Long r5 = (java.lang.Long) r5
            r16 = r14
            long r13 = r5.longValue()
            java.util.ArrayList r5 = new java.util.ArrayList
            r15 = 4
            r5.<init>(r15)
            com.tencent.mars.smc.IDKey r15 = new com.tencent.mars.smc.IDKey
            r15.<init>()
            r8 = 1013(0x3f5, float:1.42E-42)
            r15.SetID(r8)
            boolean r20 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            r21 = 100
            r22 = 60
            r23 = 40
            r24 = 20
            r25 = 80
            if (r20 == 0) goto L_0x00b4
            r20 = 0
            goto L_0x00e3
        L_0x00b4:
            boolean r20 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r20 == 0) goto L_0x00bd
            r20 = 20
            goto L_0x00e3
        L_0x00bd:
            boolean r20 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isPushProcess()
            if (r20 == 0) goto L_0x00c6
            r20 = 40
            goto L_0x00e3
        L_0x00c6:
            boolean r20 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isExdeviceProcess()
            if (r20 == 0) goto L_0x00cf
            r20 = 60
            goto L_0x00e3
        L_0x00cf:
            boolean r20 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isSandBoxProcess()
            if (r20 == 0) goto L_0x00d8
            r20 = 80
            goto L_0x00e3
        L_0x00d8:
            boolean r20 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r20 == 0) goto L_0x00e1
            r20 = 100
            goto L_0x00e3
        L_0x00e1:
            r20 = -1
        L_0x00e3:
            if (r20 < 0) goto L_0x011f
            r26 = 2000(0x7d0, double:9.88E-321)
            int r28 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r28 <= 0) goto L_0x00ee
            int r20 = r20 + 0
            goto L_0x011c
        L_0x00ee:
            r26 = 1500(0x5dc, double:7.41E-321)
            int r28 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r28 <= 0) goto L_0x00f7
            int r20 = r20 + 1
            goto L_0x011c
        L_0x00f7:
            int r26 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r26 <= 0) goto L_0x00fe
            int r20 = r20 + 2
            goto L_0x011c
        L_0x00fe:
            r26 = 800(0x320, double:3.953E-321)
            int r28 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r28 <= 0) goto L_0x0109
            r19 = 3
            int r20 = r20 + 3
            goto L_0x011c
        L_0x0109:
            r26 = 600(0x258, double:2.964E-321)
            int r28 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r28 <= 0) goto L_0x0114
            r18 = 4
            int r20 = r20 + 4
            goto L_0x011c
        L_0x0114:
            r26 = 300(0x12c, double:1.48E-321)
            int r18 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r18 <= 0) goto L_0x011f
            int r20 = r20 + 5
        L_0x011c:
            r9 = r20
            goto L_0x0120
        L_0x011f:
            r9 = -1
        L_0x0120:
            r15.SetKey(r9)
            r10 = 1
            r15.SetValue(r10)
            r5.add(r15)
            com.tencent.mars.smc.IDKey r9 = new com.tencent.mars.smc.IDKey
            r9.<init>()
            r9.SetValue(r13)
            r9.SetID(r8)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r10 == 0) goto L_0x013d
            goto L_0x016a
        L_0x013d:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r10 == 0) goto L_0x0146
            r10 = 20
            goto L_0x016b
        L_0x0146:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isPushProcess()
            if (r10 == 0) goto L_0x014f
            r10 = 40
            goto L_0x016b
        L_0x014f:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isExdeviceProcess()
            if (r10 == 0) goto L_0x0158
            r10 = 60
            goto L_0x016b
        L_0x0158:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isSandBoxProcess()
            if (r10 == 0) goto L_0x0161
            r10 = 80
            goto L_0x016b
        L_0x0161:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r10 == 0) goto L_0x016a
            r10 = 100
            goto L_0x016b
        L_0x016a:
            r10 = 0
        L_0x016b:
            int r10 = r10 + 17
            r9.SetKey(r10)
            r5.add(r9)
            com.tencent.mars.smc.IDKey r9 = new com.tencent.mars.smc.IDKey
            r9.<init>()
            r9.SetID(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r8 == 0) goto L_0x0182
            goto L_0x01ad
        L_0x0182:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r8 == 0) goto L_0x018b
            r21 = 20
            goto L_0x01af
        L_0x018b:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isPushProcess()
            if (r8 == 0) goto L_0x0194
            r21 = 40
            goto L_0x01af
        L_0x0194:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isExdeviceProcess()
            if (r8 == 0) goto L_0x019d
            r21 = 60
            goto L_0x01af
        L_0x019d:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isSandBoxProcess()
            if (r8 == 0) goto L_0x01a6
            r21 = 80
            goto L_0x01af
        L_0x01a6:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r8 == 0) goto L_0x01ad
            goto L_0x01af
        L_0x01ad:
            r21 = 0
        L_0x01af:
            int r8 = r21 + 18
            r9.SetKey(r8)
            r10 = 1
            r9.SetValue(r10)
            r5.add(r9)
            kj2.d r8 = kj2.C117407d.INSTANCE
            r8.mo160124a(r5, r7)
            goto L_0x01c4
        L_0x01c2:
            r16 = r14
        L_0x01c4:
            boolean r5 = r4.f338975m
            if (r5 != 0) goto L_0x01d5
            kj2.d r28 = kj2.C117407d.INSTANCE
            r29 = 1540(0x604, double:7.61E-321)
            r31 = 8
            r33 = 1
            r35 = 0
            r28.idkeyStat(r29, r31, r33, r35)
        L_0x01d5:
            boolean r5 = p212oe.C117750b.f352135n
            if (r5 == 0) goto L_0x0201
            RECORD r5 = r2.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r5 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r5
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r5 = r5.f343063h
            java.util.List<ITEM> r5 = r5.f343212a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x01e9
            goto L_0x03fe
        L_0x01e9:
            boolean r5 = r4.mo165843g()
            if (r5 != 0) goto L_0x03fe
            boolean r5 = r4.mo165844h()
            if (r5 == 0) goto L_0x0201
            int r5 = r4.f338964b
            int r8 = p212oe.C117750b.f352122a
            int r8 = java.lang.Math.max(r8, r7)
            if (r5 > r8) goto L_0x0201
            goto L_0x03fe
        L_0x0201:
            boolean r5 = r4.mo165844h()
            if (r5 != 0) goto L_0x0246
            long r8 = p212oe.C117750b.f352124c
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = java.lang.Math.max(r8, r10)
            int r5 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0222
            java.lang.String r2 = "#onReportJiffies report as exception!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r2)
            p269xe.C91179e.C91180a.m114435b(r12)
            java.lang.String r1 = r1.f355663a
            p269xe.C91179e.C91181b.C91182a.m114441b(r1, r3, r7)
            goto L_0x03fe
        L_0x0222:
            long r8 = r2.f343208d
            r10 = 7200000(0x6ddd00, double:3.5572727E-317)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 < 0) goto L_0x0246
            long r8 = p212oe.C117750b.f352125d
            r10 = 50
            long r8 = java.lang.Math.max(r8, r10)
            int r5 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0246
            java.lang.String r2 = "#onReportJiffies report as long time exception!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r2)
            p269xe.C91179e.C91180a.m114435b(r12)
            java.lang.String r1 = r1.f355663a
            p269xe.C91179e.C91181b.C91182a.m114441b(r1, r3, r12)
            goto L_0x03fe
        L_0x0246:
            p269xe.C91179e.C91180a.m114435b(r7)
            boolean r1 = r4.mo165844h()
            boolean r3 = p212oe.b$$f.m166058c()
            if (r3 != 0) goto L_0x0255
            goto L_0x03fe
        L_0x0255:
            RECORD r3 = r2.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r3 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r3
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r3 = r3.f343062g
            DIGIT r3 = r3.f343211a
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r5 = 100
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x03fe
            long r3 = r2.f343208d
            r5 = 60000(0xea60, double:2.9644E-319)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0274
            goto L_0x03fe
        L_0x0274:
            java.lang.String r22 = p269xe.C118872b.m167609f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r24 = p269xe.C118872b.m167607d(r1)
            int r25 = p269xe.C118872b.m167608e()
            java.lang.String r35 = p269xe.C91179e.m114432a()
            long r8 = r2.f343208d
            long r8 = r8 / r5
            r4 = 1
            long r33 = java.lang.Math.max(r4, r8)
            RECORD r1 = r2.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r1 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r1
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r1 = r1.f343062g
            DIGIT r1 = r1.f343211a
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            long r27 = r4 / r33
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 3
            r1.<init>(r4)
            r5 = 0
        L_0x02a9:
            if (r5 >= r4) goto L_0x02eb
            r8 = 0
            RECORD r6 = r2.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r6 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r6
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r6 = r6.f343063h
            java.util.List<ITEM> r6 = r6.f343212a
            int r6 = r6.size()
            if (r6 <= r5) goto L_0x02da
            RECORD r6 = r2.f343207c
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r6 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r6
            com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r6 = r6.f343063h
            java.util.List<ITEM> r6 = r6.f343212a
            java.lang.Object r6 = r6.get(r5)
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r6 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r6
            if (r6 == 0) goto L_0x02da
            java.lang.String r8 = r6.f343067c
            DIGIT r6 = r6.f343211a
            java.lang.Long r6 = (java.lang.Long) r6
            long r9 = r6.longValue()
            long r9 = r9 / r33
            r6 = r8
            r8 = r9
            goto L_0x02dc
        L_0x02da:
            java.lang.String r6 = ""
        L_0x02dc:
            d3.c r10 = new d3.c
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r10.<init>(r6, r8)
            r1.add(r10)
            int r5 = r5 + 1
            goto L_0x02a9
        L_0x02eb:
            java.lang.String r2 = "Matrix.battery.BatteryReporter"
            java.lang.String r4 = "#statJiffies"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            java.lang.Object r2 = r1.get(r12)
            d3.c r2 = (p329d3.C58104c) r2
            F r2 = r2.f166179a
            java.lang.String r2 = (java.lang.String) r2
            r4 = -1
            java.lang.String r2 = p269xe.C118872b.m167612i(r2, r4)
            r3.append(r2)
            java.lang.String r2 = ":"
            r3.append(r2)
            java.lang.Object r4 = r1.get(r12)
            d3.c r4 = (p329d3.C58104c) r4
            S r4 = r4.f166180b
            r3.append(r4)
            r4 = 2
            java.lang.Object r5 = r1.get(r4)
            d3.c r5 = (p329d3.C58104c) r5
            F r5 = r5.f166179a
            java.lang.String r5 = (java.lang.String) r5
            r6 = -1
            java.lang.String r5 = p269xe.C118872b.m167612i(r5, r6)
            r3.append(r5)
            r3.append(r2)
            java.lang.Object r2 = r1.get(r4)
            d3.c r2 = (p329d3.C58104c) r2
            S r2 = r2.f166180b
            r3.append(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r2 = p981ie.C117159b.m165207h(r2)
            java.lang.String r4 = "|"
            r3.append(r4)
            java.lang.String r5 = "batTemp="
            r3.append(r5)
            r3.append(r2)
            int[] r2 = p981ie.C117159b.m165211l()
            int r5 = r2.length
            if (r5 <= 0) goto L_0x0361
            r3.append(r4)
            java.lang.String r4 = "cupFreq="
            r3.append(r4)
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r3.append(r2)
        L_0x0361:
            android.util.SparseArray<java.lang.Integer> r2 = p269xe.C91179e.C91181b.f261436a
            r20 = 0
            r21 = 5
            java.lang.String r23 = r3.toString()
            java.lang.Object r2 = r1.get(r7)
            d3.c r2 = (p329d3.C58104c) r2
            F r2 = r2.f166179a
            java.lang.String r2 = (java.lang.String) r2
            r3 = -1
            java.lang.String r29 = p269xe.C118872b.m167612i(r2, r3)
            java.lang.Object r1 = r1.get(r7)
            d3.c r1 = (p329d3.C58104c) r1
            S r1 = r1.f166180b
            java.lang.Long r1 = (java.lang.Long) r1
            long r30 = r1.longValue()
            r37 = 0
            r39 = 0
            r41 = 0
            java.lang.String r26 = "avgJiffies"
            java.lang.String r32 = "duringMin"
            java.lang.String r36 = ""
            java.lang.String r43 = ""
            p269xe.C91179e.C91181b.m114437a(r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r32, r33, r35, r36, r37, r39, r41, r43)
            goto L_0x03fe
        L_0x039a:
            r16 = r14
            java.lang.String r2 = r1.f355663a
            java.lang.String r4 = "module"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x03d4
            r2 = r3
            oe.s r2 = (p212oe.C117776s) r2
            java.lang.String r2 = r2.mo182526y()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x03fe
            boolean r4 = p212oe.b$$f.m166058c()
            if (r4 != 0) goto L_0x03ba
            goto L_0x03c8
        L_0x03ba:
            ce.a r4 = r3.f343163l
            if (r4 == 0) goto L_0x03c8
            java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot> r5 = com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.class
            xe.e$b$b$$b r6 = new xe.e$b$b$$b
            r6.<init>(r4, r3, r2)
            r3.mo173668l(r5, r6)
        L_0x03c8:
            r4 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x03fe
            java.lang.String r1 = r1.f355663a
            p269xe.C91179e.C91181b.C91182a.m114441b(r1, r3, r7)
            goto L_0x03fe
        L_0x03d4:
            java.lang.String r2 = r1.f355663a
            java.lang.String r4 = "biz"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x03f1
            r2 = r3
            oe.s r2 = (p212oe.C117776s) r2
            java.lang.String r2 = r2.mo182526y()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x03fe
            java.lang.String r1 = r1.f355663a
            p269xe.C91179e.C91181b.C91182a.m114441b(r1, r3, r7)
            goto L_0x03fe
        L_0x03f1:
            java.lang.String r2 = r1.f355663a
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x03fe
            java.lang.String r1 = r1.f355663a
            p269xe.C91179e.C91181b.C91182a.m114441b(r1, r3, r7)
        L_0x03fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p269xe.d$$j$$d.accept(java.lang.Object):void");
    }
}
