package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.e */
public class C71708e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceFetchUI f207893d;

    public C71708e(WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f207893d = walletBalanceFetchUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        WalletBalanceFetchUI walletBalanceFetchUI = this.f207893d;
        int i2 = WalletBalanceFetchUI.f207703Y;
        walletBalanceFetchUI.mo98838M7();
    }
}
