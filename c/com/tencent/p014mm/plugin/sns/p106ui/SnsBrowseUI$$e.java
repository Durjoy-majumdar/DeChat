package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsBrowseUI$$e */
public class SnsBrowseUI$$e implements MMViewPager.C19689f {

    /* renamed from: a */
    public final /* synthetic */ MMViewPager f277821a;

    /* renamed from: b */
    public final /* synthetic */ SnsBrowseUI f277822b;

    public SnsBrowseUI$$e(SnsBrowseUI snsBrowseUI, MMViewPager mMViewPager) {
        this.f277822b = snsBrowseUI;
        this.f277821a = mMViewPager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r2 == 0) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26037a(float r8, float r9) {
        /*
            r7 = this;
            java.lang.String r0 = "onGalleryScale"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$6"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI r2 = r7.f277822b
            int r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsBrowseUI.m121946c8(r2)
            java.lang.String r3 = "access$100"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsBrowseUI"
            if (r2 == 0) goto L_0x0020
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI r2 = r7.f277822b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            int r2 = r2.f277811p0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            if (r2 != 0) goto L_0x0046
        L_0x0020:
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI r2 = r7.f277822b
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r5 = r2.f277761o
            if (r5 == 0) goto L_0x0046
            int r5 = r5.getHeight()
            java.lang.String r6 = "access$202"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            r2.f277812x0 = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI r2 = r7.f277822b
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r5 = r2.f277761o
            int r5 = r5.getWidth()
            java.lang.String r6 = "access$102"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            r2.f277811p0 = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
        L_0x0046:
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI r2 = r7.f277822b
            int r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsBrowseUI.m121946c8(r2)
            if (r2 == 0) goto L_0x00aa
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI r2 = r7.f277822b
            int r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsBrowseUI.m121946c8(r2)
            float r2 = (float) r2
            float r2 = r9 / r2
            r5 = 1065353216(0x3f800000, float:1.0)
            float r2 = r5 - r2
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r5 = r2
        L_0x0061:
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI r2 = r7.f277822b
            java.lang.String r6 = "access$1102"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            r2.f277807c1 = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            com.tencent.mm.ui.base.MMViewPager r2 = r7.f277821a
            android.view.View r2 = r2.getSelectedView()
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI r6 = r7.f277822b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            int r6 = r6.f277811p0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            int r6 = r6 / 2
            float r3 = (float) r6
            r2.setPivotX(r3)
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI r3 = r7.f277822b
            int r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsBrowseUI.m121946c8(r3)
            int r3 = r3 / 2
            float r3 = (float) r3
            r2.setPivotY(r3)
            r2.setScaleX(r5)
            r2.setScaleY(r5)
            r2.setTranslationX(r8)
            r2.setTranslationY(r9)
            com.tencent.mm.plugin.sns.ui.SnsBrowseUI r8 = r7.f277822b
            java.lang.String r9 = "access$500"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
            android.widget.ImageView r8 = r8.f277813y0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            r8.setAlpha(r5)
        L_0x00aa:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsBrowseUI$$e.mo26037a(float, float):void");
    }

    /* renamed from: b */
    public void mo26038b(float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onSetPreParam", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$6");
        SnsBrowseUI snsBrowseUI = this.f277822b;
        int i = SnsBrowseUI.f277783g1;
        SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI.f277808d1 = (int) f;
        SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsBrowseUI snsBrowseUI2 = this.f277822b;
        SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI2.f277809e1 = (int) f2;
        SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsMethodCalculate.markEndTimeMs("onSetPreParam", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$6");
    }
}
