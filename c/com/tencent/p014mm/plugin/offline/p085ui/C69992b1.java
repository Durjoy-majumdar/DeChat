package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import id2.C76309n;

/* renamed from: com.tencent.mm.plugin.offline.ui.b1 */
public class C69992b1 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202003g;

    public C69992b1(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202003g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "do get token, %s", Integer.valueOf(C69963m.wx0().Bx0().mo96269d(true)));
        if (C69963m.wx0().Bx0().mo96269d(true) <= 0) {
            this.f202003g.doSceneForceProgress(new C76309n("" + ((int) (System.currentTimeMillis() / 1000)), 10, 10));
            return;
        }
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f202003g;
        int i = WalletOfflineCoinPurseUI.f201810W1;
        walletOfflineCoinPurseUI.mo96296Q7(true, true);
    }
}
