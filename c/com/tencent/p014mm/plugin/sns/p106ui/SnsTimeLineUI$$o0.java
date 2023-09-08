package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$o0 */
public class SnsTimeLineUI$$o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278772d;

    public SnsTimeLineUI$$o0(SnsTimeLineUI snsTimeLineUI) {
        this.f278772d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$60");
        this.f278772d.mo132950a1();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$60");
    }
}
