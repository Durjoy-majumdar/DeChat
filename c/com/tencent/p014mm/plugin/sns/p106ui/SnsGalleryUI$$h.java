package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsGalleryUI$$h */
public class SnsGalleryUI$$h implements MMViewPager.C19705g {

    /* renamed from: a */
    public final /* synthetic */ SnsGalleryUI f278096a;

    public SnsGalleryUI$$h(SnsGalleryUI snsGalleryUI) {
        this.f278096a = snsGalleryUI;
    }

    /* renamed from: a */
    public void mo26055a() {
        SnsMethodCalculate.markStartTimeMs("longClickOver", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$7");
        SnsGalleryUI.m122078c8(this.f278096a);
        SnsMethodCalculate.markEndTimeMs("longClickOver", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$7");
    }
}
