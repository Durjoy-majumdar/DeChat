package hd0;

/* renamed from: hd0.p0 */
public class C8508p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f27539d;

    /* renamed from: e */
    public final /* synthetic */ String f27540e;

    /* renamed from: f */
    public final /* synthetic */ String f27541f;

    public C8508p0(C98410o0 o0Var, String str, String str2, String str3) {
        this.f27539d = str;
        this.f27540e = str2;
        this.f27541f = str3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:11|12|13|14|15|16|(5:17|18|(1:20)|21|(1:50)(4:24|(3:26|(2:28|52)(1:53)|29)|51|30))|23|39|40|41|42|43|(2:46|47)(2:48|49)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00e8 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r1 = r18
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r0 = r1.f27539d
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            int r5 = (int) r4
            java.lang.String r0 = r1.f27540e
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            int r4 = (int) r6
            r0 = 5
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r8 = 0
            r6[r8] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r9 = 1
            r6[r9] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r10 = 2
            r6[r10] = r7
            java.lang.String r7 = r1.f27539d
            r11 = 3
            r6[r11] = r7
            java.lang.String r7 = r1.f27540e
            r12 = 4
            r6[r12] = r7
            java.lang.String r7 = "MicroMsg.VideoInfoStorage"
            java.lang.String r13 = "checkVideoHashByteDiff now:%s size:%s,%s path:%s,%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r13, r6)
            java.lang.String r6 = ""
            r13 = 12696(0x3198, float:1.7791E-41)
            if (r4 == r5) goto L_0x0089
            if (r4 > 0) goto L_0x0048
            r2 = 10
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            int r2 = r2 + 106
            if (r5 > 0) goto L_0x0050
            r3 = 20
            goto L_0x0051
        L_0x0050:
            r3 = 0
        L_0x0051:
            int r2 = r2 + r3
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r8] = r2
            java.lang.String r2 = r1.f27541f
            r0[r9] = r2
            r0[r10] = r6
            r0[r11] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0[r12] = r2
            r3.mo160131h(r13, r0)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0[r9] = r2
            java.lang.String r2 = r1.f27539d
            r0[r10] = r2
            java.lang.String r2 = r1.f27540e
            r0[r11] = r2
            java.lang.String r2 = "checkVideoHashByteDiff Err File Size diff %d,%d path:%s org:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r0)
            return
        L_0x0089:
            r14 = 0
            java.lang.String r0 = r1.f27539d     // Catch:{ Exception -> 0x00cc }
            java.io.InputStream r15 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r0 = r1.f27540e     // Catch:{ Exception -> 0x00c7 }
            java.io.InputStream r14 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ Exception -> 0x00c7 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r0]     // Catch:{ Exception -> 0x00c7 }
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x00c7 }
            r16 = 0
            r17 = 0
        L_0x00a0:
            int r11 = r15.read(r13)     // Catch:{ Exception -> 0x00c2 }
            int r10 = r14.read(r0)     // Catch:{ Exception -> 0x00c2 }
            if (r11 == r10) goto L_0x00ac
            r17 = 1
        L_0x00ac:
            r10 = -1
            if (r11 != r10) goto L_0x00b0
            goto L_0x00e3
        L_0x00b0:
            r10 = 0
        L_0x00b1:
            if (r10 >= r11) goto L_0x00c0
            byte r12 = r13[r10]     // Catch:{ Exception -> 0x00c2 }
            byte r8 = r0[r10]     // Catch:{ Exception -> 0x00c2 }
            if (r12 == r8) goto L_0x00bb
            int r16 = r16 + 1
        L_0x00bb:
            int r10 = r10 + 1
            r8 = 0
            r12 = 4
            goto L_0x00b1
        L_0x00c0:
            r10 = 2
            goto L_0x00a0
        L_0x00c2:
            r0 = move-exception
            r8 = r0
            r0 = r14
            r14 = r15
            goto L_0x00d1
        L_0x00c7:
            r0 = move-exception
            r8 = r0
            r0 = r14
            r14 = r15
            goto L_0x00cf
        L_0x00cc:
            r0 = move-exception
            r8 = r0
            r0 = r14
        L_0x00cf:
            r16 = 0
        L_0x00d1:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r8)
            r11 = 0
            r10[r11] = r8
            java.lang.String r8 = "checkVideoHashByteDiff Err e:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r10)
            r15 = r14
            r17 = 1
            r14 = r0
        L_0x00e3:
            r0 = r16
            r14.close()     // Catch:{ Exception -> 0x00e8 }
        L_0x00e8:
            r15.close()     // Catch:{ Exception -> 0x00ec }
            goto L_0x00ed
        L_0x00ec:
        L_0x00ed:
            if (r17 == 0) goto L_0x0125
            r8 = 4
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r3 = 0
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0[r9] = r2
            java.lang.String r2 = r1.f27539d
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = r1.f27540e
            r4 = 3
            r0[r4] = r2
            java.lang.String r2 = "checkVideoHashByteDiff Read Failed! size:%s,%s path:%s,%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r3 = 107(0x6b, float:1.5E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = r1.f27541f
            r2[r9] = r3
            r3 = 12696(0x3198, float:1.7791E-41)
            r0.mo160131h(r3, r2)
            return
        L_0x0125:
            r4 = 0
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r2)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 4
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r8 = 400(0x190, float:5.6E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10[r4] = r8
            java.lang.String r4 = r1.f27541f
            r10[r9] = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r6 = 2
            r10[r6] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            r8 = 3
            r10[r8] = r4
            r4 = 12696(0x3198, float:1.7791E-41)
            r5.mo160131h(r4, r10)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 0
            r4[r3] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r9] = r0
            java.lang.String r0 = r1.f27539d
            r4[r6] = r0
            java.lang.String r0 = r1.f27540e
            r4[r8] = r0
            java.lang.String r0 = "checkVideoHashByteDiff time:%s diff:%s check:%s org:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C8508p0.run():void");
    }
}
