package com.tencent.p014mm.p136ui.chatting.component;

import u90.C37355b;

/* renamed from: com.tencent.mm.ui.chatting.component.i1 */
public class C30820i1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C37355b f82827d;

    /* renamed from: e */
    public final /* synthetic */ C44825h1 f82828e;

    public C30820i1(C44825h1 h1Var, C37355b bVar) {
        this.f82828e = h1Var;
        this.f82827d = bVar;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088 A[Catch:{ Exception -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r2 = "notifymessage"
            java.lang.String r3 = " = '"
            java.lang.String r4 = "talker"
            java.lang.String r5 = " WHERE "
            java.lang.String r6 = "message"
            java.lang.String r7 = "MicroMsg.NotifyMessageRecordStorage"
            java.lang.String r8 = "MicroMsg.ChattingServiceNotifyComponent"
            java.lang.String r0 = "pre sync"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            u90.b r0 = r1.f82827d
            r9 = r0
            com.tencent.mm.storage.l4 r9 = (com.tencent.p014mm.storage.C30757l4) r9
            r9.getClass()
            r10 = 0
            r11 = 1
            r12 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061 }
            r0.<init>()     // Catch:{ Exception -> 0x0061 }
            java.lang.String r13 = "SELECT COUNT(*) FROM "
            r0.append(r13)     // Catch:{ Exception -> 0x0061 }
            r0.append(r6)     // Catch:{ Exception -> 0x0061 }
            r0.append(r5)     // Catch:{ Exception -> 0x0061 }
            r0.append(r4)     // Catch:{ Exception -> 0x0061 }
            r0.append(r3)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r2)     // Catch:{ Exception -> 0x0061 }
            r0.append(r13)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r13 = "'"
            r0.append(r13)     // Catch:{ Exception -> 0x0061 }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r13 = r9.f82707d     // Catch:{ Exception -> 0x0061 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0061 }
            android.database.Cursor r13 = r13.rawQuery(r0, r10)     // Catch:{ Exception -> 0x0061 }
            r13.moveToFirst()     // Catch:{ Exception -> 0x005f }
            boolean r0 = r13.moveToLast()     // Catch:{ Exception -> 0x005f }
            if (r0 == 0) goto L_0x0070
            int r0 = r13.getInt(r12)     // Catch:{ Exception -> 0x005f }
            r25 = r13
            r13 = r0
            r0 = r25
            goto L_0x0072
        L_0x005f:
            r0 = move-exception
            goto L_0x0063
        L_0x0061:
            r0 = move-exception
            r13 = r10
        L_0x0063:
            java.lang.Object[] r14 = new java.lang.Object[r11]
            java.lang.String r0 = r0.toString()
            r14[r12] = r0
            java.lang.String r0 = "dz[getNotifyMessageCount] exception %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r0, r14)
        L_0x0070:
            r0 = r13
            r13 = 0
        L_0x0072:
            if (r0 == 0) goto L_0x0077
            r0.close()
        L_0x0077:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r9.f82707d     // Catch:{ Exception -> 0x008f }
            java.lang.String r9 = "SELECT COUNT(*) FROM NotifyMessageRecord"
            android.database.Cursor r9 = r0.rawQuery(r9, r10)     // Catch:{ Exception -> 0x008f }
            r9.moveToFirst()     // Catch:{ Exception -> 0x008d }
            boolean r0 = r9.moveToLast()     // Catch:{ Exception -> 0x008d }
            if (r0 == 0) goto L_0x009e
            int r0 = r9.getInt(r12)     // Catch:{ Exception -> 0x008d }
            goto L_0x009f
        L_0x008d:
            r0 = move-exception
            goto L_0x0091
        L_0x008f:
            r0 = move-exception
            r9 = r10
        L_0x0091:
            java.lang.Object[] r14 = new java.lang.Object[r11]
            java.lang.String r0 = r0.toString()
            r14[r12] = r0
            java.lang.String r0 = "dz[getNotifyMessageRecordCount] exception %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r0, r14)
        L_0x009e:
            r0 = 0
        L_0x009f:
            if (r9 == 0) goto L_0x00a4
            r9.close()
        L_0x00a4:
            if (r13 == r0) goto L_0x00a8
            r0 = 1
            goto L_0x00a9
        L_0x00a8:
            r0 = 0
        L_0x00a9:
            java.lang.Object[] r9 = new java.lang.Object[r11]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            r9[r12] = r13
            java.lang.String r13 = "need sync record: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r13, r9)
            if (r0 == 0) goto L_0x0329
            java.lang.String r0 = "before sync"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            u90.b r0 = r1.f82827d
            r9 = r0
            com.tencent.mm.storage.l4 r9 = (com.tencent.p014mm.storage.C30757l4) r9
            r9.getClass()
            boolean r0 = com.tencent.p014mm.storage.C30757l4.f82706f
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "sync is running"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            r18 = r8
            r19 = r13
            r3 = 0
            r7 = 0
            goto L_0x02c4
        L_0x00da:
            java.lang.String r0 = "syncRecord"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.p014mm.storage.C30757l4.f82706f = r11
            java.lang.String r11 = " = "
            java.lang.String r12 = " ON "
            java.lang.String r10 = "NotifyMessageRecord"
            java.lang.String r1 = " FROM "
            r18 = r8
            java.lang.String r8 = "."
            r19 = r13
            java.lang.String r13 = "msgId"
            java.lang.String r0 = " AS "
            java.lang.String r14 = "NOTIFY_RECORD"
            r21 = r15
            java.lang.String r15 = "NOTIFY_RECORD_msgId"
            r16 = r9
            java.lang.String r9 = "MESSAGE"
            r23 = r2
            java.lang.String r2 = "sync msg not in record start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ee }
            r2.<init>()     // Catch:{ Exception -> 0x01ee }
            r24 = r7
            java.lang.String r7 = "SELECT * FROM "
            r2.append(r7)     // Catch:{ Exception -> 0x01ea }
            r2.append(r6)     // Catch:{ Exception -> 0x01ea }
            r2.append(r0)     // Catch:{ Exception -> 0x01ea }
            r2.append(r9)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r7 = " LEFT JOIN ("
            r2.append(r7)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r7 = "SELECT "
            r2.append(r7)     // Catch:{ Exception -> 0x01ea }
            r2.append(r13)     // Catch:{ Exception -> 0x01ea }
            r2.append(r0)     // Catch:{ Exception -> 0x01ea }
            r2.append(r15)     // Catch:{ Exception -> 0x01ea }
            r2.append(r1)     // Catch:{ Exception -> 0x01ea }
            r2.append(r10)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r0 = ") AS "
            r2.append(r0)     // Catch:{ Exception -> 0x01ea }
            r2.append(r14)     // Catch:{ Exception -> 0x01ea }
            r2.append(r12)     // Catch:{ Exception -> 0x01ea }
            r2.append(r9)     // Catch:{ Exception -> 0x01ea }
            r2.append(r8)     // Catch:{ Exception -> 0x01ea }
            r2.append(r13)     // Catch:{ Exception -> 0x01ea }
            r2.append(r11)     // Catch:{ Exception -> 0x01ea }
            r2.append(r14)     // Catch:{ Exception -> 0x01ea }
            r2.append(r8)     // Catch:{ Exception -> 0x01ea }
            r2.append(r15)     // Catch:{ Exception -> 0x01ea }
            r2.append(r5)     // Catch:{ Exception -> 0x01ea }
            r2.append(r9)     // Catch:{ Exception -> 0x01ea }
            r2.append(r8)     // Catch:{ Exception -> 0x01ea }
            r2.append(r4)     // Catch:{ Exception -> 0x01ea }
            r2.append(r3)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r23)     // Catch:{ Exception -> 0x01ea }
            r2.append(r0)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r0 = "' AND "
            r2.append(r0)     // Catch:{ Exception -> 0x01ea }
            r2.append(r14)     // Catch:{ Exception -> 0x01ea }
            r2.append(r8)     // Catch:{ Exception -> 0x01ea }
            r2.append(r15)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r0 = " IS NULL"
            r2.append(r0)     // Catch:{ Exception -> 0x01ea }
            r3 = r16
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r3.f82707d     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01e5 }
            r7 = 0
            android.database.Cursor r2 = r0.rawQuery(r2, r7)     // Catch:{ Exception -> 0x01e1 }
            if (r2 == 0) goto L_0x01d1
            boolean r0 = r2.moveToFirst()     // Catch:{ Exception -> 0x01cd }
            if (r0 != 0) goto L_0x0195
            goto L_0x01d1
        L_0x0195:
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4     // Catch:{ Exception -> 0x01cd }
            r0.<init>()     // Catch:{ Exception -> 0x01cd }
            r0.convertFrom(r2)     // Catch:{ Exception -> 0x01cd }
            xh.r6 r0 = r3.mo57662bD(r0)     // Catch:{ Exception -> 0x01cd }
            u90.d r0 = (u90.C37356d) r0     // Catch:{ Exception -> 0x01cd }
            if (r0 == 0) goto L_0x01a9
            r7 = 0
            r3.insertNotify(r0, r7)     // Catch:{ Exception -> 0x01cd }
        L_0x01a9:
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x01cd }
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "sync row: %d"
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01c8 }
            int r7 = r2.getCount()     // Catch:{ Exception -> 0x01c8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01c8 }
            r14 = 0
            r9[r14] = r7     // Catch:{ Exception -> 0x01c8 }
            r14 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r9)     // Catch:{ Exception -> 0x01c6 }
            r7 = 1
            goto L_0x0204
        L_0x01c6:
            r0 = move-exception
            goto L_0x01cb
        L_0x01c8:
            r0 = move-exception
            r14 = r24
        L_0x01cb:
            r7 = 1
            goto L_0x01f5
        L_0x01cd:
            r0 = move-exception
            r14 = r24
            goto L_0x01f4
        L_0x01d1:
            r14 = r24
            java.lang.String r0 = "sync with no record"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)     // Catch:{ Exception -> 0x01df }
            if (r2 == 0) goto L_0x01dd
            r2.close()     // Catch:{ Exception -> 0x01df }
        L_0x01dd:
            r7 = 1
            goto L_0x020e
        L_0x01df:
            r0 = move-exception
            goto L_0x01f4
        L_0x01e1:
            r0 = move-exception
            r14 = r24
            goto L_0x01f3
        L_0x01e5:
            r0 = move-exception
        L_0x01e6:
            r14 = r24
        L_0x01e8:
            r7 = 0
            goto L_0x01f3
        L_0x01ea:
            r0 = move-exception
            r3 = r16
            goto L_0x01e6
        L_0x01ee:
            r0 = move-exception
            r14 = r7
            r3 = r16
            goto L_0x01e8
        L_0x01f3:
            r2 = r7
        L_0x01f4:
            r7 = 0
        L_0x01f5:
            r9 = 1
            java.lang.Object[] r15 = new java.lang.Object[r9]
            java.lang.String r0 = r0.toString()
            r9 = 0
            r15[r9] = r0
            java.lang.String r0 = "dz[syncMsgNotInRecord] exception %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r0, r15)
        L_0x0204:
            if (r2 == 0) goto L_0x0209
            r2.close()
        L_0x0209:
            java.lang.String r0 = "sync msg not in record finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
        L_0x020e:
            java.lang.String r0 = "delete unreachable record start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0298 }
            r0.<init>()     // Catch:{ Exception -> 0x0298 }
            java.lang.String r2 = "DELETE FROM "
            r0.append(r2)     // Catch:{ Exception -> 0x0298 }
            r0.append(r10)     // Catch:{ Exception -> 0x0298 }
            r0.append(r5)     // Catch:{ Exception -> 0x0298 }
            r0.append(r13)     // Catch:{ Exception -> 0x0298 }
            java.lang.String r2 = " IN "
            r0.append(r2)     // Catch:{ Exception -> 0x0298 }
            java.lang.String r2 = "(SELECT "
            r0.append(r2)     // Catch:{ Exception -> 0x0298 }
            r0.append(r10)     // Catch:{ Exception -> 0x0298 }
            r0.append(r8)     // Catch:{ Exception -> 0x0298 }
            r0.append(r13)     // Catch:{ Exception -> 0x0298 }
            r0.append(r1)     // Catch:{ Exception -> 0x0298 }
            r0.append(r10)     // Catch:{ Exception -> 0x0298 }
            java.lang.String r1 = " LEFT JOIN "
            r0.append(r1)     // Catch:{ Exception -> 0x0298 }
            r0.append(r6)     // Catch:{ Exception -> 0x0298 }
            r0.append(r12)     // Catch:{ Exception -> 0x0298 }
            r0.append(r10)     // Catch:{ Exception -> 0x0298 }
            r0.append(r8)     // Catch:{ Exception -> 0x0298 }
            r0.append(r13)     // Catch:{ Exception -> 0x0298 }
            r0.append(r11)     // Catch:{ Exception -> 0x0298 }
            r0.append(r6)     // Catch:{ Exception -> 0x0298 }
            r0.append(r8)     // Catch:{ Exception -> 0x0298 }
            r0.append(r13)     // Catch:{ Exception -> 0x0298 }
            r0.append(r5)     // Catch:{ Exception -> 0x0298 }
            r0.append(r6)     // Catch:{ Exception -> 0x0298 }
            r0.append(r8)     // Catch:{ Exception -> 0x0298 }
            r0.append(r4)     // Catch:{ Exception -> 0x0298 }
            java.lang.String r1 = " IS NULL OR "
            r0.append(r1)     // Catch:{ Exception -> 0x0298 }
            r0.append(r6)     // Catch:{ Exception -> 0x0298 }
            r0.append(r8)     // Catch:{ Exception -> 0x0298 }
            r0.append(r4)     // Catch:{ Exception -> 0x0298 }
            java.lang.String r1 = " != '"
            r0.append(r1)     // Catch:{ Exception -> 0x0298 }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r23)     // Catch:{ Exception -> 0x0298 }
            r0.append(r1)     // Catch:{ Exception -> 0x0298 }
            java.lang.String r1 = "')"
            r0.append(r1)     // Catch:{ Exception -> 0x0298 }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r3.f82707d     // Catch:{ Exception -> 0x0298 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0298 }
            r1.execSQL(r10, r0)     // Catch:{ Exception -> 0x0298 }
            r1 = 1
            r3 = 0
            r17 = 1
            goto L_0x02aa
        L_0x0298:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r0 = r0.toString()
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "dz[deleteUnreachableRecord] exception %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r0, r2)
            r17 = 0
        L_0x02aa:
            java.lang.String r0 = "delete unreachable record finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            r7 = r7 & r17
            java.lang.Object[] r0 = new java.lang.Object[r1]
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r21)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r3] = r1
            java.lang.String r1 = "handle msg info done, cost: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
            com.tencent.p014mm.storage.C30757l4.f82706f = r3
        L_0x02c4:
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r19)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            r2[r3] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = "syncNotifyRecord finish, ret: %b, cost: %d"
            r5 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r2)
            r2 = r26
            com.tencent.mm.ui.chatting.component.h1 r4 = r2.f82828e
            r4.getClass()
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1584(0x630, double:7.826E-321)
            r11 = 0
            r9 = 1584(0x630, double:7.826E-321)
            r8 = r5
            r13 = r0
            r8.mo175913w(r9, r11, r13)
            r8 = 1
            r10 = 1
            r5.mo175913w(r6, r8, r10)
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r4
            r4 = 11
            int[] r5 = new int[r4]
            r5 = {5, 10, 20, 30, 40, 50, 60, 90, 180, 360, 600} // fill-array
            r6 = 600(0x258, double:2.964E-321)
            r8 = 21
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x030f
            r8 = 32
            goto L_0x031e
        L_0x030f:
            r12 = 0
        L_0x0310:
            if (r12 >= r4) goto L_0x031e
            r3 = r5[r12]
            long r6 = (long) r3
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x031b
            int r8 = r8 + r12
            goto L_0x031e
        L_0x031b:
            int r12 = r12 + 1
            goto L_0x0310
        L_0x031e:
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1584(0x630, double:7.826E-321)
            long r12 = (long) r8
            r14 = 1
            r9.mo175913w(r10, r12, r14)
            goto L_0x032a
        L_0x0329:
            r2 = r1
        L_0x032a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C30820i1.run():void");
    }
}
