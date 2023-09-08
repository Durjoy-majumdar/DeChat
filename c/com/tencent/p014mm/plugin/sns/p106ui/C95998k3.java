package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.k3 */
public class C95998k3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsAdNativeLandingTestUI f280326d;

    public C95998k3(SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        this.f280326d = snsAdNativeLandingTestUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$10");
        this.f280326d.f277669e.setIsPlay(false);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$10");
    }
}
