package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43283c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.k */
public class C43347k implements C7045j.C7056k {

    /* renamed from: a */
    public final /* synthetic */ C7045j f117216a;

    /* renamed from: b */
    public final /* synthetic */ WalletLqtBalanceAutoTransferUI f117217b;

    public C43347k(WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI, C7045j jVar) {
        this.f117217b = walletLqtBalanceAutoTransferUI;
        this.f117216a = jVar;
    }

    public void onResult(boolean z, Object obj, Object obj2) {
        this.f117216a.mo8101d();
        if (z && this.f117216a.mo8099b() >= 0 && this.f117216a.mo8099b() < this.f117217b.f117181q.f140885f.size()) {
            this.f117217b.f117179o = this.f117216a.mo8099b();
            WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = this.f117217b;
            walletLqtBalanceAutoTransferUI.f117180p = walletLqtBalanceAutoTransferUI.f117181q.f140885f.get(walletLqtBalanceAutoTransferUI.f117179o);
            WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI2 = this.f117217b;
            walletLqtBalanceAutoTransferUI2.getClass();
            Log.m105924i("MicroMsg.WalletLqtBalanceAutoTransferUI", "do modify time");
            new C43283c(walletLqtBalanceAutoTransferUI2.f117180p).mo9225i().mo123062e(new C43354o(walletLqtBalanceAutoTransferUI2, C75197d0.m90163d(walletLqtBalanceAutoTransferUI2.getContext(), false, false, (DialogInterface.OnCancelListener) null)));
        }
    }
}
