package ta1;

import g62.C75875l;

/* renamed from: ta1.c */
public class C36988c implements C75875l.C32329c {
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0139, code lost:
        return;
     */
    /* renamed from: w5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo55728w5(g62.C75875l r10, g62.C75875l.C45886e r11) {
        /*
            r9 = this;
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.isBackupMerge()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r10 == 0) goto L_0x013d
            if (r11 == 0) goto L_0x013d
            java.util.ArrayList<com.tencent.mm.storage.f4> r10 = r11.f123846c
            if (r10 != 0) goto L_0x0011
            goto L_0x013d
        L_0x0011:
            ra1.b r10 = ra1.C47958b.xx0()
            monitor-enter(r10)
            com.tencent.mm.storage.n4 r0 = ra1.C47958b.zx0()     // Catch:{ all -> 0x013a }
            java.lang.String r1 = "1"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch:{ all -> 0x013a }
            java.lang.String r2 = "select * from OpenMsgListener where (status = ?) "
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ all -> 0x013a }
            if (r0 != 0) goto L_0x0032
            java.lang.String r11 = "MicroMsg.ExtOnMsgChanged"
            java.lang.String r0 = "onMsgChange onNotifyChange getValidOpenMsgListener cu == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ all -> 0x013a }
            monitor-exit(r10)     // Catch:{ all -> 0x013a }
            return
        L_0x0032:
            java.lang.String r1 = "MicroMsg.ExtOnMsgChanged"
            java.lang.String r2 = "onMsgChange onNotifyChange listener count = %s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x013a }
            int r5 = r0.getCount()     // Catch:{ all -> 0x013a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x013a }
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r4)     // Catch:{ all -> 0x013a }
            int r1 = r0.getCount()     // Catch:{ all -> 0x013a }
            if (r1 > 0) goto L_0x0059
            r0.close()     // Catch:{ all -> 0x013a }
            java.lang.String r11 = "MicroMsg.ExtOnMsgChanged"
            java.lang.String r0 = "onMsgChange onNotifyChange cu.getCount() <= 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ all -> 0x013a }
            monitor-exit(r10)     // Catch:{ all -> 0x013a }
            return
        L_0x0059:
            r0.close()     // Catch:{ all -> 0x013a }
            r0 = 0
        L_0x005d:
            java.util.ArrayList<com.tencent.mm.storage.f4> r1 = r11.f123846c     // Catch:{ all -> 0x013a }
            int r1 = r1.size()     // Catch:{ all -> 0x013a }
            if (r0 >= r1) goto L_0x0114
            java.util.ArrayList<com.tencent.mm.storage.f4> r1 = r11.f123846c     // Catch:{ all -> 0x013a }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x013a }
            com.tencent.mm.storage.f4 r1 = (com.tencent.p014mm.storage.C72963f4) r1     // Catch:{ all -> 0x013a }
            if (r1 == 0) goto L_0x0110
            int r2 = r1.mo108769t2()     // Catch:{ all -> 0x013a }
            if (r2 != 0) goto L_0x0110
            int r2 = r1.getStatus()     // Catch:{ all -> 0x013a }
            r4 = 4
            if (r2 != r4) goto L_0x007e
            goto L_0x0110
        L_0x007e:
            int r2 = r1.getType()     // Catch:{ all -> 0x013a }
            r4 = 9999(0x270f, float:1.4012E-41)
            if (r2 == r4) goto L_0x0110
            int r2 = r1.getType()     // Catch:{ all -> 0x013a }
            r4 = 10000(0x2710, float:1.4013E-41)
            if (r2 != r4) goto L_0x0090
            goto L_0x0110
        L_0x0090:
            java.lang.String r2 = r1.mo108768t()     // Catch:{ all -> 0x013a }
            boolean r2 = eb0.C45628s0.m50751P(r2)     // Catch:{ all -> 0x013a }
            if (r2 == 0) goto L_0x009b
            goto L_0x0110
        L_0x009b:
            java.lang.String r2 = r1.mo108768t()     // Catch:{ all -> 0x013a }
            boolean r2 = eb0.C45628s0.m50747L(r2)     // Catch:{ all -> 0x013a }
            if (r2 == 0) goto L_0x00a6
            goto L_0x0110
        L_0x00a6:
            ra1.b r2 = ra1.C47958b.xx0()     // Catch:{ all -> 0x013a }
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r2.f128655h     // Catch:{ all -> 0x013a }
            java.lang.String r4 = r1.mo108768t()     // Catch:{ all -> 0x013a }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x013a }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x013a }
            r4 = 2
            if (r2 != 0) goto L_0x00e0
            ra1.b r2 = ra1.C47958b.xx0()     // Catch:{ all -> 0x013a }
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r2.f128655h     // Catch:{ all -> 0x013a }
            java.lang.String r5 = r1.mo108768t()     // Catch:{ all -> 0x013a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x013a }
            r2.put(r5, r7)     // Catch:{ all -> 0x013a }
            java.lang.String r2 = "MicroMsg.ExtOnMsgChanged"
            java.lang.String r5 = "onMsgChange %s, %d"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x013a }
            java.lang.String r1 = r1.mo108768t()     // Catch:{ all -> 0x013a }
            r4[r6] = r1     // Catch:{ all -> 0x013a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x013a }
            r4[r3] = r1     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r4)     // Catch:{ all -> 0x013a }
            goto L_0x0110
        L_0x00e0:
            ra1.b r5 = ra1.C47958b.xx0()     // Catch:{ all -> 0x013a }
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r5.f128655h     // Catch:{ all -> 0x013a }
            java.lang.String r7 = r1.mo108768t()     // Catch:{ all -> 0x013a }
            int r8 = r2.intValue()     // Catch:{ all -> 0x013a }
            int r8 = r8 + r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x013a }
            r5.put(r7, r8)     // Catch:{ all -> 0x013a }
            java.lang.String r5 = "MicroMsg.ExtOnMsgChanged"
            java.lang.String r7 = "onMsgChange %s, %d"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x013a }
            java.lang.String r1 = r1.mo108768t()     // Catch:{ all -> 0x013a }
            r4[r6] = r1     // Catch:{ all -> 0x013a }
            int r1 = r2.intValue()     // Catch:{ all -> 0x013a }
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x013a }
            r4[r3] = r1     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r7, r4)     // Catch:{ all -> 0x013a }
        L_0x0110:
            int r0 = r0 + 1
            goto L_0x005d
        L_0x0114:
            ra1.b r11 = ra1.C47958b.xx0()     // Catch:{ all -> 0x013a }
            java.util.HashMap<java.lang.String, java.lang.Integer> r11 = r11.f128655h     // Catch:{ all -> 0x013a }
            int r11 = r11.size()     // Catch:{ all -> 0x013a }
            if (r11 <= 0) goto L_0x0131
            ra1.b r11 = ra1.C47958b.xx0()     // Catch:{ all -> 0x013a }
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r11.f128657j     // Catch:{ all -> 0x013a }
            r0.removeMessages(r6)     // Catch:{ all -> 0x013a }
            com.tencent.mm.sdk.platformtools.MMHandler r11 = r11.f128657j     // Catch:{ all -> 0x013a }
            r0 = 1600(0x640, double:7.905E-321)
            r11.sendEmptyMessageDelayed(r6, r0)     // Catch:{ all -> 0x013a }
            goto L_0x0138
        L_0x0131:
            java.lang.String r11 = "MicroMsg.ExtOnMsgChanged"
            java.lang.String r0 = "notifyMsgUsers.size < 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ all -> 0x013a }
        L_0x0138:
            monitor-exit(r10)     // Catch:{ all -> 0x013a }
            return
        L_0x013a:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x013a }
            throw r11
        L_0x013d:
            java.lang.String r10 = "MicroMsg.ExtOnMsgChanged"
            java.lang.String r11 = "onMsgChange, wrong args"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ta1.C36988c.mo55728w5(g62.l, g62.l$e):void");
    }
}
