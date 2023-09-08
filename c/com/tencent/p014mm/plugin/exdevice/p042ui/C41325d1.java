package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.d1 */
public class C41325d1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceRankInfoUI f111300d;

    public C41325d1(ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f111300d = exdeviceRankInfoUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f111300d.finish();
        return false;
    }
}
