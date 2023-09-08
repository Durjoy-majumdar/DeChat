package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import com.tencent.p014mm.wallet_core.p137ui.C75217h;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$d */
public class WalletBalanceSaveUI$$d implements C75217h {

    /* renamed from: a */
    public final /* synthetic */ WalletBalanceSaveUI f207856a;

    public WalletBalanceSaveUI$$d(WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f207856a = walletBalanceSaveUI;
    }

    public void onVisibleStateChange(boolean z) {
        if (z) {
            WalletBalanceSaveUI walletBalanceSaveUI = this.f207856a;
            int i = WalletBalanceSaveUI.f207831A;
            walletBalanceSaveUI.getClass();
            return;
        }
        this.f207856a.f207838j.scrollTo(0, 0);
    }
}
