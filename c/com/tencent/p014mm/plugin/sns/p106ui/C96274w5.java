package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.w5 */
public class C96274w5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsSightPlayerUI f281340d;

    public C96274w5(SnsSightPlayerUI snsSightPlayerUI) {
        this.f281340d = snsSightPlayerUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$10");
        this.f281340d.finish();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$10");
    }
}
