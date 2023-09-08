package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.widget.CompoundButton;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.w1 */
public class C71841w1 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ WalletLqtSaveFetchUI f208393a;

    public C71841w1(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208393a = walletLqtSaveFetchUI;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!z) {
            WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208393a;
            int i = WalletLqtSaveFetchUI.f208151m1;
            walletLqtSaveFetchUI.mo98972K7(false);
            return;
        }
        WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = this.f208393a;
        int i2 = WalletLqtSaveFetchUI.f208151m1;
        walletLqtSaveFetchUI2.mo98972K7(true);
    }
}
