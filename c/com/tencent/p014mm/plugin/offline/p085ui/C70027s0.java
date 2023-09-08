package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.offline.ui.s0 */
public class C70027s0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202054g;

    public C70027s0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202054g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "click change_bankcard_layout() card：%s", this.f202054g.f201899s);
        C115669n.INSTANCE.mo160131h(14515, 1);
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f202054g;
        walletOfflineCoinPurseUI.f201812A1 = true;
        walletOfflineCoinPurseUI.mo96300V7(false);
    }
}
