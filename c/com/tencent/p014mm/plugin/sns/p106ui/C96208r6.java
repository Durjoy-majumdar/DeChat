package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.sns.ui.r6 */
public class C96208r6 implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ SnsTimeLineUI f281143a;

    public C96208r6(SnsTimeLineUI snsTimeLineUI) {
        this.f281143a = snsTimeLineUI;
    }

    public void onDismiss() {
        SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$68");
        SnsTimeLineUI.m122306i8(this.f281143a).mo132961a(10);
        SnsTimeLineUI snsTimeLineUI = this.f281143a;
        SnsTimeLineUI.m122307j8(snsTimeLineUI, SnsTimeLineUI.m122306i8(snsTimeLineUI));
        if (SnsTimeLineUI.m122308k8(this.f281143a) != 0) {
            SnsReportHelper.f275506m0.mo131354O(1, this.f281143a.getString(C0966R.string.c38), 10, SnsTimeLineUI.m122309l8(this.f281143a), SnsTimeLineUI.m122308k8(this.f281143a), SnsTimeLineUI.m122310m8());
            SnsTimeLineUI snsTimeLineUI2 = this.f281143a;
            SnsMethodCalculate.markStartTimeMs("access$5802", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            snsTimeLineUI2.f278652R1 = 0;
            SnsMethodCalculate.markEndTimeMs("access$5802", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        }
        SnsTimeLineUI snsTimeLineUI3 = this.f281143a;
        SnsMethodCalculate.markStartTimeMs("access$6100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI3.mo132945A8(0);
        SnsMethodCalculate.markEndTimeMs("access$6100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$68");
    }
}
