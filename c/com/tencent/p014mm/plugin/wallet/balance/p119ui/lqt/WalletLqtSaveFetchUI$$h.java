package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.widget.LinearLayout;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$h */
public class WalletLqtSaveFetchUI$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f208254d;

    public WalletLqtSaveFetchUI$$h(WalletLqtSaveFetchUI walletLqtSaveFetchUI, LinearLayout linearLayout) {
        this.f208254d = linearLayout;
    }

    public void run() {
        LinearLayout linearLayout = this.f208254d;
        if (linearLayout != null) {
            linearLayout.sendAccessibilityEvent(8);
        }
    }
}
