package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.content.DialogInterface;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.g */
public class C5817g implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBrandUI f21963d;

    public C5817g(WalletBrandUI walletBrandUI) {
        this.f21963d = walletBrandUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123458d(this.f21963d.f211001g);
        this.f21963d.finish();
    }
}
