package k11;

import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import wy0.C102522u;

/* renamed from: k11.a0 */
public class C99083a0 implements C102522u {

    /* renamed from: a */
    public final /* synthetic */ CleanNewUI f290437a;

    public C99083a0(CleanNewUI cleanNewUI) {
        this.f290437a = cleanNewUI;
    }

    /* renamed from: a */
    public void mo137337a(long j, long j2) {
        int i = 0;
        Log.m105925i("MicroMsg.CleanNewUI", "Scan progress: %d/%d", Long.valueOf(j), Long.valueOf(j2));
        int i2 = (int) (((((float) j) * 1.0f) / ((float) j2)) * 100.0f);
        if (i2 >= 0) {
            i = i2 > 100 ? 100 : i2;
        }
        this.f290437a.mo127439J7(i, 100);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 144 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137338b(boolean r25, long r26, int r28, int r29) {
        /*
            r24 = this;
            r1 = r24
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            if (r25 == 0) goto L_0x0007
            return
        L_0x0007:
            long r3 = h11.C98311d.m127052a()
            r5 = 1
            r6 = 0
            k40.a r0 = f40.C86709a0.m107533q(r2)     // Catch:{ Exception -> 0x0043 }
            f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x0043 }
            g62.l r0 = r0.mo96095LE()     // Catch:{ Exception -> 0x0043 }
            r7 = -9223372036854775808
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0     // Catch:{ Exception -> 0x0043 }
            android.database.Cursor r7 = r0.mo101060CP(r7, r9)     // Catch:{ Exception -> 0x0043 }
            r0 = 0
        L_0x0025:
            boolean r8 = r7.moveToNext()     // Catch:{ all -> 0x0035 }
            if (r8 == 0) goto L_0x0031
            int r8 = r7.getInt(r5)     // Catch:{ all -> 0x0035 }
            int r0 = r0 + r8
            goto L_0x0025
        L_0x0031:
            r7.close()     // Catch:{ Exception -> 0x0043 }
            goto L_0x005d
        L_0x0035:
            r0 = move-exception
            r8 = r0
            if (r7 == 0) goto L_0x0042
            r7.close()     // Catch:{ all -> 0x003d }
            goto L_0x0042
        L_0x003d:
            r0 = move-exception
            r7 = r0
            r8.addSuppressed(r7)     // Catch:{ Exception -> 0x0043 }
        L_0x0042:
            throw r8     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            java.lang.String r7 = "MicroMsg.CleanNewUI"
            java.lang.String r8 = "Cannot get real message count"
            java.lang.Object[] r9 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r9)
            k40.a r0 = f40.C86709a0.m107533q(r2)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            int r0 = r0.mo101146vP()
        L_0x005d:
            r2 = r0
            wy0.a r0 = wy0.C102506a.f301832a
            yy0.b r0 = r0.mo142120e()
            r0.getClass()
            r7 = 0
            zh3.f r0 = r0.f303871d     // Catch:{ RuntimeException -> 0x0075 }
            com.tencent.wcdb.database.SQLiteDatabase r0 = r0.mo125615f()     // Catch:{ RuntimeException -> 0x0075 }
            java.lang.String r10 = "SELECT sum(diskSpace) FROM WxFileIndex3"
            long r10 = com.tencent.wcdb.DatabaseUtils.longForQuery(r0, r10, r7)     // Catch:{ RuntimeException -> 0x0075 }
            goto L_0x0081
        L_0x0075:
            r0 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.String r11 = "MicroMsg.WxFileIndexStorage"
            java.lang.String r12 = "Cannot get media summery."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r12, r10)
            r10 = 0
        L_0x0081:
            long r12 = (long) r2
            long r12 = r12 * r3
            long r10 = r10 + r12
            j11.e r0 = j11.C98896e.wx0()
            java.lang.Class<j11.e> r2 = j11.C98896e.class
            monitor-enter(r2)
            r0.f289907e = r10     // Catch:{ all -> 0x0106 }
            r0.f289910h = r3     // Catch:{ all -> 0x0106 }
            long r3 = r0.f289906d     // Catch:{ all -> 0x0106 }
            long r12 = r0.f289908f     // Catch:{ all -> 0x0106 }
            long r14 = r0.f289909g     // Catch:{ all -> 0x0106 }
            monitor-exit(r2)     // Catch:{ all -> 0x0106 }
            r0.xx0(r5, r7)
            k11.a0$$a r0 = new k11.a0$$a
            r0.<init>(r1, r10)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI r0 = r1.f290437a
            long r8 = java.lang.System.currentTimeMillis()
            r0.f267928A = r8
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI r0 = r1.f290437a
            long r8 = r0.f267928A
            long r5 = r0.f267955z
            long r8 = r8 - r5
            r0.f267954y = r7
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 714(0x2ca, double:3.53E-321)
            r19 = 51
            r21 = 1
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            r0 = 14
            r2 = 6
            java.lang.Long[] r2 = new java.lang.Long[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r4 = 1
            r2[r4] = r3
            r3 = 2
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r2[r3] = r4
            r3 = 3
            r4 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            r2[r3] = r6
            r3 = 4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2[r3] = r4
            r3 = 5
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r2[r3] = r4
            wy0.C102506a.m135309i(r0, r8, r2)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FIRST_TIME_LOADING_DONE_BOOLEAN
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.mo119677K(r2, r3)
            return
        L_0x0104:
            monitor-exit(r2)     // Catch:{ all -> 0x0106 }
            throw r0
        L_0x0106:
            r0 = move-exception
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: k11.C99083a0.mo137338b(boolean, long, int, int):void");
    }
}
