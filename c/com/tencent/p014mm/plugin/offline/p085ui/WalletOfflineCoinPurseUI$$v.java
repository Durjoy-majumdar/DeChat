package com.tencent.p014mm.plugin.offline.p085ui;

import android.widget.LinearLayout;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$v */
public class WalletOfflineCoinPurseUI$$v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinearLayout f201991d;

    public WalletOfflineCoinPurseUI$$v(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, LinearLayout linearLayout) {
        this.f201991d = linearLayout;
    }

    public void run() {
        LinearLayout linearLayout = this.f201991d;
        if (linearLayout != null) {
            linearLayout.sendAccessibilityEvent(8);
        }
    }
}
