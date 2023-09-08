package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.y3 */
public class C40562y3 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandVoIPDeviceListAuthorizeUI f108958d;

    public C40562y3(AppBrandVoIPDeviceListAuthorizeUI appBrandVoIPDeviceListAuthorizeUI) {
        this.f108958d = appBrandVoIPDeviceListAuthorizeUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f108958d.finish();
        return false;
    }
}
