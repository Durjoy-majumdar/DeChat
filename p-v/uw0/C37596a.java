package uw0;

import tw0.C37289g;
import vw0.C37851a;

/* renamed from: uw0.a */
public class C37596a implements C37289g {

    /* renamed from: b */
    public static C37596a f99701b;

    /* renamed from: a */
    public C37851a f99702a;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r4 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r4 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r4 = r1.f99702a;
        r4.getClass();
        r0 = new java.lang.String[]{java.lang.String.valueOf(r24)};
        r5 = new tw0.C37285a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r14 = r4.f100213d.query("ActiveInfo", (java.lang.String[]) null, "key=?", r0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r14 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r14.moveToFirst() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        r5.convertFrom(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        r6 = r24;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.field_key = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        if (r14 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0094, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        r6 = r24;
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.Tinker.ActiveInfoStorage", r0, "touch active key failed.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if (r5.field_useTime < (com.tencent.p014mm.sdk.platformtools.Util.getBeginTimeOfToday() - 86400000)) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00be, code lost:
        r7 = r5.field_dau + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d2, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d3, code lost:
        r5.field_useTime = java.lang.System.currentTimeMillis();
        r5.field_dau = r7;
        r5.field_mau = 1;
        r8 = new java.lang.String[]{java.lang.String.valueOf(r24)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e7, code lost:
        if (r0 == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e9, code lost:
        r4 = r4.f100213d.insert("ActiveInfo", "key", r5.convertTo());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f6, code lost:
        r4 = (long) r4.f100213d.update("ActiveInfo", r5.convertTo(), "key=?", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0107, code lost:
        if (r4 < 0) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0109, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.Tinker.ActiveInfoStorage", "update tinker info failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010f, code lost:
        if (r25 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0117, code lost:
        if (r7 > 255) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0119, code lost:
        r7 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.idkeyStat((long) r26, (long) r7, 1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0128, code lost:
        if (r14 != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012a, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a2 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61219a(int r24, boolean r25, int r26) {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r2 = "MicroMsg.Tinker.ActiveInfoStorage"
            vw0.a r0 = r1.f99702a
            if (r0 == 0) goto L_0x0136
            tw0.a r3 = new tw0.a
            r3.<init>()
            java.lang.String r7 = "key =?"
            r12 = 1
            java.lang.String[] r8 = new java.lang.String[r12]
            java.lang.String r4 = java.lang.String.valueOf(r24)
            r13 = 0
            r8[r13] = r4
            r14 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r0.f100213d     // Catch:{ Exception -> 0x003a, all -> 0x0037 }
            java.lang.String r5 = "ActiveInfo"
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x003a, all -> 0x0037 }
            if (r4 == 0) goto L_0x0034
            boolean r0 = r4.moveToFirst()     // Catch:{ Exception -> 0x0032 }
            if (r0 == 0) goto L_0x0034
            r3.convertFrom(r4)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r0 = move-exception
            goto L_0x003c
        L_0x0034:
            if (r4 == 0) goto L_0x004e
            goto L_0x004b
        L_0x0037:
            r0 = move-exception
            goto L_0x0130
        L_0x003a:
            r0 = move-exception
            r4 = r14
        L_0x003c:
            java.lang.String r5 = "getActiveInfoByKey %s failed."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x012e }
            java.lang.String r7 = java.lang.Integer.toHexString(r24)     // Catch:{ all -> 0x012e }
            r6[r13] = r7     // Catch:{ all -> 0x012e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r6)     // Catch:{ all -> 0x012e }
            if (r4 == 0) goto L_0x004e
        L_0x004b:
            r4.close()
        L_0x004e:
            vw0.a r4 = r1.f99702a
            r4.getClass()
            java.lang.String r18 = "key=?"
            java.lang.String[] r0 = new java.lang.String[r12]
            java.lang.String r5 = java.lang.String.valueOf(r24)
            r0[r13] = r5
            tw0.a r5 = new tw0.a
            r5.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r15 = r4.f100213d     // Catch:{ Exception -> 0x0094 }
            java.lang.String r16 = "ActiveInfo"
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r19 = r0
            android.database.Cursor r14 = r15.query(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0094 }
            if (r14 == 0) goto L_0x0083
            boolean r0 = r14.moveToFirst()     // Catch:{ Exception -> 0x0094 }
            if (r0 == 0) goto L_0x0083
            r5.convertFrom(r14)     // Catch:{ Exception -> 0x0094 }
            r6 = r24
            r0 = 0
            goto L_0x0088
        L_0x0083:
            r6 = r24
            r5.field_key = r6     // Catch:{ Exception -> 0x008e }
            r0 = 1
        L_0x0088:
            if (r14 == 0) goto L_0x00a6
            r14.close()
            goto L_0x00a6
        L_0x008e:
            r0 = move-exception
            r7 = 1
            goto L_0x0098
        L_0x0091:
            r0 = move-exception
            goto L_0x0128
        L_0x0094:
            r0 = move-exception
            r6 = r24
            r7 = 0
        L_0x0098:
            java.lang.String r8 = "touch active key failed."
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ all -> 0x0091 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r8, r9)     // Catch:{ all -> 0x0091 }
            if (r14 == 0) goto L_0x00a5
            r14.close()
        L_0x00a5:
            r0 = r7
        L_0x00a6:
            long r7 = r5.field_useTime
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getBeginTimeOfToday()
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = r9 - r14
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00c2
            long r7 = r5.field_useTime
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getBeginTimeOfToday()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x00c2
            int r7 = r5.field_dau
            int r7 = r7 + r12
            goto L_0x00d3
        L_0x00c2:
            long r7 = r5.field_useTime
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getBeginTimeOfToday()
            long r9 = r9 - r14
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00d2
            int r7 = r5.field_dau
            if (r7 <= 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r7 = 1
        L_0x00d3:
            long r8 = java.lang.System.currentTimeMillis()
            r5.field_useTime = r8
            r5.field_dau = r7
            r5.field_mau = r12
            java.lang.String[] r8 = new java.lang.String[r12]
            java.lang.String r6 = java.lang.String.valueOf(r24)
            r8[r13] = r6
            java.lang.String r6 = "ActiveInfo"
            if (r0 == 0) goto L_0x00f6
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r4.f100213d
            android.content.ContentValues r4 = r5.convertTo()
            java.lang.String r5 = "key"
            long r4 = r0.insert(r6, r5, r4)
            goto L_0x0103
        L_0x00f6:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r4.f100213d
            android.content.ContentValues r4 = r5.convertTo()
            java.lang.String r5 = "key=?"
            int r0 = r0.update(r6, r4, r5, r8)
            long r4 = (long) r0
        L_0x0103:
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x010f
            java.lang.String r0 = "update tinker info failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
        L_0x010f:
            if (r25 == 0) goto L_0x013e
            int r0 = r3.field_dau
            if (r0 == r7) goto L_0x013e
            r0 = 255(0xff, float:3.57E-43)
            if (r7 <= r0) goto L_0x011b
            r7 = 255(0xff, float:3.57E-43)
        L_0x011b:
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = r26
            long r9 = (long) r2
            long r11 = (long) r7
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            goto L_0x013e
        L_0x0128:
            if (r14 == 0) goto L_0x012d
            r14.close()
        L_0x012d:
            throw r0
        L_0x012e:
            r0 = move-exception
            r14 = r4
        L_0x0130:
            if (r14 == 0) goto L_0x0135
            r14.close()
        L_0x0135:
            throw r0
        L_0x0136:
            java.lang.String r0 = "MicroMsg.Boots.TinkerLogic"
            java.lang.String r2 = "storage is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uw0.C37596a.mo61219a(int, boolean, int):void");
    }
}
