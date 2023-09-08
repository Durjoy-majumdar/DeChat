package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$s$$a */
public final /* synthetic */ class WalletOfflineCoinPurseUI$$s$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletOfflineCoinPurseUI$$s f201928d;

    /* renamed from: e */
    public final /* synthetic */ Bankcard f201929e;

    public /* synthetic */ WalletOfflineCoinPurseUI$$s$$a(WalletOfflineCoinPurseUI$$s walletOfflineCoinPurseUI$$s, Bankcard bankcard) {
        this.f201928d = walletOfflineCoinPurseUI$$s;
        this.f201929e = bankcard;
    }

    public final void run() {
        WalletOfflineCoinPurseUI$$s walletOfflineCoinPurseUI$$s = this.f201928d;
        Bankcard bankcard = this.f201929e;
        walletOfflineCoinPurseUI$$s.f201989b.f201870c1.mo106728c();
        Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "click mmBottomSheet card：%s,status：%s", bankcard.field_bindSerial, Integer.valueOf(bankcard.field_defaultCardState));
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(14515, 3);
        if (!Util.isNullOrNil(bankcard.field_forbid_title) || !Util.isNullOrNil(bankcard.field_forbidWord) || !bankcard.field_support_micropay) {
            nVar.mo160131h(14515, 4);
        }
        if (bankcard.mo99391q2()) {
            walletOfflineCoinPurseUI$$s.f201989b.f201867Z0 = false;
            WalletOfflineCoinPurseUI.m82435R7(3);
        }
    }
}
