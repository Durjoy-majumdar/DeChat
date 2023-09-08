package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.u0 */
public class C72434u0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletOrderInfoNewUI f210691d;

    public C72434u0(WalletOrderInfoNewUI walletOrderInfoNewUI) {
        this.f210691d = walletOrderInfoNewUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f210691d.finish();
    }
}
