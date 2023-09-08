package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$q0 */
public class SnsTimeLineUI$$q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278778d;

    public SnsTimeLineUI$$q0(SnsTimeLineUI snsTimeLineUI) {
        this.f278778d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$63");
        SnsTimeLineUI.m122305g8(this.f278778d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$63");
    }
}
