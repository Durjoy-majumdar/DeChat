package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.t3 */
public final class C40804t3 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineSettingUI f109674d;

    public C40804t3(BizTimeLineSettingUI bizTimeLineSettingUI) {
        this.f109674d = bizTimeLineSettingUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f109674d.finish();
        return true;
    }
}
