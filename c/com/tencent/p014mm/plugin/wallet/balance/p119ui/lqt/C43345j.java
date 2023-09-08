package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.j */
public class C43345j implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtBalanceAutoTransferUI f117213d;

    public C43345j(WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI) {
        this.f117213d = walletLqtBalanceAutoTransferUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.WalletLqtBalanceAutoTransferUI", "cancel close");
        this.f117213d.f117171d.setCheck(true);
    }
}
