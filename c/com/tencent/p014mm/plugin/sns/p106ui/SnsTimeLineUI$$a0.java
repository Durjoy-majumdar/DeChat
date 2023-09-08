package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a0 */
public class SnsTimeLineUI$$a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f116636d;

    public SnsTimeLineUI$$a0(SnsTimeLineUI snsTimeLineUI) {
        this.f116636d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$45");
        Log.m105924i("MicroMsg.SnsTimeLineUI", "selectImageOrVideo");
        SnsTimeLineUI.m122299a8(this.f116636d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$45");
    }
}
