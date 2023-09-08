package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.n0 */
public class C68652n0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandLauncherUI f197205d;

    public C68652n0(AppBrandLauncherUI appBrandLauncherUI) {
        this.f197205d = appBrandLauncherUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f197205d.finish();
        return true;
    }
}
