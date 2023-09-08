package com.tencent.p014mm.p136ui.chatting;

/* renamed from: com.tencent.mm.ui.chatting.n1 */
public class C73762n1 {
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x03db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m87367a(ck3.C67391b r20, java.util.List<com.tencent.p014mm.storage.C72963f4> r21, com.tencent.p014mm.storage.C72996z1 r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.Class<gt.k> r3 = p158gt.C98201k.class
            r4 = 0
            java.lang.String r5 = "MicroMsg.ChattingEditModeSendToMail"
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "do send to mail fail, context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            return r4
        L_0x0013:
            if (r1 == 0) goto L_0x0639
            boolean r6 = r21.isEmpty()
            if (r6 == 0) goto L_0x001d
            goto L_0x0639
        L_0x001d:
            if (r2 == 0) goto L_0x0632
            long r6 = r2.f108320R1
            int r7 = (int) r6
            if (r7 > 0) goto L_0x0026
            goto L_0x0632
        L_0x0026:
            java.lang.Class<d62.i> r6 = d62.C75339i.class
            java.lang.Class<wo.b> r7 = p740wo.C53193b.class
            java.lang.String r8 = r22.getUsername()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)
            java.lang.String r9 = ", "
            java.lang.String r10 = ""
            r11 = 4
            r12 = 0
            r13 = 2
            r14 = 1
            if (r8 != 0) goto L_0x0063
            android.content.res.Resources r8 = r20.mo91572m()
            r15 = 2131835620(0x7f113ae4, float:1.9304384E38)
            java.lang.String r8 = r8.getString(r15)
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.String r16 = r22.mo62909j3()
            r15[r4] = r16
            eb0.c r16 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r16.mo105906u()
            java.lang.Object r4 = r4.mo119684e(r11, r12)
            r15[r14] = r4
            java.lang.String r4 = java.lang.String.format(r8, r15)
            r11 = 0
            goto L_0x00cf
        L_0x0063:
            java.lang.String r4 = r22.getNickname()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x00b7
            di3.d r4 = di3.C86312j.m106911c(r7)
            wo.b r4 = (p740wo.C53193b) r4
            java.lang.String r8 = r22.getUsername()
            java.util.List r4 = r4.mo73727k5(r8)
            java.util.Iterator r4 = r4.iterator()
            r8 = r10
        L_0x0080:
            boolean r15 = r4.hasNext()
            if (r15 == 0) goto L_0x00ac
            java.lang.Object r15 = r4.next()
            java.lang.String r15 = (java.lang.String) r15
            di3.d r16 = di3.C86312j.m106911c(r6)
            r11 = r16
            d62.i r11 = (d62.C75339i) r11
            java.lang.String r11 = r11.getDisplayName(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r8)
            r15.append(r11)
            r15.append(r9)
            java.lang.String r8 = r15.toString()
            r11 = 4
            goto L_0x0080
        L_0x00ac:
            int r4 = r8.length()
            int r4 = r4 - r13
            r11 = 0
            java.lang.String r4 = r8.substring(r11, r4)
            goto L_0x00bc
        L_0x00b7:
            r11 = 0
            java.lang.String r4 = r22.mo62909j3()
        L_0x00bc:
            android.content.res.Resources r8 = r20.mo91572m()
            r15 = 2131835621(0x7f113ae5, float:1.9304386E38)
            java.lang.String r8 = r8.getString(r15)
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r15[r11] = r4
            java.lang.String r4 = java.lang.String.format(r8, r15)
        L_0x00cf:
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 10811(0x2a3b, float:1.515E-41)
            java.lang.Object[] r12 = new java.lang.Object[r13]
            r17 = 7
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r12[r11] = r17
            int r11 = r21.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r14] = r11
            r8.mo160131h(r15, r12)
            int r8 = eb0.C75592q0.m90785o()
            r8 = r8 & r14
            if (r8 != 0) goto L_0x0573
            java.lang.String r8 = "use qq mail plugin to send mail"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r21.iterator()
        L_0x0105:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x019d
            java.lang.Object r15 = r12.next()
            com.tencent.mm.storage.f4 r15 = (com.tencent.p014mm.storage.C72963f4) r15
            boolean r18 = r15.mo100994f4()
            if (r18 == 0) goto L_0x0137
            java.lang.Class<rz.s> r18 = p682rz.C101488s.class
            di3.d r18 = di3.C86312j.m106911c(r18)
            rz.s r18 = (p682rz.C101488s) r18
            rz.t r18 = r18.Kj0()
            java.lang.String r15 = r15.mo108765s2()
            r13 = r18
            hd0.o0 r13 = (hd0.C98410o0) r13
            java.lang.String r13 = r13.mo137728q(r15)
            r8.add(r13)
            r13 = 0
            r11.add(r13)
            goto L_0x017d
        L_0x0137:
            r13 = 0
            boolean r16 = r15.mo101020w3()
            if (r16 == 0) goto L_0x017d
            java.lang.String r15 = r15.getContent()
            com.tencent.mm.message.l$b r15 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r15, r13)
            if (r15 != 0) goto L_0x0149
            goto L_0x0199
        L_0x0149:
            int r13 = r15.f195582i
            r14 = 4
            if (r13 == r14) goto L_0x0152
            r14 = 6
            if (r13 == r14) goto L_0x0152
            goto L_0x017d
        L_0x0152:
            com.tencent.mm.pluginsdk.model.app.e r13 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String r14 = r15.f195606o
            com.tencent.mm.pluginsdk.model.app.d r13 = r13.mo100154qq(r14)
            if (r13 != 0) goto L_0x015f
            goto L_0x0199
        L_0x015f:
            com.tencent.mm.vfs.m1 r14 = new com.tencent.mm.vfs.m1
            java.lang.String r13 = r13.field_fileFullPath
            r14.<init>((java.lang.String) r13)
            boolean r13 = r14.mo119967g()
            if (r13 == 0) goto L_0x017d
            java.lang.String r13 = r14.mo119971i()
            r14 = 0
            java.lang.String r13 = com.tencent.p014mm.vfs.C86013q1.m106448i(r13, r14)
            r8.add(r13)
            java.lang.String r13 = r15.f195570f
            r11.add(r13)
        L_0x017d:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "file path = "
            r13.append(r14)
            r13.append(r8)
            java.lang.String r14 = "file name = "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
        L_0x0199:
            r13 = 2
            r14 = 1
            goto L_0x0105
        L_0x019d:
            com.tencent.mm.ui.chatting.QQMailHistoryExporter r5 = new com.tencent.mm.ui.chatting.QQMailHistoryExporter
            android.app.Activity r11 = r20.mo91565f()
            r5.<init>(r11, r1, r2)
            r2 = 1
            java.lang.Object[] r11 = new java.lang.Object[r2]
            int r1 = r21.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r11[r2] = r1
            java.lang.String r1 = "MicroMsg.QQMailHistoryExporter"
            java.lang.String r2 = "selectItems.size = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r11)
            android.content.Context r2 = r5.f215346a
            boolean r2 = kg3.C76577a.m92147C(r2)
            if (r2 == 0) goto L_0x01cb
            android.content.Context r2 = r5.f215346a
            float r2 = kg3.C76577a.m92165p(r2)
            r5.f215350e = r2
        L_0x01cb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = "<div id=\"history\">\n"
            r2.append(r11)
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            float r13 = r5.f215350e
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r14 = 0
            r12[r14] = r13
            float r13 = r5.f215350e
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r14 = 1
            r12[r14] = r13
            com.tencent.mm.storage.z1 r13 = r5.f215349d
            java.lang.String r13 = r13.getUsername()
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85820U5(r13)
            if (r13 != 0) goto L_0x0222
            android.content.Context r6 = r5.f215346a
            r7 = 2131835617(0x7f113ae1, float:1.9304378E38)
            java.lang.String r6 = r6.getString(r7)
            r7 = 2
            java.lang.Object[] r9 = new java.lang.Object[r7]
            com.tencent.mm.storage.z1 r7 = r5.f215349d
            java.lang.String r7 = r7.mo62909j3()
            r10 = 0
            r9[r10] = r7
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r7 = r7.mo105906u()
            r10 = 4
            r13 = 0
            java.lang.Object r7 = r7.mo119684e(r10, r13)
            r10 = 1
            r9[r10] = r7
            java.lang.String r6 = java.lang.String.format(r6, r9)
        L_0x0220:
            r7 = 2
            goto L_0x0291
        L_0x0222:
            com.tencent.mm.storage.z1 r13 = r5.f215349d
            java.lang.String r13 = r13.getNickname()
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0277
            di3.d r7 = di3.C86312j.m106911c(r7)
            wo.b r7 = (p740wo.C53193b) r7
            com.tencent.mm.storage.z1 r13 = r5.f215349d
            java.lang.String r13 = r13.getUsername()
            java.util.List r7 = r7.mo73727k5(r13)
            java.util.Iterator r7 = r7.iterator()
        L_0x0242:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x026b
            java.lang.Object r13 = r7.next()
            java.lang.String r13 = (java.lang.String) r13
            di3.d r14 = di3.C86312j.m106911c(r6)
            d62.i r14 = (d62.C75339i) r14
            java.lang.String r13 = r14.getDisplayName(r13)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r10)
            r14.append(r13)
            r14.append(r9)
            java.lang.String r10 = r14.toString()
            goto L_0x0242
        L_0x026b:
            int r6 = r10.length()
            r7 = 2
            int r6 = r6 - r7
            r7 = 0
            java.lang.String r6 = r10.substring(r7, r6)
            goto L_0x027e
        L_0x0277:
            r7 = 0
            com.tencent.mm.storage.z1 r6 = r5.f215349d
            java.lang.String r6 = r6.mo62909j3()
        L_0x027e:
            android.content.Context r9 = r5.f215346a
            r10 = 2131835616(0x7f113ae0, float:1.9304376E38)
            java.lang.String r9 = r9.getString(r10)
            r10 = 1
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r7] = r6
            java.lang.String r6 = java.lang.String.format(r9, r13)
            goto L_0x0220
        L_0x0291:
            r12[r7] = r6
            java.lang.String r6 = "<p style=\"font-size:%fem;\">Dear:</p> <br> <p style=\"text-indent:2em; font-size:%fem;\">%s</p> <br>"
            java.lang.String r6 = java.lang.String.format(r6, r12)
            r2.append(r6)
            java.util.List<com.tencent.mm.storage.f4> r6 = r5.f215347b
            java.util.Iterator r6 = r6.iterator()
        L_0x02a2:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0530
            java.lang.Object r7 = r6.next()
            com.tencent.mm.storage.f4 r7 = (com.tencent.p014mm.storage.C72963f4) r7
            java.lang.String r9 = r5.f215348c
            java.lang.String r10 = "<p style=\"text-align:center; font-size:%fem;\"><span style=\"color:#b8b8b8;\">—————  %s  —————</span></p>\n \n"
            java.lang.String r12 = "yyyy-MM-dd"
            if (r9 != 0) goto L_0x02e4
            long r13 = r7.getCreateTime()
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat
            r9.<init>(r12)
            java.util.Date r12 = new java.util.Date
            r12.<init>(r13)
            java.lang.String r9 = r9.format(r12)
            r5.f215348c = r9
            r9 = 2
            java.lang.Object[] r12 = new java.lang.Object[r9]
            float r9 = r5.f215350e
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r13 = 0
            r12[r13] = r9
            java.lang.String r9 = r5.f215348c
            r13 = 1
            r12[r13] = r9
            java.lang.String r9 = java.lang.String.format(r10, r12)
            r2.append(r9)
            goto L_0x031e
        L_0x02e4:
            long r13 = r7.getCreateTime()
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat
            r9.<init>(r12)
            java.util.Date r12 = new java.util.Date
            r12.<init>(r13)
            java.lang.String r9 = r9.format(r12)
            java.lang.String r12 = r5.f215348c
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x031e
            r5.f215348c = r9
            java.lang.String r9 = "<br>"
            r2.append(r9)
            r9 = 2
            java.lang.Object[] r12 = new java.lang.Object[r9]
            float r9 = r5.f215350e
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r13 = 0
            r12[r13] = r9
            java.lang.String r9 = r5.f215348c
            r13 = 1
            r12[r13] = r9
            java.lang.String r9 = java.lang.String.format(r10, r12)
            r2.append(r9)
            goto L_0x031f
        L_0x031e:
            r13 = 1
        L_0x031f:
            boolean r9 = r7.mo100993e4()
            java.lang.String r10 = "<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n"
            if (r9 == 0) goto L_0x03db
            boolean r9 = r7.mo100993e4()
            if (r9 == 0) goto L_0x03d5
            int r9 = r7.mo108769t2()
            if (r9 != r13) goto L_0x035e
            r9 = 4
            java.lang.Object[] r12 = new java.lang.Object[r9]
            float r9 = r5.f215350e
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r14 = 0
            r12[r14] = r9
            java.lang.String r9 = r5.mo102116a(r7)
            r12[r13] = r9
            float r9 = r5.f215350e
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r13 = 2
            r12[r13] = r9
            java.lang.String r7 = r7.getContent()
            java.lang.String r7 = com.tencent.p014mm.p136ui.chatting.QQMailHistoryExporter.m86432b(r7)
            r12[r11] = r7
            java.lang.String r13 = java.lang.String.format(r10, r12)
            goto L_0x03d6
        L_0x035e:
            com.tencent.mm.storage.z1 r9 = r5.f215349d
            java.lang.String r9 = r9.getUsername()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            if (r9 != 0) goto L_0x0395
            r9 = 4
            java.lang.Object[] r12 = new java.lang.Object[r9]
            float r9 = r5.f215350e
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r13 = 0
            r12[r13] = r9
            java.lang.String r9 = r5.mo102116a(r7)
            r13 = 1
            r12[r13] = r9
            float r9 = r5.f215350e
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r13 = 2
            r12[r13] = r9
            java.lang.String r7 = r7.getContent()
            java.lang.String r7 = com.tencent.p014mm.p136ui.chatting.QQMailHistoryExporter.m86432b(r7)
            r12[r11] = r7
            java.lang.String r13 = java.lang.String.format(r10, r12)
            goto L_0x03d6
        L_0x0395:
            java.lang.String r9 = r7.getContent()
            int r9 = eb0.C75604z3.m90848t(r9)
            r12 = -1
            if (r9 == r12) goto L_0x03d5
            r12 = 4
            java.lang.Object[] r13 = new java.lang.Object[r12]
            float r12 = r5.f215350e
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r14 = 0
            r13[r14] = r12
            java.lang.String r12 = r5.mo102116a(r7)
            r14 = 1
            r13[r14] = r12
            float r12 = r5.f215350e
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r14 = 2
            r13[r14] = r12
            java.lang.String r7 = r7.getContent()
            int r9 = r9 + 1
            java.lang.String r7 = r7.substring(r9)
            java.lang.String r7 = r7.trim()
            java.lang.String r7 = com.tencent.p014mm.p136ui.chatting.QQMailHistoryExporter.m86432b(r7)
            r13[r11] = r7
            java.lang.String r13 = java.lang.String.format(r10, r13)
            goto L_0x03d6
        L_0x03d5:
            r13 = 0
        L_0x03d6:
            r2.append(r13)
            goto L_0x04c4
        L_0x03db:
            boolean r9 = r7.mo100979R3()
            if (r9 == 0) goto L_0x04c8
            boolean r9 = r7.mo100979R3()
            if (r9 == 0) goto L_0x04c0
            long r12 = r7.getMsgId()
            long r14 = r7.mo108774y2()
            java.lang.String r9 = r7.mo108768t()
            di3.d r19 = di3.C86312j.m106911c(r3)
            gt.k r19 = (p158gt.C98201k) r19
            gt.m r19 = r19.mo137277xi()
            r11 = r19
            com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
            com.tencent.mm.modelimage.k r9 = r11.mo127200vP(r9, r12)
            java.lang.String r13 = com.tencent.p014mm.p136ui.chatting.C73869u3.m87559b(r9)
            if (r13 == 0) goto L_0x040c
            goto L_0x040d
        L_0x040c:
            r13 = 0
        L_0x040d:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r9 == 0) goto L_0x042f
            java.lang.String r9 = r7.mo108768t()
            di3.d r11 = di3.C86312j.m106911c(r3)
            gt.k r11 = (p158gt.C98201k) r11
            gt.m r11 = r11.mo137277xi()
            com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
            com.tencent.mm.modelimage.k r9 = r11.mo127168NQ(r9, r14)
            java.lang.String r13 = com.tencent.p014mm.p136ui.chatting.C73869u3.m87559b(r9)
            if (r13 == 0) goto L_0x042e
            goto L_0x042f
        L_0x042e:
            r13 = 0
        L_0x042f:
            r9 = 0
            java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106448i(r13, r9)
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r9] = r11
            java.lang.String r9 = "hdPath[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r13)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r9 != 0) goto L_0x04c0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "file://"
            r9.append(r12)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)
            java.lang.String r13 = r12.getPath()
            if (r13 == 0) goto L_0x047a
            r14 = 0
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r14, r14)
            java.lang.String r14 = r12.getPath()
            boolean r14 = r14.equals(r13)
            if (r14 != 0) goto L_0x047a
            android.net.Uri$Builder r12 = r12.buildUpon()
            android.net.Uri$Builder r12 = r12.path(r13)
            android.net.Uri r12 = r12.build()
        L_0x047a:
            java.lang.String r13 = com.tencent.p014mm.p136ui.chatting.QQMailHistoryExporter.f215343f
            r14 = 3
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.String r12 = r12.getPath()
            java.lang.String r14 = "/"
            int r14 = r12.lastIndexOf(r14)
            if (r14 >= 0) goto L_0x048c
            goto L_0x0492
        L_0x048c:
            int r14 = r14 + 1
            java.lang.String r12 = r12.substring(r14)
        L_0x0492:
            r14 = 0
            r15[r14] = r12
            r12 = 1
            r15[r12] = r9
            r9 = 2
            r15[r9] = r11
            java.lang.String r11 = java.lang.String.format(r13, r15)
            r13 = 4
            java.lang.Object[] r15 = new java.lang.Object[r13]
            float r13 = r5.f215350e
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r15[r14] = r13
            java.lang.String r7 = r5.mo102116a(r7)
            r15[r12] = r7
            float r7 = r5.f215350e
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r15[r9] = r7
            r7 = 3
            r15[r7] = r11
            java.lang.String r13 = java.lang.String.format(r10, r15)
            goto L_0x04c1
        L_0x04c0:
            r13 = 0
        L_0x04c1:
            r2.append(r13)
        L_0x04c4:
            r9 = 3
            r11 = 4
            r13 = 0
            goto L_0x052d
        L_0x04c8:
            boolean r9 = r7.mo101020w3()
            if (r9 == 0) goto L_0x0523
            java.lang.String r9 = r7.getContent()
            r13 = 0
            com.tencent.mm.message.l$b r9 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r9, r13)
            if (r9 == 0) goto L_0x0519
            int r11 = r9.f195582i
            r12 = 57
            r14 = 53
            if (r11 == r14) goto L_0x04e3
            if (r11 != r12) goto L_0x0519
        L_0x04e3:
            if (r11 == r14) goto L_0x04ec
            if (r11 != r12) goto L_0x04e8
            goto L_0x04ec
        L_0x04e8:
            r7 = r13
            r9 = 3
            r11 = 4
            goto L_0x0515
        L_0x04ec:
            r11 = 4
            java.lang.Object[] r12 = new java.lang.Object[r11]
            float r14 = r5.f215350e
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r15 = 0
            r12[r15] = r14
            java.lang.String r7 = r5.mo102116a(r7)
            r14 = 1
            r12[r14] = r7
            float r7 = r5.f215350e
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r14 = 2
            r12[r14] = r7
            java.lang.String r7 = r9.f195570f
            java.lang.String r7 = com.tencent.p014mm.p136ui.chatting.QQMailHistoryExporter.m86432b(r7)
            r9 = 3
            r12[r9] = r7
            java.lang.String r7 = java.lang.String.format(r10, r12)
        L_0x0515:
            r2.append(r7)
            goto L_0x052d
        L_0x0519:
            r9 = 3
            r11 = 4
            java.lang.String r7 = r5.mo102117c(r7)
            r2.append(r7)
            goto L_0x052d
        L_0x0523:
            r9 = 3
            r11 = 4
            r13 = 0
            java.lang.String r7 = r5.mo102117c(r7)
            r2.append(r7)
        L_0x052d:
            r11 = 3
            goto L_0x02a2
        L_0x0530:
            java.lang.String r1 = "\n</div>\n"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.content.Intent r12 = new android.content.Intent
            r12.<init>()
            r2 = 21
            java.lang.String r3 = "mail_mode"
            r12.putExtra(r3, r2)
            java.lang.String r2 = "mail_content"
            r12.putExtra(r2, r1)
            java.lang.String r1 = "subject"
            r12.putExtra(r1, r4)
            java.lang.String r1 = "show_qqmail"
            r2 = 1
            r12.putExtra(r1, r2)
            java.lang.String r1 = "mail_edit_mode"
            r12.putExtra(r1, r2)
            java.lang.String r1 = "mail_attach_file"
            r12.putStringArrayListExtra(r1, r8)
            com.tencent.mm.ui.chatting.manager.b r9 = r0.f193279c
            r13 = 220(0xdc, float:3.08E-43)
            com.tencent.mm.ui.chatting.m1 r14 = new com.tencent.mm.ui.chatting.m1
            r14.<init>(r0)
            java.lang.String r10 = "qqmail"
            java.lang.String r11 = ".ui.ComposeUI"
            ke3.C88144b.m109798p(r9, r10, r11, r12, r13, r14)
            r4 = 0
            goto L_0x0631
        L_0x0573:
            java.lang.String r3 = "use order mail app to send mail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r3)
            com.tencent.mm.ui.chatting.c4 r3 = new com.tencent.mm.ui.chatting.c4
            android.app.Activity r5 = r20.mo91565f()
            r3.<init>(r5, r1, r2)
            java.lang.String r1 = r3.mo102146b()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.SEND_MULTIPLE"
            r2.<init>(r5)
            java.lang.String r5 = "message/rfc822"
            r2.setType(r5)
            java.lang.String r5 = "android.intent.extra.SUBJECT"
            r2.putExtra(r5, r4)
            java.lang.String r4 = "android.intent.extra.TEXT"
            r2.putExtra(r4, r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r3.f215449f
            if (r4 != 0) goto L_0x05a5
            r4 = 1
            goto L_0x05a6
        L_0x05a5:
            r4 = 0
        L_0x05a6:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 0
            r1[r5] = r4
            java.util.List<com.tencent.mm.storage.f4> r4 = r3.f215445b
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r1[r5] = r4
            java.lang.String r4 = "MicroMsg.OtherMailHistoryExporter"
            java.lang.String r6 = "get image attach: history is null? %B, selectItems.size = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r6, r1)
            java.lang.String r1 = r3.f215449f
            if (r1 == 0) goto L_0x05c8
            java.util.ArrayList<android.net.Uri> r1 = r3.f215450g
            goto L_0x05d2
        L_0x05c8:
            java.lang.String r1 = "had not exported, do export first"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            r3.mo102146b()
            java.util.ArrayList<android.net.Uri> r1 = r3.f215450g
        L_0x05d2:
            java.lang.String r3 = "android.intent.extra.STREAM"
            r2.putParcelableArrayListExtra(r3, r1)
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r0.f193286j     // Catch:{ ActivityNotFoundException -> 0x0621 }
            android.app.Activity r3 = r20.mo91565f()     // Catch:{ ActivityNotFoundException -> 0x0621 }
            r4 = 2131835619(0x7f113ae3, float:1.9304382E38)
            java.lang.String r3 = r3.getString(r4)     // Catch:{ ActivityNotFoundException -> 0x0621 }
            android.content.Intent r2 = android.content.Intent.createChooser(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x0621 }
            k20.a r3 = new k20.a     // Catch:{ ActivityNotFoundException -> 0x0621 }
            r3.<init>()     // Catch:{ ActivityNotFoundException -> 0x0621 }
            r3.mo10233c(r2)     // Catch:{ ActivityNotFoundException -> 0x0621 }
            java.lang.Object[] r7 = r3.mo10232b()     // Catch:{ ActivityNotFoundException -> 0x0621 }
            java.lang.String r8 = "com/tencent/mm/ui/chatting/ChattingEditModeSendToMail"
            java.lang.String r9 = "doJob"
            java.lang.String r10 = "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/util/List;Lcom/tencent/mm/storage/Contact;)Z"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ ActivityNotFoundException -> 0x0621 }
            r2 = 0
            java.lang.Object r3 = r3.mo10231a(r2)     // Catch:{ ActivityNotFoundException -> 0x0621 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ ActivityNotFoundException -> 0x0621 }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x0621 }
            java.lang.String r7 = "com/tencent/mm/ui/chatting/ChattingEditModeSendToMail"
            java.lang.String r8 = "doJob"
            java.lang.String r9 = "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/util/List;Lcom/tencent/mm/storage/Contact;)Z"
            java.lang.String r10 = "Undefined"
            java.lang.String r11 = "startActivity"
            java.lang.String r12 = "(Landroid/content/Intent;)V"
            r6 = r1
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ ActivityNotFoundException -> 0x0621 }
            goto L_0x0630
        L_0x0621:
            android.app.Activity r0 = r20.mo91565f()
            r1 = 2131835622(0x7f113ae6, float:1.9304388E38)
            r2 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r1, (int) r2)
            r0.show()
        L_0x0630:
            r4 = 1
        L_0x0631:
            return r4
        L_0x0632:
            r2 = 0
            java.lang.String r0 = "do send to mail fail, contact error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            return r2
        L_0x0639:
            r2 = 0
            java.lang.String r0 = "do send to mail fail, select item empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73762n1.m87367a(ck3.b, java.util.List, com.tencent.mm.storage.z1):boolean");
    }
}
