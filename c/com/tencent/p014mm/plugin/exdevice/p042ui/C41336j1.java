package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.j1 */
public class C41336j1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceSettingUI f111310d;

    public C41336j1(ExdeviceSettingUI exdeviceSettingUI) {
        this.f111310d = exdeviceSettingUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f111310d.finish();
        return false;
    }
}
