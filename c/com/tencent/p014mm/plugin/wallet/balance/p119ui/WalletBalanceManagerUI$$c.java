package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$c */
public class WalletBalanceManagerUI$$c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceManagerUI f207811d;

    public WalletBalanceManagerUI$$c(WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f207811d = walletBalanceManagerUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        WalletBalanceManagerUI walletBalanceManagerUI = this.f207811d;
        int i = WalletBalanceManagerUI.f207786A;
        if (walletBalanceManagerUI.needConfirmFinish()) {
            this.f207811d.hideVKB();
            this.f207811d.showDialog(1000);
            return true;
        }
        this.f207811d.finish();
        return true;
    }
}
