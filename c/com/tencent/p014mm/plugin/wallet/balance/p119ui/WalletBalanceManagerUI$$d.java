package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.view.View;
import b63.C67211x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$d */
public class WalletBalanceManagerUI$$d extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C67211x f207812g;

    /* renamed from: h */
    public final /* synthetic */ WalletBalanceManagerUI f207813h;

    public WalletBalanceManagerUI$$d(WalletBalanceManagerUI walletBalanceManagerUI, C67211x xVar) {
        this.f207813h = walletBalanceManagerUI;
        this.f207812g = xVar;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.WalletBalanceManagerUI", "click freeze layout");
        C75228t.m90221N(this.f207813h.getContext(), this.f207812g.f193003e, true);
        C67211x.m79543c("");
        this.f207813h.f207800t.setVisibility(8);
    }
}
