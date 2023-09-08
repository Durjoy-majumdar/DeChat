package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.e8 */
public class C95771e8 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsWsFoldDetailUI f279396d;

    public C95771e8(SnsWsFoldDetailUI snsWsFoldDetailUI) {
        this.f279396d = snsWsFoldDetailUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$1");
        this.f279396d.hideVKB();
        this.f279396d.finish();
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$1");
        return false;
    }
}
