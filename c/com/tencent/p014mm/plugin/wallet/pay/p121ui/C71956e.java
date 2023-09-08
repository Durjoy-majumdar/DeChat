package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.e */
public class C71956e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLoanRepaymentUI f208724d;

    public C71956e(WalletLoanRepaymentUI walletLoanRepaymentUI) {
        this.f208724d = walletLoanRepaymentUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.WalletLoanRepaymentUI", "to bind a new bankcard");
        this.f208724d.mo99102H7();
    }
}
