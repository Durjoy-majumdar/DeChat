package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.ViewGroup;
import qs2.C101258c;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a */
public abstract class C95045a extends C95295z {
    public C95045a(Context context, C101258c cVar, ViewGroup viewGroup) {
        super(context, cVar, viewGroup);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r7 != 0.0d) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo131533E(android.widget.LinearLayout r14) {
        /*
            r13 = this;
            java.lang.String r0 = "addBorder"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingBorderedComp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            qs2.a0 r2 = r13.f276580e
            qs2.c r2 = (qs2.C101258c) r2
            if (r14 != 0) goto L_0x0011
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0011:
            double r3 = r2.f296553z
            double r5 = r2.f296551A
            int r3 = java.lang.Double.compare(r3, r5)
            double r4 = r2.f296553z
            int r6 = (int) r4
            double r7 = r2.f296551A
            int r9 = (int) r7
            r10 = 1
            if (r3 != 0) goto L_0x0027
            if (r6 != 0) goto L_0x0037
            r6 = 1
        L_0x0025:
            r9 = 1
            goto L_0x0037
        L_0x0027:
            r11 = 0
            if (r6 != 0) goto L_0x0030
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0030
            r6 = 1
        L_0x0030:
            if (r9 != 0) goto L_0x0037
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0037
            goto L_0x0025
        L_0x0037:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r5 = 0
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r3[r10] = r4
            java.lang.String r4 = "AdLandingBorderedComp"
            java.lang.String r7 = "border width top %d,bottom %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r3)
            r3 = -1
            if (r6 <= 0) goto L_0x006b
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r7 = r14.getContext()
            r4.<init>(r7)
            int r7 = r2.f296552B
            r4.setBackgroundColor(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r3, r6)
            r6 = 48
            r7.gravity = r6
            r14.addView(r4, r5, r7)
        L_0x006b:
            if (r9 <= 0) goto L_0x0087
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r5 = r14.getContext()
            r4.<init>(r5)
            int r2 = r2.f296552B
            r4.setBackgroundColor(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r3, r9)
            r3 = 80
            r2.gravity = r3
            r14.addView(r4, r2)
        L_0x0087:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95045a.mo131533E(android.widget.LinearLayout):void");
    }
}
