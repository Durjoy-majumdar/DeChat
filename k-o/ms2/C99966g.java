package ms2;

/* renamed from: ms2.g */
public final class C99966g {

    /* renamed from: a */
    public static final C99966g f292911a = new C99966g();

    /* renamed from: b */
    public static boolean f292912b;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00e1, code lost:
        if (r11.f298733G != false) goto L_0x00ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x013a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Object> mo139307a() {
        /*
            r15 = this;
            java.lang.String r0 = "refreshUnreadFailedNotify"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.snstimeline.SnsPostActionFailedHandler"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            int r2 = com.tencent.p014mm.plugin.sns.model.C94897n1.f274990d
            java.lang.String r2 = "getListErrorInTimeLine"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
            java.lang.String r6 = " AND "
            java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            os2.e0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            r8.getClass()
            java.lang.String r9 = "getTimeLineFeedAndPostCoverError"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r7)
            java.lang.String r10 = "getTimeLineErrorAndPostCoverErrorSql"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r7)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            os2.C100400e0.m131327CP()
            java.lang.String r12 = " (sourceType & 2 != 0 ) "
            r11.append(r12)
            r11.append(r6)
            java.lang.String r12 = os2.C100400e0.f294102u
            r11.append(r12)
            r11.append(r6)
            java.lang.String r12 = " (snsId = 0  ) "
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = os2.C100400e0.f294089C
            r12.append(r13)
            r12.append(r6)
            java.lang.String r6 = os2.C100400e0.f294088B
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "select *,rowid from SnsInfo  where ("
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = ") OR ("
            r12.append(r11)
            r12.append(r6)
            java.lang.String r6 = ")"
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r7)
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            r11[r12] = r6
            java.lang.String r13 = "MicroMsg.SnsInfoStorage"
            java.lang.String r14 = "getTimeLineFeedAndPostCoverError: sql:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r14, r11)
            os2.k0 r8 = r8.f294108d
            android.database.Cursor r5 = r8.rawQuery(r6, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r7)
            int r6 = r5.getCount()
            java.lang.String r7 = "MicroMsg.SnsInfoStorageLogic"
            if (r6 != 0) goto L_0x00af
            r5.close()
            java.lang.String r5 = "getListErrorInTimeLine: originCount = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x0113
        L_0x00af:
            r5.moveToFirst()
            java.lang.String r8 = eb0.C75592q0.m90789s()
        L_0x00b6:
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r9.<init>()
            r9.convertFrom((android.database.Cursor) r5)
            java.lang.String r11 = r9.getUserName()
            java.lang.String r11 = r11.trim()
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x00cd
            goto L_0x00ef
        L_0x00cd:
            te3.lv2 r11 = new te3.lv2     // Catch:{ Exception -> 0x00e4 }
            r11.<init>()     // Catch:{ Exception -> 0x00e4 }
            byte[] r13 = r9.field_postBuf     // Catch:{ Exception -> 0x00e4 }
            pe3.a r11 = r11.parseFrom(r13)     // Catch:{ Exception -> 0x00e4 }
            te3.lv2 r11 = (te3.C101808lv2) r11     // Catch:{ Exception -> 0x00e4 }
            int r13 = r11.f298755s     // Catch:{ Exception -> 0x00e4 }
            if (r13 != 0) goto L_0x00df
            goto L_0x00ef
        L_0x00df:
            boolean r11 = r11.f298733G     // Catch:{ Exception -> 0x00e4 }
            if (r11 == 0) goto L_0x00ec
            goto L_0x00ef
        L_0x00e4:
            r11 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.String r14 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r11, r14, r13)
        L_0x00ec:
            r4.add(r9)
        L_0x00ef:
            boolean r9 = r5.moveToNext()
            if (r9 != 0) goto L_0x00b6
            r5.close()
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r12] = r6
            int r6 = r4.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r10] = r6
            java.lang.String r6 = "getListErrorInTimeLine: before filter count:%d, after filter count:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x0113:
            com.tencent.mm.plugin.sns.model.b1 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Rx0()
            r2.getClass()
            java.lang.String r3 = "getFailedItem"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            ms2.c r2 = r2.f274774a
            java.util.LinkedList<ms2.e> r2 = r2.f292905j
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            java.lang.String r3 = "getSnsAsyncQueueMgr().failedItem"
            gy3.C87412m.m108593f(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            java.lang.String r6 = "MicroMsg.SnsPostActionFailedHandler"
            if (r5 != 0) goto L_0x019a
            java.util.Iterator r3 = r3.iterator()
        L_0x013e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0182
            java.lang.Object r5 = r3.next()
            ms2.e r5 = (ms2.C99965e) r5
            java.lang.Object[] r7 = new java.lang.Object[r10]
            if (r5 != 0) goto L_0x0152
            java.lang.String r5 = "null"
            goto L_0x017a
        L_0x0152:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "snsID:"
            r8.append(r9)
            long r13 = r5.f292906d
            r8.append(r13)
            java.lang.String r9 = ", type:"
            r8.append(r9)
            int r9 = r5.f292908f
            r8.append(r9)
            java.lang.String r9 = ", opTime:"
            r8.append(r9)
            int r5 = r5.f292907e
            r8.append(r5)
            java.lang.String r5 = r8.toString()
        L_0x017a:
            r7[r12] = r5
            java.lang.String r5 = "checkEnableShowErrorIcon errorComment:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r7)
            goto L_0x013e
        L_0x0182:
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_sns_error_comment_show_enable
            boolean r3 = r3.mo58784wf(r5, r10)
            if (r3 != 0) goto L_0x019a
            java.lang.String r3 = "checkEnableShowErrorIcon not show comment error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            r2.clear()
        L_0x019a:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>(r2)
            r3.addAll(r4)
            boolean r2 = r3.isEmpty()
            r2 = r2 ^ r10
            f292912b = r2
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r4 = 589825(0x90001, float:8.26521E-40)
            boolean r5 = f292912b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r2.mo119676J(r4, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "refreshUnreadFailedNotify count:"
            r2.append(r4)
            int r4 = r3.size()
            r2.append(r4)
            java.lang.String r4 = ", hadUnreadFailedNotify:"
            r2.append(r4)
            boolean r4 = f292912b
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ms2.C99966g.mo139307a():java.util.List");
    }
}
