package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$y */
public class SnsTimeLineUI$$y implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f116640d;

    public SnsTimeLineUI$$y(SnsTimeLineUI snsTimeLineUI) {
        this.f116640d = snsTimeLineUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$43");
        SnsTimeLineUI.m122299a8(this.f116640d);
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$43");
        return true;
    }
}
