package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import kd2.C76559f;

/* renamed from: com.tencent.mm.plugin.offline.ui.c1 */
public class C69994c1 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202006g;

    /* renamed from: com.tencent.mm.plugin.offline.ui.c1$a */
    public class C69995a implements Runnable {
        public C69995a() {
        }

        public void run() {
            C69994c1.this.f202006g.finish();
        }
    }

    public C69994c1(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202006g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C76559f.m92105a();
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f202006g;
        C76559f.m92106b(walletOfflineCoinPurseUI, walletOfflineCoinPurseUI.f201879h);
        this.f202006g.getWindow().getDecorView().postDelayed(new C69995a(), 300);
    }
}
