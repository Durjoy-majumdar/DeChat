package com.tencent.p014mm.plugin.wallet.balance.p119ui;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$g */
public class WalletBalanceSaveUI$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceSaveUI f207862d;

    public WalletBalanceSaveUI$$g(WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f207862d = walletBalanceSaveUI;
    }

    public void run() {
        WalletBalanceSaveUI walletBalanceSaveUI = this.f207862d;
        if (walletBalanceSaveUI.f207848w == 2 && walletBalanceSaveUI.isHandleAutoShowNormalStWcKb()) {
            this.f207862d.showNormalStWcKb();
        }
    }
}
