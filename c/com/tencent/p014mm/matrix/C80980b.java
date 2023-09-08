package com.tencent.p014mm.matrix;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.matrix.b */
public class C80980b {

    /* renamed from: a */
    public static final boolean f237843a = (BuildInfo.ENABLE_MATRIX || BuildInfo.DEBUG);

    /* renamed from: b */
    public static final boolean f237844b;

    /* renamed from: c */
    public static final List<b$$d> f237845c = new ArrayList();

    static {
        boolean z = false;
        if (BuildInfo.ENABLE_MATRIX_TRACE || BuildInfo.DEBUG) {
            z = true;
        }
        f237844b = z;
    }

    /* JADX WARNING: type inference failed for: r3v141 */
    /* JADX WARNING: type inference failed for: r3v143 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x05e2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x062a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0682  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x06c0  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x06f2  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x06f5  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0905  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0a7d  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x056f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0579  */
    /* renamed from: a */
    public static void m98870a(android.app.Application r92, com.tencent.p014mm.matrix.b$$c r93) {
        /*
            r0 = r92
            java.lang.Class<xv.l> r1 = p757xv.C118904l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.matrix.a r1 = (com.tencent.p014mm.matrix.C55261a) r1
            com.tencent.p014mm.matrix.C55262j.f157382a = r1
            java.lang.String r1 = "MicroMsg.MatrixDelegate"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[onBoot] ENABLE_MATRIX="
            r2.append(r3)
            boolean r3 = f237843a
            r2.append(r3)
            java.lang.String r4 = ", ENABLE_MATRIX_TRACE="
            r2.append(r4)
            boolean r4 = f237844b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            p723vf.C118672d.m167353c(r1, r2, r5)
            if (r3 != 0) goto L_0x0064
            com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor r1 = com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor.f235421k
            com.tencent.matrix.lifecycle.k r2 = p70.C89315a.f257273a
            com.tencent.matrix.lifecycle.supervisor.l r2 = r2.f235352a
            r1.mo111976c(r0, r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 != 0) goto L_0x0046
            boolean r1 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r1 == 0) goto L_0x0063
        L_0x0046:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r1 == 0) goto L_0x0063
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.matrix.b$$a r3 = new com.tencent.mm.matrix.b$$a
            r3.<init>(r0)
            r4 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            r6 = 1
            long r6 = r0.toMillis(r6)
            r2 = r1
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183872c(r3, r4, r6)
        L_0x0063:
            return
        L_0x0064:
            oa1.d r1 = oa1.C117731d.m166007c()
            java.lang.String r2 = "clicfg_matrix_boot_enable"
            java.lang.String r3 = "1"
            r5 = 1
            java.lang.String r1 = r1.mo182444f(r2, r3, r4, r5)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r5)
            if (r1 == r5) goto L_0x0081
            java.lang.String r0 = "MicroMsg.MatrixDelegate"
            java.lang.String r1 = "[onBoot] disabled by clicfg_matrix_boot_enable"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            p723vf.C118672d.m167352b(r0, r1, r2)
            return
        L_0x0081:
            java.util.List<com.tencent.mm.matrix.b$$d> r1 = f237845c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0089:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x009f
            java.lang.Object r2 = r1.next()
            com.tencent.mm.matrix.b$$d r2 = (com.tencent.p014mm.matrix.b$$d) r2
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            int r6 = r2.f237846a
            java.lang.Object[] r2 = r2.f237847b
            r3.mo160131h(r6, r2)
            goto L_0x0089
        L_0x009f:
            java.util.Objects.requireNonNull(r93)
            java.lang.String r1 = "onInitialize()"
            bp3.C79760s.m96908a(r1)
            r1 = r93
            com.tencent.mm.matrix.c r1 = (com.tencent.p014mm.matrix.C80981c) r1
            com.tencent.mm.matrix.d r2 = new com.tencent.mm.matrix.d
            r2.<init>(r1)
            p723vf.C118672d.f355106a = r2
            com.tencent.mm.app.AppForegroundDelegate r2 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            com.tencent.mm.matrix.e r3 = new com.tencent.mm.matrix.e
            r3.<init>(r1)
            r2.mo174208a(r3)
            java.lang.String r2 = "createDynamicConfig()"
            bp3.C79760s.m96908a(r2)
            com.tencent.mm.matrix.l r2 = new com.tencent.mm.matrix.l
            r2.<init>()
            bp3.C79760s.m96909b()
            java.lang.String r3 = "createReporter()"
            bp3.C79760s.m96908a(r3)
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "matrix report init, context is null"
            if (r7 == 0) goto L_0x0b2a
            int r3 = qe3.C89625d.f257841g
            long r8 = (long) r3
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isMonkeyEnv()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            r11 = 5
            if (r3 != 0) goto L_0x010b
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r3 != 0) goto L_0x010b
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 == 0) goto L_0x00f6
            goto L_0x010b
        L_0x00f6:
            boolean r3 = qe3.C89625d.f257845k
            if (r3 == 0) goto L_0x00fb
            goto L_0x010b
        L_0x00fb:
            boolean r3 = qe3.C89625d.f257842h
            if (r3 == 0) goto L_0x0102
            r11 = 3
            goto L_0x010b
        L_0x0102:
            boolean r3 = qe3.C89625d.f257844j
            if (r3 == 0) goto L_0x0109
            r11 = 4
            goto L_0x010b
        L_0x0109:
            r11 = -1
        L_0x010b:
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.lang.String r3 = "matrix report init, clientVersion is null"
            java.util.Objects.requireNonNull(r8, r3)
            java.lang.String r3 = "matrix report init, revision is null"
            java.util.Objects.requireNonNull(r9, r3)
            java.lang.String r3 = "matrix report init, publishType is null"
            java.util.Objects.requireNonNull(r11, r3)
            r70.c r3 = new r70.c
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r1.f237852d = r3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r4] = r3
            java.lang.String r3 = "MatrixDelegate"
            java.lang.String r7 = "init matrix reporter %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
            r70.c r3 = r1.f237852d
            bp3.C79760s.m96909b()
            java.lang.String r6 = "attachReportPolicy()"
            bp3.C79760s.m96908a(r6)
            r70.b r6 = new r70.b
            r6.<init>()
            r3.f258343i = r6
            bp3.C79760s.m96909b()
            java.lang.String r6 = "new Matrix.Builder()"
            bp3.C79760s.m96908a(r6)
            yd.c$b r15 = new yd.c$b
            r15.<init>(r0)
            bp3.C79760s.m96909b()
            r15.f262170b = r3
            com.tencent.matrix.lifecycle.k r3 = p70.C89315a.f257273a
            r15.f262171c = r3
            java.lang.String r3 = "onInstallPlugin()"
            bp3.C79760s.m96908a(r3)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r6 = "clicfg_matrix_base_swtich"
            boolean r3 = r3.decodeBool(r6, r4)
            com.tencent.p014mm.matrix.C80981c.f237849p = r3
            zt3.t r3 = zt3.C119157j.f356862d
            com.tencent.mm.matrix.i r6 = new com.tencent.mm.matrix.i
            r6.<init>()
            zt3.j r3 = (zt3.C119157j) r3
            java.lang.String r7 = "initCameraCacheDevice"
            r3.mo183876g(r6, r7)
            com.tencent.mm.matrix.MatrixDelegate$10 r3 = new com.tencent.mm.matrix.MatrixDelegate$10
            com.tencent.mm.app.f r6 = com.tencent.p014mm.app.C40008f.f107254d
            r3.<init>(r6)
            r3.alive()
            java.lang.String r3 = "Init MemoryCanaryPlugin"
            bp3.C79760s.m96908a(r3)
            java.lang.String r3 = "clicfg_matrix_memory_canary_enable"
            boolean r3 = p761yd.C38993b.m41995e(r3, r5)     // Catch:{ all -> 0x018d }
            goto L_0x018f
        L_0x018d:
            r3 = 1
        L_0x018f:
            java.lang.String r12 = "MatrixDelegate"
            r9 = 3
            r11 = 0
            r10 = 4
            r13 = 2
            if (r3 == 0) goto L_0x04b7
            java.lang.String r3 = "onInstallPlugin: MemoryCanary"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            java.lang.String r3 = "MemoryCanaryBoot.configure"
            bp3.C79760s.m96908a(r3)
            q70.c0$a r3 = q70.C89491c0.f257566a
            r3.getClass()
            java.lang.String r3 = "MemoryCanaryConfig expt"
            bp3.C79760s.m96908a(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isPushProcess()
            if (r3 == 0) goto L_0x01db
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 != 0) goto L_0x01bb
            boolean r3 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r3 == 0) goto L_0x01db
        L_0x01bb:
            com.tencent.mm.matrix.test.PushKillerTest r3 = com.tencent.p014mm.matrix.test.PushKillerTest.f237880a
            r3.getClass()
            java.lang.String r14 = "MicroMsg.PushKiller"
            java.lang.String r8 = "register"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r8)
            android.content.IntentFilter r8 = new android.content.IntentFilter
            r8.<init>()
            java.lang.String r14 = "com.tencent.matrix.kill.lru"
            r8.addAction(r14)
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = "com.tencent.mm.permission.MM_MESSAGE"
            r14.registerReceiver(r3, r8, r6, r11)
        L_0x01db:
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_matrix_memory_trim_notifier_enable_v2
            boolean r3 = p761yd.C38993b.m41993c(r3, r5)
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_matrix_memory_trim_notifier_delay_array
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r7 != 0) goto L_0x01f0
            boolean r7 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r7 == 0) goto L_0x01ee
            goto L_0x01f0
        L_0x01ee:
            r7 = 0
            goto L_0x01f1
        L_0x01f0:
            r7 = 1
        L_0x01f1:
            boolean r6 = p761yd.C38993b.m41993c(r6, r7)
            r7 = 30
            if (r6 == 0) goto L_0x022f
            java.lang.Long[] r6 = new java.lang.Long[r10]
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            long r16 = r14.toMillis(r7)
            java.lang.Long r16 = java.lang.Long.valueOf(r16)
            r6[r4] = r16
            long r7 = r14.toMillis(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6[r5] = r7
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MINUTES
            r14 = r12
            r11 = 2
            long r17 = r7.toMillis(r11)
            java.lang.Long r8 = java.lang.Long.valueOf(r17)
            r6[r13] = r8
            long r7 = r7.toMillis(r11)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6[r9] = r7
            java.util.ArrayList r6 = sx3.C64197v.m75534c(r6)
            goto L_0x0242
        L_0x022f:
            r14 = r12
            java.lang.Long[] r6 = new java.lang.Long[r5]
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r7 = r11.toMillis(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6[r4] = r7
            java.util.ArrayList r6 = sx3.C64197v.m75534c(r6)
        L_0x0242:
            bp3.C79760s.m96909b()
            r7 = 16
            qe.g[] r7 = new p659qe.C89612g[r7]
            java.lang.String r8 = "AppBgConfig"
            bp3.C79760s.m96908a(r8)
            q70.f r8 = q70.C89496f.f257573a
            qe.g r11 = r8.mo123797j()
            bp3.C79760s.m96909b()
            r7[r4] = r11
            qe.g r11 = r8.mo123794g()
            r7[r5] = r11
            r11 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r5 = 1024(0x400, float:1.435E-42)
            double r4 = (double) r5
            double r11 = r11 * r4
            r9 = 1024(0x400, double:5.06E-321)
            r22 = r14
            double r13 = (double) r9
            double r11 = r11 * r13
            long r11 = (long) r11
            long r37 = q70.C89496f.f257574b
            com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner r39 = com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner.INSTANCE
            qe.g r40 = new qe.g
            q70.x r9 = new q70.x
            r9.<init>(r11)
            r41 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r43 = 0
            r44 = 0
            r45 = 160(0xa0, float:2.24E-43)
            r46 = 0
            r24 = 1
            r47 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r58 = 0
            r60 = 0
            r61 = 160(0xa0, float:2.24E-43)
            r62 = 0
            r30 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r72 = 0
            r74 = 0
            r75 = 160(0xa0, float:2.24E-43)
            r76 = 0
            r32 = 0
            r34 = 0
            r35 = 160(0xa0, float:2.24E-43)
            r36 = 0
            r23 = r40
            r25 = r39
            r26 = r37
            r28 = r11
            r33 = r9
            r23.<init>(r24, r25, r26, r28, r30, r32, r33, r34, r35, r36)
            r9 = 2
            r7[r9] = r40
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r23 = r11 * r4
            double r11 = r23 * r13
            long r11 = (long) r11
            com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner r9 = com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE
            qe.g r40 = new qe.g
            q70.d r10 = new q70.d
            r10.<init>(r11)
            r32 = 0
            r34 = 0
            r35 = 160(0xa0, float:2.24E-43)
            r36 = 0
            r23 = r40
            r24 = 1
            r25 = r9
            r26 = r37
            r28 = r11
            r30 = r47
            r33 = r10
            r23.<init>(r24, r25, r26, r28, r30, r32, r33, r34, r35, r36)
            r10 = 3
            r7[r10] = r40
            r23 = 4608533498688228557(0x3ff4cccccccccccd, double:1.3)
            double r23 = r23 * r4
            double r4 = r23 * r13
            long r4 = (long) r4
            long r66 = q70.C89496f.f257576d
            qe.g r10 = new qe.g
            q70.a0 r13 = new q70.a0
            r13.<init>(r4)
            r50 = 1
            r64 = 1
            r24 = 1
            r32 = 0
            r34 = 0
            r35 = 160(0xa0, float:2.24E-43)
            r36 = 0
            r23 = r10
            r25 = r39
            r26 = r66
            r28 = r4
            r30 = r41
            r33 = r13
            r23.<init>(r24, r25, r26, r28, r30, r32, r33, r34, r35, r36)
            r4 = 4
            r7[r4] = r10
            r4 = 4650248090236747776(0x4089000000000000, double:800.0)
            long r4 = r8.mo123798k(r4)
            qe.g r10 = new qe.g
            q70.v r13 = new q70.v
            r13.<init>(r4)
            r30 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r56 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r70 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r63 = r10
            r65 = r9
            r68 = r4
            r73 = r13
            r63.<init>(r64, r65, r66, r68, r70, r72, r73, r74, r75, r76)
            r4 = 5
            r7[r4] = r10
            qe.g r5 = r8.mo123791d()
            r10 = 6
            r7[r10] = r5
            r5 = 7
            qe.g r13 = r8.mo123790c()
            r7[r5] = r13
            qe.g r5 = r8.mo123789b()
            r13 = 8
            r7[r13] = r5
            r5 = 9
            qe.g r13 = r8.mo123793f()
            r7[r5] = r13
            r5 = 10
            qe.g r13 = r8.mo123792e()
            r7[r5] = r13
            r5 = 11
            qe.g r13 = r8.mo123796i()
            r7[r5] = r13
            r5 = 12
            qe.g r13 = r8.mo123795h()
            r7[r5] = r13
            r5 = 13
            r13 = 4647503709213818880(0x407f400000000000, double:500.0)
            r39 = r11
            long r10 = r8.mo123798k(r13)
            long r52 = q70.C89496f.f257577e
            qe.g r23 = new qe.g
            q70.b r12 = new q70.b
            r12.<init>(r10)
            r49 = r23
            r51 = r9
            r54 = r10
            r59 = r12
            r49.<init>(r50, r51, r52, r54, r56, r58, r59, r60, r61, r62)
            r7[r5] = r23
            r5 = 14
            long r10 = r8.mo123798k(r13)
            long r26 = q70.C89496f.f257578f
            qe.g r12 = new qe.g
            q70.o r4 = new q70.o
            r4.<init>(r10)
            r23 = r12
            r25 = r9
            r28 = r10
            r33 = r4
            r23.<init>(r24, r25, r26, r28, r30, r32, r33, r34, r35, r36)
            r7[r5] = r12
            r4 = 15
            long r10 = r8.mo123798k(r13)
            qe.g r5 = new qe.g
            q70.m r8 = new q70.m
            r8.<init>(r10)
            r48 = 1
            r28 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r78 = 1
            r23 = r5
            r26 = r37
            r30 = r10
            r32 = r43
            r33 = r8
            r34 = r44
            r35 = r45
            r36 = r46
            r23.<init>(r24, r25, r26, r28, r30, r32, r33, r34, r35, r36)
            r7[r4] = r5
            r4 = 6
            qe.n[] r4 = new p659qe.C89616n[r4]
            java.lang.String r5 = "ProcBgConfig"
            bp3.C79760s.m96908a(r5)
            q70.g0 r5 = q70.C89508g0.f257593a
            qe.n r8 = r5.mo123803c()
            bp3.C79760s.m96909b()
            r9 = 0
            r4[r9] = r8
            qe.n r8 = r5.mo123802b()
            r9 = 1
            r4[r9] = r8
            r8 = 250(0xfa, float:3.5E-43)
            long r82 = r5.mo123804d(r8)
            r9 = 500(0x1f4, float:7.0E-43)
            long r84 = r5.mo123804d(r9)
            qe.n r10 = new qe.n
            com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner r25 = com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.INSTANCE
            long r52 = q70.C89508g0.f257594b
            q70.l0 r91 = q70.C35772l0.f95541d
            r90 = 3
            r77 = r10
            r79 = r25
            r80 = r52
            r86 = r39
            r88 = r39
            r77.<init>(r78, r79, r80, r82, r84, r86, r88, r90, r91)
            r11 = 2
            r4[r11] = r10
            r10 = 150(0x96, float:2.1E-43)
            long r54 = r5.mo123804d(r10)
            r11 = 350(0x15e, float:4.9E-43)
            long r56 = r5.mo123804d(r11)
            r11 = 600(0x258, float:8.41E-43)
            long r11 = (long) r11
            r13 = 1024(0x400, double:5.06E-321)
            long r11 = r11 * r13
            qe.n r13 = new qe.n
            com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner r14 = com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE
            r62 = 3
            q70.e0 r63 = q70.C35769e0.f95538d
            r50 = 1
            r49 = r13
            r51 = r14
            r58 = r11
            r60 = r11
            r49.<init>(r50, r51, r52, r54, r56, r58, r60, r62, r63)
            r19 = 3
            r4[r19] = r13
            long r28 = r5.mo123804d(r8)
            long r30 = r5.mo123804d(r9)
            r9 = 800(0x320, float:1.121E-42)
            long r8 = (long) r9
            r23 = 1024(0x400, double:5.06E-321)
            long r34 = r8 * r23
            qe.n r8 = new qe.n
            long r50 = q70.C89508g0.f257596d
            r36 = 3
            q70.o0 r37 = q70.C35773o0.f95542d
            r24 = 1
            r23 = r8
            r26 = r50
            r32 = r34
            r23.<init>(r24, r25, r26, r28, r30, r32, r34, r36, r37)
            r9 = 4
            r4[r9] = r8
            long r52 = r5.mo123804d(r10)
            r8 = 250(0xfa, float:3.5E-43)
            long r54 = r5.mo123804d(r8)
            qe.n r5 = new qe.n
            r60 = 3
            q70.i0 r61 = q70.C35770i0.f95539d
            r47 = r5
            r49 = r14
            r56 = r11
            r47.<init>(r48, r49, r50, r52, r54, r56, r58, r60, r61)
            r8 = 5
            r4[r8] = r5
            re.b r5 = new re.b
            r5.<init>(r3, r6)
            pe.a r3 = new pe.a
            r3.<init>(r7, r4, r5)
            bp3.C79760s.m96909b()
            java.lang.String r4 = "new MemoryCanaryPlugin"
            bp3.C79760s.m96908a(r4)
            pe.b r4 = new pe.b
            r4.<init>(r3)
            bp3.C79760s.m96909b()
            java.lang.String r3 = "add memoryCanaryPlugin"
            bp3.C79760s.m96908a(r3)
            r15.mo125379a(r4)
            bp3.C79760s.m96909b()
            goto L_0x04b9
        L_0x04b7:
            r22 = r12
        L_0x04b9:
            bp3.C79760s.m96909b()
            java.lang.String r3 = "Init TracePlugin"
            bp3.C79760s.m96908a(r3)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r4 = "clicfg_matrix_traceplugin_switch"
            r5 = 1
            boolean r3 = r3.decodeBool(r4, r5)
            if (r3 == 0) goto L_0x04e4
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r3 != 0) goto L_0x04e0
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r3 != 0) goto L_0x04e0
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r3 == 0) goto L_0x04e4
        L_0x04e0:
            r3 = 1
            r17 = 1
            goto L_0x04e7
        L_0x04e4:
            r3 = 1
            r17 = 0
        L_0x04e7:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r17)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "[isEnableTracePlugin] isEnable=%s"
            r12 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r4)
            java.lang.String r4 = ""
            r5 = -1
            if (r17 == 0) goto L_0x0735
            lf.a r6 = p1002lf.C88490a.f255594b
            r6.f255595a = r3
            boolean r6 = r1.mo112802h()
            if (r6 == 0) goto L_0x0512
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = r1.f237855g
            java.lang.String r7 = "clicfg_matrix_trace_evil_method_enable"
            r8 = 0
            int r18 = r6.getInt(r7, r8)
            r6 = r18
            goto L_0x0514
        L_0x0512:
            r8 = 0
            r6 = 0
        L_0x0514:
            if (r6 != r3) goto L_0x0517
            goto L_0x0541
        L_0x0517:
            if (r6 != r5) goto L_0x051a
            goto L_0x0543
        L_0x051a:
            boolean r3 = com.tencent.p014mm.matrix.C80981c.f237849p
            if (r3 == 0) goto L_0x052c
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r7 = "clicfg_matrix_trace_evil_method_switch"
            boolean r3 = r3.decodeBool(r7, r8)
            if (r3 == 0) goto L_0x052c
            r3 = 1
            goto L_0x052d
        L_0x052c:
            r3 = 0
        L_0x052d:
            if (r3 == 0) goto L_0x0543
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r3 != 0) goto L_0x0541
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r3 != 0) goto L_0x0541
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r3 == 0) goto L_0x0543
        L_0x0541:
            r3 = 1
            goto L_0x0544
        L_0x0543:
            r3 = 0
        L_0x0544:
            boolean r7 = com.tencent.p014mm.matrix.C80981c.m98873c()
            if (r7 == 0) goto L_0x054b
            r3 = 1
        L_0x054b:
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            r9 = 0
            r8[r9] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r8[r7] = r6
            java.lang.String r6 = "[isEnableEvilMethod] isEnable=%s value=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r8)
            lf.b r6 = new lf.b
            r11 = 0
            r6.<init>(r11)
            r6.f255596a = r2
            boolean r7 = r1.mo112802h()
            if (r7 == 0) goto L_0x0579
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = r1.f237855g
            java.lang.String r8 = "clicfg_matrix_trace_fps_enable"
            r9 = 0
            int r7 = r7.getInt(r8, r9)
            goto L_0x057a
        L_0x0579:
            r7 = 0
        L_0x057a:
            r8 = 1
            if (r7 != r8) goto L_0x057e
            goto L_0x05ae
        L_0x057e:
            if (r7 != r5) goto L_0x0581
            goto L_0x05b1
        L_0x0581:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r8 != 0) goto L_0x0599
            boolean r8 = qe3.C89625d.f257845k
            if (r8 != 0) goto L_0x0599
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r9 = "clicfg_matrix_new_frame_tracer_switch"
            r10 = 0
            boolean r8 = r8.decodeBool(r9, r10)
            if (r8 == 0) goto L_0x0597
            goto L_0x0599
        L_0x0597:
            r8 = 0
            goto L_0x059a
        L_0x0599:
            r8 = 1
        L_0x059a:
            if (r8 == 0) goto L_0x05b1
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r8 != 0) goto L_0x05ae
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r8 != 0) goto L_0x05ae
            boolean r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r8 == 0) goto L_0x05b1
        L_0x05ae:
            r8 = 1
        L_0x05af:
            r9 = 2
            goto L_0x05b3
        L_0x05b1:
            r8 = 0
            goto L_0x05af
        L_0x05b3:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            r13 = 0
            r10[r13] = r9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 1
            r10[r9] = r7
            java.lang.String r7 = "[isEnableFPS] isEnable=%s value=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r10)
            r6.f255597b = r8
            r6.f255598c = r3
            boolean r3 = r1.mo112802h()
            if (r3 == 0) goto L_0x05dd
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r1.f237855g
            java.lang.String r7 = "clicfg_matrix_trace_startup_enable"
            int r18 = r3.getInt(r7, r13)
            r3 = r18
            goto L_0x05de
        L_0x05dd:
            r3 = 0
        L_0x05de:
            r7 = 1
            if (r3 != r7) goto L_0x05e2
            goto L_0x0603
        L_0x05e2:
            if (r3 != r5) goto L_0x05e5
            goto L_0x0606
        L_0x05e5:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r8 = "clicfg_matrix_startup_tracer_switch"
            boolean r7 = r7.decodeBool(r8, r13)
            if (r7 == 0) goto L_0x0606
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r7 != 0) goto L_0x0603
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r7 != 0) goto L_0x0603
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r7 == 0) goto L_0x0606
        L_0x0603:
            r7 = 1
        L_0x0604:
            r8 = 2
            goto L_0x0608
        L_0x0606:
            r7 = 0
            goto L_0x0604
        L_0x0608:
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r10 = 0
            r9[r10] = r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8 = 1
            r9[r8] = r3
            java.lang.String r3 = "[isEnableStartUp] isEnable=%s value=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r9)
            r6.f255599d = r7
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r1.f237855g
            java.lang.String r7 = "clicfg_matrix_trace_anr_enable"
            int r3 = r3.getInt(r7, r10)
            if (r3 != r8) goto L_0x062a
            goto L_0x064b
        L_0x062a:
            if (r3 != r5) goto L_0x062d
            goto L_0x064e
        L_0x062d:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r9 = "clicfg_matrix_trace_looper_printer_switch"
            boolean r7 = r7.decodeBool(r9, r8)
            if (r7 == 0) goto L_0x064e
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r7 != 0) goto L_0x064b
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r7 != 0) goto L_0x064b
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r7 == 0) goto L_0x064e
        L_0x064b:
            r7 = 1
        L_0x064c:
            r8 = 2
            goto L_0x0650
        L_0x064e:
            r7 = 0
            goto L_0x064c
        L_0x0650:
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            r10 = 0
            r9[r10] = r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8 = 1
            r9[r8] = r3
            java.lang.String r3 = "[isEnableAnr] isEnable=%s value=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r9)
            r6.f255600e = r7
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r7 = "clicfg_record_history_msg"
            boolean r3 = r3.decodeBool(r7, r10)
            if (r3 != 0) goto L_0x0682
            boolean r3 = qe3.C89625d.f257845k
            if (r3 != 0) goto L_0x0682
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 != 0) goto L_0x0682
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r3 == 0) goto L_0x0680
            goto L_0x0682
        L_0x0680:
            r3 = 0
            goto L_0x0683
        L_0x0682:
            r3 = 1
        L_0x0683:
            r6.f255608m = r3
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r7 = "clicfg_dense_msg_tracer"
            r8 = 0
            boolean r3 = r3.decodeBool(r7, r8)
            if (r3 != 0) goto L_0x06a1
            boolean r3 = qe3.C89625d.f257845k
            if (r3 != 0) goto L_0x06a1
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 != 0) goto L_0x06a1
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r3 == 0) goto L_0x069f
            goto L_0x06a1
        L_0x069f:
            r3 = 0
            goto L_0x06a2
        L_0x06a1:
            r3 = 1
        L_0x06a2:
            r6.f255609n = r3
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r7 = "clicfg_touch_event_tracer"
            r8 = 0
            boolean r3 = r3.decodeBool(r7, r8)
            if (r3 != 0) goto L_0x06c0
            boolean r3 = qe3.C89625d.f257845k
            if (r3 != 0) goto L_0x06c0
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 != 0) goto L_0x06c0
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r3 == 0) goto L_0x06be
            goto L_0x06c0
        L_0x06be:
            r3 = 0
            goto L_0x06c1
        L_0x06c0:
            r3 = 1
        L_0x06c1:
            r6.f255602g = r3
            boolean r3 = com.tencent.p014mm.matrix.C80981c.m98873c()
            if (r3 == 0) goto L_0x06ca
            goto L_0x06e4
        L_0x06ca:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r7 = "clicfg_idle_handler_tracer"
            r8 = 0
            boolean r3 = r3.decodeBool(r7, r8)
            if (r3 != 0) goto L_0x06e6
            boolean r3 = qe3.C89625d.f257845k
            if (r3 != 0) goto L_0x06e6
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r3 != 0) goto L_0x06e6
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r3 == 0) goto L_0x06e4
            goto L_0x06e6
        L_0x06e4:
            r3 = 0
            goto L_0x06e7
        L_0x06e6:
            r3 = 1
        L_0x06e7:
            r6.f255601f = r3
            r3 = 2
            r6.f255605j = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r3 == 0) goto L_0x06f5
            java.lang.String r3 = "com.tencent.mm.app.WeChatSplashActivity;com.tencent.mm.plugin.account.ui.WelcomeActivity;"
            goto L_0x06f6
        L_0x06f5:
            r3 = r4
        L_0x06f6:
            r6.f255606k = r3
            r3 = 1
            r6.f255603h = r3
            r3 = 0
            r6.f255604i = r3
            kf.a r3 = new kf.a
            r3.<init>(r6)
            r15.mo125379a(r3)
            r70.c r7 = r1.f237852d
            r70.a r8 = new r70.a
            r8.<init>()
            java.util.concurrent.ConcurrentHashMap<we.b, r70.c$c> r7 = r7.f258342h
            r7.put(r3, r8)
            boolean r3 = r6.f255609n
            if (r3 == 0) goto L_0x0736
            r3 = 1
            com.tencent.p014mm.matrix.C80981c.f237850q = r3
            lu3.c<?> r3 = r1.f237856h
            if (r3 != 0) goto L_0x0736
            zt3.t r3 = zt3.C119157j.f356862d
            com.tencent.mm.matrix.f r6 = new com.tencent.mm.matrix.f
            r6.<init>(r1)
            r24 = 100
            r26 = 5000(0x1388, double:2.4703E-320)
            r22 = r3
            zt3.j r22 = (zt3.C119157j) r22
            r23 = r6
            lu3.c r3 = r22.mo183872c(r23, r24, r26)
            r1.f237856h = r3
            goto L_0x0736
        L_0x0735:
            r11 = 0
        L_0x0736:
            bp3.C79760s.m96909b()
            java.lang.String r3 = "Init BatteryMonitorPlugin"
            bp3.C79760s.m96908a(r3)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = r1.f237855g
            java.lang.String r6 = "ENABLE_BATTERY"
            r7 = 0
            int r3 = r3.getInt(r6, r7)
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r8[r7] = r9
            java.lang.String r7 = "[isEnableBatteryMonitor] value=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r7, r8)
            if (r3 != r6) goto L_0x0758
            goto L_0x0776
        L_0x0758:
            if (r3 != r5) goto L_0x075b
            goto L_0x0774
        L_0x075b:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r5 != 0) goto L_0x0776
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r5 != 0) goto L_0x0776
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r5 != 0) goto L_0x0776
            boolean r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isPushProcess()
            if (r5 == 0) goto L_0x0774
            goto L_0x0776
        L_0x0774:
            r5 = 0
            goto L_0x0777
        L_0x0776:
            r5 = 1
        L_0x0777:
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r8 = 0
            r7[r8] = r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 1
            r7[r6] = r3
            java.lang.String r3 = "[isEnableBatteryMonitor] isEnable=%s value=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r7)
            if (r5 == 0) goto L_0x07fd
            oa1.d r3 = oa1.C117731d.m166007c()
            java.lang.String r5 = "clicfg_battery_process_enable"
            java.lang.String r3 = r3.mo182444f(r5, r4, r8, r6)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 != 0) goto L_0x07a5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3, r5)
        L_0x07a5:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r3 == 0) goto L_0x07b0
            r3 = r5 & 1
            if (r3 != r6) goto L_0x07dd
            goto L_0x07db
        L_0x07b0:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r3 == 0) goto L_0x07bc
            r3 = r5 & 2
            r4 = 2
            if (r3 != r4) goto L_0x07dd
            goto L_0x07db
        L_0x07bc:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r3 == 0) goto L_0x07c8
            r3 = r5 & 4
            r4 = 4
            if (r3 != r4) goto L_0x07dd
            goto L_0x07db
        L_0x07c8:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isPushProcess()
            if (r3 == 0) goto L_0x07d5
            r3 = r5 & 8
            r4 = 8
            if (r3 != r4) goto L_0x07dd
            goto L_0x07db
        L_0x07d5:
            r3 = r5 & 128(0x80, float:1.794E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r3 != r4) goto L_0x07dd
        L_0x07db:
            r3 = 1
            goto L_0x07de
        L_0x07dd:
            r3 = 0
        L_0x07de:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r7 = 0
            r4[r7] = r6
            java.lang.String r5 = java.lang.Integer.toBinaryString(r5)
            r6 = 1
            r4[r6] = r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r13 = 2
            r4[r13] = r5
            java.lang.String r5 = "[isEnableBatteryMonitor] isEnable=%s cliCfg=%s processName=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r4)
            r5 = r3
            goto L_0x07fe
        L_0x07fd:
            r13 = 2
        L_0x07fe:
            if (r5 == 0) goto L_0x080a
            be.i r3 = p212oe.C117750b.m166043a()
            p212oe.C117762j.m166101d(r3)
            r15.mo125379a(r3)
        L_0x080a:
            bp3.C79760s.m96909b()
            java.lang.String r3 = "Init ResourcePlugin"
            bp3.C79760s.m96908a(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r3 != 0) goto L_0x0827
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r3 != 0) goto L_0x0827
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r3 == 0) goto L_0x0825
            goto L_0x0827
        L_0x0825:
            r3 = 0
            goto L_0x0828
        L_0x0827:
            r3 = 1
        L_0x0828:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r6 = 0
            r5[r6] = r4
            java.lang.String r4 = "[isEnableActivityLeak] isEnable=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r5)
            if (r3 == 0) goto L_0x0950
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            cf.a$b r4 = p937cf.C80018a.C80020b.FORK_ANALYSE
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r5 != 0) goto L_0x08f5
            boolean r5 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r5 == 0) goto L_0x084c
            goto L_0x08f5
        L_0x084c:
            r5 = 0
            java.lang.String r7 = "clicfg_android_enable_memory_fork_dump"
            long r5 = p761yd.C38993b.m41992b(r7, r5)
            double r7 = java.lang.Math.random()
            r9 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r7 = r7 * r9
            long r7 = (long) r7
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0866
            goto L_0x08f3
        L_0x0866:
            java.lang.String r5 = "clicfg_android_enable_memory_fork_dump_rate"
            r6 = -1
            long r5 = p761yd.C38993b.m41992b(r5, r6)
            double r7 = java.lang.Math.random()
            double r5 = (double) r5
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r9 / r5
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0890
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r5 == 0) goto L_0x0890
            java.lang.String r5 = "enable fork dump cause expt: clicfg_android_enable_memory_fork_dump_rate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 1699(0x6a3, double:8.394E-321)
            r22 = 2
            r24 = 1
            r19.mo175913w(r20, r22, r24)
            goto L_0x08f3
        L_0x0890:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isMonkeyEnv()
            if (r5 == 0) goto L_0x089c
            java.lang.String r5 = "enable silence dump cause monkey"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            goto L_0x08f3
        L_0x089c:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r5 != 0) goto L_0x08ee
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r5 == 0) goto L_0x08a5
            goto L_0x08ee
        L_0x08a5:
            boolean r5 = qe3.C89625d.f257845k
            if (r5 != 0) goto L_0x08bb
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_P_ALPHA
            if (r5 == 0) goto L_0x08ae
            goto L_0x08bb
        L_0x08ae:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.ENABLE_MATRIX_SILENCE_ANALYSE
            if (r5 == 0) goto L_0x08b8
            java.lang.String r5 = "enable silence analyse by build config"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            goto L_0x08f3
        L_0x08b8:
            cf.a$b r5 = p937cf.C80018a.C80020b.NO_DUMP
            goto L_0x08f7
        L_0x08bb:
            oa1.d r5 = oa1.C117731d.m166007c()
            r6 = 0
            java.lang.String r7 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "clicfg_android_alpha_disable_fork_analyze"
            r9 = 1
            java.lang.String r5 = r5.mo182444f(r8, r7, r6, r9)
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r6)
            if (r5 == r9) goto L_0x08e6
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r5 != 0) goto L_0x08d6
            goto L_0x08e6
        L_0x08d6:
            java.lang.Object[] r5 = new java.lang.Object[r9]
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_P_ALPHA
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r5[r6] = r7
            java.lang.String r6 = "enable fork analyze on alpha. IS_FLAVOR_P_ALPHA = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r5)
            goto L_0x08f3
        L_0x08e6:
            java.lang.String r5 = "enable silence mode on alpha because fork analyze is disable from remote."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            cf.a$b r5 = p937cf.C80018a.C80020b.SILENCE_ANALYSE
            goto L_0x08f7
        L_0x08ee:
            java.lang.String r5 = "enable silence dump cause purple/red"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
        L_0x08f3:
            r8 = r4
            goto L_0x08f8
        L_0x08f5:
            cf.a$b r5 = p937cf.C80018a.C80020b.MANUAL_DUMP
        L_0x08f7:
            r8 = r5
        L_0x08f8:
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r8
            java.lang.String r5 = "Activity Leak Detect DumpMode=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r6)
            if (r4 != r8) goto L_0x0911
            zt3.t r4 = zt3.C119157j.f356862d
            com.tencent.mm.matrix.c$$a r5 = new com.tencent.mm.matrix.c$$a
            r5.<init>()
            zt3.j r4 = (zt3.C119157j) r4
            r4.mo183884o(r5)
        L_0x0911:
            com.tencent.mm.sdk.platformtools.WeChatBrands$AppInfo$WhichApp r4 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.AppInfo.current()
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "com.tencent.mm.ui.matrix.ManualDumpActivity"
            r3.setClassName(r4, r5)
            int r3 = p937cf.C80018a.f234430h
            java.lang.String r3 = android.os.Build.MANUFACTURER
            r4 = 0
            cf.a r5 = new cf.a
            r9 = 0
            r14 = 0
            java.lang.String r10 = "com.tencent.mm.ui.matrix.ManualDumpActivity"
            r6 = r5
            r7 = r2
            r11 = r3
            r3 = r12
            r12 = r4
            r4 = 2
            r13 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            com.tencent.matrix.resource.h r6 = new com.tencent.matrix.resource.h
            r6.<init>(r5)
            r15.mo125379a(r6)
            com.tencent.matrix.resource.g r5 = new com.tencent.matrix.resource.g
            r5.<init>()
            r0.registerActivityLifecycleCallbacks(r5)
            r70.c r0 = r1.f237852d
            r70.d r5 = new r70.d
            r5.<init>()
            java.util.concurrent.ConcurrentHashMap<we.b, r70.c$c> r0 = r0.f258342h
            r0.put(r6, r5)
            goto L_0x0952
        L_0x0950:
            r3 = r12
            r4 = 2
        L_0x0952:
            bp3.C79760s.m96909b()
            java.lang.String r0 = "Init IOCanaryPlugin"
            bp3.C79760s.m96908a(r0)
            java.lang.String r0 = "matrix_native"
            boolean r0 = p206nj.C76862i.m92661a(r0)
            if (r0 != 0) goto L_0x0964
            r0 = 0
            goto L_0x0987
        L_0x0964:
            boolean r0 = com.tencent.p014mm.matrix.C80981c.f237849p
            if (r0 == 0) goto L_0x0977
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r5 = "clicfg_matrix_io_switch"
            r6 = 0
            boolean r0 = r0.decodeBool(r5, r6)
            if (r0 == 0) goto L_0x0978
            r0 = 1
            goto L_0x0979
        L_0x0977:
            r6 = 0
        L_0x0978:
            r0 = 0
        L_0x0979:
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            r7[r6] = r5
            java.lang.String r5 = "[isEnableIOCanary] isEnable=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r7)
        L_0x0987:
            if (r0 == 0) goto L_0x0997
            je.a r0 = new je.a
            ke.a r5 = new ke.a
            r6 = 0
            r5.<init>(r2, r6)
            r0.<init>(r5)
            r15.mo125379a(r0)
        L_0x0997:
            bp3.C79760s.m96909b()
            java.lang.String r0 = "Init OpenglLeakPlugin"
            bp3.C79760s.m96908a(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x0a31
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x09f4 }
            java.lang.String r2 = "clicfg_gpu_service_open"
            java.lang.String r7 = "true"
            r8 = 1
            r9 = 0
            java.lang.String r0 = r0.mo182444f(r2, r7, r9, r8)     // Catch:{ Exception -> 0x09f4 }
            oa1.d r2 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x09f4 }
            java.lang.String r7 = "clicfg_opengl_hook_sample_new"
            java.lang.String r10 = "-1"
            java.lang.String r2 = r2.mo182444f(r7, r10, r9, r8)     // Catch:{ Exception -> 0x09f4 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09f4 }
            r7.<init>()     // Catch:{ Exception -> 0x09f4 }
            java.lang.String r8 = "[OpenglLeakPlugin: oplStr] = "
            r7.append(r8)     // Catch:{ Exception -> 0x09f4 }
            r7.append(r0)     // Catch:{ Exception -> 0x09f4 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x09f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ Exception -> 0x09f4 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x09f4 }
            r7.<init>()     // Catch:{ Exception -> 0x09f4 }
            java.lang.String r8 = "[OpenglLeakPlugin: dmStr] = "
            r7.append(r8)     // Catch:{ Exception -> 0x09f4 }
            r7.append(r2)     // Catch:{ Exception -> 0x09f4 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x09f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ Exception -> 0x09f4 }
            r7 = 0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r7)     // Catch:{ Exception -> 0x09f4 }
            double r5 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r2, r5)     // Catch:{ Exception -> 0x09f5 }
            goto L_0x09fa
        L_0x09f4:
            r0 = 0
        L_0x09f5:
            java.lang.String r2 = "get Control System cause Error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x09fa:
            r8 = r0
            r10 = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[OpenglLeakPlugin: openglLeakEnable] = "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[OpenglLeakPlugin: denominator] = "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            com.tencent.mm.matrix.g r0 = new com.tencent.mm.matrix.g
            r6 = r0
            r7 = r1
            r9 = r15
            r6.<init>(r7, r8, r9, r10)
            com.tencent.mm.matrix.dice.a r2 = com.tencent.p014mm.matrix.dice.C80982a.f237863f
            r2.mo112808c(r0)
        L_0x0a31:
            bp3.C79760s.m96909b()
            java.lang.String r0 = "Init SyncBarrierWatchDogPlus"
            bp3.C79760s.m96908a(r0)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r2 = "clicfg_detect_syncbarrier_leak"
            r5 = 0
            boolean r0 = r0.decodeBool(r2, r5)
            if (r0 == 0) goto L_0x0a92
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 != 0) goto L_0x0a58
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isToolsProcess()
            if (r0 != 0) goto L_0x0a58
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isAppBrandProcess()
            if (r0 == 0) goto L_0x0a92
        L_0x0a58:
            java.lang.String r0 = "SyncBarrierWatchDogPlus start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            boolean r2 = p1064xf.C91194c.f261452a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            boolean r2 = p1064xf.C91194c.f261458g
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            java.lang.String r2 = "SyncBarrierWatchDogPlus"
            java.lang.String r4 = "startDetect sync barrier, isStarted =%b , oncCheckFinished = %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r0)
            boolean r0 = p1064xf.C91194c.f261452a
            if (r0 != 0) goto L_0x0a92
            p1064xf.C91194c.f261452a = r3
            xf.a r5 = new xf.a
            r5.<init>()
            p1064xf.C91194c.f261454c = r5
            zt3.t r0 = zt3.C119157j.f356862d
            r4 = r0
            zt3.j r4 = (zt3.C119157j) r4
            r6 = 4500(0x1194, double:2.2233E-320)
            r8 = 4500(0x1194, double:2.2233E-320)
            r4.mo183872c(r5, r6, r8)
        L_0x0a92:
            bp3.C79760s.m96909b()
            bp3.C79760s.m96909b()
            java.lang.String r0 = "Matrix.init()"
            bp3.C79760s.m96908a(r0)
            we.c r0 = r15.f262170b
            if (r0 != 0) goto L_0x0aaa
            we.a r0 = new we.a
            android.app.Application r2 = r15.f262169a
            r0.<init>(r2)
            r15.f262170b = r0
        L_0x0aaa:
            yd.c r0 = new yd.c
            android.app.Application r4 = r15.f262169a
            we.c r5 = r15.f262170b
            java.util.HashSet<we.b> r6 = r15.f262172d
            com.tencent.matrix.lifecycle.k r7 = r15.f262171c
            r8 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Class<yd.c> r2 = p761yd.C91441c.class
            monitor-enter(r2)
            yd.c r3 = p761yd.C91441c.f262166c     // Catch:{ all -> 0x0b27 }
            if (r3 != 0) goto L_0x0ac3
            p761yd.C91441c.f262166c = r0     // Catch:{ all -> 0x0b27 }
            goto L_0x0acd
        L_0x0ac3:
            java.lang.String r0 = "Matrix.Matrix"
            java.lang.String r3 = "Matrix instance is already set. this invoking will be ignored"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0b27 }
            p723vf.C118672d.m167352b(r0, r3, r4)     // Catch:{ all -> 0x0b27 }
        L_0x0acd:
            monitor-exit(r2)     // Catch:{ all -> 0x0b27 }
            bp3.C79760s.m96909b()
            yd.c r0 = p761yd.C91441c.m114730d()
            java.util.HashSet<we.b> r0 = r0.f262167a
            java.util.Iterator r0 = r0.iterator()
        L_0x0adb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0b1c
            java.lang.Object r2 = r0.next()
            we.b r2 = (p1060we.C90970b) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.mo112098b()
            r3.append(r4)
            java.lang.String r4 = ".start()"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            bp3.C79760s.m96908a(r3)
            java.lang.String r3 = "MicroMsg.MatrixDelegate"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[onInitialize] start plugin: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r2.mo112100d()
            bp3.C79760s.m96909b()
            goto L_0x0adb
        L_0x0b1c:
            yd.c r0 = p761yd.C91441c.m114730d()
            r1.mo112801g(r0)
            bp3.C79760s.m96909b()
            return
        L_0x0b27:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0b27 }
            throw r0
        L_0x0b2a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.matrix.C80980b.m98870a(android.app.Application, com.tencent.mm.matrix.b$$c):void");
    }
}
