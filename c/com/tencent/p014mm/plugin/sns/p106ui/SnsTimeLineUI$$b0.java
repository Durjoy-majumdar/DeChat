package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$b0 */
public class SnsTimeLineUI$$b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f116638d;

    public SnsTimeLineUI$$b0(SnsTimeLineUI snsTimeLineUI) {
        this.f116638d = snsTimeLineUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$46");
        Log.m105924i("MicroMsg.SnsTimeLineUI", "needDoLongClickDialog");
        SnsTimeLineUI.m122300b8(this.f116638d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$46");
    }
}
