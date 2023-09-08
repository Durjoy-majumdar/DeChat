package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.z */
public final class C42777z implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactWidgetTabBizInfo f115822d;

    public C42777z(ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f115822d = contactWidgetTabBizInfo;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f115822d.f115605d.onBackPressed();
        return true;
    }
}
