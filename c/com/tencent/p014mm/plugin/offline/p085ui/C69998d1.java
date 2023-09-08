package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.offline.ui.d1 */
public class C69998d1 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202012g;

    public C69998d1(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202012g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "do click fqf text link");
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f202012g;
        walletOfflineCoinPurseUI.f201904u1 = true;
        walletOfflineCoinPurseUI.f201900s1 = 1;
        walletOfflineCoinPurseUI.f201902t1 = "weixin://wcpay/fqf/opentinyapp";
    }
}
