package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import te3.C101802kr2;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$a */
public final /* synthetic */ class SnsCommentDetailUI$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsCommentDetailUI f278019d;

    /* renamed from: e */
    public final /* synthetic */ SnsInfo f278020e;

    /* renamed from: f */
    public final /* synthetic */ TimeLineObject f278021f;

    /* renamed from: g */
    public final /* synthetic */ String f278022g;

    /* renamed from: h */
    public final /* synthetic */ C101802kr2 f278023h;

    /* renamed from: i */
    public final /* synthetic */ SnsInfo f278024i;

    public /* synthetic */ SnsCommentDetailUI$$a(SnsCommentDetailUI snsCommentDetailUI, SnsInfo snsInfo, TimeLineObject timeLineObject, String str, C101802kr2 kr22, SnsInfo snsInfo2) {
        this.f278019d = snsCommentDetailUI;
        this.f278020e = snsInfo;
        this.f278021f = timeLineObject;
        this.f278022g = str;
        this.f278023h = kr22;
        this.f278024i = snsInfo2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r0 = r21
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI r11 = r0.f278019d
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r0.f278020e
            com.tencent.mm.protocal.protobuf.TimeLineObject r9 = r0.f278021f
            java.lang.String r10 = r0.f278022g
            te3.kr2 r12 = r0.f278023h
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r0.f278024i
            int r1 = com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI.f277824M1
            r11.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r8)
            r1.add(r9)
            r1.add(r10)
            r1.add(r12)
            r1.add(r7)
            r2 = r22
            r1.add(r2)
            java.lang.Object[] r6 = r1.toArray()
            r1.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r11
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.String r13 = "lambda$initView$1"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            java.lang.String r15 = "MicroMsg.SnsCommentDetailUI"
            java.lang.String r1 = "SnsCommentDetailUI click to post finder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            int r1 = r8.getTypeFlag()
            r6 = 1
            if (r1 != r6) goto L_0x0194
            boolean r16 = r8.isAd()
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$d r4 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$d
            r4.<init>(r11, r9, r7, r10)
            java.lang.String r7 = "handleSaveFinderPostOfPhotos"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r14)
            yn2.s0 r1 = yn2.C102882s0.f303681a
            boolean r1 = r1.mo142592d(r10)
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = "[handleSaveFinderPostOfPhotos] already contains, return;"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            r4.run()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r14)
            goto L_0x0194
        L_0x0079:
            te3.j00 r1 = r9.ContentObj
            java.util.LinkedList<te3.kv2> r3 = r1.f298427h
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r5 = 0
            r6 = 0
        L_0x0089:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x00dc
            java.lang.Object r0 = r3.get(r6)
            te3.kv2 r0 = (te3.C101804kv2) r0
            java.lang.String r18 = com.tencent.p014mm.plugin.sns.model.C94901o.m120385m(r0)
            boolean r18 = com.tencent.p014mm.vfs.C86013q1.m106450k(r18)
            if (r18 != 0) goto L_0x00d1
            r18 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r2.add(r7)
            java.lang.String r7 = r0.f298689d
            r1.put(r7, r0)
            int r5 = r5 + 1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r19 = r1
            java.lang.String r1 = "media.Id = "
            r7.append(r1)
            java.lang.String r0 = r0.f298689d
            r7.append(r0)
            java.lang.String r0 = ", need to download Image, current unLocalCount = "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x00d5
        L_0x00d1:
            r19 = r1
            r18 = r7
        L_0x00d5:
            int r6 = r6 + 1
            r7 = r18
            r1 = r19
            goto L_0x0089
        L_0x00dc:
            r19 = r1
            r18 = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[handleSaveFinderPostOfPhotos] unLocalCount = "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            if (r5 != 0) goto L_0x010d
            java.util.ArrayList r0 = r11.mo132625l8(r3)
            yn2.s0 r1 = yn2.C102882s0.f303681a
            java.lang.String r2 = r11.f277831D
            r6 = 0
            r1.mo142601m(r2, r12, r0, r6)
            r4.run()
            r20 = r13
            r13 = r18
            r18 = r12
            goto L_0x0190
        L_0x010d:
            r6 = 0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "current thread = "
            r1.append(r5)
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r1.append(r5)
            java.lang.String r5 = ", finalUnLocalCount = "
            r1.append(r5)
            int r5 = r0.get()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$32 r7 = new com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$32
            r5 = r19
            r1 = r7
            r17 = r2
            r2 = r11
            r19 = r3
            r3 = r0
            r0 = r4
            r4 = r5
            r5 = r19
            r20 = r13
            r13 = 0
            r6 = r12
            r13 = r18
            r18 = r12
            r12 = r7
            r7 = r0
            r1.<init>(r3, r4, r5, r6, r7)
            r11.f277830C1 = r12
            com.tencent.mm.plugin.sns.model.e r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()
            com.tencent.mm.plugin.sns.model.e$h r1 = r11.f277830C1
            r0.mo130978c(r1)
            r5 = 0
        L_0x015f:
            int r0 = r17.size()
            if (r5 >= r0) goto L_0x0190
            r0 = r17
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r19
            java.lang.Object r1 = r2.get(r1)
            te3.kv2 r1 = (te3.C101804kv2) r1
            com.tencent.mm.plugin.sns.model.e r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()
            if (r16 == 0) goto L_0x0182
            r4 = 8
            goto L_0x0183
        L_0x0182:
            r4 = 2
        L_0x0183:
            r6 = 0
            com.tencent.mm.storage.o3 r7 = com.tencent.p014mm.storage.C96983o3.f284138j
            r3.mo130979d(r1, r4, r6, r7)
            int r5 = r5 + 1
            r17 = r0
            r19 = r2
            goto L_0x015f
        L_0x0190:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            goto L_0x0198
        L_0x0194:
            r18 = r12
            r20 = r13
        L_0x0198:
            int r0 = r8.getTypeFlag()
            r1 = 15
            if (r0 != r1) goto L_0x01fc
            yn2.s0 r1 = yn2.C102882s0.f303681a
            boolean r0 = r1.mo142592d(r10)
            if (r0 != 0) goto L_0x01ea
            java.lang.String r0 = "SnsCommentDetailUI not contains localId, saveFinderPostDataOfPhotos"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            te3.j00 r2 = r9.ContentObj
            java.util.LinkedList<te3.kv2> r2 = r2.f298427h
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            te3.kv2 r2 = (te3.C101804kv2) r2
            java.lang.String r2 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120294m(r10, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "SnsCommentDetailUI videoUri = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r3)
            if (r2 == 0) goto L_0x01ea
            java.lang.String r3 = "KSightPath"
            r0.putExtra(r3, r2)
            java.lang.String r2 = "intent_skip_video_duration_check"
            r3 = 1
            r0.putExtra(r2, r3)
            java.lang.String r2 = r11.f277831D
            r3 = r18
            r4 = 0
            r1.mo142600l(r2, r3, r0, r4)
        L_0x01ea:
            java.lang.String r4 = r9.ContentDesc
            long r5 = r8.field_snsId
            int r0 = r8.localid
            long r7 = (long) r0
            te3.e94 r9 = r9.videoTemplate
            r0 = 1
            r2 = r11
            r3 = r10
            r10 = r0
            boolean r5 = r1.mo142596h(r2, r3, r4, r5, r7, r9, r10)
            goto L_0x01fe
        L_0x01fc:
            r4 = 0
            r5 = 0
        L_0x01fe:
            if (r5 == 0) goto L_0x0207
            android.widget.ListView r0 = r11.f277894o
            android.widget.LinearLayout r1 = r11.f277885i
            r0.removeHeaderView(r1)
        L_0x0207:
            r0 = r20
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r14)
            java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/SnsCommentDetailUI"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r11, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI$$a.onClick(android.view.View):void");
    }
}
