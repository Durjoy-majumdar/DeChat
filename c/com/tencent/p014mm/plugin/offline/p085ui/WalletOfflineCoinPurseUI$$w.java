package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$w */
public class WalletOfflineCoinPurseUI$$w implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201992d;

    public WalletOfflineCoinPurseUI$$w(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f201992d = walletOfflineCoinPurseUI;
    }

    public boolean onTimerExpired() {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201992d;
        if (!walletOfflineCoinPurseUI.f201852T0) {
            walletOfflineCoinPurseUI.mo96308c8(0, false);
            this.f201992d.mo96291L7(true);
        }
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI2 = this.f201992d;
        walletOfflineCoinPurseUI2.f201850S1.startTimer((long) walletOfflineCoinPurseUI2.f201847R1);
        return false;
    }
}
