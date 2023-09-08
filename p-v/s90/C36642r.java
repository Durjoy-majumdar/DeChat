package s90;

import com.tencent.p014mm.storage.C72963f4;

/* renamed from: s90.r */
public final class C36642r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C36643s f97405d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f97406e;

    public C36642r(C36643s sVar, C72963f4 f4Var) {
        this.f97405d = sVar;
        this.f97406e = f4Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x017a, code lost:
        if (r7 == null) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0183, code lost:
        if (r7 == null) goto L_0x0185;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r1 = r21
            s90.s r0 = r1.f97405d
            com.tencent.mm.storage.f4 r2 = r1.f97406e
            java.lang.String r3 = "msgInfo"
            gy3.C87412m.m108593f(r2, r3)
            r0.getClass()
            java.lang.Class<gw0.b> r3 = gw0.C76073b.class
            int r4 = r2.getType()
            r0 = 721420337(0x2b000031, float:4.5475E-13)
            r5 = 318767153(0x13000031, float:1.6155966E-27)
            if (r4 == r5) goto L_0x0020
            if (r4 == r0) goto L_0x0020
            goto L_0x02c6
        L_0x0020:
            java.lang.String r5 = "MicroMsg.AppMsgInsertEventListener"
            java.lang.String r6 = ""
            r8 = 9
            r10 = 7
            r11 = 6
            r12 = 4
            r13 = 5
            r14 = 3
            r15 = 2
            r7 = 1
            r9 = 0
            if (r4 != r0) goto L_0x009e
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0[r9] = r3
            long r3 = r2.getMsgId()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r7] = r3
            long r3 = r2.getCreateTime()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r15] = r3
            java.lang.String r3 = r2.mo108768t()
            r0[r14] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r0[r12] = r3
            java.lang.String r3 = r2.mo108768t()
            r0[r13] = r3
            java.lang.String r3 = "alvinluo doReportReceiveAppMsg callback msgType: %d, msgId: %s, createTime: %s, talker: %s, businessType: %d, srcUsername: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r3, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r3[r9] = r4
            long r4 = r2.getCreateTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3[r7] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r3[r15] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r3[r14] = r4
            java.lang.String r2 = r2.mo108768t()
            r3[r12] = r2
            r3[r13] = r6
            r3[r11] = r6
            r3[r10] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r4 = 8
            r3[r4] = r2
            r2 = 20566(0x5056, float:2.8819E-41)
            r0.mo160131h(r2, r3)
            goto L_0x02c6
        L_0x009e:
            java.lang.String r0 = r2.getContent()     // Catch:{ Exception -> 0x02bd }
            java.lang.String r8 = "msg"
            r10 = 0
            java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r8, r10)     // Catch:{ Exception -> 0x02bd }
            if (r8 == 0) goto L_0x02b7
            boolean r0 = r8.isEmpty()     // Catch:{ Exception -> 0x02bd }
            if (r0 == 0) goto L_0x00b3
            goto L_0x02b7
        L_0x00b3:
            java.lang.String r0 = ".msg.fromusername"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00c2
            r0 = r6
        L_0x00c2:
            int r16 = r0.length()
            if (r16 != 0) goto L_0x00cb
            r16 = 1
            goto L_0x00cd
        L_0x00cb:
            r16 = 0
        L_0x00cd:
            if (r16 == 0) goto L_0x00d1
            r10 = r6
            goto L_0x00d2
        L_0x00d1:
            r10 = r0
        L_0x00d2:
            java.lang.String r0 = ".msg.appmsg.mmreader.template_detail.new_tmpl_type"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00e6
            int r17 = r0.length()
            if (r17 != 0) goto L_0x00e3
            goto L_0x00e6
        L_0x00e3:
            r17 = 0
            goto L_0x00e8
        L_0x00e6:
            r17 = 1
        L_0x00e8:
            if (r17 == 0) goto L_0x00ec
            java.lang.String r0 = "-1"
        L_0x00ec:
            r11 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r13 = "valueOf(newTemplateMsgStr)"
            gy3.C87412m.m108593f(r0, r13)     // Catch:{ Exception -> 0x00fb }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x00fb }
            goto L_0x0102
        L_0x00fb:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r9]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r13)
            r0 = -1
        L_0x0102:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsInt(r0, r11)
            if (r0 == r15) goto L_0x0111
            if (r0 != r14) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            r13 = 0
            goto L_0x0112
        L_0x0111:
            r13 = 1
        L_0x0112:
            if (r13 == 0) goto L_0x0116
            r13 = 1
            goto L_0x0117
        L_0x0116:
            r13 = 2
        L_0x0117:
            java.lang.String r12 = ".msg.appmsg.mmreader.category.item.template_op_type"
            java.lang.Object r12 = r8.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r11)
            if (r12 != r15) goto L_0x0126
            goto L_0x0185
        L_0x0126:
            java.lang.String r14 = ".msg.appmsg.mmreader.template_detail.template_show_type"
            java.lang.Object r14 = r8.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r9)
            java.lang.String r11 = ".msg.appmsg.mmreader.category.item.title"
            if (r14 == 0) goto L_0x017d
            java.lang.String r14 = ".msg.appmsg.mmreader.template_header.ignore_hide_title_and_time"
            java.lang.Object r14 = r8.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r9)
            if (r14 != 0) goto L_0x0151
            java.lang.String r14 = ".msg.appmsg.mmreader.template_header.hide_title_and_time"
            java.lang.Object r14 = r8.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r9)
            goto L_0x0152
        L_0x0151:
            r14 = 0
        L_0x0152:
            java.lang.String r7 = ".msg.appmsg.mmreader.template_header.hide_title"
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r7, (int) r9)
            if (r14 != 0) goto L_0x0174
            if (r7 != 0) goto L_0x0174
            java.lang.String r7 = ".msg.appmsg.mmreader.template_header.title"
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            java.lang.String r11 = "nullAsNil(values.get(\".m….template_header.title\"))"
            gy3.C87412m.m108593f(r7, r11)
            goto L_0x0186
        L_0x0174:
            java.lang.Object r7 = r8.get(r11)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x0186
            goto L_0x0185
        L_0x017d:
            java.lang.Object r7 = r8.get(r11)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x0186
        L_0x0185:
            r7 = r6
        L_0x0186:
            if (r12 != r15) goto L_0x018a
            r11 = 1
            goto L_0x018b
        L_0x018a:
            r11 = 0
        L_0x018b:
            java.lang.String r14 = ".msg.appmsg.mmreader.category.item.weapp_username"
            java.lang.Object r14 = r8.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L_0x0196
            r14 = r6
        L_0x0196:
            r9 = 1
            if (r12 != r9) goto L_0x01b4
            boolean r9 = android.text.TextUtils.isEmpty(r14)
            if (r9 != 0) goto L_0x01b4
            java.lang.String r9 = ".msg.appmsg.mmreader.category.item.weapp_path"
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x01aa
            r8 = r6
        L_0x01aa:
            java.lang.String r8 = android.net.Uri.encode(r8)
            rx3.l r9 = new rx3.l
            r9.<init>(r8, r14)
            goto L_0x01f0
        L_0x01b4:
            r9 = -1
            if (r12 != r9) goto L_0x01d8
            di3.d r9 = di3.C86312j.m106911c(r3)
            gw0.b r9 = (gw0.C76073b) r9
            boolean r9 = r9.mo94598h0(r10)
            if (r9 == 0) goto L_0x01d8
            java.lang.String r9 = ".msg.appmsg.mmreader.template_detail.opitems.opitem.url"
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x01ce
            r8 = r6
        L_0x01ce:
            rx3.l r9 = new rx3.l
            java.lang.String r8 = android.net.Uri.encode(r8)
            r9.<init>(r8, r6)
            goto L_0x01f0
        L_0x01d8:
            if (r12 != r15) goto L_0x01dc
            r9 = 0
            goto L_0x01f0
        L_0x01dc:
            rx3.l r9 = new rx3.l
            java.lang.String r14 = ".msg.appmsg.mmreader.category.item.url"
            java.lang.Object r8 = r8.get(r14)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x01e9
            r8 = r6
        L_0x01e9:
            java.lang.String r8 = android.net.Uri.encode(r8)
            r9.<init>(r8, r6)
        L_0x01f0:
            if (r9 == 0) goto L_0x01f8
            A r8 = r9.f38555d
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x01f9
        L_0x01f8:
            r8 = r6
        L_0x01f9:
            if (r9 == 0) goto L_0x0203
            B r9 = r9.f38556e
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L_0x0202
            goto L_0x0203
        L_0x0202:
            r6 = r9
        L_0x0203:
            di3.d r3 = di3.C86312j.m106911c(r3)
            gw0.b r3 = (gw0.C76073b) r3
            boolean r3 = r3.mo94598h0(r10)
            if (r0 == r15) goto L_0x0215
            r9 = 3
            if (r0 != r9) goto L_0x0213
            goto L_0x0215
        L_0x0213:
            r9 = 0
            goto L_0x0216
        L_0x0215:
            r9 = 1
        L_0x0216:
            if (r9 == 0) goto L_0x0219
            goto L_0x021e
        L_0x0219:
            if (r3 == 0) goto L_0x021d
            r0 = 1
            goto L_0x021e
        L_0x021d:
            r0 = 0
        L_0x021e:
            r3 = 12
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9 = 0
            r3[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r9 = 1
            r3[r9] = r4
            long r19 = r2.mo108774y2()
            java.lang.Long r4 = java.lang.Long.valueOf(r19)
            r3[r15] = r4
            long r19 = r2.getCreateTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r19)
            r9 = 3
            r3[r9] = r4
            java.lang.String r4 = r2.mo108768t()
            r9 = 4
            r3[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r9 = 5
            r3[r9] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r9 = 6
            r3[r9] = r4
            r4 = 7
            r3[r4] = r10
            r4 = 8
            r3[r4] = r7
            r4 = 9
            r3[r4] = r8
            r9 = 10
            r3[r9] = r6
            r9 = 11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r3[r9] = r12
            java.lang.String r9 = "alvinluo doReportReceiveAppMsgFromNotifyMessage callback msgType: %d, opType: %d, msgSvrId: %s, createTime: %s, talker: %s, reportMsgType: %d, businessType: %d, srcUsername: %s, title: %s, jumpUrl: %s, jumpUsernanme: %s, msgSubType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r9, r3)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r4 = new java.lang.Object[r4]
            long r19 = r2.mo108774y2()
            java.lang.Long r5 = java.lang.Long.valueOf(r19)
            r9 = 0
            r4[r9] = r5
            long r18 = r2.getCreateTime()
            java.lang.Long r2 = java.lang.Long.valueOf(r18)
            r5 = 1
            r4[r5] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r4[r15] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r5 = 3
            r4[r5] = r2
            r2 = 4
            r4[r2] = r10
            r2 = 5
            r4[r2] = r7
            r2 = 6
            r4[r2] = r8
            r2 = 7
            r4[r2] = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 8
            r4[r2] = r0
            r2 = 20566(0x5056, float:2.8819E-41)
            r3.mo160131h(r2, r4)
            goto L_0x02c6
        L_0x02b7:
            java.lang.String r0 = "doReportReceiveAppMsgFromNotifyMessage parse msg fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ Exception -> 0x02bd }
            goto L_0x02c6
        L_0x02bd:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "doReportReceiveAppMsgFromNotifyMessage exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r3, r2)
        L_0x02c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s90.C36642r.run():void");
    }
}
