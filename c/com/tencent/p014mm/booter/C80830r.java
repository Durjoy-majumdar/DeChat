package com.tencent.p014mm.booter;

/* renamed from: com.tencent.mm.booter.r */
public class C80830r {

    /* renamed from: a */
    public static long f237592a = -1;

    /* renamed from: b */
    public static final int[] f237593b = {20, 30, 40};

    /* renamed from: c */
    public static final int[] f237594c = {21, 31, 41};

    /* renamed from: d */
    public static final int[] f237595d = {22, 32, 42};

    /* renamed from: e */
    public static final int[] f237596e = {23, 33, 43};

    /* renamed from: f */
    public static final int[] f237597f = {24, 34, 44};

    /* renamed from: g */
    public static final int[] f237598g = {25, 35, 45};

    /* renamed from: h */
    public static final int[] f237599h = {26, 36, 46};

    /* renamed from: i */
    public static final int[] f237600i = {27, 37, 47};

    /* renamed from: j */
    public static final int[] f237601j = {28, 38, 48};

    /* renamed from: k */
    public static final int[] f237602k = {29, 39, 49};

    /* renamed from: l */
    public static final int[] f237603l = {100, 110, 120};

    /* renamed from: m */
    public static final int[] f237604m = {101, 111, 121};

    /* renamed from: n */
    public static final int[] f237605n = {102, 112, 122};

    /* renamed from: o */
    public static final int[] f237606o = {103, 113, 123};

    /* renamed from: p */
    public static final int[] f237607p = {104, 114, 124};

    /* renamed from: q */
    public static final int[] f237608q = {105, 115, 125};

    /* renamed from: r */
    public static final int[] f237609r = {106, 116, 126};

    /* renamed from: s */
    public static final int[] f237610s = {107, 117, 127};

    /* renamed from: t */
    public static final int[] f237611t = {108, 118, 128};

    /* renamed from: u */
    public static final int[] f237612u = {109, 119, 129};

    /* renamed from: v */
    public static final int[] f237613v = {160, 170, 180};

    /* renamed from: w */
    public static final int[] f237614w = {200, 210, 220};

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0326 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04df  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m98680a() {
        /*
            long r0 = f237592a
            java.lang.String r2 = "last_report"
            java.lang.String r3 = "eabi_report"
            r4 = 0
            r6 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x001d
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r6)
            r7 = -1
            long r0 = r0.getLong(r2, r7)
            f237592a = r0
        L_0x001d:
            long r0 = f237592a
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x0031
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = f237592a
            long r0 = r0 - r4
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x0546
        L_0x0031:
            boolean r0 = p156gj.C32461x.m39732a()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r5 = 1726(0x6be, float:2.419E-42)
            r7 = 1
            r4.<init>((int) r5, (int) r6, (int) r7)
            r1.add(r4)
            if (r0 == 0) goto L_0x004f
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r0.<init>((int) r5, (int) r7, (int) r7)
            r1.add(r0)
        L_0x004f:
            kj2.d r0 = kj2.C117407d.INSTANCE
            r0.mo160124a(r1, r6)
            java.lang.String[] r0 = android.os.Build.SUPPORTED_64_BIT_ABIS
            int r1 = r0.length
            if (r1 <= 0) goto L_0x005b
            r1 = 1
            goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String[] r8 = android.os.Build.SUPPORTED_32_BIT_ABIS
            java.lang.String r8 = java.util.Arrays.toString(r8)
            r5[r6] = r8
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r5[r7] = r0
            java.lang.String r8 = "MicroMsg.PostTaskReportEABISupport"
            java.lang.String r0 = "current device support eabi: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r9 = 661(0x295, float:9.26E-43)
            r10 = 3
            r0.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r0)
            r0 = 4
            r11 = 5
            if (r1 == 0) goto L_0x0091
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>((int) r9, (int) r0, (int) r7)
            r5.add(r1)
            goto L_0x0099
        L_0x0091:
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>((int) r9, (int) r11, (int) r7)
            r5.add(r1)
        L_0x0099:
            r1 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x009e:
            java.lang.String[] r11 = android.os.Build.SUPPORTED_32_BIT_ABIS
            int r0 = r11.length
            if (r1 >= r0) goto L_0x00d1
            r0 = r11[r1]
            java.lang.String r11 = "armeabi"
            boolean r11 = r11.equalsIgnoreCase(r0)
            if (r11 == 0) goto L_0x00af
            r12 = 1
            goto L_0x00cd
        L_0x00af:
            java.lang.String r11 = "armeabi-v7a"
            boolean r11 = r11.equalsIgnoreCase(r0)
            if (r11 == 0) goto L_0x00b9
            r13 = 1
            goto L_0x00cd
        L_0x00b9:
            java.lang.String r11 = "x86"
            boolean r11 = r11.equalsIgnoreCase(r0)
            if (r11 == 0) goto L_0x00c4
            r14 = 1
            goto L_0x00cd
        L_0x00c4:
            java.lang.String r11 = "mips"
            boolean r0 = r11.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00cd
            r15 = 1
        L_0x00cd:
            int r1 = r1 + 1
            r0 = 4
            goto L_0x009e
        L_0x00d1:
            r0 = 0
            r1 = 0
            r11 = 0
            r17 = 0
        L_0x00d6:
            java.lang.String[] r10 = android.os.Build.SUPPORTED_64_BIT_ABIS
            int r4 = r10.length
            if (r0 >= r4) goto L_0x0100
            r4 = r10[r0]
            java.lang.String r10 = "arm64-v8a"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x00e7
            r1 = 1
            goto L_0x00fc
        L_0x00e7:
            java.lang.String r10 = "x86_64"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x00f2
            r11 = 1
            goto L_0x00fc
        L_0x00f2:
            java.lang.String r10 = "mips64"
            boolean r4 = r10.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x00fc
            r17 = 1
        L_0x00fc:
            int r0 = r0 + 1
            r4 = 2
            goto L_0x00d6
        L_0x0100:
            r4 = 10
            if (r12 == 0) goto L_0x010c
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
        L_0x010c:
            if (r13 == 0) goto L_0x0118
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r10 = 11
            r0.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r0)
        L_0x0118:
            if (r1 == 0) goto L_0x0124
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r10 = 12
            r0.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r0)
        L_0x0124:
            if (r14 == 0) goto L_0x0130
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r10 = 13
            r0.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r0)
        L_0x0130:
            if (r11 == 0) goto L_0x013c
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r10 = 14
            r0.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r0)
        L_0x013c:
            if (r15 == 0) goto L_0x0148
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r10 = 15
            r0.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r0)
        L_0x0148:
            if (r17 == 0) goto L_0x0154
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r10 = 16
            r0.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r0)
        L_0x0154:
            kj2.d r0 = kj2.C117407d.INSTANCE
            r10 = 18459(0x481b, float:2.5867E-41)
            r4 = 7
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
            r4[r6] = r19
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r4[r7] = r13
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 2
            r4[r13] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r13 = 3
            r4[r13] = r12
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 4
            r4[r12] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r12 = 5
            r4[r12] = r11
            r11 = 6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
            r4[r11] = r12
            r0.mo160131h(r10, r4)
            if (r1 == 0) goto L_0x01ae
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r4 = 64
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            int r4 = r0 + -21
            r10 = 10
            if (r4 >= r10) goto L_0x01cc
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            int r0 = r0 + -21
            int r0 = r0 + 90
            r4.<init>((int) r9, (int) r0, (int) r7)
            r5.add(r4)
            goto L_0x01cc
        L_0x01ae:
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r4 = 65
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            int r4 = r0 + -21
            r10 = 10
            if (r4 >= r10) goto L_0x01cc
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            int r0 = r0 + -21
            int r0 = r0 + 80
            r4.<init>((int) r9, (int) r0, (int) r7)
            r5.add(r4)
        L_0x01cc:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r0[r6] = r4
            java.lang.String r4 = "supportArm64_v8a : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r0)
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r4 = 50
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r4 = 240(0xf0, float:3.36E-43)
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r0 == 0) goto L_0x0207
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r4 = 52
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r4 = 242(0xf2, float:3.39E-43)
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
            goto L_0x021b
        L_0x0207:
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r4 = 51
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r4 = 241(0xf1, float:3.38E-43)
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
        L_0x021b:
            boolean r0 = p156gj.C87203t.m108279o()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r4 == 0) goto L_0x0225
            if (r0 != 0) goto L_0x0229
        L_0x0225:
            if (r4 != 0) goto L_0x0234
            if (r0 != 0) goto L_0x0234
        L_0x0229:
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r10 = 53
            r4.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r4)
            goto L_0x023e
        L_0x0234:
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r10 = 54
            r4.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r4)
        L_0x023e:
            r4 = 2
            java.lang.Object[] r10 = new java.lang.Object[r4]
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r10[r6] = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10[r7] = r0
            java.lang.String r0 = "IS_ARM64: %s, isRuntime64 : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r0, r10)
            r4 = 0
            r10 = -1
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ all -> 0x02c2 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x02c2 }
            java.lang.String r12 = "/proc/cpuinfo"
            java.io.InputStream r12 = com.tencent.p014mm.vfs.C86013q1.m106423E(r12)     // Catch:{ all -> 0x02c2 }
            java.lang.String r13 = "UTF-8"
            r0.<init>(r12, r13)     // Catch:{ all -> 0x02c2 }
            r11.<init>(r0)     // Catch:{ all -> 0x02c2 }
        L_0x0268:
            java.lang.String r0 = r11.readLine()     // Catch:{ all -> 0x02bf }
            if (r0 == 0) goto L_0x02ba
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x02bf }
            if (r4 != 0) goto L_0x0268
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x02bf }
            java.lang.String r12 = ""
            if (r4 == 0) goto L_0x027d
            goto L_0x029b
        L_0x027d:
            java.lang.String r4 = " "
            java.lang.String r0 = r0.replaceAll(r4, r12)     // Catch:{ all -> 0x02bf }
            java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x02bf }
            java.lang.String r4 = "kB"
            java.lang.String r0 = r0.replaceAll(r4, r12)     // Catch:{ all -> 0x02bf }
            java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x02bf }
            java.lang.String r4 = "\\t"
            java.lang.String r0 = r0.replaceAll(r4, r12)     // Catch:{ all -> 0x02bf }
            java.lang.String r12 = r0.trim()     // Catch:{ all -> 0x02bf }
        L_0x029b:
            java.lang.String r0 = "CPUarchitecture:7"
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x02bf }
            if (r0 == 0) goto L_0x02a8
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r11)
            r0 = 0
            goto L_0x02cf
        L_0x02a8:
            java.lang.String r0 = "CPUarchitecture:8"
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x02bf }
            if (r0 != 0) goto L_0x02b8
            java.lang.String r0 = "CPUarchitecture:AArch64"
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x02bf }
            if (r0 == 0) goto L_0x0268
        L_0x02b8:
            r0 = 1
            goto L_0x02bb
        L_0x02ba:
            r0 = 2
        L_0x02bb:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r11)
            goto L_0x02cf
        L_0x02bf:
            r0 = move-exception
            r4 = r11
            goto L_0x02c3
        L_0x02c2:
            r0 = move-exception
        L_0x02c3:
            java.lang.String r11 = "unexpected exception occurred."
            java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ all -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r11, r12)     // Catch:{ all -> 0x0547 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r4)
            r0 = -1
        L_0x02cf:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r4[r6] = r11
            java.lang.String r11 = "supportArm64FromCpuInfo : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r4)
            if (r0 != r10) goto L_0x02ea
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r10 = 63
            r4.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r4)
            goto L_0x0311
        L_0x02ea:
            if (r0 != 0) goto L_0x02f7
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r10 = 61
            r4.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r4)
            goto L_0x0311
        L_0x02f7:
            if (r0 != r7) goto L_0x0304
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r10 = 60
            r4.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r4)
            goto L_0x0311
        L_0x0304:
            r4 = 2
            if (r0 != r4) goto L_0x0311
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r10 = 62
            r4.<init>((int) r9, (int) r10, (int) r7)
            r5.add(r4)
        L_0x0311:
            if (r1 == 0) goto L_0x0315
            if (r0 == r7) goto L_0x0319
        L_0x0315:
            if (r1 != 0) goto L_0x0324
            if (r0 != 0) goto L_0x0324
        L_0x0319:
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r4 = 66
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
            goto L_0x0341
        L_0x0324:
            if (r1 == 0) goto L_0x0328
            if (r0 == 0) goto L_0x032c
        L_0x0328:
            if (r1 != 0) goto L_0x0337
            if (r0 != r7) goto L_0x0337
        L_0x032c:
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r4 = 67
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
            goto L_0x0341
        L_0x0337:
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r4 = 68
            r0.<init>((int) r9, (int) r4, (int) r7)
            r5.add(r0)
        L_0x0341:
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r4 = r0.toLowerCase()
            java.lang.String r10 = "xiaomi"
            boolean r11 = r4.contains(r10)
            java.lang.String r12 = "meizu"
            java.lang.String r13 = "samsung"
            java.lang.String r14 = "oppo"
            java.lang.String r15 = "vivo"
            java.lang.String r9 = "honor"
            java.lang.String r6 = "huawei"
            java.lang.String r7 = "redmi"
            if (r11 != 0) goto L_0x03d1
            boolean r11 = r4.contains(r7)
            if (r11 == 0) goto L_0x036a
            goto L_0x03d1
        L_0x036a:
            boolean r11 = r4.contains(r6)
            if (r11 == 0) goto L_0x0378
            int[] r4 = f237593b
        L_0x0372:
            r19 = r2
            r11 = 1
            r16 = 0
            goto L_0x03d8
        L_0x0378:
            boolean r11 = r4.contains(r9)
            if (r11 == 0) goto L_0x0381
            int[] r4 = f237594c
            goto L_0x0372
        L_0x0381:
            boolean r11 = r4.contains(r15)
            if (r11 == 0) goto L_0x038a
            int[] r4 = f237595d
            goto L_0x0372
        L_0x038a:
            boolean r11 = r4.contains(r14)
            if (r11 == 0) goto L_0x0393
            int[] r4 = f237596e
            goto L_0x0372
        L_0x0393:
            boolean r11 = r4.contains(r13)
            if (r11 == 0) goto L_0x039c
            int[] r4 = f237598g
            goto L_0x0372
        L_0x039c:
            boolean r11 = r4.contains(r12)
            if (r11 == 0) goto L_0x03a5
            int[] r4 = f237599h
            goto L_0x0372
        L_0x03a5:
            java.lang.String r11 = "gionee"
            boolean r11 = r4.contains(r11)
            if (r11 == 0) goto L_0x03b0
            int[] r4 = f237600i
            goto L_0x0372
        L_0x03b0:
            java.lang.String r11 = "oneplus"
            boolean r11 = r4.contains(r11)
            if (r11 == 0) goto L_0x03bc
            int[] r4 = f237601j
            goto L_0x0372
        L_0x03bc:
            int[] r11 = f237602k
            r19 = r2
            r18 = r11
            r11 = 1
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r16 = 0
            r2[r16] = r4
            java.lang.String r4 = "factoryKeys : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r2)
            r4 = r18
            goto L_0x03d8
        L_0x03d1:
            r19 = r2
            r11 = 1
            r16 = 0
            int[] r4 = f237597f
        L_0x03d8:
            com.tencent.mars.smc.IDKey r2 = new com.tencent.mars.smc.IDKey
            r18 = r3
            r3 = r4[r16]
            r20 = r8
            r8 = 661(0x295, float:9.26E-43)
            r2.<init>((int) r8, (int) r3, (int) r11)
            r5.add(r2)
            if (r1 == 0) goto L_0x03f5
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r2 = r4[r11]
            r1.<init>((int) r8, (int) r2, (int) r11)
            r5.add(r1)
            goto L_0x0400
        L_0x03f5:
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r2 = 2
            r3 = r4[r2]
            r1.<init>((int) r8, (int) r3, (int) r11)
            r5.add(r1)
        L_0x0400:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            java.lang.String r0 = r0.toLowerCase()
            boolean r2 = r0.contains(r10)
            if (r2 != 0) goto L_0x047e
            boolean r2 = r0.contains(r7)
            if (r2 == 0) goto L_0x0414
            goto L_0x047e
        L_0x0414:
            boolean r2 = r0.contains(r6)
            if (r2 == 0) goto L_0x0421
            int[] r0 = f237603l
        L_0x041c:
            r7 = r20
            r3 = 0
            r6 = 1
            goto L_0x0484
        L_0x0421:
            boolean r2 = r0.contains(r9)
            if (r2 == 0) goto L_0x042a
            int[] r0 = f237604m
            goto L_0x041c
        L_0x042a:
            boolean r2 = r0.contains(r15)
            if (r2 == 0) goto L_0x0433
            int[] r0 = f237605n
            goto L_0x041c
        L_0x0433:
            boolean r2 = r0.contains(r14)
            if (r2 == 0) goto L_0x043c
            int[] r0 = f237606o
            goto L_0x041c
        L_0x043c:
            boolean r2 = r0.contains(r13)
            if (r2 == 0) goto L_0x0445
            int[] r0 = f237608q
            goto L_0x041c
        L_0x0445:
            boolean r2 = r0.contains(r12)
            if (r2 == 0) goto L_0x044e
            int[] r0 = f237609r
            goto L_0x041c
        L_0x044e:
            java.lang.String r2 = "gionee"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0459
            int[] r0 = f237610s
            goto L_0x041c
        L_0x0459:
            java.lang.String r2 = "oneplus"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0465
            int[] r0 = f237611t
            goto L_0x041c
        L_0x0465:
            int[] r2 = f237612u
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = 0
            r4[r3] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6 = 1
            r4[r6] = r0
            java.lang.String r0 = "wechatKeys : %s %s"
            r7 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r4)
            r0 = r2
            goto L_0x0484
        L_0x047e:
            r7 = r20
            r3 = 0
            r6 = 1
            int[] r0 = f237607p
        L_0x0484:
            com.tencent.mars.smc.IDKey r2 = new com.tencent.mars.smc.IDKey
            r4 = r0[r3]
            r3 = 661(0x295, float:9.26E-43)
            r2.<init>((int) r3, (int) r4, (int) r6)
            r5.add(r2)
            if (r1 == 0) goto L_0x049e
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r2 = 2
            r0 = r0[r2]
            r1.<init>((int) r3, (int) r0, (int) r6)
            r5.add(r1)
            goto L_0x04a8
        L_0x049e:
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r0 = r0[r6]
            r1.<init>((int) r3, (int) r0, (int) r6)
            r5.add(r1)
        L_0x04a8:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = r1 + -21
            r3 = 10
            if (r2 >= r3) goto L_0x04df
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            int[] r3 = f237613v
            r4 = 0
            r6 = r3[r4]
            int r6 = r6 + r2
            r4 = 661(0x295, float:9.26E-43)
            r7 = 1
            r1.<init>((int) r4, (int) r6, (int) r7)
            r5.add(r1)
            if (r0 == 0) goto L_0x04d2
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r1 = 2
            r1 = r3[r1]
            int r1 = r1 + r2
            r0.<init>((int) r4, (int) r1, (int) r7)
            r5.add(r0)
            goto L_0x04dd
        L_0x04d2:
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r1 = r3[r7]
            int r1 = r1 + r2
            r0.<init>((int) r4, (int) r1, (int) r7)
            r5.add(r0)
        L_0x04dd:
            r2 = 0
            goto L_0x0522
        L_0x04df:
            if (r2 < r3) goto L_0x0513
            r3 = 20
            if (r2 >= r3) goto L_0x0513
            int r2 = r2 + -10
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            int[] r3 = f237614w
            r4 = 0
            r6 = r3[r4]
            int r6 = r6 + r2
            r4 = 661(0x295, float:9.26E-43)
            r8 = 1
            r1.<init>((int) r4, (int) r6, (int) r8)
            r5.add(r1)
            if (r0 == 0) goto L_0x0507
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r1 = 2
            r1 = r3[r1]
            int r1 = r1 + r2
            r0.<init>((int) r4, (int) r1, (int) r8)
            r5.add(r0)
            goto L_0x04dd
        L_0x0507:
            com.tencent.mars.smc.IDKey r0 = new com.tencent.mars.smc.IDKey
            r1 = r3[r8]
            int r1 = r1 + r2
            r0.<init>((int) r4, (int) r1, (int) r8)
            r5.add(r0)
            goto L_0x04dd
        L_0x0513:
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "Api level is too high, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r1, r0)
        L_0x0522:
            kj2.d r0 = kj2.C117407d.INSTANCE
            r0.mo160124a(r5, r2)
            long r0 = java.lang.System.currentTimeMillis()
            f237592a = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = r18
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            long r1 = f237592a
            r3 = r19
            android.content.SharedPreferences$Editor r0 = r0.putLong(r3, r1)
            r0.commit()
        L_0x0546:
            return
        L_0x0547:
            r0 = move-exception
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.C80830r.m98680a():void");
    }
}
