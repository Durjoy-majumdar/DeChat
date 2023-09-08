package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsGalleryUI$$f */
public class SnsGalleryUI$$f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsGalleryUI f278094d;

    public SnsGalleryUI$$f(SnsGalleryUI snsGalleryUI) {
        this.f278094d = snsGalleryUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4");
        SnsGalleryUI.m122078c8(this.f278094d);
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4");
        return true;
    }
}
