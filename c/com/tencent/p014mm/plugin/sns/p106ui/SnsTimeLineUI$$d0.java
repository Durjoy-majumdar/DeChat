package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$d0 */
public class SnsTimeLineUI$$d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278737d;

    public SnsTimeLineUI$$d0(SnsTimeLineUI snsTimeLineUI) {
        this.f278737d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$48");
        StringBuilder sb = new StringBuilder();
        sb.append("onResume go to playAnim ");
        SnsTimeLineUI snsTimeLineUI = this.f278737d;
        Boolean bool = SnsTimeLineUI.f278611T1;
        SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z = snsTimeLineUI.f278622D;
        SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        sb.append(z);
        Log.m105924i("MicroMsg.SnsTimeLineUI", sb.toString());
        SnsTimeLineUI snsTimeLineUI2 = this.f278737d;
        SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z2 = snsTimeLineUI2.f278622D;
        SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (z2) {
            SnsTimeLineUI snsTimeLineUI3 = this.f278737d;
            SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            snsTimeLineUI3.f278622D = false;
            SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            SnsTimeLineUI.m122285M7(this.f278737d).mo133009c();
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$48");
    }
}
