package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.o */
public class C71849o implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ List f208405d;

    /* renamed from: e */
    public final /* synthetic */ WalletBalanceFetchUI f208406e;

    public C71849o(WalletBalanceFetchUI walletBalanceFetchUI, List list) {
        this.f208406e = walletBalanceFetchUI;
        this.f208405d = list;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        List list = this.f208405d;
        if (list == null || i >= list.size()) {
            Log.m105924i("MicroMsg.WalletBalanceFetchUI", "showRecommendBanks, select card in error index " + i);
        } else {
            this.f208406e.f207728e = (Bankcard) this.f208405d.get(i);
            this.f208406e.mo98845T7();
            Log.m105925i("MicroMsg.WalletBalanceFetchUI", "showRecommendBanks, bankcard: %s", this.f208406e.f207728e.field_desc);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[4];
            objArr[0] = this.f208406e.f207715L;
            objArr[1] = 2;
            Bankcard bankcard = this.f208406e.f207728e;
            String str = "";
            objArr[2] = bankcard != null ? bankcard.field_bankcardType : str;
            if (bankcard != null) {
                str = bankcard.field_bindSerial;
            }
            objArr[3] = str;
            nVar.mo160131h(16398, objArr);
        }
        WalletBalanceFetchUI walletBalanceFetchUI = this.f208406e;
        int i2 = WalletBalanceFetchUI.f207703Y;
        walletBalanceFetchUI.mo98846U7();
        this.f208406e.getClass();
    }
}
