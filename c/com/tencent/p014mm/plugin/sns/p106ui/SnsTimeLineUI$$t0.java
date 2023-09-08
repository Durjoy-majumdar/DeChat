package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$t0 */
public class SnsTimeLineUI$$t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278783d;

    public SnsTimeLineUI$$t0(SnsTimeLineUI snsTimeLineUI) {
        this.f278783d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$73");
        if (SnsTimeLineUI.m122282J7(this.f278783d) != null) {
            SnsTimeLineUI.m122282J7(this.f278783d).mo133186F0("");
        }
        SnsTimeLineUI snsTimeLineUI = this.f278783d;
        SnsMethodCalculate.markStartTimeMs("access$6802", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.f278655S1 = false;
        SnsMethodCalculate.markEndTimeMs("access$6802", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$73");
    }
}
