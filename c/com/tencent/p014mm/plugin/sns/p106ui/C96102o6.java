package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.o6 */
public class C96102o6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f280682d;

    public C96102o6(SnsTimeLineUI snsTimeLineUI) {
        this.f280682d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$61");
        SnsTimeLineUI.m122305g8(this.f280682d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$61");
    }
}
