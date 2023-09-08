package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$k */
public class WalletOfflineCoinPurseUI$$k implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201966d;

    public WalletOfflineCoinPurseUI$$k(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f201966d = walletOfflineCoinPurseUI;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201966d;
        if (walletOfflineCoinPurseUI.f201863X0) {
            walletOfflineCoinPurseUI.f201852T0 = false;
            walletOfflineCoinPurseUI.f201863X0 = false;
            walletOfflineCoinPurseUI.mo96308c8(0, false);
            this.f201966d.mo96291L7(true);
        }
    }
}
