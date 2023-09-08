package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.f5 */
public class C95781f5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f279441d;

    public C95781f5(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f279441d = snsOnlineVideoActivity;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$13");
        this.f279441d.finish();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$13");
    }
}
