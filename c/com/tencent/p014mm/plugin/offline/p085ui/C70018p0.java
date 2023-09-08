package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.ViewGroup;

/* renamed from: com.tencent.mm.plugin.offline.ui.p0 */
public class C70018p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202044d;

    public C70018p0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202044d = walletOfflineCoinPurseUI;
    }

    public void run() {
        ViewGroup.LayoutParams layoutParams = this.f202044d.f201813B.getLayoutParams();
        if (layoutParams != null) {
            this.f202044d.f201813B.setMinimumHeight(layoutParams.height);
        }
    }
}
