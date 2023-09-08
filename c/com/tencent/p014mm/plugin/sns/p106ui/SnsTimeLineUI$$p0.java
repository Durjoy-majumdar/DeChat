package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$p0 */
public class SnsTimeLineUI$$p0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f82116d;

    public SnsTimeLineUI$$p0(SnsTimeLineUI snsTimeLineUI) {
        this.f82116d = snsTimeLineUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$62");
        this.f82116d.hideVKB();
        this.f82116d.finish();
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$62");
        return false;
    }
}
