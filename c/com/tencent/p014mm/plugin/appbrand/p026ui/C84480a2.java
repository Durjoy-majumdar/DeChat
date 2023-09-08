package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.a2 */
public class C84480a2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProfileUI f246584d;

    public C84480a2(AppBrandProfileUI appBrandProfileUI) {
        this.f246584d = appBrandProfileUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f246584d.onBackPressed();
        return true;
    }
}
