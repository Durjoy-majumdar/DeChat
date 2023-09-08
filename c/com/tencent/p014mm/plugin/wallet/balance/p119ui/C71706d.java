package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.DialogInterface;
import u43.C78127d;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.d */
public class C71706d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78127d f207891d;

    /* renamed from: e */
    public final /* synthetic */ WalletBalanceFetchUI f207892e;

    public C71706d(WalletBalanceFetchUI walletBalanceFetchUI, C78127d dVar) {
        this.f207892e = walletBalanceFetchUI;
        this.f207891d = dVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        WalletBalanceFetchUI walletBalanceFetchUI = this.f207892e;
        C78127d dVar = this.f207891d;
        int i2 = WalletBalanceFetchUI.f207703Y;
        if (!walletBalanceFetchUI.mo98840O7(dVar)) {
            WalletBalanceFetchUI walletBalanceFetchUI2 = this.f207892e;
            C78127d dVar2 = this.f207891d;
            walletBalanceFetchUI2.f207730g = dVar2.f228937d;
            walletBalanceFetchUI2.mo98837L7(dVar2);
        }
    }
}
