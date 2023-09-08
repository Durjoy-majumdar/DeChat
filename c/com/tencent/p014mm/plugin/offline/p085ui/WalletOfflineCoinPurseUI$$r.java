package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.List;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$r */
public class WalletOfflineCoinPurseUI$$r implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ List f201986d;

    /* renamed from: e */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201987e;

    public WalletOfflineCoinPurseUI$$r(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, List list) {
        this.f201987e = walletOfflineCoinPurseUI;
        this.f201986d = list;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f201987e;
        if (walletOfflineCoinPurseUI.f201870c1 != null) {
            walletOfflineCoinPurseUI.f201816C1 = null;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
            this.f201987e.mo96311f8();
            Bankcard bankcard = (Bankcard) this.f201986d.get(i);
            if (bankcard.field_bindSerial.equals(this.f201987e.f201899s)) {
                this.f201987e.f201870c1.mo106728c();
            } else {
                this.f201987e.mo96293N7(bankcard, true, new WalletOfflineCoinPurseUI$$r$$a(this, bankcard));
            }
        }
    }
}
