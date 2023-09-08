package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.q0 */
public class C41364q0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111360d;

    public C41364q0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111360d = exdeviceProfileUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f111360d.finish();
        return false;
    }
}
