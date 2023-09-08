package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.offline.ui.y0 */
public class C70041y0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202070d;

    public C70041y0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202070d = walletOfflineCoinPurseUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f202070d;
        int i = WalletOfflineCoinPurseUI.f201810W1;
        walletOfflineCoinPurseUI.forceCancel();
    }
}
