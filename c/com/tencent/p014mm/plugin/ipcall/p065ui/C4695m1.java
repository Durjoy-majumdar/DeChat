package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.m1 */
public class C4695m1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19685d;

    public C4695m1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19685d = iPCallShareCouponUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f19685d.finish();
        return true;
    }
}
