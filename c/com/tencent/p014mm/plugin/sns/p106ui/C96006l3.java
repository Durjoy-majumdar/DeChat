package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.l3 */
public class C96006l3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsAdNativeLandingTestUI f280333d;

    public C96006l3(SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        this.f280333d = snsAdNativeLandingTestUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$9");
        this.f280333d.f277669e.setIsPlay(true);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$9");
    }
}
