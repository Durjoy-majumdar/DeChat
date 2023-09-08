package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage.LuggagePrivacyManageUI;
import vn3.C118694m;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI$$a */
public final /* synthetic */ class AppBrandLauncherUI$$a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandLauncherUI f246392d;

    public /* synthetic */ AppBrandLauncherUI$$a(AppBrandLauncherUI appBrandLauncherUI) {
        this.f246392d = appBrandLauncherUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        AppBrandLauncherUI appBrandLauncherUI = this.f246392d;
        int i = AppBrandLauncherUI.f246382i;
        appBrandLauncherUI.getClass();
        int i2 = LuggagePrivacyManageUI.f246786d;
        C118694m.m167386d(appBrandLauncherUI, new Intent(appBrandLauncherUI, LuggagePrivacyManageUI.class), (Bundle) null);
        return true;
    }
}
