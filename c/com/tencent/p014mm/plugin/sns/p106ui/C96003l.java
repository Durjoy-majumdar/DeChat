package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.l */
public class C96003l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AsyncMaskImageView f280330d;

    public C96003l(AsyncMaskImageView asyncMaskImageView) {
        this.f280330d = asyncMaskImageView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$1");
        this.f280330d.setPressed(false);
        this.f280330d.invalidate();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$1");
    }
}
