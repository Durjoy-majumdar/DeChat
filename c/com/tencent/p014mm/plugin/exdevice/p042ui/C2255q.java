package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.q */
public class C2255q implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceLikeUI f12338d;

    public C2255q(ExdeviceLikeUI exdeviceLikeUI) {
        this.f12338d = exdeviceLikeUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f12338d.finish();
        return false;
    }
}
