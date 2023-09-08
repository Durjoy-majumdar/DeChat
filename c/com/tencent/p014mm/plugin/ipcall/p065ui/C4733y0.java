package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.y0 */
public class C4733y0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponCardUI f19747d;

    public C4733y0(IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f19747d = iPCallShareCouponCardUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f19747d.finish();
        return true;
    }
}
