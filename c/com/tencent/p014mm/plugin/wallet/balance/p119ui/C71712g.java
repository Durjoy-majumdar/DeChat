package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.g */
public class C71712g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceFetchUI f207900d;

    public C71712g(WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f207900d = walletBalanceFetchUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        WalletBalanceFetchUI walletBalanceFetchUI = this.f207900d;
        int i2 = WalletBalanceFetchUI.f207703Y;
        walletBalanceFetchUI.mo98838M7();
    }
}
