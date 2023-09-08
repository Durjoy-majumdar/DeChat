package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$j */
public class WalletOfflineCoinPurseUI$$j implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ DialogInterface.OnDismissListener f201964d;

    /* renamed from: e */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201965e;

    public WalletOfflineCoinPurseUI$$j(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, DialogInterface.OnDismissListener onDismissListener) {
        this.f201965e = walletOfflineCoinPurseUI;
        this.f201964d = onDismissListener;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.f201964d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201965e;
        if (walletOfflineCoinPurseUI.f201863X0) {
            walletOfflineCoinPurseUI.f201852T0 = false;
            walletOfflineCoinPurseUI.f201863X0 = false;
            walletOfflineCoinPurseUI.mo96308c8(0, false);
            this.f201965e.mo96291L7(true);
        }
    }
}
