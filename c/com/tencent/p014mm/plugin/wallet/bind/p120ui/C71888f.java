package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.content.DialogInterface;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.f */
public class C71888f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBankcardDetailUI f208526d;

    public C71888f(WalletBankcardDetailUI walletBankcardDetailUI) {
        this.f208526d = walletBankcardDetailUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        WalletBankcardDetailUI walletBankcardDetailUI = this.f208526d;
        int i2 = WalletBankcardDetailUI.f208429n;
        walletBankcardDetailUI.mo99036H7(true);
        C75228t.m90243e0(2, 1);
    }
}
