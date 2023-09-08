package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$i */
public class WalletLqtSaveFetchUI$$i extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletLqtSaveFetchUI f208255g;

    public WalletLqtSaveFetchUI$$i(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208255g = walletLqtSaveFetchUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        int i;
        this.f208255g.hideTenpayKB();
        if (this.f208255g.f208173T == 1) {
            C115669n.INSTANCE.mo160131h(17084, 28);
            i = 2;
        } else {
            i = -1;
        }
        if (this.f208255g.f208173T == 2) {
            C115669n.INSTANCE.mo160131h(20287, 3);
        }
        this.f208255g.mo98984W7((String) null, i);
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208255g;
        if (walletLqtSaveFetchUI.f208158G) {
            walletLqtSaveFetchUI.f208195g.f207646e.mo67530b(1, 0);
        }
    }
}
