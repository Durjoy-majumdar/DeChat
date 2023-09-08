package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget$$l */
public class NewSightWidget$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewSightWidget f277100d;

    public NewSightWidget$$l(NewSightWidget newSightWidget) {
        this.f277100d = newSightWidget;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$6");
        NewSightWidget.m121575l(this.f277100d);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$6");
    }
}
