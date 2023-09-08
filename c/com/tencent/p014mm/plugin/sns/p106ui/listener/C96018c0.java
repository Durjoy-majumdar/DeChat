package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.c0 */
public class C96018c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280419d;

    public C96018c0(TimelineClickListener timelineClickListener) {
        this.f280419d = timelineClickListener;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x081a  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0d3a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r45) {
        /*
            r44 = this;
            r7 = r44
            r8 = r45
            java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI> r9 = com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI.class
            java.lang.String r10 = "MicroMsg.TimelineClickListener"
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r8)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$36"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r44
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$36"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.Object r0 = r45.getTag()
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.lang.String r4 = "android/view/View$OnClickListener"
            java.lang.String r5 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$36"
            if (r0 == 0) goto L_0x0d43
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder
            if (r0 != 0) goto L_0x0063
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96235u4
            if (r0 != 0) goto L_0x0063
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96066m2
            if (r0 != 0) goto L_0x0063
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.MaskImageView
            if (r0 != 0) goto L_0x0063
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof nt2.C100165c
            if (r0 != 0) goto L_0x0063
            goto L_0x0d43
        L_0x0063:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96235u4
            r13 = 1
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.u4 r0 = (com.tencent.p014mm.plugin.sns.p106ui.C96235u4) r0
            java.lang.String r0 = r0.f281206a
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = os2.C100416r.m131409b(r0)
            boolean r14 = r8 instanceof android.widget.LinearLayout
            r14 = r14 ^ r13
            java.lang.Object r15 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.u4 r15 = (com.tencent.p014mm.plugin.sns.p106ui.C96235u4) r15
            r15.getClass()
            goto L_0x00b0
        L_0x0085:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.MaskImageView
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = (com.tencent.p014mm.plugin.sns.p106ui.MaskImageView) r0
            java.lang.Object r14 = r0.getTag()
            boolean r14 = r14 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96235u4
            if (r14 == 0) goto L_0x00ae
            java.lang.Object r0 = r0.getTag()
            com.tencent.mm.plugin.sns.ui.u4 r0 = (com.tencent.p014mm.plugin.sns.p106ui.C96235u4) r0
            java.lang.String r0 = r0.f281206a
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = os2.C100416r.m131409b(r0)
            boolean r14 = r8 instanceof android.widget.LinearLayout
            if (r14 == 0) goto L_0x00ac
            goto L_0x00af
        L_0x00ac:
            r14 = 1
            goto L_0x00b0
        L_0x00ae:
            r0 = 0
        L_0x00af:
            r14 = 0
        L_0x00b0:
            r15 = r14
            r6 = 0
            r14 = 0
            goto L_0x00e3
        L_0x00b4:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96066m2
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.m2 r0 = (com.tencent.p014mm.plugin.sns.p106ui.C96066m2) r0
            os2.e0 r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r15 = r0.f280499b
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = r14.mo139798DN(r15)
            boolean r15 = r8 instanceof android.widget.LinearLayout
            r15 = r15 ^ r13
            boolean r6 = r0.f280513p
            if (r6 == 0) goto L_0x00db
            int r0 = r0.f280514q
            if (r0 <= 0) goto L_0x00d9
            r6 = 2
            goto L_0x00dd
        L_0x00d9:
            r6 = 1
            goto L_0x00dd
        L_0x00db:
            r0 = 0
            r6 = 0
        L_0x00dd:
            r43 = r6
            r6 = r0
            r0 = r14
            r14 = r43
        L_0x00e3:
            r24 = r14
        L_0x00e5:
            r14 = r6
            r6 = r0
            goto L_0x0141
        L_0x00e8:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder
            if (r0 == 0) goto L_0x0114
            java.lang.Object r0 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r0 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r0
            java.lang.String r6 = r0.f279950d
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = os2.C100416r.m131408a(r6)
            boolean r14 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.C95944p.C95951g
            if (r14 == 0) goto L_0x010c
            com.tencent.mm.plugin.sns.ui.item.p$g r0 = (com.tencent.p014mm.plugin.sns.p106ui.item.C95944p.C95951g) r0
            com.tencent.mm.plugin.sns.ui.item.p$f r0 = r0.f280164H0
            int r0 = r0.f280156a
            if (r0 <= 0) goto L_0x010a
            r14 = 2
            goto L_0x010e
        L_0x010a:
            r14 = 1
            goto L_0x010e
        L_0x010c:
            r0 = 0
            r14 = 0
        L_0x010e:
            r43 = r6
            r6 = r0
            r0 = r43
            goto L_0x013d
        L_0x0114:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof nt2.C100165c
            if (r0 == 0) goto L_0x013a
            java.lang.Object r0 = r45.getTag()
            nt2.c r0 = (nt2.C100165c) r0
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = r0.f293412e
            java.lang.Object r6 = r45.getTag()
            boolean r6 = r6 instanceof nt2.C100189m
            if (r6 == 0) goto L_0x013b
            java.lang.Object r6 = r45.getTag()
            nt2.m r6 = (nt2.C100189m) r6
            int r6 = r6.f293550s
            if (r6 <= 0) goto L_0x0138
            r14 = 2
            goto L_0x013d
        L_0x0138:
            r14 = 1
            goto L_0x013d
        L_0x013a:
            r0 = 0
        L_0x013b:
            r6 = 0
            r14 = 0
        L_0x013d:
            r24 = r14
            r15 = 0
            goto L_0x00e5
        L_0x0141:
            if (r6 == 0) goto L_0x0d3a
            boolean r0 = r6.isAd()
            if (r0 != 0) goto L_0x014b
            goto L_0x0d3a
        L_0x014b:
            r17 = 3
            r11 = 4
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d     // Catch:{ Exception -> 0x019c }
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122990l(r0, r6)     // Catch:{ Exception -> 0x019c }
            if (r0 != 0) goto L_0x0159
            java.lang.String r0 = ""
            goto L_0x015b
        L_0x0159:
            java.lang.String r0 = r0.viewId     // Catch:{ Exception -> 0x019c }
        L_0x015b:
            com.tencent.mm.protocal.protobuf.TimeLineObject r13 = r6.getTimeLine()     // Catch:{ Exception -> 0x019c }
            java.lang.String r13 = r13.f283893Id     // Catch:{ Exception -> 0x019c }
            boolean r18 = r6.isRecExpAd()     // Catch:{ Exception -> 0x019c }
            if (r18 != 0) goto L_0x0199
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x019c }
            r25 = r9
            java.lang.Object[] r9 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0197 }
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r11 = r7.f280419d     // Catch:{ Exception -> 0x0197 }
            int r11 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r11)     // Catch:{ Exception -> 0x0197 }
            if (r11 != 0) goto L_0x0177
            r11 = 1
            goto L_0x0178
        L_0x0177:
            r11 = 2
        L_0x0178:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0197 }
            r19 = 0
            r9[r19] = r11     // Catch:{ Exception -> 0x0197 }
            if (r15 == 0) goto L_0x0184
            r11 = 1
            goto L_0x0185
        L_0x0184:
            r11 = 2
        L_0x0185:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0197 }
            r15 = 1
            r9[r15] = r11     // Catch:{ Exception -> 0x0197 }
            r11 = 2
            r9[r11] = r13     // Catch:{ Exception -> 0x0197 }
            r9[r17] = r0     // Catch:{ Exception -> 0x0197 }
            r0 = 14066(0x36f2, float:1.971E-41)
            r12.mo160131h(r0, r9)     // Catch:{ Exception -> 0x0197 }
            goto L_0x01b8
        L_0x0197:
            r0 = move-exception
            goto L_0x019f
        L_0x0199:
            r25 = r9
            goto L_0x01b8
        L_0x019c:
            r0 = move-exception
            r25 = r9
        L_0x019f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "report click ad card style error "
            r9.append(r11)
            java.lang.String r0 = r0.getMessage()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x01b8:
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            boolean r9 = r6.isAd()
            if (r9 == 0) goto L_0x01d7
            if (r0 == 0) goto L_0x01d7
            boolean r9 = r0.isFullCardAd()
            if (r9 != 0) goto L_0x01d7
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r9 = r7.f280419d
            android.app.Activity r9 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r9)
            java.lang.String r11 = r0.appGiftPackCode
            java.lang.String r0 = r0.appGiftPackCodeTips
            lo2.C34318c.m40322a(r9, r11, r0)
        L_0x01d7:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            boolean r0 = com.tencent.p014mm.plugin.sns.p106ui.C96177r2.m123271s(r6, r0)
            if (r0 == 0) goto L_0x0201
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            boolean r0 = r0.hasActionBtn()
            if (r0 == 0) goto L_0x0201
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            int r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r0)
            if (r0 != 0) goto L_0x01f7
            r0 = 1
            goto L_0x01f8
        L_0x01f7:
            r0 = 2
        L_0x01f8:
            long r11 = r6.field_snsId
            int r9 = com.tencent.p014mm.plugin.sns.p106ui.C96177r2.C57420i.m66159a(r0, r11)
            com.tencent.p014mm.plugin.sns.p106ui.C96177r2.m123270q(r6, r0, r9)
        L_0x0201:
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r0 = r6.getAdSnsInfo()
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()
            boolean r0 = r0.hasVoteInfo()
            if (r0 == 0) goto L_0x0238
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r0 = r6.getAdSnsInfo()
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()
            java.lang.String r0 = r0.getAdVoteComponentUrl()
            java.lang.String r9 = r6.getUxinfo()
            f40.e r11 = f40.C86709a0.m107523b()
            java.lang.String r11 = r11.mo121111i()
            int r29 = os2.C100417r0.m131414c(r0, r9, r11)
            r30 = 0
            java.lang.String r31 = ""
            r26 = r0
            r27 = r9
            r28 = r11
            os2.C100417r0.m131423l(r26, r27, r28, r29, r30, r31)
        L_0x0238:
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r6.getTimeLine()
            te3.j00 r9 = r0.ContentObj
            int r11 = r9.f298424e
            java.lang.String r12 = "adTurnCanvasInfo"
            java.lang.String r13 = "adCanvasInfo"
            java.lang.String r15 = "sns_landing_pages_share_thumb_url"
            r19 = r12
            java.lang.String r12 = "sns_"
            r26 = 16
            r20 = r13
            java.lang.String r13 = " "
            r27 = r12
            java.lang.String r12 = "sns_landing_pages_ux_info"
            r21 = r13
            java.lang.String r13 = "sns_landing_pages_rawSnsId"
            r28 = r15
            java.lang.String r15 = "sns_landing_pages_share_sns_id"
            r29 = r12
            java.lang.String r12 = "img_gallery_height"
            r30 = r13
            java.lang.String r13 = "img_gallery_width"
            r31 = r15
            java.lang.String r15 = "img_gallery_top"
            r32 = r12
            java.lang.String r12 = "img_gallery_left"
            r33 = r13
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker"
            r22 = r13
            java.lang.String r13 = "makeMaterialClickAction"
            r23 = r13
            r13 = 15
            r34 = r15
            if (r11 != r13) goto L_0x0287
            int r13 = r0.sightFolded
            r15 = 1
            if (r13 != r15) goto L_0x02a2
        L_0x0287:
            r13 = 27
            if (r11 != r13) goto L_0x081a
            java.util.LinkedList<te3.kv2> r9 = r9.f298427h
            int r9 = r9.size()
            if (r9 <= r14) goto L_0x081a
            te3.j00 r9 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r9 = r9.f298427h
            java.lang.Object r9 = r9.get(r14)
            te3.kv2 r9 = (te3.C101804kv2) r9
            int r9 = r9.f298690e
            r11 = 6
            if (r9 != r11) goto L_0x081a
        L_0x02a2:
            java.lang.String r9 = "onsight click"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            java.lang.Object r9 = r45.getTag()
            boolean r9 = r9 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96066m2
            if (r9 == 0) goto L_0x02b7
            java.lang.Object r9 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.m2 r9 = (com.tencent.p014mm.plugin.sns.p106ui.C96066m2) r9
            goto L_0x02b8
        L_0x02b7:
            r9 = 0
        L_0x02b8:
            java.lang.Object r11 = r45.getTag()
            boolean r11 = r11 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder
            if (r11 == 0) goto L_0x02d7
            java.lang.Object r9 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r9 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r9
            te3.j00 r11 = r0.ContentObj
            int r11 = r11.f298424e
            r13 = 27
            if (r11 != r13) goto L_0x02d4
            r11 = r9
            com.tencent.mm.plugin.sns.ui.item.p$g r11 = (com.tencent.p014mm.plugin.sns.p106ui.item.C95944p.C95951g) r11
            com.tencent.mm.plugin.sns.ui.m2 r11 = r11.f280167K0
            goto L_0x02e9
        L_0x02d4:
            com.tencent.mm.plugin.sns.ui.m2 r11 = r9.f279953e0
            goto L_0x02e9
        L_0x02d7:
            java.lang.Object r11 = r45.getTag()
            boolean r11 = r11 instanceof nt2.C100165c
            if (r11 == 0) goto L_0x02e7
            java.lang.Object r9 = r45.getTag()
            nt2.c r9 = (nt2.C100165c) r9
            com.tencent.mm.plugin.sns.ui.m2 r9 = r9.f293415h
        L_0x02e7:
            r11 = r9
            r9 = 0
        L_0x02e9:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r13 = r7.f280419d
            com.tencent.mm.plugin.sns.model.d1 r13 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122983e(r13)
            boolean r13 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r13)
            if (r13 == 0) goto L_0x0302
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r13 = r7.f280419d
            com.tencent.mm.plugin.sns.model.d1 r13 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122983e(r13)
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r13 = r13.mo130970a()
            r13.mo131335v(r6)
        L_0x0302:
            boolean r13 = r6.isAd()
            te3.j00 r15 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r15 = r15.f298427h
            if (r15 == 0) goto L_0x080b
            int r15 = r15.size()
            if (r15 != 0) goto L_0x0314
            goto L_0x080b
        L_0x0314:
            te3.j00 r15 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r15 = r15.f298427h
            java.lang.Object r15 = r15.get(r14)
            te3.kv2 r15 = (te3.C101804kv2) r15
            r35 = r10
            if (r13 == 0) goto L_0x033b
            com.tencent.mm.plugin.sns.model.o r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            boolean r10 = r10.mo131141x(r15)
            if (r10 != 0) goto L_0x033b
            if (r11 == 0) goto L_0x033b
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r36 = r12
            r12 = 5
            r37 = r3
            r3 = 1910(0x776, float:2.676E-42)
            r10.mo175911u(r3, r12)
            goto L_0x033f
        L_0x033b:
            r37 = r3
            r36 = r12
        L_0x033f:
            boolean r3 = r6.isAd()
            if (r3 == 0) goto L_0x0364
            com.tencent.mm.plugin.sns.storage.ADXml r3 = r6.getAdXml()
            boolean r3 = r3.isLandingPagesAd()
            if (r3 == 0) goto L_0x0364
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r3 = r6.getAdSnsInfo()
            java.lang.String r3 = r3.field_adxml
            if (r14 <= 0) goto L_0x035a
            r12 = r19
            goto L_0x035c
        L_0x035a:
            r12 = r20
        L_0x035c:
            boolean r3 = ps2.C100894u.m132240t(r3, r12)
            if (r3 == 0) goto L_0x0364
            r3 = 1
            goto L_0x0365
        L_0x0364:
            r3 = 0
        L_0x0365:
            if (r3 != 0) goto L_0x039e
            if (r13 == 0) goto L_0x039e
            com.tencent.mm.plugin.sns.model.o r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            boolean r10 = r10.mo131143z(r15)
            if (r10 == 0) goto L_0x039e
            if (r11 == 0) goto L_0x039e
            com.tencent.mm.plugin.sns.model.o r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r10.mo131122i0(r15)
            android.widget.ImageView r10 = r11.f280506i
            r12 = 8
            r10.setVisibility(r12)
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r11.f280507j
            r10.setVisibility(r12)
            if (r13 == 0) goto L_0x0397
            jp2.w$b r10 = jp2.C98977w.C98979b.Sight
            jp2.w$a r11 = jp2.C98977w.C98978a.PlayIcon
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r13 = r7.f280419d
            int r13 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r13)
            jp2.C98977w.m128885a(r10, r11, r6, r13)
        L_0x0397:
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 1910(0x776, float:2.676E-42)
            r10.mo175911u(r11, r12)
        L_0x039e:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r10 = r7.f280419d
            int r10 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r10)
            r11 = 717(0x2cd, float:1.005E-42)
            if (r10 != 0) goto L_0x03ac
            ad0.C91998s.m115550d(r11)
            goto L_0x03af
        L_0x03ac:
            ad0.C91998s.m115549c(r11)
        L_0x03af:
            vr2.C102236a0.m134728W(r6)
            r6.isAd()
            r6.getUxinfo()
            java.lang.String r10 = r15.f298689d
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r10 = r7.f280419d
            int r10 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r10)
            r11 = 745(0x2e9, float:1.044E-42)
            if (r10 != 0) goto L_0x03c8
            ad0.C91998s.m115550d(r11)
            goto L_0x03cb
        L_0x03c8:
            ad0.C91998s.m115549c(r11)
        L_0x03cb:
            vr2.C102236a0.m134728W(r6)
            r6.isAd()
            r10 = 2
            int[] r11 = new int[r10]
            if (r9 == 0) goto L_0x042f
            boolean r10 = r9 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.C95917e.C95922e
            if (r10 == 0) goto L_0x03f6
            com.tencent.mm.plugin.sns.ui.item.e$e r9 = (com.tencent.p014mm.plugin.sns.p106ui.item.C95917e.C95922e) r9
            nq2.a$d r0 = r9.f280077F0
            android.view.View r0 = r0.f293379x
            if (r0 == 0) goto L_0x042c
            r0.getLocationInWindow(r11)
            nq2.a$d r0 = r9.f280077F0
            android.view.View r0 = r0.f293379x
            int r0 = r0.getWidth()
            nq2.a$d r9 = r9.f280077F0
            android.view.View r9 = r9.f293379x
            int r9 = r9.getHeight()
            goto L_0x0461
        L_0x03f6:
            com.tencent.mm.plugin.sns.ui.m2 r10 = r9.f279953e0
            android.view.View r10 = r10.f280505h
            if (r10 == 0) goto L_0x0410
            r10.getLocationInWindow(r11)
            com.tencent.mm.plugin.sns.ui.m2 r0 = r9.f279953e0
            android.view.View r0 = r0.f280505h
            int r0 = r0.getWidth()
            com.tencent.mm.plugin.sns.ui.m2 r9 = r9.f279953e0
            android.view.View r9 = r9.f280505h
            int r9 = r9.getHeight()
            goto L_0x0461
        L_0x0410:
            te3.j00 r0 = r0.ContentObj
            int r0 = r0.f298424e
            r10 = 27
            if (r0 != r10) goto L_0x042c
            com.tencent.mm.plugin.sns.ui.item.p$g r9 = (com.tencent.p014mm.plugin.sns.p106ui.item.C95944p.C95951g) r9
            android.view.View r0 = r9.f280162F0
            r0.getLocationInWindow(r11)
            android.view.View r0 = r9.f280162F0
            int r0 = r0.getWidth()
            android.view.View r9 = r9.f280162F0
            int r9 = r9.getHeight()
            goto L_0x0461
        L_0x042c:
            r0 = 0
            r9 = 0
            goto L_0x0461
        L_0x042f:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96066m2
            if (r0 == 0) goto L_0x0456
            java.lang.Object r0 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.m2 r0 = (com.tencent.p014mm.plugin.sns.p106ui.C96066m2) r0
            if (r0 == 0) goto L_0x0444
            android.view.View r9 = r0.f280505h
            r9.getLocationInWindow(r11)
        L_0x0444:
            android.view.View r9 = r0.f280505h
            int r9 = r9.getWidth()
            android.view.View r0 = r0.f280505h
            int r0 = r0.getHeight()
            r43 = r9
            r9 = r0
            r0 = r43
            goto L_0x0461
        L_0x0456:
            r8.getLocationInWindow(r11)
            int r0 = r45.getWidth()
            int r9 = r45.getHeight()
        L_0x0461:
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 11444(0x2cb4, float:1.6036E-41)
            r13 = 1
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            r16 = 0
            r15[r16] = r13
            r10.mo160131h(r12, r15)
            boolean r10 = br2.C54550e.m61296a(r6)
            if (r10 == 0) goto L_0x0489
            com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent r10 = new com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent
            r10.<init>()
            com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent$a r12 = r10.f154872d
            java.lang.String r13 = vr2.C102236a0.m134728W(r6)
            r12.f154873a = r13
            r10.publish()
        L_0x0489:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r10 = r7.f280419d
            com.tencent.mm.plugin.sns.storage.ADInfo r10 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122990l(r10, r6)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r12 = r7.f280419d
            android.app.Activity r12 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r12)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r13 = r7.f280419d
            int r13 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r13)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r15 = r7.f280419d
            jp2.o r15 = r15.f280378h
            boolean r10 = vr2.C102260r.m134837F(r12, r6, r10, r13, r15)
            if (r10 == 0) goto L_0x04ae
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r10 = r37
            j20.C117292a.m165361g(r7, r5, r4, r1, r10)
            return
        L_0x04ae:
            r10 = r37
            if (r3 == 0) goto L_0x0625
            java.lang.Object r3 = r45.getTag()
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder
            if (r3 == 0) goto L_0x04c6
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            java.lang.Object r8 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r8 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r8
            r3.mo133540C(r8)
            goto L_0x04d9
        L_0x04c6:
            java.lang.Object r3 = r45.getTag()
            boolean r3 = r3 instanceof nt2.C100165c
            if (r3 == 0) goto L_0x04d9
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            java.lang.Object r8 = r45.getTag()
            nt2.c r8 = (nt2.C100165c) r8
            r3.mo133538A(r8)
        L_0x04d9:
            com.tencent.mm.modelsns.SnsAdClick r3 = new com.tencent.mm.modelsns.SnsAdClick
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r8 = r7.f280419d
            int r16 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r8)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r8 = r7.f280419d
            int r8 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r8)
            if (r8 != 0) goto L_0x04ec
            r17 = 1
            goto L_0x04ee
        L_0x04ec:
            r17 = 2
        L_0x04ee:
            long r12 = r6.field_snsId
            r20 = 22
            r21 = 21
            r15 = r3
            r18 = r12
            r15.<init>(r16, r17, r18, r20, r21)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r8 = r7.f280419d
            jp2.o r8 = r8.f280378h
            r12 = 22
            vr2.C102260r.m134864d(r3, r8, r6, r12)
            vr2.C102236a0.m134773u0(r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r8 = 0
            r12 = r11[r8]
            r13 = r36
            r3.putExtra(r13, r12)
            r8 = 1
            r11 = r11[r8]
            r12 = r34
            r3.putExtra(r12, r11)
            r11 = r33
            r3.putExtra(r11, r0)
            r15 = r32
            r3.putExtra(r15, r9)
            java.lang.String r0 = r6.getSnsId()
            r9 = r31
            r3.putExtra(r9, r0)
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r6.getTimeLine()
            java.lang.String r0 = r0.f283893Id
            r8 = r30
            r3.putExtra(r8, r0)
            java.lang.String r0 = r6.getUxinfo()
            r8 = r29
            r3.putExtra(r8, r0)
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r6.getTimeLine()
            if (r0 == 0) goto L_0x055f
            te3.j00 r0 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r8 = r0.size()
            if (r8 <= r14) goto L_0x055f
            java.lang.Object r0 = r0.get(r14)
            te3.kv2 r0 = (te3.C101804kv2) r0
            java.lang.String r0 = r0.f298694i
            r8 = r28
            r3.putExtra(r8, r0)
        L_0x055f:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            r8 = r25
            r3.setClass(r0, r8)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            int r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r0)
            r8 = 2
            if (r0 != r8) goto L_0x0576
            r11 = 16
            goto L_0x0582
        L_0x0576:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            int r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r0)
            r8 = 1
            if (r0 != r8) goto L_0x0581
            r11 = 2
            goto L_0x0582
        L_0x0581:
            r11 = 1
        L_0x0582:
            java.lang.String r0 = "sns_landig_pages_from_source"
            r3.putExtra(r0, r11)
            if (r14 <= 0) goto L_0x0593
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            java.lang.String r0 = r0.getTurnCanvasInfo()
            goto L_0x0599
        L_0x0593:
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r0 = r6.getAdSnsInfo()
            java.lang.String r0 = r0.field_adxml
        L_0x0599:
            java.lang.String r8 = "sns_landing_pages_xml"
            r3.putExtra(r8, r0)
            int r0 = r6.getAdRecSrc()
            java.lang.String r8 = "sns_landing_pages_rec_src"
            r3.putExtra(r8, r0)
            java.lang.String r0 = "sns_landing_pages_xml_prefix"
            java.lang.String r8 = "adxml"
            r3.putExtra(r0, r8)
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "sns_landing_page_start_time"
            r3.putExtra(r0, r8)
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            boolean r0 = r0.forbiddenCustomAnimation
            if (r0 != 0) goto L_0x05cb
            java.lang.String r0 = "sns_landing_pages_need_enter_and_exit_animation"
            r8 = 1
            r3.putExtra(r0, r8)
            goto L_0x05cc
        L_0x05cb:
            r8 = 1
        L_0x05cc:
            java.lang.String r0 = "sns_landing_is_native_sight_ad"
            r3.putExtra(r0, r8)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r3)
            java.lang.Object[] r12 = r8.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$36"
            java.lang.String r14 = "onClick"
            java.lang.String r15 = "(Landroid/view/View;)V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = 0
            java.lang.Object r8 = r8.mo10231a(r3)
            android.content.Intent r8 = (android.content.Intent) r8
            r0.startActivity(r8)
            java.lang.String r12 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$36"
            java.lang.String r13 = "onClick"
            java.lang.String r14 = "(Landroid/view/View;)V"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "startActivity"
            java.lang.String r17 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            boolean r0 = r0.forbiddenCustomAnimation
            if (r0 != 0) goto L_0x0864
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            r3 = 0
            r0.overridePendingTransition(r3, r3)
            goto L_0x0864
        L_0x0625:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            com.tencent.mm.plugin.sns.storage.ADInfo r3 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122990l(r0, r6)
            if (r14 <= 0) goto L_0x062f
            r9 = 1
            goto L_0x0630
        L_0x062f:
            r9 = 0
        L_0x0630:
            boolean r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122982d(r0, r3, r6, r9)
            if (r0 == 0) goto L_0x067b
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d     // Catch:{ all -> 0x064a }
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)     // Catch:{ all -> 0x064a }
            cq2.d r0 = cq2.C97354d.m125367c(r0)     // Catch:{ all -> 0x064a }
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d     // Catch:{ all -> 0x064a }
            int r3 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r3)     // Catch:{ all -> 0x064a }
            r0.mo136622a(r3, r6)     // Catch:{ all -> 0x064a }
            goto L_0x064b
        L_0x064a:
        L_0x064b:
            com.tencent.mm.modelsns.SnsAdClick r0 = new com.tencent.mm.modelsns.SnsAdClick
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            int r12 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r3)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            int r3 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r3)
            if (r3 != 0) goto L_0x065d
            r13 = 1
            goto L_0x065e
        L_0x065d:
            r13 = 2
        L_0x065e:
            long r14 = r6.field_snsId
            r16 = 22
            r17 = 31
            r11 = r0
            r11.<init>(r12, r13, r14, r16, r17)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            jp2.o r3 = r3.f280378h
            r8 = 22
            vr2.C102260r.m134864d(r0, r3, r6, r8)
            vr2.C102236a0.m134773u0(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            j20.C117292a.m165361g(r7, r5, r4, r1, r10)
            return
        L_0x067b:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d     // Catch:{ all -> 0x06b4 }
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)     // Catch:{ all -> 0x06b4 }
            r3 = r22
            r9 = r23
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r3)     // Catch:{ all -> 0x06b4 }
            r11 = 4
            tp2.c r0 = tp2.C101911a.m134112a(r11, r0)     // Catch:{ all -> 0x06b4 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r3)     // Catch:{ all -> 0x06b4 }
            if (r0 == 0) goto L_0x06b5
            tp2.d r3 = new tp2.d     // Catch:{ all -> 0x06b4 }
            r3.<init>()     // Catch:{ all -> 0x06b4 }
            java.lang.String r9 = "snsAdStatistic"
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r11 = r7.f280419d     // Catch:{ all -> 0x06b4 }
            jp2.o r11 = r11.f280378h     // Catch:{ all -> 0x06b4 }
            r3.mo141404b(r9, r11)     // Catch:{ all -> 0x06b4 }
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r9 = r7.f280419d     // Catch:{ all -> 0x06b4 }
            int r9 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r9)     // Catch:{ all -> 0x06b4 }
            boolean r0 = r0.mo126055b(r8, r9, r6, r3)     // Catch:{ all -> 0x06b4 }
            if (r0 == 0) goto L_0x06b5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            j20.C117292a.m165361g(r7, r5, r4, r1, r10)
            return
        L_0x06b4:
        L_0x06b5:
            com.tencent.mm.modelsns.SnsAdClick r0 = new com.tencent.mm.modelsns.SnsAdClick
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            int r29 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r3)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            int r3 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r3)
            if (r3 != 0) goto L_0x06c8
            r30 = 1
            goto L_0x06ca
        L_0x06c8:
            r30 = 2
        L_0x06ca:
            long r8 = r6.field_snsId
            r33 = 22
            r34 = 0
            r28 = r0
            r31 = r8
            r28.<init>(r29, r30, r31, r33, r34)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            jp2.o r3 = r3.f280378h
            r8 = 22
            vr2.C102260r.m134864d(r0, r3, r6, r8)
            vr2.C102236a0.m134773u0(r0)
            if (r14 <= 0) goto L_0x06ee
            com.tencent.mm.plugin.sns.storage.ADXml r3 = r6.getAdXml()
            com.tencent.mm.plugin.sns.storage.ADXml$j r3 = r3.adTurnInfo
            java.lang.String r3 = r3.f275717a
            goto L_0x06f2
        L_0x06ee:
            java.lang.String r3 = r6.getAdInfoLink()
        L_0x06f2:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r8 == 0) goto L_0x06fc
            java.lang.String r3 = r6.getAdLink()
        L_0x06fc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "video cardAdClick, adlink url "
            r8.append(r9)
            r8.append(r3)
            r9 = r21
            r8.append(r9)
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r6.getAdXml()
            int r9 = r9.webrightBar
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r9 = r35
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r8 == 0) goto L_0x072e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            j20.C117292a.m165361g(r7, r5, r4, r1, r10)
            return
        L_0x072e:
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r6.getAdXml()
            int r9 = r9.webrightBar
            if (r9 != 0) goto L_0x073d
            r9 = 1
            goto L_0x073e
        L_0x073d:
            r9 = 0
        L_0x073e:
            boolean r11 = sf0.C90188n0.f258957y
            if (r11 == 0) goto L_0x0744
            r12 = 0
            goto L_0x0745
        L_0x0744:
            r12 = r9
        L_0x0745:
            boolean r9 = r6.isAd()
            if (r9 == 0) goto L_0x0769
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r9 = r7.f280419d
            com.tencent.mm.plugin.sns.storage.ADInfo r9 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122990l(r9, r6)
            if (r9 == 0) goto L_0x0769
            java.lang.String r11 = r9.viewId
            java.lang.String r13 = "KsnsViewId"
            r8.putExtra(r13, r11)
            java.lang.String r11 = r9.uxInfo
            java.lang.String r3 = vr2.C102236a0.m134734b(r3, r11)
            java.lang.String r3 = ko2.C46734a.m52032e(r3)
            java.lang.String r9 = r9.uxInfo
            vr2.C102236a0.m134736c(r8, r9)
        L_0x0769:
            java.lang.String r9 = "KRightBtn"
            r8.putExtra(r9, r12)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r11 = "KSnsAdTag"
            r9.putParcelable(r11, r0)
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r6.getTimeLine()
            java.lang.String r0 = r0.statExtStr
            java.lang.String r11 = "key_snsad_statextstr"
            r9.putString(r11, r0)
            java.lang.String r0 = "jsapiargs"
            r8.putExtra(r0, r9)
            java.lang.String r0 = "rawUrl"
            r8.putExtra(r0, r3)
            java.lang.String r0 = "useJs"
            r3 = 1
            r8.putExtra(r0, r3)
            java.lang.String r0 = r6.field_userName
            java.lang.String r3 = "srcUsername"
            r8.putExtra(r3, r0)
            java.lang.String r0 = "stastic_scene"
            r3 = 15
            r8.putExtra(r0, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = r27
            r0.append(r3)
            long r11 = r6.field_snsId
            java.lang.String r9 = vr2.C102236a0.m134765q0(r11)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = "KPublisherId"
            r8.putExtra(r9, r0)
            java.lang.String r0 = r6.field_userName
            java.lang.String r9 = "pre_username"
            r8.putExtra(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            long r11 = r6.field_snsId
            java.lang.String r3 = vr2.C102236a0.m134765q0(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "prePublishId"
            r8.putExtra(r3, r0)
            java.lang.String r0 = r6.field_userName
            java.lang.String r3 = "preUsername"
            r8.putExtra(r3, r0)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            r0.mo133544m(r8)
            java.lang.Class<om.f> r0 = p214om.C11502f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            android.app.Activity r3 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r3)
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            r0.mo93190w(r8, r3)
            goto L_0x0864
        L_0x080b:
            r9 = r10
            r10 = r3
            java.lang.String r0 = "the obj.ContentObj.MediaObjList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            j20.C117292a.m165361g(r7, r5, r4, r1, r10)
            return
        L_0x081a:
            r38 = r10
            r13 = r12
            r41 = r21
            r42 = r23
            r40 = r25
            r39 = r27
            r9 = r31
            r15 = r32
            r11 = r33
            r12 = r34
            r10 = r3
            te3.j00 r3 = r0.ContentObj
            r31 = r9
            int r9 = r3.f298424e
            r32 = r15
            r15 = 1
            if (r9 != r15) goto L_0x0841
            java.util.LinkedList<te3.kv2> r3 = r3.f298427h
            int r3 = r3.size()
            if (r3 == r15) goto L_0x0867
        L_0x0841:
            te3.j00 r3 = r0.ContentObj
            int r9 = r3.f298424e
            r15 = 7
            if (r9 == r15) goto L_0x0867
            r15 = 27
            if (r9 != r15) goto L_0x0864
            java.util.LinkedList<te3.kv2> r3 = r3.f298427h
            int r3 = r3.size()
            if (r3 <= r14) goto L_0x0864
            te3.j00 r0 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            java.lang.Object r0 = r0.get(r14)
            te3.kv2 r0 = (te3.C101804kv2) r0
            int r0 = r0.f298690e
            r3 = 2
            if (r0 != r3) goto L_0x0864
            goto L_0x0867
        L_0x0864:
            r8 = r4
            goto L_0x0d33
        L_0x0867:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122990l(r0, r6)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            android.app.Activity r3 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r3)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r9 = r7.f280419d
            int r9 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r9)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r15 = r7.f280419d
            jp2.o r15 = r15.f280378h
            boolean r0 = vr2.C102260r.m134837F(r3, r6, r0, r9, r15)
            if (r0 == 0) goto L_0x088a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            j20.C117292a.m165361g(r7, r5, r4, r1, r10)
            return
        L_0x088a:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder
            if (r0 == 0) goto L_0x08e7
            java.lang.Object r0 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r0 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r0
            java.lang.Object r3 = r45.getTag()
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.C95911b.C95915d
            if (r3 == 0) goto L_0x08aa
            java.lang.Object r0 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.item.b$d r0 = (com.tencent.p014mm.plugin.sns.p106ui.item.C95911b.C95915d) r0
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r0.f280037I0
            goto L_0x095e
        L_0x08aa:
            java.lang.Object r3 = r45.getTag()
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.C95917e.C95922e
            if (r3 == 0) goto L_0x08be
            java.lang.Object r0 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.item.e$e r0 = (com.tencent.p014mm.plugin.sns.p106ui.item.C95917e.C95922e) r0
            nq2.a$d r0 = r0.f280077F0
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r0.f293358c
            goto L_0x095e
        L_0x08be:
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.C95944p.C95951g
            if (r3 == 0) goto L_0x08cc
            com.tencent.mm.plugin.sns.ui.item.p$g r0 = (com.tencent.p014mm.plugin.sns.p106ui.item.C95944p.C95951g) r0
            com.tencent.mm.plugin.sns.ui.item.p$f r0 = r0.f280164H0
            android.view.View r0 = r0.f280157b
            com.tencent.mm.plugin.sns.ui.TagImageView r0 = (com.tencent.p014mm.plugin.sns.p106ui.TagImageView) r0
            goto L_0x095e
        L_0x08cc:
            java.lang.Object r3 = r45.getTag()
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.C95933n.C95941e
            if (r3 == 0) goto L_0x08de
            java.lang.Object r0 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.item.n$e r0 = (com.tencent.p014mm.plugin.sns.p106ui.item.C95933n.C95941e) r0
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView r0 = r0.f280128I0
            goto L_0x095e
        L_0x08de:
            com.tencent.mm.plugin.sns.ui.PhotosContent r0 = r0.f279936S
            r3 = 0
            com.tencent.mm.plugin.sns.ui.TagImageView r0 = r0.mo132426b(r3)
            goto L_0x095e
        L_0x08e7:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof nt2.C100165c
            if (r0 == 0) goto L_0x0942
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof nt2.C100167e
            if (r0 == 0) goto L_0x0900
            java.lang.Object r0 = r45.getTag()
            nt2.e r0 = (nt2.C100167e) r0
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r0.f293453w
            goto L_0x095e
        L_0x0900:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof nt2.C100173h
            if (r0 == 0) goto L_0x0920
            java.lang.Object r0 = r45.getTag()
            nt2.h r0 = (nt2.C100173h) r0
            r0.getClass()
            java.lang.String r3 = "getWrapViewHolder"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r9)
            nq2.a$d r0 = r0.f293468s
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r9)
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = r0.f293358c
            goto L_0x095e
        L_0x0920:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof nt2.C100189m
            if (r0 == 0) goto L_0x0931
            java.lang.Object r0 = r45.getTag()
            nt2.m r0 = (nt2.C100189m) r0
            android.view.View r0 = r0.f293413f
            goto L_0x095e
        L_0x0931:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof nt2.C100180k
            if (r0 == 0) goto L_0x095d
            java.lang.Object r0 = r45.getTag()
            nt2.k r0 = (nt2.C100180k) r0
            android.view.View r0 = r0.f293413f
            goto L_0x095e
        L_0x0942:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.MaskImageView
            if (r0 == 0) goto L_0x0951
            java.lang.Object r0 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.MaskImageView r0 = (com.tencent.p014mm.plugin.sns.p106ui.MaskImageView) r0
            goto L_0x095e
        L_0x0951:
            java.lang.Object r0 = r45.getTag()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.sns.p106ui.TagImageView
            if (r0 == 0) goto L_0x095d
            r0 = r8
            com.tencent.mm.plugin.sns.ui.TagImageView r0 = (com.tencent.p014mm.plugin.sns.p106ui.TagImageView) r0
            goto L_0x095e
        L_0x095d:
            r0 = 0
        L_0x095e:
            com.tencent.mm.plugin.sns.storage.ADXml r3 = r6.getAdXml()
            boolean r3 = r3.isLandingPagesAd()
            if (r3 == 0) goto L_0x0b36
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r3 = r6.getAdSnsInfo()
            java.lang.String r3 = r3.field_adxml
            if (r14 <= 0) goto L_0x0973
            r9 = r19
            goto L_0x0975
        L_0x0973:
            r9 = r20
        L_0x0975:
            boolean r3 = ps2.C100894u.m132240t(r3, r9)
            if (r3 == 0) goto L_0x0b36
            com.tencent.mm.modelsns.SnsAdClick r3 = new com.tencent.mm.modelsns.SnsAdClick
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r9 = r7.f280419d
            int r18 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r9)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r9 = r7.f280419d
            int r9 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r9)
            if (r9 != 0) goto L_0x098e
            r19 = 1
            goto L_0x0990
        L_0x098e:
            r19 = 2
        L_0x0990:
            long r8 = r6.field_snsId
            r22 = 22
            r23 = 21
            r17 = r3
            r20 = r8
            r17.<init>(r18, r19, r20, r22, r23, r24)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r8 = r7.f280419d
            jp2.o r8 = r8.f280378h
            r9 = 22
            vr2.C102260r.m134864d(r3, r8, r6, r9)
            vr2.C102236a0.m134773u0(r3)
            java.lang.Object r3 = r45.getTag()
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder
            if (r3 == 0) goto L_0x09bd
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            java.lang.Object r8 = r45.getTag()
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r8 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r8
            r3.mo133540C(r8)
            goto L_0x09d0
        L_0x09bd:
            java.lang.Object r3 = r45.getTag()
            boolean r3 = r3 instanceof nt2.C100165c
            if (r3 == 0) goto L_0x09d0
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            java.lang.Object r8 = r45.getTag()
            nt2.c r8 = (nt2.C100165c) r8
            r3.mo133538A(r8)
        L_0x09d0:
            r3 = 2
            int[] r8 = new int[r3]
            r0.getLocationInWindow(r8)
            int r3 = r0.getWidth()
            int r0 = r0.getHeight()
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            r16 = r4
            r15 = 0
            r4 = r8[r15]
            r9.putExtra(r13, r4)
            r4 = 1
            r8 = r8[r4]
            r9.putExtra(r12, r8)
            r9.putExtra(r11, r3)
            r3 = r32
            r9.putExtra(r3, r0)
            java.lang.String r0 = r6.getSnsId()
            r3 = r31
            r9.putExtra(r3, r0)
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r6.getTimeLine()
            java.lang.String r0 = r0.f283893Id
            r3 = r30
            r9.putExtra(r3, r0)
            java.lang.String r0 = r6.getUxinfo()
            r3 = r29
            r9.putExtra(r3, r0)
            java.lang.String r0 = r6.getAid()
            java.lang.String r3 = "sns_landing_pages_aid"
            r9.putExtra(r3, r0)
            java.lang.String r0 = r6.getTraceid()
            java.lang.String r3 = "sns_landing_pages_traceid"
            r9.putExtra(r3, r0)
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r6.getTimeLine()
            if (r0 == 0) goto L_0x0a5c
            te3.j00 r0 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r3 = r0.size()
            if (r3 <= r14) goto L_0x0a48
            java.lang.Object r0 = r0.get(r14)
            te3.kv2 r0 = (te3.C101804kv2) r0
            java.lang.String r0 = r0.f298694i
            r3 = r28
            r9.putExtra(r3, r0)
            goto L_0x0a5c
        L_0x0a48:
            r3 = r28
            int r4 = r0.size()
            if (r4 <= 0) goto L_0x0a5c
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            te3.kv2 r0 = (te3.C101804kv2) r0
            java.lang.String r0 = r0.f298694i
            r9.putExtra(r3, r0)
        L_0x0a5c:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            r3 = r40
            r9.setClass(r0, r3)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            int r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r0)
            r3 = 2
            if (r0 != r3) goto L_0x0a73
            r11 = 16
            goto L_0x0a7f
        L_0x0a73:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            int r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r0)
            r4 = 1
            if (r0 != r4) goto L_0x0a7e
            r11 = 2
            goto L_0x0a7f
        L_0x0a7e:
            r11 = 1
        L_0x0a7f:
            java.lang.String r0 = "sns_landig_pages_from_source"
            r9.putExtra(r0, r11)
            if (r14 <= 0) goto L_0x0a90
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            java.lang.String r0 = r0.getTurnCanvasInfo()
            goto L_0x0a96
        L_0x0a90:
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r0 = r6.getAdSnsInfo()
            java.lang.String r0 = r0.field_adxml
        L_0x0a96:
            java.lang.String r3 = "sns_landing_pages_xml"
            r9.putExtra(r3, r0)
            int r0 = r6.getAdRecSrc()
            java.lang.String r3 = "sns_landing_pages_rec_src"
            r9.putExtra(r3, r0)
            java.lang.String r0 = "sns_landing_pages_xml_prefix"
            java.lang.String r3 = "adxml"
            r9.putExtra(r0, r3)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "sns_landing_page_start_time"
            r9.putExtra(r0, r3)
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            boolean r0 = r0.forbiddenCustomAnimation
            if (r0 != 0) goto L_0x0ac7
            java.lang.String r0 = "sns_landing_pages_need_enter_and_exit_animation"
            r3 = 1
            r9.putExtra(r0, r3)
        L_0x0ac7:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r9)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$36"
            java.lang.String r20 = "onClick"
            java.lang.String r21 = "(Landroid/view/View;)V"
            java.lang.String r22 = "Undefined"
            java.lang.String r23 = "startActivity"
            java.lang.String r24 = "(Landroid/content/Intent;)V"
            r17 = r0
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            android.content.Intent r3 = (android.content.Intent) r3
            r0.startActivity(r3)
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$36"
            java.lang.String r19 = "onClick"
            java.lang.String r20 = "(Landroid/view/View;)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            boolean r0 = r0.forbiddenCustomAnimation
            if (r0 != 0) goto L_0x0b19
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)
            r4 = 0
            r0.overridePendingTransition(r4, r4)
        L_0x0b19:
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            com.tencent.mm.plugin.sns.model.d1 r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122983e(r0)
            boolean r0 = com.tencent.p014mm.plugin.sns.p106ui.C96085n8.m123089H(r0)
            if (r0 == 0) goto L_0x0b32
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            com.tencent.mm.plugin.sns.model.d1 r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122983e(r0)
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r0 = r0.mo130970a()
            r0.mo131335v(r6)
        L_0x0b32:
            r8 = r16
            goto L_0x0d33
        L_0x0b36:
            r16 = r4
            r3 = 2
            r4 = 0
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            com.tencent.mm.plugin.sns.storage.ADInfo r8 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122990l(r0, r6)
            if (r14 <= 0) goto L_0x0b44
            r9 = 1
            goto L_0x0b45
        L_0x0b44:
            r9 = 0
        L_0x0b45:
            boolean r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122982d(r0, r8, r6, r9)
            if (r0 == 0) goto L_0x0b97
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d     // Catch:{ all -> 0x0b5f }
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)     // Catch:{ all -> 0x0b5f }
            cq2.d r0 = cq2.C97354d.m125367c(r0)     // Catch:{ all -> 0x0b5f }
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r7.f280419d     // Catch:{ all -> 0x0b5f }
            int r4 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r4)     // Catch:{ all -> 0x0b5f }
            r0.mo136622a(r4, r6)     // Catch:{ all -> 0x0b5f }
            goto L_0x0b60
        L_0x0b5f:
        L_0x0b60:
            com.tencent.mm.modelsns.SnsAdClick r0 = new com.tencent.mm.modelsns.SnsAdClick
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r7.f280419d
            int r18 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r4)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r7.f280419d
            int r4 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r4)
            if (r4 != 0) goto L_0x0b73
            r19 = 1
            goto L_0x0b75
        L_0x0b73:
            r19 = 2
        L_0x0b75:
            long r3 = r6.field_snsId
            r22 = 22
            r23 = 31
            r17 = r0
            r20 = r3
            r17.<init>(r18, r19, r20, r22, r23, r24)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            jp2.o r3 = r3.f280378h
            r4 = 22
            vr2.C102260r.m134864d(r0, r3, r6, r4)
            vr2.C102236a0.m134773u0(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r8 = r16
            j20.C117292a.m165361g(r7, r5, r8, r1, r10)
            return
        L_0x0b97:
            r8 = r16
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d     // Catch:{ all -> 0x0bda }
            android.app.Activity r0 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r0)     // Catch:{ all -> 0x0bda }
            r9 = r22
            r11 = r42
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r9)     // Catch:{ all -> 0x0bda }
            r12 = 4
            tp2.c r0 = tp2.C101911a.m134112a(r12, r0)     // Catch:{ all -> 0x0bda }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r9)     // Catch:{ all -> 0x0bda }
            if (r0 == 0) goto L_0x0bdb
            tp2.d r9 = new tp2.d     // Catch:{ all -> 0x0bda }
            java.lang.String r11 = "flipStatus"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x0bda }
            r9.<init>(r11, r12)     // Catch:{ all -> 0x0bda }
            java.lang.String r11 = "snsAdStatistic"
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r12 = r7.f280419d     // Catch:{ all -> 0x0bda }
            jp2.o r12 = r12.f280378h     // Catch:{ all -> 0x0bda }
            r9.mo141404b(r11, r12)     // Catch:{ all -> 0x0bda }
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r11 = r7.f280419d     // Catch:{ all -> 0x0bda }
            int r11 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r11)     // Catch:{ all -> 0x0bda }
            r12 = r45
            boolean r0 = r0.mo126055b(r12, r11, r6, r9)     // Catch:{ all -> 0x0bda }
            if (r0 == 0) goto L_0x0bdb
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            j20.C117292a.m165361g(r7, r5, r8, r1, r10)
            return
        L_0x0bda:
        L_0x0bdb:
            if (r14 <= 0) goto L_0x0be6
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r6.getAdXml()
            com.tencent.mm.plugin.sns.storage.ADXml$j r0 = r0.adTurnInfo
            java.lang.String r0 = r0.f275717a
            goto L_0x0bea
        L_0x0be6:
            java.lang.String r0 = r6.getAdInfoLink()
        L_0x0bea:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 == 0) goto L_0x0bf4
            java.lang.String r0 = r6.getAdLink()
        L_0x0bf4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "photo cardAdClick, adlink url "
            r9.append(r11)
            r9.append(r0)
            r11 = r41
            r9.append(r11)
            com.tencent.mm.plugin.sns.storage.ADXml r11 = r6.getAdXml()
            int r11 = r11.webrightBar
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r11 = r38
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r9)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r9 == 0) goto L_0x0c26
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            j20.C117292a.m165361g(r7, r5, r8, r1, r10)
            return
        L_0x0c26:
            com.tencent.mm.modelsns.SnsAdClick r9 = new com.tencent.mm.modelsns.SnsAdClick
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r11 = r7.f280419d
            int r18 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r11)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r11 = r7.f280419d
            int r11 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122989k(r11)
            if (r11 != 0) goto L_0x0c39
            r19 = 1
            goto L_0x0c3b
        L_0x0c39:
            r19 = 2
        L_0x0c3b:
            long r11 = r6.field_snsId
            r22 = 22
            r23 = 0
            r17 = r9
            r20 = r11
            r17.<init>(r18, r19, r20, r22, r23, r24)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r3 = r7.f280419d
            jp2.o r3 = r3.f280378h
            r11 = 22
            vr2.C102260r.m134864d(r9, r3, r6, r11)
            vr2.C102236a0.m134773u0(r9)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            com.tencent.mm.plugin.sns.storage.ADXml r11 = r6.getAdXml()
            int r11 = r11.webrightBar
            if (r11 != 0) goto L_0x0c64
            r19 = 1
            goto L_0x0c66
        L_0x0c64:
            r19 = 0
        L_0x0c66:
            boolean r11 = sf0.C90188n0.f258957y
            if (r11 == 0) goto L_0x0c6c
            r12 = 0
            goto L_0x0c6e
        L_0x0c6c:
            r12 = r19
        L_0x0c6e:
            boolean r4 = r6.isAd()
            if (r4 == 0) goto L_0x0c92
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r7.f280419d
            com.tencent.mm.plugin.sns.storage.ADInfo r4 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122990l(r4, r6)
            if (r4 == 0) goto L_0x0c92
            java.lang.String r11 = r4.viewId
            java.lang.String r13 = "KsnsViewId"
            r3.putExtra(r13, r11)
            java.lang.String r11 = r4.uxInfo
            java.lang.String r0 = vr2.C102236a0.m134734b(r0, r11)
            java.lang.String r0 = ko2.C46734a.m52032e(r0)
            java.lang.String r4 = r4.uxInfo
            vr2.C102236a0.m134736c(r3, r4)
        L_0x0c92:
            java.lang.String r4 = "KRightBtn"
            r3.putExtra(r4, r12)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r11 = "KSnsAdTag"
            r4.putParcelable(r11, r9)
            com.tencent.mm.protocal.protobuf.TimeLineObject r9 = r6.getTimeLine()
            java.lang.String r9 = r9.statExtStr
            java.lang.String r11 = "key_snsad_statextstr"
            r4.putString(r11, r9)
            java.lang.String r9 = "jsapiargs"
            r3.putExtra(r9, r4)
            java.lang.String r4 = "rawUrl"
            r3.putExtra(r4, r0)
            java.lang.String r0 = "useJs"
            r4 = 1
            r3.putExtra(r0, r4)
            java.lang.String r0 = r6.field_userName
            java.lang.String r4 = "srcUsername"
            r3.putExtra(r4, r0)
            java.lang.String r0 = "stastic_scene"
            r4 = 15
            r3.putExtra(r0, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r4 = r39
            r0.append(r4)
            long r11 = r6.field_snsId
            java.lang.String r9 = vr2.C102236a0.m134765q0(r11)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = "KPublisherId"
            r3.putExtra(r9, r0)
            java.lang.String r0 = r6.field_userName
            java.lang.String r9 = "pre_username"
            r3.putExtra(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            long r11 = r6.field_snsId
            java.lang.String r4 = vr2.C102236a0.m134765q0(r11)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "prePublishId"
            r3.putExtra(r4, r0)
            java.lang.String r0 = r6.field_userName
            java.lang.String r4 = "preUsername"
            r3.putExtra(r4, r0)
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r0 = r7.f280419d
            r0.mo133544m(r3)
            java.lang.Class<om.f> r0 = p214om.C11502f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.z r0 = r0.mo11462yM()
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r4 = r7.f280419d
            android.app.Activity r4 = com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener.m122988j(r4)
            com.tencent.mm.app.r1 r0 = (com.tencent.p014mm.app.C67654r1) r0
            r0.mo93190w(r3, r4)
        L_0x0d33:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            j20.C117292a.m165361g(r7, r5, r8, r1, r10)
            return
        L_0x0d3a:
            r10 = r3
            r8 = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            j20.C117292a.m165361g(r7, r5, r8, r1, r10)
            return
        L_0x0d43:
            r10 = r3
            r8 = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            j20.C117292a.m165361g(r7, r5, r8, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.listener.C96018c0.onClick(android.view.View):void");
    }
}
