package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$n */
public class SnsTimeLineUI$$n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278768d;

    public SnsTimeLineUI$$n(SnsTimeLineUI snsTimeLineUI) {
        this.f278768d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$32");
        this.f278768d.setMMNormalView();
        SnsTimeLineUI snsTimeLineUI = this.f278768d;
        Boolean bool = SnsTimeLineUI.f278611T1;
        SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.mo132958v8();
        SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsTimeLineUI snsTimeLineUI2 = this.f278768d;
        SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI2.mo132952n8();
        SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsTimeLineUI snsTimeLineUI3 = this.f278768d;
        snsTimeLineUI3.setMMTitle(snsTimeLineUI3.getString(C0966R.string.jj4));
        SnsTimeLineUI snsTimeLineUI4 = this.f278768d;
        SnsMethodCalculate.markStartTimeMs("access$2702", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI4.f278617A1 = 0;
        SnsMethodCalculate.markEndTimeMs("access$2702", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsTimeLineUI snsTimeLineUI5 = this.f278768d;
        int firstVisiblePosition = SnsTimeLineUI.m122302d8(snsTimeLineUI5).f278851d.getFirstVisiblePosition();
        SnsMethodCalculate.markStartTimeMs("access$2802", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI5.f278621C1 = firstVisiblePosition;
        SnsMethodCalculate.markEndTimeMs("access$2802", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$32");
    }
}
