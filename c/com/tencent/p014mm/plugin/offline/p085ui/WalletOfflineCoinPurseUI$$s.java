package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.List;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$s */
public class WalletOfflineCoinPurseUI$$s implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ List f201988a;

    /* renamed from: b */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201989b;

    public WalletOfflineCoinPurseUI$$s(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, List list) {
        this.f201989b = walletOfflineCoinPurseUI;
        this.f201988a = list;
    }

    /* renamed from: a */
    public void mo2001a() {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201989b;
        if (walletOfflineCoinPurseUI.f201870c1 != null) {
            walletOfflineCoinPurseUI.f201816C1 = null;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
            this.f201989b.mo96311f8();
            Bankcard bankcard = (Bankcard) this.f201988a.get(this.f201989b.f201870c1.f223933m);
            if (bankcard.field_bindSerial.equals(this.f201989b.f201899s)) {
                this.f201989b.f201870c1.mo106728c();
            } else {
                this.f201989b.mo96293N7(bankcard, true, new WalletOfflineCoinPurseUI$$s$$a(this, bankcard));
            }
        }
    }
}
