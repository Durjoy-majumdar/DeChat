package jp2;

/* renamed from: jp2.s */
public class C33620s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C33615q f90995d;

    public C33620s(C33615q qVar) {
        this.f90995d = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0238 A[LOOP:0: B:23:0x00eb->B:67:0x0238, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x021e A[EDGE_INSN: B:94:0x021e->B:66:0x021e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r23 = this;
            java.lang.String r1 = "run"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr$4"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = r23
            jp2.q r4 = r3.f90995d
            java.lang.String r5 = "access$400"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r4.getClass()
            java.lang.String r7 = "reportNowImpl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            java.lang.String r0 = "getUpSize"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            r4.init()
            long r8 = r4.f90987i
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)
            r10 = 100
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0038
            int r8 = r4.f90988j
            if (r8 <= 0) goto L_0x0038
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            goto L_0x007b
        L_0x0038:
            int r8 = jp2.C33615q.f90975n
            r4.f90988j = r8
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r8)
            if (r8 == 0) goto L_0x004a
            int r8 = jp2.C33615q.f90977p
            r4.f90988j = r8
        L_0x004a:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r8)
            if (r8 != 0) goto L_0x005e
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is4G(r8)
            if (r8 == 0) goto L_0x0062
        L_0x005e:
            int r8 = jp2.C33615q.f90976o
            r4.f90988j = r8
        L_0x0062:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r8)
            if (r8 == 0) goto L_0x0070
            int r8 = jp2.C33615q.f90975n
            r4.f90988j = r8
        L_0x0070:
            long r8 = android.os.SystemClock.elapsedRealtime()
            r4.f90987i = r8
            int r8 = r4.f90988j
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
        L_0x007b:
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            os2.h0 r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.by0()
            int r0 = r4.f90982d
            r10.getClass()
            java.lang.String r11 = "MicroMsg.SnsKvReportStg"
            java.lang.String r12 = "getByCount"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.SnsKvReportStg"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            java.lang.StringBuffer r14 = new java.lang.StringBuffer
            r14.<init>()
            java.lang.String r15 = "select rowid, *  from SnsReportKv"
            if (r0 <= 0) goto L_0x00b0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            java.lang.String r15 = " where rowid <= "
            r3.append(r15)
            r3.append(r0)
            java.lang.String r15 = r3.toString()
        L_0x00b0:
            zh3.f r3 = r10.f94552d
            r16 = r1
            r1 = 0
            android.database.Cursor r1 = r3.rawQuery(r15, r1)
            te3.l74 r3 = new te3.l74
            r3.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r17 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r18 = r5
            java.lang.String r5 = "target size "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r5 = " current maxcolid "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r14.append(r0)
            boolean r0 = r1.moveToFirst()
            if (r0 == 0) goto L_0x0240
            r5 = 0
        L_0x00eb:
            os2.g0 r2 = new os2.g0
            r2.<init>()
            r2.convertFrom(r1)
            int r0 = r2.field_offset
            r19 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r20 = r6
            java.lang.String r6 = "|offset: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r14.append(r5)
            te3.l74 r5 = new te3.l74
            r5.<init>()
            byte[] r6 = r2.field_value     // Catch:{ Exception -> 0x01ea }
            r5.parseFrom(r6)     // Catch:{ Exception -> 0x01ea }
            r21 = r7
            r6 = r19
        L_0x011c:
            java.util.LinkedList<te3.sl2> r7 = r5.f137242d     // Catch:{ Exception -> 0x01e4 }
            int r7 = r7.size()     // Catch:{ Exception -> 0x01e4 }
            if (r0 >= r7) goto L_0x017c
            java.util.LinkedList<te3.sl2> r7 = r5.f137242d     // Catch:{ Exception -> 0x0176 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ Exception -> 0x0176 }
            te3.sl2 r7 = (te3.C51263sl2) r7     // Catch:{ Exception -> 0x0176 }
            r22 = r9
            pe3.b r9 = r7.f141589e     // Catch:{ Exception -> 0x01e2 }
            byte[] r9 = r9.f257327a     // Catch:{ Exception -> 0x01e2 }
            int r9 = r9.length     // Catch:{ Exception -> 0x01e2 }
            int r9 = r9 + r6
            if (r9 <= r8) goto L_0x0164
            if (r6 != 0) goto L_0x0162
            int r0 = r2.f94550v     // Catch:{ Exception -> 0x01e2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01e2 }
            r15.add(r0)     // Catch:{ Exception -> 0x01e2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e2 }
            r0.<init>()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r9 = "error by server for the mini size "
            r0.append(r9)     // Catch:{ Exception -> 0x01e2 }
            r0.append(r8)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r9 = " vlauesize "
            r0.append(r9)     // Catch:{ Exception -> 0x01e2 }
            pe3.b r7 = r7.f141589e     // Catch:{ Exception -> 0x01e2 }
            byte[] r7 = r7.f257327a     // Catch:{ Exception -> 0x01e2 }
            int r7 = r7.length     // Catch:{ Exception -> 0x01e2 }
            r0.append(r7)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ Exception -> 0x01e2 }
        L_0x0162:
            r0 = 1
            goto L_0x017f
        L_0x0164:
            int r0 = r0 + 1
            r2.field_offset = r0     // Catch:{ Exception -> 0x01e2 }
            java.util.LinkedList<te3.sl2> r9 = r3.f137242d     // Catch:{ Exception -> 0x01e2 }
            r9.add(r7)     // Catch:{ Exception -> 0x01e2 }
            pe3.b r7 = r7.f141589e     // Catch:{ Exception -> 0x01e2 }
            byte[] r7 = r7.f257327a     // Catch:{ Exception -> 0x01e2 }
            int r7 = r7.length     // Catch:{ Exception -> 0x01e2 }
            int r6 = r6 + r7
            r9 = r22
            goto L_0x011c
        L_0x0176:
            r0 = move-exception
            r22 = r9
        L_0x0179:
            r7 = r6
            goto L_0x01e8
        L_0x017c:
            r22 = r9
            r0 = 0
        L_0x017f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e2 }
            r7.<init>()     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r9 = "|read end on "
            r7.append(r9)     // Catch:{ Exception -> 0x01e2 }
            int r9 = r2.f94550v     // Catch:{ Exception -> 0x01e2 }
            r7.append(r9)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r9 = " and get size "
            r7.append(r9)     // Catch:{ Exception -> 0x01e2 }
            r7.append(r6)     // Catch:{ Exception -> 0x01e2 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01e2 }
            r14.append(r7)     // Catch:{ Exception -> 0x01e2 }
            if (r0 == 0) goto L_0x01c9
            int r7 = r2.field_offset     // Catch:{ Exception -> 0x01e2 }
            java.util.LinkedList<te3.sl2> r5 = r5.f137242d     // Catch:{ Exception -> 0x01e2 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x01e2 }
            if (r7 > r5) goto L_0x01c9
            int r5 = r2.f94550v     // Catch:{ Exception -> 0x01e2 }
            r7 = r6
            long r5 = (long) r5
            r10.update((long) r5, r2)     // Catch:{ Exception -> 0x01e0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e0 }
            r5.<init>()     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r6 = "|update new offset "
            r5.append(r6)     // Catch:{ Exception -> 0x01e0 }
            int r6 = r2.field_offset     // Catch:{ Exception -> 0x01e0 }
            r5.append(r6)     // Catch:{ Exception -> 0x01e0 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01e0 }
            r14.append(r5)     // Catch:{ Exception -> 0x01e0 }
            goto L_0x01d9
        L_0x01c9:
            r7 = r6
            java.lang.String r5 = "|read full "
            r14.append(r5)     // Catch:{ Exception -> 0x01e0 }
            int r5 = r2.f94550v     // Catch:{ Exception -> 0x01e0 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x01e0 }
            r15.add(r5)     // Catch:{ Exception -> 0x01e0 }
        L_0x01d9:
            if (r0 == 0) goto L_0x01dd
            r6 = 0
            goto L_0x021e
        L_0x01dd:
            r5 = r7
            r6 = 0
            goto L_0x0218
        L_0x01e0:
            r0 = move-exception
            goto L_0x01e8
        L_0x01e2:
            r0 = move-exception
            goto L_0x0179
        L_0x01e4:
            r0 = move-exception
            r7 = r6
            r22 = r9
        L_0x01e8:
            r5 = r7
            goto L_0x01f1
        L_0x01ea:
            r0 = move-exception
            r21 = r7
            r22 = r9
            r5 = r19
        L_0x01f1:
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r9 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r9, r7)
            int r0 = r2.f94550v
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "error paser then delete "
            r0.append(r7)
            int r2 = r2.f94550v
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
        L_0x0218:
            boolean r0 = r1.moveToNext()
            if (r0 != 0) goto L_0x0238
        L_0x021e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "read info "
            r0.append(r2)
            java.lang.String r2 = r14.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x0247
        L_0x0238:
            r6 = r20
            r7 = r21
            r9 = r22
            goto L_0x00eb
        L_0x0240:
            r20 = r6
            r21 = r7
            r22 = r9
            r6 = 0
        L_0x0247:
            r1.close()
            java.util.Iterator r0 = r15.iterator()
        L_0x024e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0263
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            r10.delete(r1)
            goto L_0x024e
        L_0x0263:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            java.util.LinkedList<te3.sl2> r0 = r3.f137242d
            int r0 = r0.size()
            if (r0 != 0) goto L_0x029a
            r2 = 0
        L_0x026f:
            te3.l74 r0 = r4.f90985g
            java.util.LinkedList<te3.sl2> r0 = r0.f137242d
            int r0 = r0.size()
            if (r0 > 0) goto L_0x027a
            goto L_0x028c
        L_0x027a:
            te3.l74 r0 = r4.f90985g
            java.util.LinkedList<te3.sl2> r0 = r0.f137242d
            java.lang.Object r0 = r0.remove()
            te3.sl2 r0 = (te3.C51263sl2) r0
            pe3.b r1 = r0.f141589e
            byte[] r1 = r1.f257327a
            int r3 = r1.length
            int r3 = r3 + r2
            if (r3 < r8) goto L_0x0292
        L_0x028c:
            java.lang.String r0 = "read from memery"
            r1 = r22
            goto L_0x02a8
        L_0x0292:
            int r1 = r1.length
            int r2 = r2 + r1
            r1 = r22
            r1.add(r0)
            goto L_0x026f
        L_0x029a:
            r1 = r22
            r2 = 0
        L_0x029d:
            java.util.LinkedList<te3.sl2> r0 = r3.f137242d
            int r0 = r0.size()
            if (r0 > 0) goto L_0x032b
            java.lang.String r0 = "read from db"
        L_0x02a8:
            int r3 = r1.size()
            java.lang.String r5 = "MicroMsg.SnsLogMgr"
            if (r3 != 0) goto L_0x02be
            java.lang.String r0 = "nothing for report"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r6 = r20
            r7 = r21
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            goto L_0x031e
        L_0x02be:
            r6 = r20
            r7 = r21
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "size "
            r3.append(r9)
            r3.append(r2)
            java.lang.String r2 = " "
            r3.append(r2)
            int r9 = r1.size()
            r3.append(r9)
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = " logItemList.LogList.size  "
            r3.append(r2)
            te3.l74 r2 = r4.f90985g
            java.util.LinkedList<te3.sl2> r2 = r2.f137242d
            int r2 = r2.size()
            r3.append(r2)
            java.lang.String r2 = " label:  "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.lang.String r0 = "reportInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            jp2.k r2 = new jp2.k
            r2.<init>(r1)
            f40.C86709a0.m107528h()
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r1.mo123460f(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
        L_0x031e:
            r5 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            r10 = r16
            r9 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
            return
        L_0x032b:
            r10 = r16
            r9 = r17
            r5 = r18
            r6 = r20
            r7 = r21
            java.util.LinkedList<te3.sl2> r0 = r3.f137242d
            java.lang.Object r0 = r0.remove()
            te3.sl2 r0 = (te3.C51263sl2) r0
            r1.add(r0)
            pe3.b r0 = r0.f141589e
            byte[] r0 = r0.f257327a
            int r0 = r0.length
            int r2 = r2 + r0
            goto L_0x029d
        */
        throw new UnsupportedOperationException("Method not decompiled: jp2.C33620s.run():void");
    }
}
