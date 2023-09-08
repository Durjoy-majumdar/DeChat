package com.tencent.p014mm.plugin.offline.p085ui;

import kd2.C76559f;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$o */
public class WalletOfflineCoinPurseUI$$o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201972d;

    public WalletOfflineCoinPurseUI$$o(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f201972d = walletOfflineCoinPurseUI;
    }

    public void run() {
        if (WalletOfflineCoinPurseUI.m82434H7(this.f201972d)) {
            WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201972d;
            C76559f.m92128x(walletOfflineCoinPurseUI, 20000, -1, walletOfflineCoinPurseUI.getInput());
        } else {
            C76559f.m92127w(this.f201972d.f201885k1.f202060a, 20000, -1);
        }
        this.f201972d.f201890o = true;
    }
}
