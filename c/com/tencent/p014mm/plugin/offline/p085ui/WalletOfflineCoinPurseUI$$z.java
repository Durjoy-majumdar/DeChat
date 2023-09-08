package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.MenuItem;
import com.tencent.p014mm.autogen.events.FuckOfflinePayResultEvent;
import kd2.C76559f;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$z */
public class WalletOfflineCoinPurseUI$$z implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201995d;

    public WalletOfflineCoinPurseUI$$z(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f201995d = walletOfflineCoinPurseUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        FuckOfflinePayResultEvent fuckOfflinePayResultEvent = new FuckOfflinePayResultEvent();
        fuckOfflinePayResultEvent.f193628d.f193629a = "ok";
        fuckOfflinePayResultEvent.publish();
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201995d;
        if (walletOfflineCoinPurseUI.f201858V0 == 8) {
            C76559f.m92112h(walletOfflineCoinPurseUI.getIntent().getStringExtra("key_appid"));
        }
        this.f201995d.finish();
        return false;
    }
}
