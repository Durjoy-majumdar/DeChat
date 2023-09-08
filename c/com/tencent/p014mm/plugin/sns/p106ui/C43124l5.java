package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.l5 */
public class C43124l5 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f116692d;

    public C43124l5(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f116692d = snsOnlineVideoActivity;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$6");
        this.f116692d.mo132875W7();
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$6");
        return true;
    }
}
