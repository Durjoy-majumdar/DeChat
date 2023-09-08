package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsLikesTextView$$d */
public class SnsLikesTextView$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsLikesTextView f278274d;

    public SnsLikesTextView$$d(SnsLikesTextView snsLikesTextView) {
        this.f278274d = snsLikesTextView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$3");
        this.f278274d.mo132827b();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$3");
    }
}
