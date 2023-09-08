package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.finder.ui.b2 */
public final class C3773b2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderPostAtUI f17246d;

    public C3773b2(FinderPostAtUI finderPostAtUI) {
        this.f17246d = finderPostAtUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f17246d.finish();
        return true;
    }
}
