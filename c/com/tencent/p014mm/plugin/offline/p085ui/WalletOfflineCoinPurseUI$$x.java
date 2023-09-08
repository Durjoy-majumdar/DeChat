package com.tencent.p014mm.plugin.offline.p085ui;

import android.app.Dialog;
import com.tencent.p014mm.plugin.offline.C30326g;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$x */
public class WalletOfflineCoinPurseUI$$x implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201993d;

    public WalletOfflineCoinPurseUI$$x(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f201993d = walletOfflineCoinPurseUI;
    }

    public boolean onTimerExpired() {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201993d;
        walletOfflineCoinPurseUI.f201852T0 = false;
        Dialog dialog = walletOfflineCoinPurseUI.f201913y0;
        if (dialog != null && dialog.isShowing()) {
            this.f201993d.f201913y0.dismiss();
        }
        C30326g.m39030e();
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI2 = this.f201993d;
        Dialog dialog2 = walletOfflineCoinPurseUI2.f201913y0;
        if (dialog2 != null && dialog2.isShowing()) {
            walletOfflineCoinPurseUI2.f201913y0.dismiss();
        }
        this.f201993d.mo96309d8();
        return false;
    }
}
