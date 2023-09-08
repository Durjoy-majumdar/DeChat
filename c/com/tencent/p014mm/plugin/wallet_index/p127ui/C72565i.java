package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.i */
public class C72565i implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ WalletOpenFingerprintPayRedirectUI f211108d;

    public C72565i(WalletOpenFingerprintPayRedirectUI walletOpenFingerprintPayRedirectUI) {
        this.f211108d = walletOpenFingerprintPayRedirectUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        WalletOpenFingerprintPayRedirectUI walletOpenFingerprintPayRedirectUI = this.f211108d;
        walletOpenFingerprintPayRedirectUI.f211047e = true;
        walletOpenFingerprintPayRedirectUI.mo99951L7(4, false, "");
    }
}
