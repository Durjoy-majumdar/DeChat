package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.sns.ui.u1 */
public class C96232u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NewSightWidget f281203d;

    public C96232u1(NewSightWidget newSightWidget) {
        this.f281203d = newSightWidget;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$9");
        C76912y0.makeText((Context) NewSightWidget.m121576m(this.f281203d), (int) C0966R.string.ilv, 0).show();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.NewSightWidget$9");
    }
}
