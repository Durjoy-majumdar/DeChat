package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.e5 */
public class C95768e5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f279392d;

    public C95768e5(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f279392d = snsOnlineVideoActivity;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$12");
        this.f279392d.finish();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$12");
    }
}
