package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import p206nj.C76865k;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$m0 */
public class SnsTimeLineUI$$m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278767d;

    public SnsTimeLineUI$$m0(SnsTimeLineUI snsTimeLineUI) {
        this.f278767d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$57");
        C76865k.m92670a(this.f278767d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$57");
    }
}
