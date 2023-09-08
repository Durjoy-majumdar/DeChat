package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$d */
public class MobileRemitNumberInputUI$$d implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MobileRemitNumberInputUI f203897d;

    public MobileRemitNumberInputUI$$d(MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        this.f203897d = mobileRemitNumberInputUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        MobileRemitNumberInputUI mobileRemitNumberInputUI = this.f203897d;
        int i = MobileRemitNumberInputUI.f203879v;
        mobileRemitNumberInputUI.getClass();
        this.f203897d.hideVKB();
        this.f203897d.finish();
        return true;
    }
}
