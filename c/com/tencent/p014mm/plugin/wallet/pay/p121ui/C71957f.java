package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.f */
public class C71957f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletLoanRepaymentUI f208725d;

    public C71957f(WalletLoanRepaymentUI walletLoanRepaymentUI) {
        this.f208725d = walletLoanRepaymentUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f208725d.isTransparent()) {
            this.f208725d.finish();
        }
    }
}
