package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.FlipView$$j */
public class FlipView$$j implements Runnable {

    /* renamed from: d */
    public float f276830d;

    /* renamed from: e */
    public float f276831e;

    /* renamed from: f */
    public final /* synthetic */ FlipView f276832f;

    public FlipView$$j(FlipView flipView) {
        this.f276832f = flipView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$ClickRunnable");
        this.f276832f.mo132147h(this.f276830d, this.f276831e);
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.FlipView$ClickRunnable");
    }
}
