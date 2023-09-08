package hc2;

import f62.C31922b1;

/* renamed from: hc2.e */
public class C117078e implements C31922b1 {
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0119, code lost:
        if (r1 == 1) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0147, code lost:
        if (r12 != false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0149, code lost:
        r46 = "";
        r15 = 1;
        r29 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x063b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0169  */
    /* renamed from: X5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo10269X5(java.lang.String r56, java.util.Map<java.lang.String, java.lang.String> r57, ob0.C35136m.C35137a r58) {
        /*
            r55 = this;
            r0 = r57
            f40.e r1 = f40.C86709a0.m107523b()
            r1.mo121108c()
            gc2.b r1 = gc2.C116945b.zx0()
            com.tencent.mm.plugin.newtips.model.p r7 = r1.f350435h
            r7.getClass()
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r1[r9] = r56
            java.lang.String r11 = "MicroMsg.NewTips.NewTipsXMLConsumer"
            java.lang.String r2 = "dancy consumeNewXml， subType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r56)
            java.lang.String r2 = "newtips"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0a5c
            if (r0 == 0) goto L_0x0a5c
            java.lang.String r1 = ".sysmsg.newtips.tips_showInfo_list"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r13 = "newtips_gettipstime"
            java.lang.String r14 = "_newtips_report"
            java.lang.String r15 = ""
            java.lang.String r2 = ".sysmsg.newtips.control.disappear_time"
            java.lang.String r3 = ".sysmsg.newtips.control.overdue_time"
            java.lang.String r4 = ".sysmsg.newtips.control.begin_time"
            java.lang.String r5 = ".sysmsg.newtips.control.tips_type"
            java.lang.String r6 = ".sysmsg.newtips.control.tips_id"
            r16 = 17
            r17 = 16
            r18 = 15
            r19 = 14
            r20 = 13
            r21 = 12
            r22 = 11
            r23 = 10
            r24 = 9
            r25 = 8
            r26 = 7
            r27 = 6
            r28 = r13
            r12 = 0
            r8 = 2
            if (r1 == 0) goto L_0x084c
            boolean r1 = r0.containsKey(r6)
            if (r1 == 0) goto L_0x0079
            java.lang.Object r1 = r0.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            long r30 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r12)
            goto L_0x007b
        L_0x0079:
            r30 = r12
        L_0x007b:
            java.lang.String r1 = ".sysmsg.newtips.control.unique_id"
            boolean r6 = r0.containsKey(r1)
            if (r6 == 0) goto L_0x008f
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r6 = r1
            goto L_0x0090
        L_0x008f:
            r6 = r15
        L_0x0090:
            java.lang.String r1 = ".sysmsg.newtips.control.op"
            boolean r32 = r0.containsKey(r1)
            if (r32 == 0) goto L_0x00a3
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r9)
            goto L_0x00a4
        L_0x00a3:
            r1 = 0
        L_0x00a4:
            boolean r32 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r32 == 0) goto L_0x00b0
            java.lang.String r12 = "checkNumValidUniqueIdAndOp() uniqueId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            goto L_0x00d1
        L_0x00b0:
            java.lang.Object[] r12 = new java.lang.Object[r8]
            r12[r9] = r6
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r8 = 1
            r12[r8] = r13
            java.lang.String r13 = "checkNumValidUniqueIdAndOp() uniqueId:%s op:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r12)
            if (r1 == 0) goto L_0x00d3
            if (r1 == r8) goto L_0x00d3
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r12[r9] = r8
            java.lang.String r8 = "checkNumValidUniqueIdAndOp() op:%s not exist in (0,1)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r8, r12)
        L_0x00d1:
            r8 = 0
            goto L_0x00d4
        L_0x00d3:
            r8 = 1
        L_0x00d4:
            if (r8 != 0) goto L_0x00d8
            goto L_0x01e9
        L_0x00d8:
            boolean r8 = r0.containsKey(r5)
            if (r8 == 0) goto L_0x00e9
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r9)
            goto L_0x00ea
        L_0x00e9:
            r5 = 0
        L_0x00ea:
            jc2.b r8 = gc2.C116945b.xx0()
            java.util.List r8 = r8.mo182004Lo(r6)
            r12 = 3
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r13[r9] = r12
            r12 = 1
            r13[r12] = r6
            java.lang.Integer r29 = java.lang.Integer.valueOf(r1)
            r34 = 2
            r13[r34] = r29
            java.lang.String r9 = "checkLogicValidOp() newTips type(%s) unique_id(%s) op(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r9, r13)
            r9 = r8
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r13 = r9.size()
            if (r13 > 0) goto L_0x011c
            java.lang.String r13 = "checkLogicValidOp() uniqueId not exist in storage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r13)
            if (r1 != r12) goto L_0x0149
            goto L_0x011e
        L_0x011c:
            if (r5 != 0) goto L_0x0122
        L_0x011e:
            r46 = r15
            r15 = 1
            goto L_0x0163
        L_0x0122:
            if (r1 != r12) goto L_0x014f
            java.util.Iterator r13 = r9.iterator()
        L_0x0128:
            boolean r29 = r13.hasNext()
            if (r29 == 0) goto L_0x0146
            java.lang.Object r29 = r13.next()
            r12 = r29
            com.tencent.mm.plugin.newtips.model.k r12 = (com.tencent.p014mm.plugin.newtips.model.C115626k) r12
            int r12 = r12.field_state
            if (r12 == 0) goto L_0x0144
            r35 = r13
            r13 = 1
            if (r12 != r13) goto L_0x0140
            goto L_0x0144
        L_0x0140:
            r13 = r35
            r12 = 1
            goto L_0x0128
        L_0x0144:
            r12 = 1
            goto L_0x0147
        L_0x0146:
            r12 = 0
        L_0x0147:
            if (r12 == 0) goto L_0x014f
        L_0x0149:
            r46 = r15
            r15 = 1
            r29 = 1
            goto L_0x0165
        L_0x014f:
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r12 = 0
            r13[r12] = r6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r46 = r15
            r15 = 1
            r13[r15] = r12
            java.lang.String r12 = "checkLogicValidOp() unique_id(%s) exist(op:%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r13)
        L_0x0163:
            r29 = 0
        L_0x0165:
            if (r29 != 0) goto L_0x0169
            goto L_0x01e9
        L_0x0169:
            if (r1 != r15) goto L_0x01ec
            java.util.Iterator r1 = r9.iterator()
        L_0x016f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x017f
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.newtips.model.k r2 = (com.tencent.p014mm.plugin.newtips.model.C115626k) r2
            r3 = 2
            r2.field_state = r3
            goto L_0x016f
        L_0x017f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.newtips.model.g> r1 = r7.f163781a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r9 = r1.iterator()
        L_0x0189:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x01cc
            java.lang.Object r1 = r9.next()
            r10 = r1
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r1 = r10.getValue()
            r12 = r1
            com.tencent.mm.plugin.newtips.model.g r12 = (com.tencent.p014mm.plugin.newtips.model.C57149g) r12
            if (r12 == 0) goto L_0x0189
            r1 = r12
            r2 = r30
            r4 = r6
            r5 = r8
            r15 = r6
            r6 = r57
            boolean r1 = r1.mo77297b(r2, r4, r5, r6)
            if (r1 == 0) goto L_0x01ca
            r1 = 4
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object r1 = r10.getKey()
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r12
            java.lang.Long r1 = java.lang.Long.valueOf(r30)
            r2 = 2
            r0[r2] = r1
            r1 = 3
            r0[r1] = r15
            java.lang.String r1 = "[handleNewXml] key=%s, handleCallback=%s has cancel consume. tipsId=%s uniqueId=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            goto L_0x01e9
        L_0x01ca:
            r6 = r15
            goto L_0x0189
        L_0x01cc:
            r1 = 1
            jc2.b r0 = gc2.C116945b.xx0()
            int r0 = r0.mo182005Ow(r8)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "handleNewXml() update localNewTips state to NEW_TIPS_STATE_CANCEL. ret: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r1)
            gc2.C116945b.yx0()
            com.tencent.p014mm.plugin.newtips.model.C115627l.m162580f(r8)
        L_0x01e9:
            r9 = r7
            goto L_0x0840
        L_0x01ec:
            r15 = r6
            r12 = r30
            int r1 = (int) r12
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r6 = ".sysmsg.newtips.tips_showInfo_list.size"
            boolean r9 = r0.containsKey(r6)
            if (r9 == 0) goto L_0x0209
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r9 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r9)
            goto L_0x020a
        L_0x0209:
            r6 = 0
        L_0x020a:
            if (r6 != 0) goto L_0x021d
            java.lang.String r2 = "parseNewTips() tipsCount == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            r49 = r7
            r30 = r10
            r7 = r11
            r47 = r12
            r31 = r14
            goto L_0x0691
        L_0x021d:
            java.lang.String r9 = ".sysmsg.newtips.control.android_min_clientversion"
            boolean r30 = r0.containsKey(r9)
            if (r30 == 0) goto L_0x0233
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            r30 = r10
            r10 = 0
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r10)
            goto L_0x0236
        L_0x0233:
            r30 = r10
            r9 = 0
        L_0x0236:
            java.lang.String r10 = ".sysmsg.newtips.control.android_max_clientversion"
            boolean r31 = r0.containsKey(r10)
            if (r31 == 0) goto L_0x024e
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r31 = r14
            r14 = 2147483647(0x7fffffff, float:NaN)
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r14)
            goto L_0x0251
        L_0x024e:
            r31 = r14
            r10 = 0
        L_0x0251:
            java.lang.String r14 = ".sysmsg.newtips.control.priority"
            boolean r34 = r0.containsKey(r14)
            if (r34 == 0) goto L_0x0267
            java.lang.Object r14 = r0.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            r47 = r12
            r12 = 0
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r12)
            goto L_0x026a
        L_0x0267:
            r47 = r12
            r13 = 0
        L_0x026a:
            boolean r12 = r0.containsKey(r4)
            if (r12 == 0) goto L_0x0281
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r12 = r7
            r14 = r8
            r7 = 0
            long r32 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r7)
            r34 = r32
            goto L_0x0287
        L_0x0281:
            r12 = r7
            r14 = r8
            r7 = 0
            r34 = r7
        L_0x0287:
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L_0x029a
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r32 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r7)
            r3 = r32
            goto L_0x029b
        L_0x029a:
            r3 = r7
        L_0x029b:
            boolean r32 = r0.containsKey(r2)
            if (r32 == 0) goto L_0x02ac
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r36 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r7)
            goto L_0x02ae
        L_0x02ac:
            r36 = 0
        L_0x02ae:
            java.lang.String r2 = ".sysmsg.newtips.ext_info"
            boolean r7 = r0.containsKey(r2)
            if (r7 == 0) goto L_0x02c5
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r2.trim()
            goto L_0x02c7
        L_0x02c5:
            r2 = r46
        L_0x02c7:
            r7 = 0
            int r32 = (r34 > r7 ? 1 : (r34 == r7 ? 0 : -1))
            if (r32 != 0) goto L_0x02e6
            long r32 = eb0.C31543z5.m39451a()
            r34 = 1000(0x3e8, double:4.94E-321)
            long r34 = r32 / r34
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r15
            java.lang.String r7 = "parseNewTips() doudi(unique_id:%s) => beginShowTime==0"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r7, r8)
            r7 = r34
            r32 = 0
            goto L_0x02ea
        L_0x02e6:
            r32 = r7
            r7 = r34
        L_0x02ea:
            int r34 = (r36 > r32 ? 1 : (r36 == r32 ? 0 : -1))
            if (r34 != 0) goto L_0x030b
            int r34 = (r3 > r32 ? 1 : (r3 == r32 ? 0 : -1))
            if (r34 != 0) goto L_0x030b
            java.lang.Long r32 = com.tencent.p014mm.plugin.newtips.model.C57150p.f163780b
            long r32 = r32.longValue()
            long r36 = r7 + r32
            r49 = r12
            r50 = r14
            r12 = 1
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r12 = 0
            r14[r12] = r15
            java.lang.String r12 = "parseNewTips() doudi(unique_id:%s) => disappearTime==0"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r14)
            goto L_0x030f
        L_0x030b:
            r49 = r12
            r50 = r14
        L_0x030f:
            r51 = r36
            java.lang.String r12 = ".sysmsg.newtips.control.regcountry"
            java.lang.Object r12 = r0.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r14 = ".sysmsg.newtips.control.lang"
            java.lang.Object r14 = r0.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            r53 = r11
            r11 = 0
        L_0x0324:
            if (r11 >= r6) goto L_0x068d
            r54 = r6
            com.tencent.mm.plugin.newtips.model.k r6 = new com.tencent.mm.plugin.newtips.model.k
            r32 = r6
            r33 = r15
            r34 = r1
            r35 = r13
            r36 = r5
            r37 = r7
            r39 = r3
            r41 = r51
            r43 = r9
            r44 = r10
            r45 = r2
            r32.<init>(r33, r34, r35, r36, r37, r39, r41, r43, r44, r45)
            r6.field_lang = r14
            r6.field_regCountry = r12
            if (r11 != 0) goto L_0x0414
            r32 = r2
            java.lang.String r2 = ".sysmsg.newtips.tips_showInfo_list.tips_showInfo.show_type"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r33 = r3
            r3 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            r6.field_showType = r2
            java.lang.String r2 = ".sysmsg.newtips.tips_showInfo_list.tips_showInfo.title"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r2.trim()
            r6.field_title = r2
            java.lang.String r2 = ".sysmsg.newtips.tips_showInfo_list.tips_showInfo.icon_url"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r2.trim()
            r6.field_icon_url = r2
            java.lang.String r2 = ".sysmsg.newtips.tips_showInfo_list.tips_showInfo.path"
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r2.trim()
            int r3 = com.tencent.p014mm.plugin.newtips.model.C115624i.m162567c(r2)
            if (r3 != 0) goto L_0x0399
            r6.field_dynamicPath = r2
            goto L_0x039b
        L_0x0399:
            r6.field_path = r3
        L_0x039b:
            java.lang.String r2 = ".sysmsg.newtips.tips_showInfo_list.tips_showInfo.parents.size"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x03af
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)
            goto L_0x03b0
        L_0x03af:
            r2 = 0
        L_0x03b0:
            if (r2 == 0) goto L_0x0410
            te3.wg4 r3 = new te3.wg4
            r3.<init>()
            r4 = 0
        L_0x03b8:
            if (r4 >= r2) goto L_0x0402
            r35 = r2
            java.lang.String r2 = ".sysmsg.newtips.tips_showInfo_list.tips_showInfo.parents.parent"
            if (r4 != 0) goto L_0x03d1
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r2.trim()
            r36 = r5
            goto L_0x03f0
        L_0x03d1:
            r36 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r2.trim()
        L_0x03f0:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 != 0) goto L_0x03fb
            java.util.LinkedList<java.lang.String> r5 = r3.f144043d
            r5.add(r2)
        L_0x03fb:
            int r4 = r4 + 1
            r2 = r35
            r5 = r36
            goto L_0x03b8
        L_0x0402:
            r36 = r5
            java.util.LinkedList<java.lang.String> r2 = r3.f144043d
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x056c
            r6.field_parents = r3
            goto L_0x056c
        L_0x0410:
            r36 = r5
            goto L_0x056c
        L_0x0414:
            r32 = r2
            r33 = r3
            r36 = r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ".sysmsg.newtips.tips_showInfo_list.tips_showInfo"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r4 = ".show_type"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r4)
            r6.field_showType = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r11)
            java.lang.String r4 = ".title"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r2.trim()
            r6.field_title = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r11)
            java.lang.String r4 = ".icon_url"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r2.trim()
            r6.field_icon_url = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r11)
            java.lang.String r4 = ".path"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.trim()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            int r4 = com.tencent.p014mm.plugin.newtips.model.C115624i.m162567c(r2)
            if (r4 != 0) goto L_0x04b0
            r6.field_dynamicPath = r2
            goto L_0x04b2
        L_0x04b0:
            r6.field_path = r4
        L_0x04b2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r11)
            java.lang.String r4 = ".parents"
            r2.append(r4)
            java.lang.String r5 = ".size"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x04f2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r11)
            r2.append(r4)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r5 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)
            goto L_0x04f3
        L_0x04f2:
            r2 = 0
        L_0x04f3:
            if (r2 == 0) goto L_0x056c
            te3.wg4 r5 = new te3.wg4
            r5.<init>()
            r37 = r7
            r7 = 0
        L_0x04fd:
            if (r7 >= r2) goto L_0x0561
            java.lang.String r8 = ".parent"
            if (r7 != 0) goto L_0x0529
            r35 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r11)
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r2.trim()
            goto L_0x0551
        L_0x0529:
            r35 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r11)
            r2.append(r4)
            r2.append(r8)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r2 = r2.trim()
        L_0x0551:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r8 != 0) goto L_0x055c
            java.util.LinkedList<java.lang.String> r8 = r5.f144043d
            r8.add(r2)
        L_0x055c:
            int r7 = r7 + 1
            r2 = r35
            goto L_0x04fd
        L_0x0561:
            java.util.LinkedList<java.lang.String> r2 = r5.f144043d
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x056e
            r6.field_parents = r5
            goto L_0x056e
        L_0x056c:
            r37 = r7
        L_0x056e:
            int r2 = r6.field_showType
            com.tencent.mm.plugin.newtips.model.n r2 = com.tencent.p014mm.plugin.newtips.model.C115631n.m162599a(r2)
            int r3 = r2.ordinal()
            java.lang.String r4 = "parseNewTips() doudi(unique_id:%s path:%s showType:%s) => field_title==null"
            r5 = 3
            if (r3 == r5) goto L_0x063b
            java.lang.String r5 = "parseNewTips() doudi(unique_id:%s path:%s showType:%s) => field_icon_url==null"
            r7 = 4
            if (r3 == r7) goto L_0x0613
            r7 = 5
            if (r3 == r7) goto L_0x058e
            r8 = r50
            r7 = r53
            r3 = 2
            goto L_0x0666
        L_0x058e:
            java.lang.String r3 = r6.field_title
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x05c2
            java.lang.String r3 = r6.field_icon_url
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x05c2
            r3 = 0
            r6.field_showType = r3
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r4 = r6.field_uniqueId
            r5[r3] = r4
            int r3 = r6.field_path
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r5[r4] = r3
            java.lang.String r2 = r2.toString()
            r3 = 2
            r5[r3] = r2
            java.lang.String r2 = "parseNewTips() doudi(unique_id:%s path:%s showType:%s) => field_title==null && field_icon_url==null"
            r7 = r53
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r5)
            goto L_0x0663
        L_0x05c2:
            r7 = r53
            java.lang.String r3 = r6.field_title
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x05eb
            r3 = 3
            r6.field_showType = r3
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r3 = r6.field_uniqueId
            r8 = 0
            r5[r8] = r3
            int r3 = r6.field_path
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8 = 1
            r5[r8] = r3
            java.lang.String r2 = r2.toString()
            r3 = 2
            r5[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r5)
            goto L_0x0664
        L_0x05eb:
            r3 = 2
            java.lang.String r4 = r6.field_icon_url
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0664
            r6.field_showType = r3
            r4 = 3
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r4 = r6.field_uniqueId
            r35 = 0
            r8[r35] = r4
            int r4 = r6.field_path
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r29 = 1
            r8[r29] = r4
            java.lang.String r2 = r2.toString()
            r8[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r8)
            goto L_0x0663
        L_0x0613:
            r7 = r53
            java.lang.String r3 = r6.field_icon_url
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0663
            r3 = 0
            r6.field_showType = r3
            r4 = 3
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r4 = r6.field_uniqueId
            r8[r3] = r4
            int r3 = r6.field_path
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r8[r4] = r3
            java.lang.String r2 = r2.toString()
            r3 = 2
            r8[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r8)
            goto L_0x0663
        L_0x063b:
            r7 = r53
            java.lang.String r3 = r6.field_title
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0663
            r3 = 0
            r6.field_showType = r3
            r5 = 3
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r5 = r6.field_uniqueId
            r8[r3] = r5
            int r3 = r6.field_path
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r8[r5] = r3
            java.lang.String r2 = r2.toString()
            r3 = 2
            r8[r3] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r8)
            goto L_0x0664
        L_0x0663:
            r3 = 2
        L_0x0664:
            r8 = r50
        L_0x0666:
            r8.add(r6)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r6
            java.lang.String r3 = "parseNewTips() i:%s newTipsInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r3, r2)
            int r11 = r11 + 1
            r53 = r7
            r50 = r8
            r2 = r32
            r3 = r33
            r5 = r36
            r7 = r37
            r6 = r54
            goto L_0x0324
        L_0x068d:
            r8 = r50
            r7 = r53
        L_0x0691:
            com.tencent.mm.plugin.newtips.model.j r1 = com.tencent.p014mm.plugin.newtips.model.C115622f.m162564a(r1)
            if (r1 != 0) goto L_0x0699
            r1 = 1
            goto L_0x069d
        L_0x0699:
            boolean r1 = r1.mo175759a(r8)
        L_0x069d:
            if (r1 == 0) goto L_0x0839
            r9 = r49
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.newtips.model.g> r1 = r9.f163781a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r10 = r1.iterator()
        L_0x06ab:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x06ec
            java.lang.Object r1 = r10.next()
            r11 = r1
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r1 = r11.getValue()
            r12 = r1
            com.tencent.mm.plugin.newtips.model.g r12 = (com.tencent.p014mm.plugin.newtips.model.C57149g) r12
            if (r12 == 0) goto L_0x06ab
            r1 = r12
            r2 = r47
            r4 = r15
            r5 = r8
            r6 = r57
            boolean r1 = r1.mo77296a(r2, r4, r5, r6)
            if (r1 == 0) goto L_0x06ab
            r1 = 4
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object r1 = r11.getKey()
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r12
            java.lang.Long r1 = java.lang.Long.valueOf(r47)
            r2 = 2
            r0[r2] = r1
            r1 = 3
            r0[r1] = r15
            java.lang.String r1 = "[handleNewXml] key=%s, handleCallback=%s has add consume. tipsId=%s uniqueId=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            goto L_0x0840
        L_0x06ec:
            jc2.b r0 = gc2.C116945b.xx0()
            r0.getClass()
            int r1 = r8.size()
            if (r1 > 0) goto L_0x06fb
            r5 = 0
            goto L_0x072a
        L_0x06fb:
            r1 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f351291d
            boolean r4 = r3 instanceof zh3.C91753f
            if (r4 == 0) goto L_0x070a
            zh3.f r3 = (zh3.C91753f) r3
            long r1 = r3.mo125613a()
            goto L_0x070b
        L_0x070a:
            r3 = 0
        L_0x070b:
            java.util.Iterator r4 = r8.iterator()     // Catch:{ all -> 0x0832 }
            r5 = 0
        L_0x0710:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0832 }
            if (r6 == 0) goto L_0x0725
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0832 }
            com.tencent.mm.plugin.newtips.model.k r6 = (com.tencent.p014mm.plugin.newtips.model.C115626k) r6     // Catch:{ all -> 0x0832 }
            boolean r6 = r0.insert(r6)     // Catch:{ all -> 0x0832 }
            if (r6 == 0) goto L_0x0710
            int r5 = r5 + 1
            goto L_0x0710
        L_0x0725:
            if (r3 == 0) goto L_0x072a
            r3.endTransaction(r1)
        L_0x072a:
            com.tencent.mm.autogen.events.NotifyPushNewTipsEvent r0 = new com.tencent.mm.autogen.events.NotifyPushNewTipsEvent
            r0.<init>()
            com.tencent.mm.autogen.events.NotifyPushNewTipsEvent$a r1 = r0.f193768d
            r1.f193769a = r15
            r0.publish()
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "handleNewXml() insert ret:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r1)
            gc2.C116945b.yx0()
            com.tencent.p014mm.plugin.newtips.model.C115627l.m162580f(r8)
            java.util.Iterator r0 = r8.iterator()
        L_0x074f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0840
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.newtips.model.k r1 = (com.tencent.p014mm.plugin.newtips.model.C115626k) r1
            if (r1 != 0) goto L_0x076b
            java.lang.String r1 = "reportNewTips, newTipsInfo is null !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            r57 = r0
            r10 = r28
            r11 = r31
            goto L_0x082a
        L_0x076b:
            int r2 = r1.field_tipId
            java.lang.String r3 = r1.field_uniqueId
            int r3 = r3.hashCode()
            int r4 = r1.field_tipType
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r10.append(r11)
            r11 = r31
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r12 = 0
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r10, r12)
            android.content.SharedPreferences$Editor r8 = r8.edit()
            r10 = r28
            android.content.SharedPreferences$Editor r8 = r8.putLong(r10, r5)
            r8.commit()
            int r8 = r1.field_showType
            java.lang.String r12 = r1.field_title
            java.lang.String r13 = r1.field_icon_url
            java.lang.String r14 = r1.field_dynamicPath
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 == 0) goto L_0x07b9
            int r14 = r1.field_path
            java.lang.String r14 = com.tencent.p014mm.plugin.newtips.model.C115624i.m162568d(r14)
            goto L_0x07bb
        L_0x07b9:
            java.lang.String r14 = r1.field_dynamicPath
        L_0x07bb:
            r57 = r0
            r15 = 4
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r15 = 0
            r0[r15] = r30
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r28 = 1
            r0[r28] = r15
            java.lang.String r15 = r1.field_uniqueId
            r28 = 2
            r0[r28] = r15
            r15 = 3
            r0[r15] = r14
            java.lang.String r15 = "newtipsreport:%d, id:%s_%s_%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r15, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 19
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r28 = 0
            r15[r28] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 1
            r15[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r3 = 2
            r15[r3] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r3 = 3
            r15[r3] = r2
            r2 = 4
            r15[r2] = r46
            r2 = 5
            r15[r2] = r46
            r15[r27] = r46
            r15[r26] = r46
            r15[r25] = r46
            r15[r24] = r46
            r15[r23] = r46
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r15[r22] = r2
            r15[r21] = r12
            r15[r20] = r13
            r15[r19] = r14
            r15[r18] = r30
            r15[r17] = r30
            r15[r16] = r30
            java.lang.String r1 = r1.field_uniqueId
            r2 = 18
            r15[r2] = r1
            r1 = 14995(0x3a93, float:2.1012E-41)
            r0.mo160131h(r1, r15)
        L_0x082a:
            r0 = r57
            r28 = r10
            r31 = r11
            goto L_0x074f
        L_0x0832:
            r0 = move-exception
            if (r3 == 0) goto L_0x0838
            r3.endTransaction(r1)
        L_0x0838:
            throw r0
        L_0x0839:
            r9 = r49
            java.lang.String r0 = "handleNewXml() no insert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x0840:
            com.tencent.mm.plugin.newtips.model.o r0 = new com.tencent.mm.plugin.newtips.model.o
            r0.<init>(r9)
            r1 = 30000(0x7530, double:1.4822E-319)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r1)
            goto L_0x0a5c
        L_0x084c:
            r30 = r10
            r7 = r11
            r11 = r14
            r46 = r15
            r10 = r28
            com.tencent.mm.plugin.newtips.model.l r1 = gc2.C116945b.yx0()
            r1.getClass()
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            com.tencent.mm.plugin.newtips.model.d r1 = new com.tencent.mm.plugin.newtips.model.d
            r1.<init>()
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r12 = 0
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r12)
            r1.field_tipId = r6
            java.lang.String r6 = ".sysmsg.newtips.control.tips_version"
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r12)
            r1.field_tipVersion = r6
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r12)
            r1.field_tipType = r5
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r5)
            long r8 = java.lang.Math.max(r12, r8)
            r1.field_beginShowTime = r8
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r5)
            r1.field_overdueTime = r3
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r5)
            r1.field_disappearTime = r2
            java.lang.String r2 = ".sysmsg.newtips.control.tips_showInfo"
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto L_0x08f7
            te3.vg4 r2 = new te3.vg4
            r2.<init>()
            r1.field_tipsShowInfo = r2
            java.lang.String r3 = ".sysmsg.newtips.control.tips_showInfo.show_type"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r4)
            r2.f354503d = r3
            te3.vg4 r2 = r1.field_tipsShowInfo
            java.lang.String r3 = ".sysmsg.newtips.control.tips_showInfo.title"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.f354504e = r3
            te3.vg4 r2 = r1.field_tipsShowInfo
            java.lang.String r3 = ".sysmsg.newtips.control.tips_showInfo.icon_url"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.f354505f = r3
            te3.vg4 r2 = r1.field_tipsShowInfo
            java.lang.String r3 = ".sysmsg.newtips.control.tips_showInfo.path"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.f354506g = r3
        L_0x08f7:
            java.lang.String r2 = ".sysmsg.newtips.control.tips_showInfo."
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.field_extInfo = r0
            jc2.a r0 = gc2.C116945b.vx0()
            int r2 = r1.field_tipId
            r0.mo182002jo(r2)
            com.tencent.mm.plugin.newtips.model.e r0 = gc2.C116945b.wx0()
            boolean r2 = r0.mo175756e(r1)
            if (r2 == 0) goto L_0x0926
            boolean r2 = r0.mo175754c(r1)
            if (r2 == 0) goto L_0x0926
            boolean r0 = r0.mo175757f(r1)
            if (r0 == 0) goto L_0x0926
            boolean r0 = r1.field_isReject
            if (r0 != 0) goto L_0x0926
            r0 = 1
            goto L_0x0927
        L_0x0926:
            r0 = 0
        L_0x0927:
            if (r0 == 0) goto L_0x0936
            r0 = 1
            r1.field_isExit = r0
            jc2.a r0 = gc2.C116945b.vx0()
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            r0.update(r1, r3)
        L_0x0936:
            int r0 = r1.field_tipId
            int r2 = r1.field_tipVersion
            int r3 = r1.field_tipType
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r8.append(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r9 = 0
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r8, r9)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            android.content.SharedPreferences$Editor r6 = r6.putLong(r10, r4)
            r6.commit()
            te3.vg4 r6 = r1.field_tipsShowInfo
            if (r6 == 0) goto L_0x096f
            int r8 = r6.f354503d
            r12 = r8
            goto L_0x0970
        L_0x096f:
            r12 = 0
        L_0x0970:
            if (r6 == 0) goto L_0x0975
            java.lang.String r8 = r6.f354504e
            goto L_0x0977
        L_0x0975:
            r8 = r46
        L_0x0977:
            if (r6 == 0) goto L_0x097c
            java.lang.String r9 = r6.f354505f
            goto L_0x097e
        L_0x097c:
            r9 = r46
        L_0x097e:
            if (r6 == 0) goto L_0x0983
            java.lang.String r6 = r6.f354506g
            goto L_0x0985
        L_0x0983:
            r6 = r46
        L_0x0985:
            com.tencent.mm.plugin.newtips.model.e r10 = gc2.C116945b.wx0()
            boolean r11 = r10.mo175754c(r1)
            if (r11 != 0) goto L_0x0991
            r10 = 2
            goto L_0x09d4
        L_0x0991:
            boolean r11 = r10.mo175757f(r1)
            if (r11 != 0) goto L_0x0999
            r10 = 3
            goto L_0x09d4
        L_0x0999:
            boolean r10 = r10.mo175756e(r1)
            if (r10 != 0) goto L_0x09a1
            r10 = 4
            goto L_0x09d4
        L_0x09a1:
            jc2.a r10 = gc2.C116945b.vx0()
            int r11 = r1.field_tipId
            com.tencent.mm.plugin.newtips.model.d r10 = r10.mo182002jo(r11)
            if (r10 == 0) goto L_0x09b5
            int r11 = r1.field_tipType
            int r10 = r10.field_tipType
            if (r11 != r10) goto L_0x09b5
            r10 = 1
            goto L_0x09b6
        L_0x09b5:
            r10 = 0
        L_0x09b6:
            if (r10 != 0) goto L_0x09ba
            r10 = 5
            goto L_0x09d4
        L_0x09ba:
            jc2.a r10 = gc2.C116945b.vx0()
            int r11 = r1.field_tipId
            com.tencent.mm.plugin.newtips.model.d r10 = r10.mo182002jo(r11)
            if (r10 == 0) goto L_0x09c8
            r10 = 1
            goto L_0x09c9
        L_0x09c8:
            r10 = 0
        L_0x09c9:
            if (r10 != 0) goto L_0x09cd
            r10 = 6
            goto L_0x09d4
        L_0x09cd:
            boolean r10 = r1.field_isReject
            if (r10 == 0) goto L_0x09d3
            r10 = 7
            goto L_0x09d4
        L_0x09d3:
            r10 = 0
        L_0x09d4:
            r11 = 1
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r14 = 0
            r13[r14] = r30
            java.lang.String r15 = "newtipsreport:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r15, r13)
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 18
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13[r14] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r13[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2 = 2
            r13[r2] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2 = 3
            r13[r2] = r0
            r0 = 4
            r13[r0] = r46
            r0 = 5
            r13[r0] = r46
            r13[r27] = r46
            r13[r26] = r46
            r13[r25] = r46
            r13[r24] = r46
            r13[r23] = r46
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r13[r22] = r0
            r13[r21] = r8
            r13[r20] = r9
            r13[r19] = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r13[r18] = r0
            r13[r17] = r30
            r13[r16] = r46
            r0 = 14995(0x3a93, float:2.1012E-41)
            r7.mo160131h(r0, r13)
            com.tencent.mm.plugin.newtips.model.l r0 = gc2.C116945b.yx0()
            com.tencent.mm.plugin.newtips.model.l$c r0 = r0.f346855e
            if (r0 == 0) goto L_0x0a5c
            com.tencent.mm.plugin.newtips.model.e r2 = gc2.C116945b.wx0()
            boolean r2 = r2.mo175753a(r1)
            if (r2 == 0) goto L_0x0a5c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            boolean r3 = r1.field_isExit
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            long r3 = r1.field_beginShowTime
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "dancy"
            java.lang.String r4 = "dancy consumeNewXml notifyShowNewTips isExit: %s, begintime: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r2)
            r0.mo96256a(r1)
        L_0x0a5c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hc2.C117078e.mo10269X5(java.lang.String, java.util.Map, ob0.m$a):ob0.m$b");
    }
}
