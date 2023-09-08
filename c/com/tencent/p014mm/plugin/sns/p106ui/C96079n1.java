package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.n1 */
public class C96079n1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MaskLinearLayout f280564d;

    public C96079n1(MaskLinearLayout maskLinearLayout) {
        this.f280564d = maskLinearLayout;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$1");
        this.f280564d.setPressed(false);
        MaskLinearLayout.m121556a(this.f280564d);
        this.f280564d.invalidate();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$1");
    }
}
