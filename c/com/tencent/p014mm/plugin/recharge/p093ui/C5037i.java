package com.tencent.p014mm.plugin.recharge.p093ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.recharge.ui.i */
public class C5037i implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ PhoneRechargeUI f20369d;

    public C5037i(PhoneRechargeUI phoneRechargeUI) {
        this.f20369d = phoneRechargeUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f20369d.hideVKB();
        this.f20369d.finish();
        return true;
    }
}
