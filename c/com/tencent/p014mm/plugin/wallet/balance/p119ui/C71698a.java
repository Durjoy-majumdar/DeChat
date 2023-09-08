package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.DialogInterface;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.a */
public class C71698a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceFetchResultUI f207880d;

    public C71698a(WalletBalanceFetchResultUI walletBalanceFetchResultUI) {
        this.f207880d = walletBalanceFetchResultUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C79148e process = this.f207880d.getProcess();
        WalletBalanceFetchResultUI walletBalanceFetchResultUI = this.f207880d;
        process.mo91264o(walletBalanceFetchResultUI, 0, walletBalanceFetchResultUI.getInput());
    }
}
