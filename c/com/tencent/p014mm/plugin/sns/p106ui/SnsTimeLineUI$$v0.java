package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$v0 */
public class SnsTimeLineUI$$v0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f82118d;

    public SnsTimeLineUI$$v0(SnsTimeLineUI snsTimeLineUI) {
        this.f82118d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$76");
        this.f82118d.hideVKB();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$76");
    }
}
