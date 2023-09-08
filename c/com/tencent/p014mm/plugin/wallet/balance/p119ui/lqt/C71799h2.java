package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.p014mm.plugin.wallet_core.utils.C72502o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.h2 */
public class C71799h2 implements C32227p<C72502o.C72503a, Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtSaveFetchUI.C7176442 f208329d;

    public C71799h2(WalletLqtSaveFetchUI.C7176442 r1) {
        this.f208329d = r1;
    }

    public Object invoke(Object obj, Object obj2) {
        C72502o.C72503a aVar = (C72502o.C72503a) obj;
        long longValue = ((Long) obj2).longValue();
        WalletLqtSaveFetchUI walletLqtSaveFetchUI = WalletLqtSaveFetchUI.this;
        if (longValue != walletLqtSaveFetchUI.f208186Z0) {
            Log.m105920e("MicroMsg.WalletLqtSaveFetchUI", "unexpected halfpage callback");
            return C13598b0.f38549a;
        }
        walletLqtSaveFetchUI.f208186Z0 = 0;
        if (aVar == C72502o.C72503a.Continue) {
            walletLqtSaveFetchUI.f208193f.mo98809a();
        } else if (aVar == C72502o.C72503a.Exit) {
            walletLqtSaveFetchUI.finish();
        }
        return C13598b0.f38549a;
    }
}
