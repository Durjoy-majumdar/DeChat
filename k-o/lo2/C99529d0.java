package lo2;

/* renamed from: lo2.d0 */
public final class C99529d0 {

    /* renamed from: a */
    public static final C99529d0 f291771a = new C99529d0();

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bb, code lost:
        r7 = r2.ContentObj;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138925a(android.view.View r17, java.lang.String r18, com.tencent.p014mm.protocal.protobuf.TimeLineObject r19, com.tencent.p014mm.plugin.sns.model.C94851d1 r20, android.app.Activity r21, int r22, jp2.C98963o r23, up2.C102064e r24, boolean r25) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r4 = r22
            r8 = r24
            jp2.w$b r3 = jp2.C98977w.C98979b.Sight
            java.lang.String r9 = "clickAdAction"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            java.lang.String r5 = "v"
            gy3.C87412m.m108594g(r0, r5)
            java.lang.String r5 = "activity"
            r6 = r21
            gy3.C87412m.m108594g(r6, r5)
            os2.e0 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r5.mo139798DN(r1)
            r7 = 1
            java.lang.String r11 = "ClickActionHelper"
            r12 = 0
            if (r5 != 0) goto L_0x003c
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r12] = r1
            java.lang.String r1 = "onsight click but info is null localid %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        L_0x003c:
            java.lang.Class<l31.f> r1 = l31.C99333f.class
            java.lang.String r13 = "report"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r10)
            if (r20 == 0) goto L_0x004f
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r14 = r20.mo130970a()
            if (r14 == 0) goto L_0x004f
            r14.mo131335v(r5)
        L_0x004f:
            di3.d r14 = di3.C86312j.m106911c(r1)
            l31.f r14 = (l31.C99333f) r14
            long r7 = r5.field_snsId
            java.lang.String r7 = vr2.C102236a0.m134765q0(r7)
            java.lang.String r8 = "longToString(snsInfo.field_snsId)"
            gy3.C87412m.m108593f(r7, r8)
            r15 = 12076(0x2f2c, float:1.6922E-41)
            java.lang.String r12 = "ClickAdFeed"
            r14.mo138726rL(r15, r12, r7)
            int r7 = r5.field_type
            r12 = 18
            if (r7 != r12) goto L_0x008f
            di3.d r7 = di3.C86312j.m106911c(r1)
            l31.f r7 = (l31.C99333f) r7
            r14 = r11
            long r11 = r5.field_snsId
            java.lang.String r11 = vr2.C102236a0.m134765q0(r11)
            gy3.C87412m.m108593f(r11, r8)
            java.lang.String r8 = "ClickStreamVideoCount"
            r7.mo138726rL(r15, r8, r11)
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.f r1 = (l31.C99333f) r1
            java.lang.String r7 = "BrowseForwardAdLongVideoTime"
            r1.um0(r15, r7)
            goto L_0x0090
        L_0x008f:
            r14 = r11
        L_0x0090:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r10)
            java.lang.String r1 = r5.getUserName()
            java.lang.String r7 = "info.userName"
            gy3.C87412m.m108593f(r1, r7)
            java.lang.String r7 = r5.getSnsId()
            java.lang.String r8 = "info.snsId"
            gy3.C87412m.m108593f(r7, r8)
            int r8 = r5.getTypeFlag()
            java.lang.String r11 = "publicClickEvent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r10)
            e30.C75539a.m90584d(r1, r7, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
            boolean r1 = r5.isAd()
            if (r2 == 0) goto L_0x00c2
            te3.j00 r7 = r2.ContentObj
            if (r7 == 0) goto L_0x00c2
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            goto L_0x00c3
        L_0x00c2:
            r7 = 0
        L_0x00c3:
            if (r7 == 0) goto L_0x01bd
            te3.j00 r7 = r2.ContentObj
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            int r7 = r7.size()
            if (r7 != 0) goto L_0x00d1
            goto L_0x01bd
        L_0x00d1:
            te3.j00 r2 = r2.ContentObj
            java.util.LinkedList<te3.kv2> r2 = r2.f298427h
            r7 = 0
            java.lang.Object r2 = r2.get(r7)
            te3.kv2 r2 = (te3.C101804kv2) r2
            if (r25 == 0) goto L_0x0188
            r7 = 3
            r8 = 1910(0x776, float:2.676E-42)
            if (r1 == 0) goto L_0x00f2
            com.tencent.mm.plugin.sns.model.o r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            boolean r11 = r11.mo131141x(r2)
            if (r11 != 0) goto L_0x00f2
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11.mo175911u(r8, r7)
        L_0x00f2:
            boolean r11 = r5.isAd()
            if (r11 == 0) goto L_0x0110
            com.tencent.mm.plugin.sns.storage.ADXml r11 = r5.getAdXml()
            boolean r11 = r11.isLandingPagesAd()
            if (r11 == 0) goto L_0x0110
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r11 = r5.getAdSnsInfo()
            java.lang.String r11 = r11.field_adxml
            boolean r11 = ps2.C100894u.m132239s(r11)
            if (r11 == 0) goto L_0x0110
            r11 = 1
            goto L_0x0111
        L_0x0110:
            r11 = 0
        L_0x0111:
            if (r11 != 0) goto L_0x0133
            if (r1 == 0) goto L_0x0133
            com.tencent.mm.plugin.sns.model.o r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            boolean r11 = r11.mo131143z(r2)
            if (r11 == 0) goto L_0x0133
            com.tencent.mm.plugin.sns.model.o r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r11.mo131122i0(r2)
            if (r1 == 0) goto L_0x012d
            jp2.w$a r11 = jp2.C98977w.C98978a.PlayIcon
            jp2.C98977w.m128885a(r3, r11, r5, r4)
        L_0x012d:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 6
            r11.mo175911u(r8, r12)
        L_0x0133:
            r8 = 717(0x2cd, float:1.005E-42)
            if (r4 != 0) goto L_0x013b
            ad0.C91998s.m115550d(r8)
            goto L_0x013e
        L_0x013b:
            ad0.C91998s.m115549c(r8)
        L_0x013e:
            vr2.C102236a0.m134728W(r5)
            r5.isAd()
            r5.getUxinfo()
            java.lang.String r2 = r2.f298689d
            r2 = 745(0x2e9, float:1.044E-42)
            if (r4 != 0) goto L_0x0151
            ad0.C91998s.m115550d(r2)
            goto L_0x0154
        L_0x0151:
            ad0.C91998s.m115549c(r2)
        L_0x0154:
            vr2.C102236a0.m134728W(r5)
            r5.isAd()
            if (r1 == 0) goto L_0x0177
            com.tencent.mm.plugin.sns.storage.ADXml r1 = r5.getAdXml()
            boolean r1 = r1.isLandingPagesAd()
            if (r1 == 0) goto L_0x0172
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r1 = r5.getAdSnsInfo()
            java.lang.String r1 = r1.field_adxml
            boolean r1 = ps2.C100894u.m132239s(r1)
            if (r1 != 0) goto L_0x0177
        L_0x0172:
            jp2.w$a r1 = jp2.C98977w.C98978a.EnterFullScreen
            jp2.C98977w.m128885a(r3, r1, r5, r4)
        L_0x0177:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 11444(0x2cb4, float:1.6036E-41)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 0
            r3[r8] = r7
            r1.mo160131h(r2, r3)
        L_0x0188:
            r1 = 2
            if (r4 != r1) goto L_0x0190
            com.tencent.mm.plugin.sns.storage.ADInfo r1 = r5.getAtAdInfo()
            goto L_0x0194
        L_0x0190:
            com.tencent.mm.plugin.sns.storage.ADInfo r1 = r5.getAdInfo()
        L_0x0194:
            r3 = r1
            r7 = 21
            r8 = 0
            r1 = r21
            r2 = r5
            r4 = r22
            r5 = r23
            r6 = r7
            r7 = r8
            boolean r1 = vr2.C102260r.m134836E(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x01ab
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        L_0x01ab:
            r1 = r24
            if (r1 == 0) goto L_0x01b3
            r1.mo141556e(r0)
            goto L_0x01b9
        L_0x01b3:
            java.lang.String r0 = "click cannot jump！！！"
            r1 = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x01b9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        L_0x01bd:
            r1 = r14
            java.lang.String r0 = "the obj.ContentObj.MediaObjList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C99529d0.mo138925a(android.view.View, java.lang.String, com.tencent.mm.protocal.protobuf.TimeLineObject, com.tencent.mm.plugin.sns.model.d1, android.app.Activity, int, jp2.o, up2.e, boolean):void");
    }
}
