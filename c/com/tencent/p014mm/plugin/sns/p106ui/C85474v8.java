package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.v8 */
public class C85474v8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ VideoFullScreenActivity f249099d;

    public C85474v8(VideoFullScreenActivity videoFullScreenActivity) {
        this.f249099d = videoFullScreenActivity;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity$1");
        this.f249099d.setRequestedOrientation(4);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity$1");
    }
}
