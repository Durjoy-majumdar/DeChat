package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.i4 */
public class C18204i4 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI f50308d;

    public C18204i4(BizTimeLineUI bizTimeLineUI) {
        this.f50308d = bizTimeLineUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f50308d.finish();
        return true;
    }
}
