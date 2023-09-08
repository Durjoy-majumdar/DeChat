package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.a2 */
public class C71780a2 implements C75217h {

    /* renamed from: a */
    public final /* synthetic */ WalletLqtSaveFetchUI f208310a;

    public C71780a2(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208310a = walletLqtSaveFetchUI;
    }

    public void onVisibleStateChange(boolean z) {
        if (z) {
            WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f208310a;
            if (walletLqtSaveFetchUI.f208173T == 2) {
                walletLqtSaveFetchUI.f208160I.postDelayed(new C71795e2(walletLqtSaveFetchUI), 100);
                return;
            }
            return;
        }
        this.f208310a.f208160I.scrollTo(0, 0);
        WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = this.f208310a;
        if (walletLqtSaveFetchUI2.f208173T == 2 && Util.isNullOrNil(walletLqtSaveFetchUI2.f208199i.getText())) {
            this.f208310a.f208159H.removeAllViews();
        }
    }
}
