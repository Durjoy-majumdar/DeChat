package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$k0 */
public class SnsTimeLineUI$$k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278762d;

    public SnsTimeLineUI$$k0(SnsTimeLineUI snsTimeLineUI) {
        this.f278762d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$55");
        if (SnsTimeLineUI.m122284L7(this.f278762d) == null) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$55");
            return;
        }
        SnsTimeLineUI.m122284L7(this.f278762d).f276710t.f280733d = SnsTimeLineUI.m122302d8(this.f278762d).f278851d.getBottom();
        SnsTimeLineUI.m122284L7(this.f278762d).f276710t.f280734e = SnsTimeLineUI.m122302d8(this.f278762d).f278852e.getTop();
        SnsTimeLineUI.m122285M7(this.f278762d).f278803r = C74942w4.m89784a(this.f278762d.getContext(), -44);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$55");
    }
}
