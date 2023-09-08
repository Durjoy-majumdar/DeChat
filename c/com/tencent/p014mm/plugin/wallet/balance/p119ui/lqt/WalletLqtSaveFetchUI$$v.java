package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$v */
public class WalletLqtSaveFetchUI$$v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtSaveFetchUI f208296d;

    public WalletLqtSaveFetchUI$$v(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208296d = walletLqtSaveFetchUI;
    }

    public void run() {
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208296d;
        if (walletLqtSaveFetchUI.f208200i1 == 2 && walletLqtSaveFetchUI.isHandleAutoShowNormalStWcKb()) {
            this.f208296d.showNormalStWcKb();
        }
    }
}
