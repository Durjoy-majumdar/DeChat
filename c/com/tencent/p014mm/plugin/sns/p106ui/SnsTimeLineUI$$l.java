package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$l */
public class SnsTimeLineUI$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278763d;

    public SnsTimeLineUI$$l(SnsTimeLineUI snsTimeLineUI) {
        this.f278763d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$30");
        if (SnsTimeLineUI.m122282J7(this.f278763d) == null) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$30");
            return;
        }
        SnsTimeLineUI snsTimeLineUI = this.f278763d;
        SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z = snsTimeLineUI.f278619B1;
        SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (z) {
            C94866e1.Fx0().mo131082B();
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$30");
    }
}
