package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.p */
public class C96107p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BaseTimeLine f280698d;

    public C96107p(BaseTimeLine baseTimeLine) {
        this.f280698d = baseTimeLine;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$7");
        this.f280698d.f276708r.setToSendTextColor(true);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$7");
    }
}
