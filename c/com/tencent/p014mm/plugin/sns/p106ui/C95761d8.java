package com.tencent.p014mm.plugin.sns.p106ui;

import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.plugin.sns.ui.d8 */
public final class C95761d8 {

    /* renamed from: a */
    public final C95741b5 f279354a = new C95741b5();

    /* renamed from: b */
    public boolean f279355b;

    /* renamed from: c */
    public boolean f279356c;

    /* renamed from: d */
    public ActionBar f279357d;

    /* renamed from: e */
    public MMActivity f279358e;

    /* renamed from: f */
    public int f279359f = 800;

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016b A[LOOP:0: B:7:0x0071->B:47:0x016b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0177 A[EDGE_INSN: B:74:0x0177->B:49:0x0177 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133218a(android.widget.ListView r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "startAutoPlay"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "listView"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "startAutoPlay >> "
            r4.append(r5)
            boolean r6 = r0.f279355b
            r4.append(r6)
            java.lang.String r6 = ", "
            r4.append(r6)
            boolean r7 = r0.f279356c
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "MicroMsg.SnsWsFoldAutoPlayManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            boolean r4 = r0.f279355b
            if (r4 == 0) goto L_0x0231
            boolean r4 = r0.f279356c
            if (r4 != 0) goto L_0x003f
            goto L_0x0231
        L_0x003f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r21.getFirstVisiblePosition()
            int r11 = r21.getLastVisiblePosition()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r10)
            r12.append(r6)
            r12.append(r11)
            java.lang.String r5 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            if (r10 > r11) goto L_0x0175
            r13 = r10
        L_0x0071:
            int r14 = r13 - r10
            int r15 = r21.getChildCount()
            if (r14 < r15) goto L_0x007b
            goto L_0x0175
        L_0x007b:
            android.view.View r14 = r1.getChildAt(r14)
            if (r14 == 0) goto L_0x0165
            java.lang.Object r15 = r14.getTag()
            if (r15 == 0) goto L_0x0165
            java.lang.Object r15 = r14.getTag()
            boolean r15 = r15 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder
            if (r15 == 0) goto L_0x0165
            java.lang.Object r14 = r14.getTag()
            boolean r15 = r14 instanceof com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder
            r16 = 0
            if (r15 == 0) goto L_0x009c
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r14 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r14
            goto L_0x009e
        L_0x009c:
            r14 = r16
        L_0x009e:
            if (r14 == 0) goto L_0x00a4
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem r15 = r14.f279965k0
            r16 = r15
        L_0x00a4:
            if (r16 == 0) goto L_0x0165
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem r15 = r14.f279965k0
            boolean r6 = r15 instanceof bv2.C92312b
            if (r6 == 0) goto L_0x0165
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.video.ISnsAutoPlayItem"
            gy3.C87412m.m108592e(r15, r6)
            bv2.b r15 = (bv2.C92312b) r15
            java.lang.String r6 = "checkItemVisible"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            androidx.appcompat.app.ActionBar r12 = r0.f279357d
            if (r12 != 0) goto L_0x00c7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
        L_0x00c0:
            r19 = r2
            r18 = r10
            r1 = 0
            goto L_0x0155
        L_0x00c7:
            com.tencent.mm.ui.MMActivity r12 = r0.f279358e
            if (r12 != 0) goto L_0x00cf
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            goto L_0x00c0
        L_0x00cf:
            android.graphics.Rect r12 = r15.getDisplayRect()
            if (r12 != 0) goto L_0x00d9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            goto L_0x00c0
        L_0x00d9:
            com.tencent.mm.ui.MMActivity r5 = r0.f279358e
            gy3.C87412m.m108591d(r5)
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.heightPixels
            androidx.appcompat.app.ActionBar r1 = r0.f279357d
            gy3.C87412m.m108591d(r1)
            int r1 = r1.mo91101l()
            r18 = r10
            com.tencent.mm.ui.MMActivity r10 = r0.f279358e
            int r10 = com.tencent.p014mm.p136ui.C85875k4.m106200p(r10)
            int r1 = r1 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r19 = r2
            java.lang.String r2 = "checkItemVisible actionbar height: "
            r10.append(r2)
            androidx.appcompat.app.ActionBar r2 = r0.f279357d
            gy3.C87412m.m108591d(r2)
            int r2 = r2.mo91101l()
            r10.append(r2)
            java.lang.String r2 = ", total height: "
            r10.append(r2)
            r10.append(r1)
            java.lang.String r2 = ", screenHeight: "
            r10.append(r2)
            r10.append(r5)
            java.lang.String r2 = ", top: "
            r10.append(r2)
            int r2 = r12.top
            r10.append(r2)
            java.lang.String r2 = ", bottom: "
            r10.append(r2)
            int r2 = r12.bottom
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            int r2 = r12.bottom
            if (r2 <= r1) goto L_0x0151
            int r10 = r12.top
            int r12 = r2 - r10
            r17 = 2
            int r12 = r12 / 2
            int r1 = r1 + r12
            if (r2 <= r1) goto L_0x0151
            int r5 = r5 - r10
            if (r5 <= r12) goto L_0x0151
            r1 = 1
            goto L_0x0152
        L_0x0151:
            r1 = 0
        L_0x0152:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
        L_0x0155:
            if (r1 == 0) goto L_0x0169
            r8.add(r14)
            r4.add(r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r9.add(r1)
            goto L_0x0169
        L_0x0165:
            r19 = r2
            r18 = r10
        L_0x0169:
            if (r13 == r11) goto L_0x0177
            int r13 = r13 + 1
            r1 = r21
            r10 = r18
            r2 = r19
            goto L_0x0071
        L_0x0175:
            r19 = r2
        L_0x0177:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x018f
            com.tencent.mm.plugin.sns.ui.video.a r1 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            r1.mo133938k()
            bv2.c r1 = bv2.C92313c.m116089a()
            r1.mo126301d()
        L_0x018b:
            r1 = r19
            goto L_0x022d
        L_0x018f:
            int r1 = r4.size()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r6 = 0
            r10 = 2147483647(0x7fffffff, float:NaN)
        L_0x019b:
            if (r5 >= r1) goto L_0x01ce
            java.lang.Object r11 = r4.get(r5)
            java.lang.String r12 = "validItems[i]"
            gy3.C87412m.m108593f(r11, r12)
            bv2.b r11 = (bv2.C92312b) r11
            java.lang.String r12 = "disToPlayLine"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r3)
            android.graphics.Rect r11 = r11.getDisplayRect()
            if (r11 != 0) goto L_0x01bb
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r3)
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x01c7
        L_0x01bb:
            int r11 = r11.top
            int r13 = r0.f279359f
            int r11 = r11 - r13
            int r11 = java.lang.Math.abs(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r3)
        L_0x01c7:
            if (r11 >= r10) goto L_0x01cb
            r6 = r5
            r10 = r11
        L_0x01cb:
            int r5 = r5 + 1
            goto L_0x019b
        L_0x01ce:
            java.lang.Object r1 = r4.get(r6)
            java.lang.String r2 = "validItems[minIndex]"
            gy3.C87412m.m108593f(r1, r2)
            bv2.b r1 = (bv2.C92312b) r1
            java.lang.Object r2 = r8.get(r6)
            java.lang.String r4 = "validHolders[minIndex]"
            gy3.C87412m.m108593f(r2, r4)
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder r2 = (com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder) r2
            java.lang.Object r4 = r9.get(r6)
            java.lang.String r5 = "validPos[minIndex]"
            gy3.C87412m.m108593f(r4, r5)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r1.mo126295e(r2, r4)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r2 = r9.get(r6)
            r4 = 0
            r1[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r5 = 1
            r1[r5] = r2
            java.lang.String r2 = "onListViewScroll play %s, minDis:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r1)
            com.tencent.mm.ui.MMActivity r1 = r0.f279358e
            if (r1 == 0) goto L_0x021c
            boolean r1 = r1.isPaused()
            if (r1 != r5) goto L_0x021c
            r6 = 1
            goto L_0x021d
        L_0x021c:
            r6 = 0
        L_0x021d:
            if (r6 == 0) goto L_0x018b
            java.lang.String r1 = "autoPlayItem.playing is refused by activity has been paused."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r1)
            com.tencent.mm.plugin.sns.ui.video.a r1 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            r1.mo133938k()
            goto L_0x018b
        L_0x022d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            return
        L_0x0231:
            r1 = r2
            java.lang.String r2 = "no support to autoPlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C95761d8.mo133218a(android.widget.ListView):void");
    }
}
