package ut2;

import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveInputUIC;

/* renamed from: ut2.e */
public final class C102090e implements SnsCommentFooter.C95535f {

    /* renamed from: a */
    public final /* synthetic */ ImproveInputUIC f300624a;

    public C102090e(ImproveInputUIC improveInputUIC) {
        this.f300624a = improveInputUIC;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (gy3.C87412m.m108589b(r13.subSequence(r7, r6 + 1).toString(), "") != false) goto L_0x0076;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo132108a(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "onCommentSend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$initComment$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r0 = "emojiMd5"
            gy3.C87412m.m108594g(r14, r0)
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC r0 = r12.f300624a
            java.lang.String r1 = "access$onCommentSendImpl"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r0.getClass()
            java.lang.Class<l31.f> r1 = l31.C99333f.class
            java.lang.String r2 = "onCommentSendImpl"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r2 = r0.mo133288i3()
            java.lang.Object r2 = r2.getTag()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.sns.storage.SnsInfo"
            gy3.C87412m.m108592e(r2, r3)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r2
            r3 = 1
            r4 = 0
            r5 = 12076(0x2f2c, float:1.6922E-41)
            if (r13 == 0) goto L_0x0076
            int r6 = r13.length()
            int r6 = r6 - r3
            r7 = 0
            r8 = 0
        L_0x0040:
            if (r7 > r6) goto L_0x0065
            if (r8 != 0) goto L_0x0046
            r9 = r7
            goto L_0x0047
        L_0x0046:
            r9 = r6
        L_0x0047:
            char r9 = r13.charAt(r9)
            r10 = 32
            int r9 = gy3.C87412m.m108596i(r9, r10)
            if (r9 > 0) goto L_0x0055
            r9 = 1
            goto L_0x0056
        L_0x0055:
            r9 = 0
        L_0x0056:
            if (r8 != 0) goto L_0x005f
            if (r9 != 0) goto L_0x005c
            r8 = 1
            goto L_0x0040
        L_0x005c:
            int r7 = r7 + 1
            goto L_0x0040
        L_0x005f:
            if (r9 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            int r6 = r6 + -1
            goto L_0x0040
        L_0x0065:
            int r6 = r6 + r3
            java.lang.CharSequence r6 = r13.subSequence(r7, r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = ""
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 == 0) goto L_0x0097
        L_0x0076:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r6 == 0) goto L_0x0097
            java.lang.String r13 = "MicroMsg.Improve.InputUIC"
            java.lang.String r14 = "onCommentSend tosendText is null or empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r14)
            java.lang.String r13 = "onCommentSendImpl"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            z31.b r13 = z31.C102972b.f303874a
            java.lang.String r14 = "CommentOrLikeFeedCount"
            java.lang.String r0 = r0.f279656t
            r13.mo142713g(r5, r14, r0)
            goto L_0x0207
        L_0x0097:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r6 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            long r7 = r2.field_snsId
            java.lang.String r7 = vr2.C102236a0.m134765q0(r7)
            r6.mo131381n(r7)
            di3.d r6 = di3.C86312j.m106911c(r1)
            l31.f r6 = (l31.C99333f) r6
            java.lang.String r7 = "CommentOrLikeFeedCount"
            long r8 = r2.field_snsId
            java.lang.String r8 = vr2.C102236a0.m134765q0(r8)
            java.lang.String r9 = "longToString(snsInfo.field_snsId)"
            gy3.C87412m.m108593f(r8, r9)
            r6.mo138726rL(r5, r7, r8)
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.f r1 = (l31.C99333f) r1
            java.lang.String r6 = "comment_feed_count"
            long r7 = r2.field_snsId
            java.lang.String r7 = vr2.C102236a0.m134765q0(r7)
            java.lang.String r8 = "longToString(snsInfo.field_snsId)"
            gy3.C87412m.m108593f(r7, r8)
            r1.mo138726rL(r5, r6, r7)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r1 = r0.mo133288i3()
            int r9 = r1.getCommentFlag()
            java.lang.String r1 = "MicroMsg.Improve.InputUIC"
            java.lang.String r5 = "onCommentSend click %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r3[r4] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r3)
            r1 = 8
            boolean r3 = gv2.C98242p.m126942d(r9, r1)
            if (r3 == 0) goto L_0x012f
            gy3.C87412m.m108591d(r13)
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r1 = r0.mo133288i3()
            java.lang.String r1 = r1.getCommentAtPrefix()
            int r1 = r1.length()
            java.lang.String r6 = r13.substring(r1)
            java.lang.String r13 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r6, r13)
            java.lang.String r13 = "MicroMsg.Improve.InputUIC"
            java.lang.String r1 = "send atFriend ad timeline comment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            r5 = 16
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r13 = r0.mo133288i3()
            te3.w64 r7 = r13.getCommentInfo()
            r8 = 1
            r10 = 0
            java.lang.String r13 = "sendCommentWithFlag"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r1)
            r4 = r2
            r11 = r14
            te3.w64 r3 = com.tencent.p014mm.plugin.sns.model.C5431p1.C5432a.m5342m(r4, r5, r6, r7, r8, r9, r10, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r1)
            goto L_0x015f
        L_0x012f:
            java.lang.String r3 = "MicroMsg.Improve.InputUIC"
            java.lang.String r4 = "send timeline comment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            boolean r3 = r2.isAd()
            if (r3 == 0) goto L_0x0140
            r5 = 8
            goto L_0x0142
        L_0x0140:
            r1 = 2
            r5 = 2
        L_0x0142:
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter r1 = r0.mo133288i3()
            te3.w64 r7 = r1.getCommentInfo()
            r8 = 1
            r10 = 0
            java.lang.String r1 = "sendCommentWithFlag"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            r4 = r2
            r6 = r13
            r11 = r14
            te3.w64 r13 = com.tencent.p014mm.plugin.sns.model.C5431p1.C5432a.m5342m(r4, r5, r6, r7, r8, r9, r10, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            r3 = r13
        L_0x015f:
            r0.mo133292m3()
            java.lang.Class<iu2.e> r13 = iu2.C60631e.class
            byte[] r1 = i40.C60247c.f171776h
            monitor-enter(r1)
            f40.e r4 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x021f }
            r4.mo121108c()     // Catch:{ all -> 0x021f }
            java.lang.Class<i40.c> r4 = i40.C60247c.class
            boolean r4 = r4.isAssignableFrom(r13)     // Catch:{ all -> 0x021f }
            if (r4 == 0) goto L_0x0217
            androidx.lifecycle.k0 r4 = new androidx.lifecycle.k0     // Catch:{ all -> 0x021f }
            f40.e r5 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x021f }
            f40.a r5 = r5.f251755f     // Catch:{ all -> 0x021f }
            i40.c$a$a r6 = new i40.c$a$a     // Catch:{ all -> 0x021f }
            r6.<init>()     // Catch:{ all -> 0x021f }
            r4.<init>((androidx.lifecycle.C0123n0) r5, (androidx.lifecycle.C54209k0.C54210b) r6)     // Catch:{ all -> 0x021f }
            androidx.lifecycle.i0 r13 = r4.mo75002a(r13)     // Catch:{ all -> 0x021f }
            monitor-exit(r1)
            iu2.e r13 = (iu2.C60631e) r13
            java.lang.Class<iu2.d> r1 = iu2.C98802d.class
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r13 = r13.mo85233d3(r1)
            iu2.d r13 = (iu2.C98802d) r13
            long r1 = r2.field_snsId
            java.lang.String r4 = "postUpdateEventBySnsIDWithComment"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            if (r3 != 0) goto L_0x01a5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            goto L_0x01c6
        L_0x01a5:
            gu2.b r1 = r13.mo138173c3(r1)
            if (r1 != 0) goto L_0x01af
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            goto L_0x01c6
        L_0x01af:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.mo142404s2(r2)
            com.tencent.mm.sdk.storage.observer.StorageEventId$Companion r2 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion
            com.tencent.mm.sdk.storage.observer.StorageEventId r2 = r2.getUPDATE()
            r13.mo138176f3(r1, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x01c6:
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r13 == 0) goto L_0x01ff
            java.lang.String r13 = r0.f279649j
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x01ff
            java.util.List<com.tencent.mm.plugin.sns.ui.s> r13 = com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine.f276689H
            java.util.Iterator r13 = r13.iterator()
        L_0x01da:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x01ff
            java.lang.Object r14 = r13.next()
            com.tencent.mm.plugin.sns.ui.s r14 = (com.tencent.p014mm.plugin.sns.p106ui.C96213s) r14
            java.lang.String r1 = r0.f279649j
            java.lang.String r2 = r14.f281156a
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x01da
            java.lang.String r13 = "MicroMsg.Improve.InputUIC"
            java.lang.String r0 = "remove ct"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
            java.util.List<com.tencent.mm.plugin.sns.ui.s> r13 = com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine.f276689H
            java.util.LinkedList r13 = (java.util.LinkedList) r13
            r13.remove(r14)
        L_0x01ff:
            java.lang.String r13 = "onCommentSendImpl"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
        L_0x0207:
            java.lang.String r13 = "access$onCommentSendImpl"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            java.lang.String r13 = "onCommentSend"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$initComment$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return
        L_0x0217:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x021f }
            java.lang.String r14 = "getLiveDB modelClass must extends BaseMvvmDB"
            r13.<init>(r14)     // Catch:{ all -> 0x021f }
            throw r13     // Catch:{ all -> 0x021f }
        L_0x021f:
            r13 = move-exception
            monitor-exit(r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ut2.C102090e.mo132108a(java.lang.String, java.lang.String):void");
    }
}
