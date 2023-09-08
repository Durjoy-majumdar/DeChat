package bt2;

import androidx.lifecycle.C0120a0;

/* renamed from: bt2.e */
public final class C92306e<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C92307f f264137d;

    public C92306e(C92307f fVar) {
        this.f264137d = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018b, code lost:
        r11 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = "onChanged"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = r21
            bt2.f$a r3 = (bt2.C92307f.C92308a) r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            if (r3 != 0) goto L_0x0018
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            goto L_0x020a
        L_0x0018:
            bt2.f r4 = r0.f264137d
            java.lang.String r5 = "access$getCurrentPickData$p"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            bt2.f$a r4 = r4.f264142e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            java.lang.String r8 = "getParentNode"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$PickerData"
            if (r4 == 0) goto L_0x0035
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            at2.c r4 = r4.f264143a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            at2.c r10 = r3.f264143a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            boolean r4 = gy3.C87412m.m108589b(r4, r10)
            java.lang.String r8 = "getRefreshForceToIndex"
            if (r4 == 0) goto L_0x0055
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            int r4 = r3.f264145c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            if (r4 >= 0) goto L_0x0055
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            goto L_0x020a
        L_0x0055:
            bt2.f r4 = r0.f264137d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            bt2.f$a r10 = r4.f264142e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            java.lang.String r5 = "findNewIndex"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            if (r10 == 0) goto L_0x01a8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            int r12 = r3.f264145c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            if (r12 >= 0) goto L_0x01a8
            com.tencent.mm.picker.base.view.WheelView r8 = r4.f264140c
            int r8 = r8.getCurrentItem()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.String r12 = "getRefreshBehavior"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r9)
            int r13 = r3.f264146d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r9)
            r14 = 2
            if (r13 != r14) goto L_0x008b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            goto L_0x01b2
        L_0x008b:
            java.util.List r13 = r3.mo126291a()
            java.util.List r14 = r10.mo126291a()
            int r15 = r14.size()
            if (r15 <= r8) goto L_0x009b
            r15 = 1
            goto L_0x009c
        L_0x009b:
            r15 = 0
        L_0x009c:
            if (r15 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r14 = 0
        L_0x00a0:
            if (r14 == 0) goto L_0x00a9
            java.lang.Object r14 = r14.get(r8)
            at2.c r14 = (at2.C92091c) r14
            goto L_0x00aa
        L_0x00a9:
            r14 = 0
        L_0x00aa:
            if (r14 != 0) goto L_0x00b1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            goto L_0x01b2
        L_0x00b1:
            java.util.Iterator r15 = r13.iterator()
            r16 = 0
        L_0x00b7:
            boolean r17 = r15.hasNext()
            r18 = -1
            if (r17 == 0) goto L_0x00d7
            java.lang.Object r17 = r15.next()
            at2.c r17 = (at2.C92091c) r17
            java.lang.String r11 = r17.mo126081b()
            java.lang.String r7 = r14.mo126081b()
            boolean r7 = gy3.C87412m.m108589b(r11, r7)
            if (r7 == 0) goto L_0x00d4
            goto L_0x00d9
        L_0x00d4:
            int r16 = r16 + 1
            goto L_0x00b7
        L_0x00d7:
            r16 = -1
        L_0x00d9:
            if (r16 < 0) goto L_0x00e2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            r11 = r16
            goto L_0x01b5
        L_0x00e2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r9)
            int r7 = r3.f264146d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r9)
            r9 = 1
            if (r7 != r9) goto L_0x00f0
            r11 = 0
            goto L_0x018f
        L_0x00f0:
            java.util.List r7 = r10.mo126291a()
            com.tencent.mm.picker.base.view.WheelView r4 = r4.f264140c
            java.lang.String r9 = "isCyclic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r6)
            java.lang.String r10 = "<this>"
            gy3.C87412m.m108594g(r4, r10)
            boolean r4 = r4.f49160z
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r6)
            java.lang.String r10 = "findNearedIndex"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r6)
            r9 = r8
            r11 = 0
            r12 = 0
        L_0x010e:
            int r14 = r7.size()
            if (r8 >= r14) goto L_0x0143
            java.util.Iterator r11 = r13.iterator()
            r14 = 0
        L_0x0119:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0142
            java.lang.Object r15 = r11.next()
            at2.c r15 = (at2.C92091c) r15
            java.lang.String r15 = r15.mo126081b()
            java.lang.Object r16 = r7.get(r8)
            at2.c r16 = (at2.C92091c) r16
            r19 = r11
            java.lang.String r11 = r16.mo126081b()
            boolean r11 = gy3.C87412m.m108589b(r15, r11)
            if (r11 == 0) goto L_0x013d
            r11 = r14
            goto L_0x0143
        L_0x013d:
            int r14 = r14 + 1
            r11 = r19
            goto L_0x0119
        L_0x0142:
            r11 = -1
        L_0x0143:
            if (r11 < 0) goto L_0x0146
            goto L_0x018c
        L_0x0146:
            if (r9 < 0) goto L_0x0177
            java.util.Iterator r11 = r13.iterator()
            r14 = 0
        L_0x014d:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0176
            java.lang.Object r15 = r11.next()
            at2.c r15 = (at2.C92091c) r15
            java.lang.String r15 = r15.mo126081b()
            java.lang.Object r16 = r7.get(r9)
            at2.c r16 = (at2.C92091c) r16
            r19 = r11
            java.lang.String r11 = r16.mo126081b()
            boolean r11 = gy3.C87412m.m108589b(r15, r11)
            if (r11 == 0) goto L_0x0171
            r11 = r14
            goto L_0x0177
        L_0x0171:
            int r14 = r14 + 1
            r11 = r19
            goto L_0x014d
        L_0x0176:
            r11 = -1
        L_0x0177:
            if (r11 < 0) goto L_0x017a
            goto L_0x018c
        L_0x017a:
            r14 = 1
            int r12 = r12 + r14
            int r15 = r7.size()
            if (r8 < r15) goto L_0x0185
            if (r9 >= 0) goto L_0x0185
            goto L_0x018b
        L_0x0185:
            int r15 = r7.size()
            if (r12 < r15) goto L_0x0193
        L_0x018b:
            r11 = 0
        L_0x018c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r6)
        L_0x018f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            goto L_0x01b5
        L_0x0193:
            int r8 = r8 + 1
            int r9 = r9 + -1
            if (r4 == 0) goto L_0x010e
            if (r9 >= 0) goto L_0x01a1
            int r9 = r7.size()
            int r9 = r9 + -1
        L_0x01a1:
            int r15 = r7.size()
            int r8 = r8 % r15
            goto L_0x010e
        L_0x01a8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            int r4 = r3.f264145c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            if (r4 >= 0) goto L_0x01b4
        L_0x01b2:
            r11 = 0
            goto L_0x01b5
        L_0x01b4:
            r11 = r4
        L_0x01b5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            bt2.f r4 = r0.f264137d
            java.lang.String r5 = "access$setAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r4.getClass()
            java.lang.String r7 = "setAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            com.tencent.mm.picker.base.view.WheelView r8 = r4.f264140c
            bt2.g r9 = new bt2.g
            r9.<init>(r3)
            r8.setAdapter(r9)
            com.tencent.mm.picker.base.view.WheelView r4 = r4.f264140c
            r4.requestLayout()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            bt2.f r4 = r0.f264137d
            com.tencent.mm.picker.base.view.WheelView r4 = r4.mo126290c()
            r4.setCurrentItem(r11)
            bt2.f r4 = r0.f264137d
            java.lang.String r5 = "access$setCurrentPickData$p"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r4.f264142e = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            bt2.f r3 = r0.f264137d
            java.lang.String r4 = "access$get_selectedItem$p"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            androidx.lifecycle.z<at2.c> r3 = r3.f264141d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            bt2.f r4 = r0.f264137d
            at2.c r4 = bt2.C92307f.m116081a(r4, r11)
            r3.setValue(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
        L_0x020a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bt2.C92306e.onChanged(java.lang.Object):void");
    }
}
