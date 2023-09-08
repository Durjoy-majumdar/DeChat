package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsGalleryUI$$e */
public class SnsGalleryUI$$e implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsGalleryUI f278093d;

    public SnsGalleryUI$$e(SnsGalleryUI snsGalleryUI) {
        this.f278093d = snsGalleryUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$3");
        this.f278093d.mo132591T7().mo132171f();
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$3");
        return true;
    }
}
