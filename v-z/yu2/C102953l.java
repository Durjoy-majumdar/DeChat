package yu2;

import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerPreviewUI;

/* renamed from: yu2.l */
public final class C102953l implements MMViewPager.C19691i {

    /* renamed from: a */
    public final /* synthetic */ SnsAlbumPickerPreviewUI f303845a;

    public C102953l(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
        this.f303845a = snsAlbumPickerPreviewUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006d, code lost:
        if ((r13 != null && r13.getVisibility() == 8) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionBarLayoutVisibility", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00be, code lost:
        if ((r13 != null && r13.getVisibility() == 0) == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
        if (r6 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d2, code lost:
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("setFooterVisibility", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
        if ((r13 != null && r13.getVisibility() == 0) == false) goto L_0x005c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26046a() {
        /*
            r15 = this;
            java.lang.String r0 = "singleClickOver"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initFlipView$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI r2 = r15.f303845a
            int r3 = com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerPreviewUI.f280747R0
            java.lang.String r3 = "access$getMIsHideTopBottom$p"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r5 = r2.f280761x0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r6 = 1
            r5 = r5 ^ r6
            java.lang.String r7 = "access$setMIsHideTopBottom$p"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
            r2.f280761x0 = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI r2 = r15.f303845a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r5 = r2.f280761x0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.String r3 = "access$setTitleFooterInVisible"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r7 = "setTitleFooterInVisible"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
            r5 = r5 ^ r6
            java.lang.String r8 = "setActionBarLayoutVisibility"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r4)
            r9 = 2130772057(0x7f010059, float:1.7147222E38)
            r10 = 2130772058(0x7f01005a, float:1.7147224E38)
            r11 = 8
            r12 = 0
            if (r5 == 0) goto L_0x005c
            android.widget.RelativeLayout r13 = r2.mo133685e8()
            if (r13 == 0) goto L_0x0059
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L_0x0059
            r13 = 1
            goto L_0x005a
        L_0x0059:
            r13 = 0
        L_0x005a:
            if (r13 != 0) goto L_0x006f
        L_0x005c:
            if (r5 != 0) goto L_0x0073
            android.widget.RelativeLayout r13 = r2.mo133685e8()
            if (r13 == 0) goto L_0x006c
            int r13 = r13.getVisibility()
            if (r13 != r11) goto L_0x006c
            r13 = 1
            goto L_0x006d
        L_0x006c:
            r13 = 0
        L_0x006d:
            if (r13 == 0) goto L_0x0073
        L_0x006f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r4)
            goto L_0x00a7
        L_0x0073:
            if (r5 == 0) goto L_0x008d
            android.widget.RelativeLayout r13 = r2.mo133685e8()
            if (r13 != 0) goto L_0x007c
            goto L_0x007f
        L_0x007c:
            r13.setVisibility(r12)
        L_0x007f:
            android.view.animation.Animation r13 = android.view.animation.AnimationUtils.loadAnimation(r2, r9)
            android.widget.RelativeLayout r14 = r2.mo133685e8()
            if (r14 == 0) goto L_0x00a4
            r14.startAnimation(r13)
            goto L_0x00a4
        L_0x008d:
            android.widget.RelativeLayout r13 = r2.mo133685e8()
            if (r13 != 0) goto L_0x0094
            goto L_0x0097
        L_0x0094:
            r13.setVisibility(r11)
        L_0x0097:
            android.view.animation.Animation r13 = android.view.animation.AnimationUtils.loadAnimation(r2, r10)
            android.widget.RelativeLayout r14 = r2.mo133685e8()
            if (r14 == 0) goto L_0x00a4
            r14.startAnimation(r13)
        L_0x00a4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r4)
        L_0x00a7:
            java.lang.String r8 = "setFooterVisibility"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r4)
            if (r5 == 0) goto L_0x00c0
            android.widget.RelativeLayout r13 = r2.mo133686f8()
            if (r13 == 0) goto L_0x00bd
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L_0x00bd
            r13 = 1
            goto L_0x00be
        L_0x00bd:
            r13 = 0
        L_0x00be:
            if (r13 != 0) goto L_0x00d2
        L_0x00c0:
            if (r5 != 0) goto L_0x00d6
            android.widget.RelativeLayout r13 = r2.mo133686f8()
            if (r13 == 0) goto L_0x00cf
            int r13 = r13.getVisibility()
            if (r13 != r11) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r6 = 0
        L_0x00d0:
            if (r6 == 0) goto L_0x00d6
        L_0x00d2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r4)
            goto L_0x010a
        L_0x00d6:
            if (r5 == 0) goto L_0x00f0
            android.widget.RelativeLayout r5 = r2.mo133686f8()
            if (r5 != 0) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            r5.setVisibility(r12)
        L_0x00e2:
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r2, r9)
            android.widget.RelativeLayout r2 = r2.mo133686f8()
            if (r2 == 0) goto L_0x0107
            r2.startAnimation(r5)
            goto L_0x0107
        L_0x00f0:
            android.widget.RelativeLayout r5 = r2.mo133686f8()
            if (r5 != 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            r5.setVisibility(r11)
        L_0x00fa:
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r2, r10)
            android.widget.RelativeLayout r2 = r2.mo133686f8()
            if (r2 == 0) goto L_0x0107
            r2.startAnimation(r5)
        L_0x0107:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r4)
        L_0x010a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yu2.C102953l.mo26046a():void");
    }

    /* renamed from: b */
    public void mo26047b() {
        SnsMethodCalculate.markStartTimeMs("exitDirectly", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initFlipView$2");
        SnsMethodCalculate.markEndTimeMs("exitDirectly", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initFlipView$2");
    }
}
