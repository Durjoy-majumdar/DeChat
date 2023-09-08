package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsGalleryUI$$c */
public class SnsGalleryUI$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsGalleryUI f278091d;

    public SnsGalleryUI$$c(SnsGalleryUI snsGalleryUI) {
        this.f278091d = snsGalleryUI;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$1");
        this.f278091d.mo132591T7().mo132171f();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$1");
    }
}
