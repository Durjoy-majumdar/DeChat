package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import kd2.C76559f;

/* renamed from: com.tencent.mm.plugin.offline.ui.z0 */
public class C70043z0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI f202071d;

    public C70043z0(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f202071d = walletOfflineCoinPurseUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (WalletOfflineCoinPurseUI.m82434H7(this.f202071d)) {
            WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f202071d;
            C76559f.m92128x(walletOfflineCoinPurseUI, 0, walletOfflineCoinPurseUI.f201879h, walletOfflineCoinPurseUI.getInput());
        } else {
            WalletOfflineCoinPurseUI walletOfflineCoinPurseUI2 = this.f202071d;
            C76559f.m92127w(walletOfflineCoinPurseUI2, 0, walletOfflineCoinPurseUI2.f201879h);
        }
        this.f202071d.f201890o = true;
        Log.m105926v("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineEntranceUI startBindProcess()");
    }
}
