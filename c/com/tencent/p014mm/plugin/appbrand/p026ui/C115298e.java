package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.e */
public class C115298e implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeDetailUI f345507d;

    public C115298e(AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI) {
        this.f345507d = appBrandAuthorizeDetailUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        AppBrandAuthorizeDetailUI appBrandAuthorizeDetailUI = this.f345507d;
        int[] iArr = AppBrandAuthorizeDetailUI.f345375r;
        appBrandAuthorizeDetailUI.mo175026I7();
        this.f345507d.finish();
        return false;
    }
}
