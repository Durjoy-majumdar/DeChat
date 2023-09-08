package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75218i;
import kd2.C76559f;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$i */
public class WalletOfflineCoinPurseUI$$i extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201963g;

    public WalletOfflineCoinPurseUI$$i(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f201963g = walletOfflineCoinPurseUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        OfflineAlertView offlineAlertView;
        if (view.getId() != C0966R.C0970id.ljc && view.getId() != C0966R.C0970id.lfh && view.getId() != C0966R.C0970id.lfj) {
            return;
        }
        if (view.getId() != C0966R.C0970id.ljc || (offlineAlertView = this.f201963g.f201887m1) == null || !offlineAlertView.mo96282e()) {
            long currentTimeMillis = System.currentTimeMillis();
            OfflineAlertView offlineAlertView2 = this.f201963g.f201887m1;
            if ((offlineAlertView2 == null || !offlineAlertView2.mo96282e()) && currentTimeMillis - this.f201963g.f201871d >= 400 && C76559f.m92115k()) {
                int i = this.f201963g.f201873e;
                if (!(i == 2 || i == 1 || i == 7)) {
                    if (view.getId() == C0966R.C0970id.ljc) {
                        this.f201963g.f201849S0 = false;
                    } else if (view.getId() == C0966R.C0970id.lfh || view.getId() == C0966R.C0970id.lfj) {
                        C115669n.INSTANCE.mo160131h(13958, 4);
                        this.f201963g.f201849S0 = true;
                    }
                    WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201963g;
                    C75218i iVar = walletOfflineCoinPurseUI.f201884j1;
                    if (iVar != null) {
                        if (iVar != null) {
                            iVar.f221321e = walletOfflineCoinPurseUI.f201846R0;
                            iVar.f221318b = walletOfflineCoinPurseUI.f201881i;
                            iVar.f221319c = walletOfflineCoinPurseUI.f201883j;
                            C76901s0 s0Var = iVar.f221324h;
                            if (s0Var != null && s0Var.isShowing()) {
                                iVar.mo105150d();
                            }
                        }
                        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI2 = this.f201963g;
                        walletOfflineCoinPurseUI2.f201884j1.mo105149c(view, walletOfflineCoinPurseUI2.f201849S0);
                    }
                    this.f201963g.f201871d = currentTimeMillis;
                    return;
                }
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "offlineAlertView is showing");
    }
}
