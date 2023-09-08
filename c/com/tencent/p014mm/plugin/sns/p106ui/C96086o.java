package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.o */
public class C96086o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseTimeLine f280623d;

    public C96086o(BaseTimeLine baseTimeLine) {
        this.f280623d = baseTimeLine;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$10");
        this.f280623d.f276708r.clearFocus();
        this.f280623d.f276708r.requestFocus();
        this.f280623d.f276708r.setToSendTextColor(true);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$10");
    }
}
