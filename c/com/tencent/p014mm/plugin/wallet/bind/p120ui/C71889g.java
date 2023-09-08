package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.g */
public class C71889g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f208527d;

    /* renamed from: e */
    public final /* synthetic */ WalletBankcardDetailUI f208528e;

    public C71889g(WalletBankcardDetailUI walletBankcardDetailUI, int i) {
        this.f208528e = walletBankcardDetailUI;
        this.f208527d = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f208527d == 2) {
            WalletBankcardDetailUI walletBankcardDetailUI = this.f208528e;
            int i2 = WalletBankcardDetailUI.f208429n;
            walletBankcardDetailUI.mo99036H7(true);
        }
        dialogInterface.dismiss();
    }
}
