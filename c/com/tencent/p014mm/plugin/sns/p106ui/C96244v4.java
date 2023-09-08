package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.v4 */
public class C96244v4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsInfoFlip f281231d;

    public C96244v4(SnsInfoFlip snsInfoFlip) {
        this.f281231d = snsInfoFlip;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$1");
        SnsInfoFlip snsInfoFlip = this.f281231d;
        if (snsInfoFlip.f276794h != null) {
            int i = SnsInfoFlip.f278141p1;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            boolean z = snsInfoFlip.f278148U0;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (z) {
                this.f281231d.f276794h.mo132180v4();
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$1");
    }
}
