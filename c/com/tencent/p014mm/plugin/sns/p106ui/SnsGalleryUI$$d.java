package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsGalleryUI$$d */
public class SnsGalleryUI$$d implements MMViewPager.C19705g {

    /* renamed from: a */
    public final /* synthetic */ SnsGalleryUI f278092a;

    public SnsGalleryUI$$d(SnsGalleryUI snsGalleryUI) {
        this.f278092a = snsGalleryUI;
    }

    /* renamed from: a */
    public void mo26055a() {
        SnsMethodCalculate.markStartTimeMs("longClickOver", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$2");
        SnsGalleryUI.m122078c8(this.f278092a);
        SnsMethodCalculate.markEndTimeMs("longClickOver", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$2");
    }
}
