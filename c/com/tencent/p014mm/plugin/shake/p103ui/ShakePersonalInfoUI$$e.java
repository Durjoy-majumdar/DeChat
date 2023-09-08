package com.tencent.p014mm.plugin.shake.p103ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI$$e */
public class ShakePersonalInfoUI$$e implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ShakePersonalInfoUI f21109d;

    public ShakePersonalInfoUI$$e(ShakePersonalInfoUI shakePersonalInfoUI) {
        this.f21109d = shakePersonalInfoUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f21109d.finish();
        return true;
    }
}
