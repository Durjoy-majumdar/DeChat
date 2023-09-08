package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.l */
public class C72152l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletRealNameProcessProxyUI f209288d;

    public C72152l(WalletRealNameProcessProxyUI walletRealNameProcessProxyUI) {
        this.f209288d = walletRealNameProcessProxyUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f209288d.setResult(1);
        this.f209288d.finish();
    }
}
