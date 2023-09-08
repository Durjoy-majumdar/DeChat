package zu0;

import lu3.C88656g;

/* renamed from: zu0.l */
public class C103088l implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ boolean f304165d;

    /* renamed from: e */
    public final /* synthetic */ C103090n f304166e;

    public C103088l(C103090n nVar, boolean z) {
        this.f304166e = nVar;
        this.f304165d = z;
    }

    public String getKey() {
        return "BackupRecoverMerger";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:110|111|103|148|149|(0)(0)|153|(0)|155|157|(0)|160|161|162|163|164|165) */
    /* JADX WARNING: Can't wrap try/catch for region: R(20:76|77|78|79|(1:81)(1:82)|83|84|85|(1:88)|87|89|(1:91)|92|95|96|97|98|99|198|144) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:140|141|142|143|197) */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r0 = r1.f304166e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0410, code lost:
        if (r19 > 0) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0412, code lost:
        r8 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0415, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0417, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r0.f304178k += r8;
        r0 = r0.f304171d.size();
        r1.f304166e.f304171d.add((java.lang.String) r1.f304166e.f304170c.get(r7));
        r5 = r1.f304166e;
        r5.f304174g++;
        r5.f304176i.mo142622e().mo142628f(r11);
        r5 = r1.f304166e.f304176i.mo142622e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0465, code lost:
        if (r1.f304166e.f304174g <= r1.f304166e.f304173f) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x046a, code lost:
        r22 = (r1.f304166e.f304174g * 100) / r1.f304166e.f304173f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x047b, code lost:
        r5.mo142625c((int) r22);
        r1.f304166e.mo142820B(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x048e, code lost:
        if (r1.f304166e.f304171d.size() > r0) goto L_0x0490;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0490, code lost:
        r1.f304166e.f304182o.mo126604u(r1.f304166e.f304171d.size());
        r1.f304166e.f304181n.encode(r12, r1.f304166e.f304182o.mo1005p());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04b6, code lost:
        zu0.C103090n.m136350q(r1.f304166e).mo142828b();
        r1.f304166e.mo142819A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04c5, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        java.lang.Thread.sleep(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        r0 = new java.lang.Object[r14];
        r0[0] = r7;
        r0[r13] = java.lang.Long.valueOf(r1.f304166e.f304174g);
        r0[2] = java.lang.Integer.valueOf(r1.f304166e.f304171d.size());
        r0[3] = java.lang.Long.valueOf(r19);
        r0[4] = java.lang.Long.valueOf(r1.f304166e.f304178k);
        r0[5] = java.lang.Long.valueOf(com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r24));
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.BackupRecoverMerger", "startMergeImpl msgDataId[%s] merge finish, transferMsgList[%d], transferSessions[%d], msgListMsgCount:%d, receiveMsgCount:%d, costTime:%d", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x051e, code lost:
        r8 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0521, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0574, code lost:
        r22 = (r1.f304166e.f304174g * 100) / r1.f304166e.f304173f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x059a, code lost:
        r1.f304166e.f304182o.mo126604u(r1.f304166e.f304171d.size());
        r1.f304166e.f304181n.encode(r12, r1.f304166e.f304182o.mo1005p());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x07d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x07d6, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.BackupRecoverMerger", r0, "Backup exit.", new java.lang.Object[0]);
        r1.f304166e.mo142820B(-24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0293, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0294, code lost:
        r12 = r33;
        r11 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02a3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02a4, code lost:
        r12 = r33;
        r11 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02b0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02b1, code lost:
        r12 = r33;
        r11 = 26;
        r13 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02b6, code lost:
        r14 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02b8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02b9, code lost:
        r12 = r33;
        r11 = 26;
        r13 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02c0, code lost:
        r19 = r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x04c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x04c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x05ce */
    /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x05d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x024d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0387 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x038a */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x040a A[SYNTHETIC, Splitter:B:122:0x040a] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0514 A[EDGE_INSN: B:145:0x0514->B:146:? ?: BREAK  , SYNTHETIC, Splitter:B:145:0x0514] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x051e A[Catch:{ Exception -> 0x05ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0521 A[Catch:{ Exception -> 0x05ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0574 A[Catch:{ Exception -> 0x05ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x059a A[Catch:{ Exception -> 0x05ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02a3 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:36:0x0140] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02b0 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:31:0x0131] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r34 = this;
            r1 = r34
            java.lang.String r2 = "MMKV_BACKUP_TRY_TIME"
            java.lang.String r3 = "startMergeImpl msgDataId[%s] merge finish, transferMsgList[%d], transferSessions[%d], msgListMsgCount:%d, receiveMsgCount:%d, costTime:%d"
            java.lang.String r4 = "MicroMsg.BackupRecoverMerger"
            r5 = 0
            zu0.C103092u.f304189a = r5     // Catch:{ b -> 0x07d5 }
            zu0.C103092u.f304190b = r5     // Catch:{ b -> 0x07d5 }
            zu0.C103092u.f304191c = r5     // Catch:{ b -> 0x07d5 }
            zu0.C103092u.f304192d = r5     // Catch:{ b -> 0x07d5 }
            zu0.C103092u.f304193e = r5     // Catch:{ b -> 0x07d5 }
            zu0.C103092u.f304194f = r5     // Catch:{ b -> 0x07d5 }
            zu0.C103092u.f304195g = r5     // Catch:{ b -> 0x07d5 }
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ b -> 0x07d5 }
            zu0.C103092u.f304196h = r6     // Catch:{ b -> 0x07d5 }
            r8 = 0
            long r6 = r6 - r8
            zu0.C103092u.f304197i = r6     // Catch:{ b -> 0x07d5 }
            zu0.C103092u.m136364a()     // Catch:{ b -> 0x07d5 }
            boolean r0 = yu0.C102913k.f303764a     // Catch:{ b -> 0x07d5 }
            if (r0 == 0) goto L_0x0054
            boolean r0 = r1.f304165d     // Catch:{ b -> 0x07d5 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = yu0.C102913k.m136052q()     // Catch:{ b -> 0x07d5 }
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ b -> 0x07d5 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = yu0.C102913k.m136052q()     // Catch:{ b -> 0x07d5 }
            java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r5)     // Catch:{ b -> 0x07d5 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = yu0.C102913k.m136051p()     // Catch:{ b -> 0x07d5 }
            yu0.C102913k.m136047l(r0)     // Catch:{ b -> 0x07d5 }
            java.lang.String r0 = yu0.C102913k.m136052q()     // Catch:{ b -> 0x07d5 }
            java.lang.String r6 = yu0.C102913k.m136051p()     // Catch:{ b -> 0x07d5 }
            com.tencent.p014mm.vfs.C86013q1.m106441b(r0, r6)     // Catch:{ b -> 0x07d5 }
        L_0x0054:
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ b -> 0x07d5 }
            r6.<init>()     // Catch:{ b -> 0x07d5 }
            hv0.e r0 = hv0.C98544e.m128035f()     // Catch:{ b -> 0x07d5 }
            hv0.c r0 = r0.mo137901e()     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.storage.v1 r0 = r0.mo137894b()     // Catch:{ b -> 0x07d5 }
            r7 = 2
            java.lang.Object r0 = r0.mo119683d(r7)     // Catch:{ b -> 0x07d5 }
            r17 = r0
            java.lang.String r17 = (java.lang.String) r17     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r0 = r0.f304182o     // Catch:{ b -> 0x07d5 }
            zu0.n r10 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r10 = r10.f304177j     // Catch:{ b -> 0x07d5 }
            r0.mo126605v(r10)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r0 = r0.f304182o     // Catch:{ b -> 0x07d5 }
            r15 = 1
            r0.mo126602s(r15)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r0 = r0.f304182o     // Catch:{ b -> 0x07d5 }
            zu0.n r10 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = r10.f304181n     // Catch:{ b -> 0x07d5 }
            int r10 = r10.getInt(r2, r5)     // Catch:{ b -> 0x07d5 }
            r0.mo126603t(r10)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r0 = r0.f304182o     // Catch:{ b -> 0x07d5 }
            zu0.n r10 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r10 = r10.f304172e     // Catch:{ b -> 0x07d5 }
            r0.mo126606w(r10)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            java.util.HashMap r0 = r0.f304170c     // Catch:{ b -> 0x07d5 }
            java.util.Set r0 = r0.keySet()     // Catch:{ b -> 0x07d5 }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ b -> 0x07d5 }
            r19 = r8
        L_0x00b9:
            boolean r0 = r18.hasNext()     // Catch:{ b -> 0x07d5 }
            java.lang.String r14 = "MMKV_BACKUP_ERROR_CACHE"
            r21 = 3
            r22 = 100
            if (r0 == 0) goto L_0x0615
            java.lang.Object r0 = r18.next()     // Catch:{ b -> 0x07d5 }
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ b -> 0x07d5 }
            long r24 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ b -> 0x07d5 }
            r26 = 10
            r28 = 1
            r8 = 5
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            r0.mo142825y()     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            zu0.n$a r0 = zu0.C103090n.m136350q(r0)     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            r0.mo142827a()     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            r0.<init>()     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            java.lang.String r9 = yu0.C102913k.m136049n(r12)     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            r0.append(r9)     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            r0.append(r12)     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            com.tencent.mm.pointers.PString r9 = new com.tencent.mm.pointers.PString     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            r9.<init>()     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            com.tencent.mm.pointers.PBool r16 = new com.tencent.mm.pointers.PBool     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            r16.<init>()     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            android.util.Pair r13 = new android.util.Pair     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            com.tencent.mm.pointers.PLong r10 = new com.tencent.mm.pointers.PLong     // Catch:{ Exception -> 0x03f6, all -> 0x03f2 }
            r32 = r12
            r11 = -1
            r10.<init>(r11)     // Catch:{ Exception -> 0x03ed, all -> 0x03e8 }
            com.tencent.mm.pointers.PLong r15 = new com.tencent.mm.pointers.PLong     // Catch:{ Exception -> 0x03ed, all -> 0x03e8 }
            r15.<init>(r11)     // Catch:{ Exception -> 0x03ed, all -> 0x03e8 }
            r13.<init>(r10, r15)     // Catch:{ Exception -> 0x03ed, all -> 0x03e8 }
            zu0.n r10 = r1.f304166e     // Catch:{ Exception -> 0x03ed, all -> 0x03e8 }
            r15 = 6
            r12 = 26
            r11 = r0
            r7 = r32
            r12 = r6
            r33 = r14
            r14 = r17
            r15 = r9
            int r0 = zu0.C103090n.m136351r(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x03e6, all -> 0x03e4 }
            long r9 = (long) r0
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x03da, all -> 0x03cf }
            boolean r0 = r0.f304168a     // Catch:{ Exception -> 0x03da, all -> 0x03cf }
            if (r0 == 0) goto L_0x02c4
            java.lang.String r0 = "startMergeImpl cancel, msgDataId[%s], transferMsgList[%d], totalMsgList[%d], transferSessions[%d], totalSession[%d]"
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x02b0, all -> 0x02b8 }
            r11[r5] = r7     // Catch:{ Exception -> 0x02b0, all -> 0x02a9 }
            zu0.n r12 = r1.f304166e     // Catch:{ Exception -> 0x02b0, all -> 0x02a9 }
            long r12 = r12.f304174g     // Catch:{ Exception -> 0x02b0, all -> 0x02a9 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x02b0, all -> 0x02a9 }
            r13 = 1
            r11[r13] = r12     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            zu0.n r12 = r1.f304166e     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            long r14 = r12.f304173f     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            java.lang.Long r12 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            r14 = 2
            r11[r14] = r12     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            zu0.n r12 = r1.f304166e     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            java.util.HashSet r12 = r12.f304171d     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            int r12 = r12.size()     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            r11[r21] = r12     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            zu0.n r12 = r1.f304166e     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            int r12 = r12.f304172e     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            r14 = 4
            r11[r14] = r12     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r11)     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            zu0.n$a r0 = zu0.C103090n.m136350q(r0)     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            r0.mo142828b()     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            r0.mo142819A()     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            hv0.C98543d.m128030a(r6)     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            boolean r11 = r0.f304185r     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            zu0.n r12 = r1.f304166e     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            int r12 = r12.f304186s     // Catch:{ Exception -> 0x02a3, all -> 0x029d }
            zu0.C103090n.m136339f(r0, r11, r12)     // Catch:{ Exception -> 0x02a3, all -> 0x0293 }
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            r11 = 0
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x019a
            r30 = r9
            goto L_0x019c
        L_0x019a:
            r30 = 0
        L_0x019c:
            long r11 = r0.f304178k     // Catch:{ Exception -> 0x024d }
            long r11 = r11 + r30
            r0.f304178k = r11     // Catch:{ Exception -> 0x024d }
            java.util.HashSet r0 = r0.f304171d     // Catch:{ Exception -> 0x024d }
            int r0 = r0.size()     // Catch:{ Exception -> 0x024d }
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            java.util.HashSet r2 = r2.f304171d     // Catch:{ Exception -> 0x024d }
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            java.util.HashMap r6 = r6.f304170c     // Catch:{ Exception -> 0x024d }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x024d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x024d }
            r2.add(r6)     // Catch:{ Exception -> 0x024d }
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            long r11 = r2.f304174g     // Catch:{ Exception -> 0x024d }
            long r11 = r11 + r28
            r2.f304174g = r11     // Catch:{ Exception -> 0x024d }
            yu0.f r2 = r2.f304176i     // Catch:{ Exception -> 0x024d }
            yu0.g r2 = r2.mo142622e()     // Catch:{ Exception -> 0x024d }
            r11 = 26
            r2.mo142628f(r11)     // Catch:{ Exception -> 0x024d }
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            yu0.f r2 = r2.f304176i     // Catch:{ Exception -> 0x024d }
            yu0.g r2 = r2.mo142622e()     // Catch:{ Exception -> 0x024d }
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            long r15 = r6.f304174g     // Catch:{ Exception -> 0x024d }
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            long r17 = r6.f304173f     // Catch:{ Exception -> 0x024d }
            int r6 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r6 <= 0) goto L_0x01f1
        L_0x01ee:
            r14 = r22
            goto L_0x0202
        L_0x01f1:
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            long r15 = r6.f304174g     // Catch:{ Exception -> 0x024d }
            long r15 = r15 * r22
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            long r17 = r6.f304173f     // Catch:{ Exception -> 0x024d }
            long r22 = r15 / r17
            goto L_0x01ee
        L_0x0202:
            int r6 = (int) r14     // Catch:{ Exception -> 0x024d }
            r2.mo142625c(r6)     // Catch:{ Exception -> 0x024d }
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            r2.mo142820B(r11)     // Catch:{ Exception -> 0x024d }
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            java.util.HashSet r2 = r2.f304171d     // Catch:{ Exception -> 0x024d }
            int r2 = r2.size()     // Catch:{ Exception -> 0x024d }
            if (r2 <= r0) goto L_0x023f
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r0 = r0.f304182o     // Catch:{ Exception -> 0x024d }
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            java.util.HashSet r2 = r2.f304171d     // Catch:{ Exception -> 0x024d }
            int r2 = r2.size()     // Catch:{ Exception -> 0x024d }
            r0.mo126604u(r2)     // Catch:{ Exception -> 0x024d }
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.f304181n     // Catch:{ Exception -> 0x024d }
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r2 = r2.f304182o     // Catch:{ Exception -> 0x024d }
            java.lang.String r2 = r2.mo1005p()     // Catch:{ Exception -> 0x024d }
            r12 = r33
            r0.encode((java.lang.String) r12, (java.lang.String) r2)     // Catch:{ Exception -> 0x024d }
        L_0x023f:
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            zu0.n$a r0 = zu0.C103090n.m136350q(r0)     // Catch:{ Exception -> 0x024d }
            r0.mo142828b()     // Catch:{ Exception -> 0x024d }
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x024d }
            r0.mo142819A()     // Catch:{ Exception -> 0x024d }
        L_0x024d:
            java.lang.Thread.sleep(r26)     // Catch:{ InterruptedException -> 0x0250 }
        L_0x0250:
            r14 = 6
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ b -> 0x07d5 }
            r0[r5] = r7     // Catch:{ b -> 0x07d5 }
            zu0.n r2 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r6 = r2.f304174g     // Catch:{ b -> 0x07d5 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ b -> 0x07d5 }
            r0[r13] = r2     // Catch:{ b -> 0x07d5 }
            zu0.n r2 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            java.util.HashSet r2 = r2.f304171d     // Catch:{ b -> 0x07d5 }
            int r2 = r2.size()     // Catch:{ b -> 0x07d5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ b -> 0x07d5 }
            r6 = 2
            r0[r6] = r2     // Catch:{ b -> 0x07d5 }
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ b -> 0x07d5 }
            r0[r21] = r2     // Catch:{ b -> 0x07d5 }
            zu0.n r2 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r6 = r2.f304178k     // Catch:{ b -> 0x07d5 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ b -> 0x07d5 }
            r6 = 4
            r0[r6] = r2     // Catch:{ b -> 0x07d5 }
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r24)     // Catch:{ b -> 0x07d5 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ b -> 0x07d5 }
            r0[r8] = r2     // Catch:{ b -> 0x07d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r0)     // Catch:{ b -> 0x07d5 }
            return
        L_0x0293:
            r0 = move-exception
            r12 = r33
            r11 = 26
            goto L_0x02be
        L_0x0299:
            r19 = r9
            goto L_0x0516
        L_0x029d:
            r0 = move-exception
            r12 = r33
            r11 = 26
            goto L_0x02be
        L_0x02a3:
            r0 = move-exception
            r12 = r33
            r11 = 26
            goto L_0x02b6
        L_0x02a9:
            r0 = move-exception
            r12 = r33
            r11 = 26
            r13 = 1
            goto L_0x02be
        L_0x02b0:
            r0 = move-exception
            r12 = r33
            r11 = 26
            r13 = 1
        L_0x02b6:
            r14 = 6
            goto L_0x02c0
        L_0x02b8:
            r0 = move-exception
            r12 = r33
            r11 = 26
            r13 = 1
        L_0x02be:
            r14 = 6
            goto L_0x0299
        L_0x02c0:
            r19 = r9
            goto L_0x03fa
        L_0x02c4:
            r12 = r33
            r11 = 26
            r13 = 1
            r14 = 6
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x0385 }
            r15 = 0
            int r19 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r19 <= 0) goto L_0x02d4
            r15 = r9
            goto L_0x02d6
        L_0x02d4:
            r15 = 0
        L_0x02d6:
            r19 = r9
            long r8 = r0.f304178k     // Catch:{ Exception -> 0x0387 }
            long r8 = r8 + r15
            r0.f304178k = r8     // Catch:{ Exception -> 0x0387 }
            java.util.HashSet r0 = r0.f304171d     // Catch:{ Exception -> 0x0387 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0387 }
            zu0.n r8 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            java.util.HashSet r8 = r8.f304171d     // Catch:{ Exception -> 0x0387 }
            zu0.n r9 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            java.util.HashMap r9 = r9.f304170c     // Catch:{ Exception -> 0x0387 }
            java.lang.Object r9 = r9.get(r7)     // Catch:{ Exception -> 0x0387 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0387 }
            r8.add(r9)     // Catch:{ Exception -> 0x0387 }
            zu0.n r8 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            long r9 = r8.f304174g     // Catch:{ Exception -> 0x0387 }
            long r9 = r9 + r28
            r8.f304174g = r9     // Catch:{ Exception -> 0x0387 }
            yu0.f r8 = r8.f304176i     // Catch:{ Exception -> 0x0387 }
            yu0.g r8 = r8.mo142622e()     // Catch:{ Exception -> 0x0387 }
            r8.mo142628f(r11)     // Catch:{ Exception -> 0x0387 }
            zu0.n r8 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            yu0.f r8 = r8.f304176i     // Catch:{ Exception -> 0x0387 }
            yu0.g r8 = r8.mo142622e()     // Catch:{ Exception -> 0x0387 }
            zu0.n r9 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            long r9 = r9.f304174g     // Catch:{ Exception -> 0x0387 }
            zu0.n r15 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            long r15 = r15.f304173f     // Catch:{ Exception -> 0x0387 }
            int r28 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r28 <= 0) goto L_0x032a
        L_0x0327:
            r9 = r22
            goto L_0x033b
        L_0x032a:
            zu0.n r9 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            long r9 = r9.f304174g     // Catch:{ Exception -> 0x0387 }
            long r9 = r9 * r22
            zu0.n r15 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            long r15 = r15.f304173f     // Catch:{ Exception -> 0x0387 }
            long r22 = r9 / r15
            goto L_0x0327
        L_0x033b:
            int r10 = (int) r9     // Catch:{ Exception -> 0x0387 }
            r8.mo142625c(r10)     // Catch:{ Exception -> 0x0387 }
            zu0.n r8 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            r8.mo142820B(r11)     // Catch:{ Exception -> 0x0387 }
            zu0.n r8 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            java.util.HashSet r8 = r8.f304171d     // Catch:{ Exception -> 0x0387 }
            int r8 = r8.size()     // Catch:{ Exception -> 0x0387 }
            if (r8 <= r0) goto L_0x0376
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r0 = r0.f304182o     // Catch:{ Exception -> 0x0387 }
            zu0.n r8 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            java.util.HashSet r8 = r8.f304171d     // Catch:{ Exception -> 0x0387 }
            int r8 = r8.size()     // Catch:{ Exception -> 0x0387 }
            r0.mo126604u(r8)     // Catch:{ Exception -> 0x0387 }
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.f304181n     // Catch:{ Exception -> 0x0387 }
            zu0.n r8 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r8 = r8.f304182o     // Catch:{ Exception -> 0x0387 }
            java.lang.String r8 = r8.mo1005p()     // Catch:{ Exception -> 0x0387 }
            r0.encode((java.lang.String) r12, (java.lang.String) r8)     // Catch:{ Exception -> 0x0387 }
        L_0x0376:
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            zu0.n$a r0 = zu0.C103090n.m136350q(r0)     // Catch:{ Exception -> 0x0387 }
            r0.mo142828b()     // Catch:{ Exception -> 0x0387 }
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x0387 }
            r0.mo142819A()     // Catch:{ Exception -> 0x0387 }
            goto L_0x0387
        L_0x0385:
            r19 = r9
        L_0x0387:
            java.lang.Thread.sleep(r26)     // Catch:{ InterruptedException -> 0x038a }
        L_0x038a:
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ b -> 0x07d5 }
            r0[r5] = r7     // Catch:{ b -> 0x07d5 }
            zu0.n r7 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r7 = r7.f304174g     // Catch:{ b -> 0x07d5 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ b -> 0x07d5 }
            r0[r13] = r7     // Catch:{ b -> 0x07d5 }
            zu0.n r7 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            java.util.HashSet r7 = r7.f304171d     // Catch:{ b -> 0x07d5 }
            int r7 = r7.size()     // Catch:{ b -> 0x07d5 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ b -> 0x07d5 }
            r8 = 2
            r0[r8] = r7     // Catch:{ b -> 0x07d5 }
            java.lang.Long r7 = java.lang.Long.valueOf(r19)     // Catch:{ b -> 0x07d5 }
            r0[r21] = r7     // Catch:{ b -> 0x07d5 }
            zu0.n r7 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r7 = r7.f304178k     // Catch:{ b -> 0x07d5 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ b -> 0x07d5 }
            r8 = 4
            r0[r8] = r7     // Catch:{ b -> 0x07d5 }
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r24)     // Catch:{ b -> 0x07d5 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ b -> 0x07d5 }
            r8 = 5
            r0[r8] = r7     // Catch:{ b -> 0x07d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r0)     // Catch:{ b -> 0x07d5 }
            r15 = r6
            goto L_0x050c
        L_0x03cf:
            r0 = move-exception
            r19 = r9
        L_0x03d2:
            r12 = r33
        L_0x03d4:
            r11 = 26
            r13 = 1
            r14 = 6
            goto L_0x0516
        L_0x03da:
            r0 = move-exception
            r19 = r9
        L_0x03dd:
            r12 = r33
        L_0x03df:
            r11 = 26
            r13 = 1
            r14 = 6
            goto L_0x03fa
        L_0x03e4:
            r0 = move-exception
            goto L_0x03d2
        L_0x03e6:
            r0 = move-exception
            goto L_0x03dd
        L_0x03e8:
            r0 = move-exception
            r12 = r14
            r7 = r32
            goto L_0x03d4
        L_0x03ed:
            r0 = move-exception
            r12 = r14
            r7 = r32
            goto L_0x03df
        L_0x03f2:
            r0 = move-exception
            r7 = r12
            r12 = r14
            goto L_0x03d4
        L_0x03f6:
            r0 = move-exception
            r7 = r12
            r12 = r14
            goto L_0x03df
        L_0x03fa:
            java.lang.String r8 = "startMergeImpl msgDataId[%s] error"
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ all -> 0x0515 }
            r9[r5] = r7     // Catch:{ all -> 0x0515 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r8, r9)     // Catch:{ all -> 0x0515 }
            boolean r8 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ all -> 0x0515 }
            if (r8 != 0) goto L_0x0514
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x04c5 }
            r8 = 0
            int r10 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0415
            r8 = r19
            goto L_0x0417
        L_0x0415:
            r8 = 0
        L_0x0417:
            r15 = r6
            long r5 = r0.f304178k     // Catch:{ Exception -> 0x04c6 }
            long r5 = r5 + r8
            r0.f304178k = r5     // Catch:{ Exception -> 0x04c6 }
            java.util.HashSet r0 = r0.f304171d     // Catch:{ Exception -> 0x04c6 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x04c6 }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            java.util.HashSet r5 = r5.f304171d     // Catch:{ Exception -> 0x04c6 }
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            java.util.HashMap r6 = r6.f304170c     // Catch:{ Exception -> 0x04c6 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x04c6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x04c6 }
            r5.add(r6)     // Catch:{ Exception -> 0x04c6 }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            long r8 = r5.f304174g     // Catch:{ Exception -> 0x04c6 }
            long r8 = r8 + r28
            r5.f304174g = r8     // Catch:{ Exception -> 0x04c6 }
            yu0.f r5 = r5.f304176i     // Catch:{ Exception -> 0x04c6 }
            yu0.g r5 = r5.mo142622e()     // Catch:{ Exception -> 0x04c6 }
            r5.mo142628f(r11)     // Catch:{ Exception -> 0x04c6 }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            yu0.f r5 = r5.f304176i     // Catch:{ Exception -> 0x04c6 }
            yu0.g r5 = r5.mo142622e()     // Catch:{ Exception -> 0x04c6 }
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            long r8 = r6.f304174g     // Catch:{ Exception -> 0x04c6 }
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            long r28 = r6.f304173f     // Catch:{ Exception -> 0x04c6 }
            int r6 = (r8 > r28 ? 1 : (r8 == r28 ? 0 : -1))
            if (r6 <= 0) goto L_0x046a
        L_0x0467:
            r8 = r22
            goto L_0x047b
        L_0x046a:
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            long r8 = r6.f304174g     // Catch:{ Exception -> 0x04c6 }
            long r8 = r8 * r22
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            long r22 = r6.f304173f     // Catch:{ Exception -> 0x04c6 }
            long r22 = r8 / r22
            goto L_0x0467
        L_0x047b:
            int r6 = (int) r8     // Catch:{ Exception -> 0x04c6 }
            r5.mo142625c(r6)     // Catch:{ Exception -> 0x04c6 }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            r5.mo142820B(r11)     // Catch:{ Exception -> 0x04c6 }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            java.util.HashSet r5 = r5.f304171d     // Catch:{ Exception -> 0x04c6 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x04c6 }
            if (r5 <= r0) goto L_0x04b6
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r0 = r0.f304182o     // Catch:{ Exception -> 0x04c6 }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            java.util.HashSet r5 = r5.f304171d     // Catch:{ Exception -> 0x04c6 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x04c6 }
            r0.mo126604u(r5)     // Catch:{ Exception -> 0x04c6 }
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.f304181n     // Catch:{ Exception -> 0x04c6 }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r5 = r5.f304182o     // Catch:{ Exception -> 0x04c6 }
            java.lang.String r5 = r5.mo1005p()     // Catch:{ Exception -> 0x04c6 }
            r0.encode((java.lang.String) r12, (java.lang.String) r5)     // Catch:{ Exception -> 0x04c6 }
        L_0x04b6:
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            zu0.n$a r0 = zu0.C103090n.m136350q(r0)     // Catch:{ Exception -> 0x04c6 }
            r0.mo142828b()     // Catch:{ Exception -> 0x04c6 }
            zu0.n r0 = r1.f304166e     // Catch:{ Exception -> 0x04c6 }
            r0.mo142819A()     // Catch:{ Exception -> 0x04c6 }
            goto L_0x04c6
        L_0x04c5:
            r15 = r6
        L_0x04c6:
            java.lang.Thread.sleep(r26)     // Catch:{ InterruptedException -> 0x04c9 }
        L_0x04c9:
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ b -> 0x07d5 }
            r5 = 0
            r0[r5] = r7     // Catch:{ b -> 0x07d5 }
            zu0.n r5 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r5 = r5.f304174g     // Catch:{ b -> 0x07d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r0[r13] = r5     // Catch:{ b -> 0x07d5 }
            zu0.n r5 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            java.util.HashSet r5 = r5.f304171d     // Catch:{ b -> 0x07d5 }
            int r5 = r5.size()     // Catch:{ b -> 0x07d5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r6 = 2
            r0[r6] = r5     // Catch:{ b -> 0x07d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r19)     // Catch:{ b -> 0x07d5 }
            r0[r21] = r5     // Catch:{ b -> 0x07d5 }
            zu0.n r5 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r5 = r5.f304178k     // Catch:{ b -> 0x07d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r6 = 4
            r0[r6] = r5     // Catch:{ b -> 0x07d5 }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r24)     // Catch:{ b -> 0x07d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r6 = 5
            r0[r6] = r5     // Catch:{ b -> 0x07d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r0)     // Catch:{ b -> 0x07d5 }
        L_0x050c:
            r6 = r15
            r5 = 0
            r7 = 2
            r8 = 0
            r15 = 1
            goto L_0x00b9
        L_0x0514:
            throw r0     // Catch:{ all -> 0x0515 }
        L_0x0515:
            r0 = move-exception
        L_0x0516:
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            r5 = 0
            int r8 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0521
            r8 = r19
            goto L_0x0522
        L_0x0521:
            r8 = r5
        L_0x0522:
            long r5 = r2.f304178k     // Catch:{ Exception -> 0x05ce }
            long r5 = r5 + r8
            r2.f304178k = r5     // Catch:{ Exception -> 0x05ce }
            java.util.HashSet r2 = r2.f304171d     // Catch:{ Exception -> 0x05ce }
            int r2 = r2.size()     // Catch:{ Exception -> 0x05ce }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            java.util.HashSet r5 = r5.f304171d     // Catch:{ Exception -> 0x05ce }
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            java.util.HashMap r6 = r6.f304170c     // Catch:{ Exception -> 0x05ce }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x05ce }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x05ce }
            r5.add(r6)     // Catch:{ Exception -> 0x05ce }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            long r8 = r5.f304174g     // Catch:{ Exception -> 0x05ce }
            long r8 = r8 + r28
            r5.f304174g = r8     // Catch:{ Exception -> 0x05ce }
            yu0.f r5 = r5.f304176i     // Catch:{ Exception -> 0x05ce }
            yu0.g r5 = r5.mo142622e()     // Catch:{ Exception -> 0x05ce }
            r5.mo142628f(r11)     // Catch:{ Exception -> 0x05ce }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            yu0.f r5 = r5.f304176i     // Catch:{ Exception -> 0x05ce }
            yu0.g r5 = r5.mo142622e()     // Catch:{ Exception -> 0x05ce }
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            long r8 = r6.f304174g     // Catch:{ Exception -> 0x05ce }
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            long r15 = r6.f304173f     // Catch:{ Exception -> 0x05ce }
            int r6 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r6 <= 0) goto L_0x0574
        L_0x0571:
            r8 = r22
            goto L_0x0585
        L_0x0574:
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            long r8 = r6.f304174g     // Catch:{ Exception -> 0x05ce }
            long r8 = r8 * r22
            zu0.n r6 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            long r15 = r6.f304173f     // Catch:{ Exception -> 0x05ce }
            long r22 = r8 / r15
            goto L_0x0571
        L_0x0585:
            int r6 = (int) r8     // Catch:{ Exception -> 0x05ce }
            r5.mo142625c(r6)     // Catch:{ Exception -> 0x05ce }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            r5.mo142820B(r11)     // Catch:{ Exception -> 0x05ce }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            java.util.HashSet r5 = r5.f304171d     // Catch:{ Exception -> 0x05ce }
            int r5 = r5.size()     // Catch:{ Exception -> 0x05ce }
            if (r5 <= r2) goto L_0x05c0
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r2 = r2.f304182o     // Catch:{ Exception -> 0x05ce }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            java.util.HashSet r5 = r5.f304171d     // Catch:{ Exception -> 0x05ce }
            int r5 = r5.size()     // Catch:{ Exception -> 0x05ce }
            r2.mo126604u(r5)     // Catch:{ Exception -> 0x05ce }
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r2.f304181n     // Catch:{ Exception -> 0x05ce }
            zu0.n r5 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct r5 = r5.f304182o     // Catch:{ Exception -> 0x05ce }
            java.lang.String r5 = r5.mo1005p()     // Catch:{ Exception -> 0x05ce }
            r2.encode((java.lang.String) r12, (java.lang.String) r5)     // Catch:{ Exception -> 0x05ce }
        L_0x05c0:
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            zu0.n$a r2 = zu0.C103090n.m136350q(r2)     // Catch:{ Exception -> 0x05ce }
            r2.mo142828b()     // Catch:{ Exception -> 0x05ce }
            zu0.n r2 = r1.f304166e     // Catch:{ Exception -> 0x05ce }
            r2.mo142819A()     // Catch:{ Exception -> 0x05ce }
        L_0x05ce:
            java.lang.Thread.sleep(r26)     // Catch:{ InterruptedException -> 0x05d1 }
        L_0x05d1:
            java.lang.Object[] r2 = new java.lang.Object[r14]     // Catch:{ b -> 0x07d5 }
            r5 = 0
            r2[r5] = r7     // Catch:{ b -> 0x07d5 }
            zu0.n r5 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r5 = r5.f304174g     // Catch:{ b -> 0x07d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r2[r13] = r5     // Catch:{ b -> 0x07d5 }
            zu0.n r5 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            java.util.HashSet r5 = r5.f304171d     // Catch:{ b -> 0x07d5 }
            int r5 = r5.size()     // Catch:{ b -> 0x07d5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r6 = 2
            r2[r6] = r5     // Catch:{ b -> 0x07d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r19)     // Catch:{ b -> 0x07d5 }
            r2[r21] = r5     // Catch:{ b -> 0x07d5 }
            zu0.n r5 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r5 = r5.f304178k     // Catch:{ b -> 0x07d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r6 = 4
            r2[r6] = r5     // Catch:{ b -> 0x07d5 }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r24)     // Catch:{ b -> 0x07d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r6 = 5
            r2[r6] = r5     // Catch:{ b -> 0x07d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r2)     // Catch:{ b -> 0x07d5 }
            throw r0     // Catch:{ b -> 0x07d5 }
        L_0x0615:
            r15 = r6
            r12 = r14
            r13 = 1
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            yu0.f r0 = r0.f304176i     // Catch:{ b -> 0x07d5 }
            yu0.g r0 = r0.mo142622e()     // Catch:{ b -> 0x07d5 }
            zu0.n r3 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r5 = r3.f304178k     // Catch:{ b -> 0x07d5 }
            r0.mo142627e(r5)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            yu0.f r0 = r0.f304176i     // Catch:{ b -> 0x07d5 }
            yu0.g r0 = r0.mo142622e()     // Catch:{ b -> 0x07d5 }
            zu0.n r3 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            java.util.HashSet r3 = r3.f304171d     // Catch:{ b -> 0x07d5 }
            int r3 = r3.size()     // Catch:{ b -> 0x07d5 }
            zu0.n r5 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r5 = r5.f304172e     // Catch:{ b -> 0x07d5 }
            if (r3 <= r5) goto L_0x064e
            zu0.n r3 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r3 = r3.f304172e     // Catch:{ b -> 0x07d5 }
            goto L_0x0658
        L_0x064e:
            zu0.n r3 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            java.util.HashSet r3 = r3.f304171d     // Catch:{ b -> 0x07d5 }
            int r3 = r3.size()     // Catch:{ b -> 0x07d5 }
        L_0x0658:
            r0.mo142630h(r3)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            yu0.f r0 = r0.f304176i     // Catch:{ b -> 0x07d5 }
            yu0.g r0 = r0.mo142622e()     // Catch:{ b -> 0x07d5 }
            zu0.n r3 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r3 = r3.f304172e     // Catch:{ b -> 0x07d5 }
            r0.mo142629g(r3)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            yu0.f r0 = r0.f304176i     // Catch:{ b -> 0x07d5 }
            yu0.g r0 = r0.mo142622e()     // Catch:{ b -> 0x07d5 }
            zu0.n r3 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r5 = r3.f304174g     // Catch:{ b -> 0x07d5 }
            zu0.n r3 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r7 = r3.f304173f     // Catch:{ b -> 0x07d5 }
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x068b
        L_0x0688:
            r5 = r22
            goto L_0x069c
        L_0x068b:
            zu0.n r3 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r5 = r3.f304174g     // Catch:{ b -> 0x07d5 }
            long r5 = r5 * r22
            zu0.n r3 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r7 = r3.f304173f     // Catch:{ b -> 0x07d5 }
            long r22 = r5 / r7
            goto L_0x0688
        L_0x069c:
            int r3 = (int) r5     // Catch:{ b -> 0x07d5 }
            r0.mo142625c(r3)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            r3 = 30
            r0.mo142820B(r3)     // Catch:{ b -> 0x07d5 }
            hv0.C98543d.m128030a(r15)     // Catch:{ b -> 0x07d5 }
            java.lang.String r0 = "startMergeImpl buildConversation finish! transferMsgList[%d], totalMsgList[%d], transferSession[%d], totalSession[%d]"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ b -> 0x07d5 }
            zu0.n r5 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r5 = r5.f304174g     // Catch:{ b -> 0x07d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r6 = 0
            r3[r6] = r5     // Catch:{ b -> 0x07d5 }
            zu0.n r5 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            long r5 = r5.f304173f     // Catch:{ b -> 0x07d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r3[r13] = r5     // Catch:{ b -> 0x07d5 }
            zu0.n r5 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            java.util.HashSet r5 = r5.f304171d     // Catch:{ b -> 0x07d5 }
            int r5 = r5.size()     // Catch:{ b -> 0x07d5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r6 = 2
            r3[r6] = r5     // Catch:{ b -> 0x07d5 }
            zu0.n r5 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r5 = r5.f304172e     // Catch:{ b -> 0x07d5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ b -> 0x07d5 }
            r3[r21] = r5     // Catch:{ b -> 0x07d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r3)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            zu0.n$a r0 = zu0.C103090n.m136350q(r0)     // Catch:{ b -> 0x07d5 }
            r0.mo142828b()     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r0 = r0.f304180m     // Catch:{ b -> 0x07d5 }
            r3 = 2
            if (r0 == r3) goto L_0x07d1
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int unused = r0.f304180m = r3     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            r0.mo142821u()     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r0 = r0.f304177j     // Catch:{ b -> 0x07d5 }
            if (r0 != r13) goto L_0x071d
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BACKUP_PC_MERGERING_BOOLEAN     // Catch:{ b -> 0x07d5 }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ b -> 0x07d5 }
            r0.mo119677K(r3, r5)     // Catch:{ b -> 0x07d5 }
            goto L_0x0735
        L_0x071d:
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r0 = r0.f304177j     // Catch:{ b -> 0x07d5 }
            r3 = 2
            if (r0 != r3) goto L_0x0735
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN     // Catch:{ b -> 0x07d5 }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ b -> 0x07d5 }
            r0.mo119677K(r3, r5)     // Catch:{ b -> 0x07d5 }
        L_0x0735:
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.f304181n     // Catch:{ b -> 0x07d5 }
            r3 = 0
            r0.encode((java.lang.String) r2, (int) r3)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.f304181n     // Catch:{ b -> 0x07d5 }
            java.lang.String r2 = "MMKV_BACKUP_NEED_REPORT"
            r0.encode((java.lang.String) r2, (boolean) r3)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.f304181n     // Catch:{ b -> 0x07d5 }
            java.lang.String r2 = ""
            r0.encode((java.lang.String) r12, (java.lang.String) r2)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            yu0.e r0 = r0.f304179l     // Catch:{ b -> 0x07d5 }
            if (r0 == 0) goto L_0x0766
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            yu0.e r0 = r0.f304179l     // Catch:{ b -> 0x07d5 }
            r0.mo17668P()     // Catch:{ b -> 0x07d5 }
        L_0x0766:
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            yu0.f r0 = r0.f304176i     // Catch:{ b -> 0x07d5 }
            yu0.g r0 = r0.mo142622e()     // Catch:{ b -> 0x07d5 }
            zu0.n r2 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            java.util.HashSet r2 = r2.f304171d     // Catch:{ b -> 0x07d5 }
            int r2 = r2.size()     // Catch:{ b -> 0x07d5 }
            zu0.n r3 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r3 = r3.f304172e     // Catch:{ b -> 0x07d5 }
            if (r2 <= r3) goto L_0x0789
            zu0.n r2 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r2 = r2.f304172e     // Catch:{ b -> 0x07d5 }
            goto L_0x0793
        L_0x0789:
            zu0.n r2 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            java.util.HashSet r2 = r2.f304171d     // Catch:{ b -> 0x07d5 }
            int r2 = r2.size()     // Catch:{ b -> 0x07d5 }
        L_0x0793:
            zu0.n r3 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            int r3 = r3.f304172e     // Catch:{ b -> 0x07d5 }
            r5 = 27
            r0.mo142626d(r5, r2, r3)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            r0.mo142820B(r5)     // Catch:{ b -> 0x07d5 }
            yu0.C102913k.m136044i()     // Catch:{ b -> 0x07d5 }
            boolean r0 = yu0.C102913k.f303764a     // Catch:{ b -> 0x07d5 }
            if (r0 != 0) goto L_0x07b4
            java.lang.String r0 = yu0.C102913k.m136051p()     // Catch:{ b -> 0x07d5 }
            yu0.C102913k.m136047l(r0)     // Catch:{ b -> 0x07d5 }
            yu0.C102913k.m136043h()     // Catch:{ b -> 0x07d5 }
        L_0x07b4:
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            r2 = 0
            int unused = r0.f304180m = r2     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            zu0.C103090n.m136346m(r0)     // Catch:{ b -> 0x07d5 }
            eb0.u2 r0 = eb0.C97625j3.m125816f()     // Catch:{ b -> 0x07d5 }
            com.tencent.mm.booter.notification.MMNotification r0 = (com.tencent.p014mm.booter.notification.MMNotification) r0     // Catch:{ b -> 0x07d5 }
            r0.mo93212i(r2)     // Catch:{ b -> 0x07d5 }
            zu0.n r0 = r1.f304166e     // Catch:{ b -> 0x07d5 }
            yu0.f r0 = r0.f304176i     // Catch:{ b -> 0x07d5 }
            r0.mo17659g()     // Catch:{ b -> 0x07d5 }
        L_0x07d1:
            com.tencent.p014mm.sdk.platformtools.Log.appenderFlush()     // Catch:{ b -> 0x07d5 }
            goto L_0x07e5
        L_0x07d5:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "Backup exit."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r2)
            zu0.n r0 = r1.f304166e
            r2 = -24
            r0.mo142820B(r2)
        L_0x07e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu0.C103088l.run():void");
    }
}
