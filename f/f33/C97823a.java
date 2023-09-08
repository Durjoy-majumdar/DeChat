package f33;

/* renamed from: f33.a */
public final class C97823a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f286972d;

    public C97823a(long j) {
        this.f286972d = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            f33.d r0 = f33.C97826d.f286974a
            long r1 = r15.f286972d
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.mo137158a()
            com.tencent.mm.sdk.storage.sql.SingleTable r5 = p749xh.C102651h0.f302391Q
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r5 = r5.selectAll()
            java.lang.String r6 = "MicroMsg，BackgroundVideoInfoStorageManager"
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r5 = r5.log(r6)
            com.tencent.mm.sdk.storage.sql.Column r7 = p749xh.C102651h0.f302395S
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            com.tencent.mm.sdk.storage.sql.SingleCondition r7 = r7.equal((java.lang.Number) r9)
            com.tencent.mm.sdk.storage.sql.Column r9 = p749xh.C102651h0.f302397T
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.tencent.mm.sdk.storage.sql.SingleCondition r3 = r9.smallerThan((java.lang.Number) r3)
            com.tencent.mm.sdk.storage.sql.ISqlCondition r3 = r7.and(r3)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r3 = r5.where(r3)
            com.tencent.mm.sdk.storage.sql.SelectSql r3 = r3.build()
            java.lang.Class<xh.h0> r4 = p749xh.C102651h0.class
            java.util.List r0 = r3.multiQuery(r0, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getWorkSuccessFinish >> size: "
            r3.append(r4)
            int r4 = r0.size()
            r3.append(r4)
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startClear >> "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ", size: "
            r1.append(r2)
            int r2 = r0.size()
            r1.append(r2)
            r1.append(r4)
            long r2 = r15.f286972d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.BackgroundStorageClearManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0097:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0188
            java.lang.Object r1 = r0.next()
            xh.h0 r1 = (p749xh.C102651h0) r1
            te3.zy r3 = new te3.zy
            r3.<init>()
            byte[] r4 = r1.field_composition_info     // Catch:{ IOException -> 0x0180 }
            r3.parseFrom(r4)     // Catch:{ IOException -> 0x0180 }
            java.util.LinkedList<te3.hi4> r3 = r3.f186899d
            java.lang.String r4 = "compositionInfo.tracks"
            gy3.C87412m.m108593f(r3, r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x00b8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0097
            java.lang.Object r4 = r3.next()
            te3.hi4 r4 = (te3.hi4) r4
            java.lang.String r5 = r4.f183504d
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106458s(r5)
            r7 = 1
            if (r5 == 0) goto L_0x00ed
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            f40.o r10 = f40.C86709a0.m107535s()
            java.lang.String r10 = r10.f251807e
            r9.append(r10)
            java.lang.String r10 = "mediaOpt/remux/tempVideo/"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            boolean r9 = z04.C112550d0.m153801u(r5, r9, r8)
            if (r9 != r7) goto L_0x00ed
            r9 = 1
            goto L_0x00ee
        L_0x00ed:
            r9 = 0
        L_0x00ee:
            if (r9 == 0) goto L_0x00b8
            hi2.f r9 = hi2.C32927f.f89501a
            java.lang.String r10 = "path"
            gy3.C87412m.m108594g(r5, r10)
            java.lang.Class<h81.h> r10 = h81.C32735h.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            h81.h r10 = (h81.C32735h) r10
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_media_clean_report_enale
            boolean r10 = r10.mo58784wf(r11, r7)
            if (r10 == 0) goto L_0x010c
            r10 = 2
            r9.mo58867a(r5, r10)
        L_0x010c:
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106446g(r5, r7)
            java.lang.String r10 = ", result: "
            if (r9 == 0) goto L_0x0159
            f33.d r11 = f33.C97826d.f286974a
            java.lang.String r12 = r1.field_work_id
            java.lang.String r13 = "it.field_work_id"
            gy3.C87412m.m108593f(r12, r13)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r11 = r11.mo137158a()
            com.tencent.mm.sdk.storage.sql.Column r13 = p749xh.C102651h0.f302393R
            com.tencent.mm.sdk.storage.sql.SingleCondition r13 = r13.equal((java.lang.String) r12)
            com.tencent.mm.sdk.storage.sql.SingleTable r14 = p749xh.C102651h0.f302391Q
            com.tencent.mm.sdk.storage.sql.DeleteSql$Builder r14 = r14.delete()
            com.tencent.mm.sdk.storage.sql.DeleteSql$Builder r13 = r14.where(r13)
            com.tencent.mm.sdk.storage.sql.DeleteSql r13 = r13.build()
            int r11 = r13.run(r11)
            r13 = -1
            if (r11 == r13) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r7 = 0
        L_0x013f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "deleteVideoInfoByWorkTagId >> workTagId: "
            r11.append(r13)
            r11.append(r12)
            r11.append(r10)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
        L_0x0159:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "sourcePath: "
            r7.append(r11)
            java.lang.String r4 = r4.f183504d
            r7.append(r4)
            java.lang.String r4 = ", sourceParent: "
            r7.append(r4)
            r7.append(r5)
            r7.append(r10)
            r7.append(r9)
            java.lang.String r4 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            goto L_0x00b8
        L_0x0180:
            java.lang.String r1 = "parse byte error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            goto L_0x0097
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f33.C97823a.run():void");
    }
}
