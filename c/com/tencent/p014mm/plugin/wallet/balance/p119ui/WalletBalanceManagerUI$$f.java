package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.ArrayList;
import nj3.C76879j;
import t43.C77855b;
import y43.C79029b0;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$f */
public class WalletBalanceManagerUI$$f extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletBalanceManagerUI f207815g;

    public WalletBalanceManagerUI$$f(WalletBalanceManagerUI walletBalanceManagerUI) {
        this.f207815g = walletBalanceManagerUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        ArrayList<Bankcard> j = C79029b0.vx0().wx0().mo91328j();
        if (j == null || j.size() == 0) {
            Log.m105924i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is empty, do bind card to fetch");
            WalletBalanceManagerUI walletBalanceManagerUI = this.f207815g;
            int i = WalletBalanceManagerUI.f207786A;
            C76879j.m92717K(walletBalanceManagerUI, false, walletBalanceManagerUI.getString(C0966R.string.klf), "", walletBalanceManagerUI.getString(C0966R.string.kle), walletBalanceManagerUI.getString(C0966R.string.f7926wf), new C71853r(walletBalanceManagerUI), new C71854s(walletBalanceManagerUI));
            return;
        }
        Log.m105924i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is valid, to do fetch");
        C79143a.m95771j(this.f207815g, C77855b.class, (Bundle) null, (C79148e.C79149a) null);
        C75228t.m90243e0(15, 1);
    }
}
