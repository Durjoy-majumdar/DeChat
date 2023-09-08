package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.offline.ui.q0 */
public class C70020q0 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202045g;

    public C70020q0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202045g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f202045g;
        int i = WalletOfflineCoinPurseUI.f201810W1;
        C77407n nVar = new C77407n((Context) walletOfflineCoinPurseUI.getContext(), 1, false);
        nVar.f225771i = new C70037w0(walletOfflineCoinPurseUI);
        nVar.f225782p = new C70039x0(walletOfflineCoinPurseUI);
        nVar.mo107573q();
    }
}
