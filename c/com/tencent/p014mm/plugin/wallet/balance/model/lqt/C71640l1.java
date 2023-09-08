package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import lp3.C46888b;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.l1 */
public class C71640l1 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C71624d1 f207641a;

    public C71640l1(C71624d1 d1Var) {
        this.f207641a = d1Var;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        Log.m105925i("MicroMsg.LqtSaveFetchLogic", "doRedeemFund interrupt: %s", obj);
        this.f207641a.f207603b.hideLoading();
        WalletBaseUI walletBaseUI = this.f207641a.f207603b;
        if (walletBaseUI instanceof WalletLqtSaveFetchUI) {
            ((WalletLqtSaveFetchUI) walletBaseUI).f208172S0 = false;
            MMHandlerThread.postToMainThreadDelayed(((WalletLqtSaveFetchUI) walletBaseUI).f208202j1, 300);
        }
        C46888b bVar = this.f207641a.f207613l;
        if (bVar != null) {
            bVar.mo72091a(obj);
        }
    }
}
