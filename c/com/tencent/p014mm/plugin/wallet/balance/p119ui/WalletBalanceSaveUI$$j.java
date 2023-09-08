package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$j */
public class WalletBalanceSaveUI$$j extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ WalletBalanceSaveUI f207865g;

    public WalletBalanceSaveUI$$j(WalletBalanceSaveUI walletBalanceSaveUI) {
        this.f207865g = walletBalanceSaveUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        WalletBalanceSaveUI walletBalanceSaveUI = this.f207865g;
        walletBalanceSaveUI.f207832d = Util.getDouble(walletBalanceSaveUI.f207836h.getText(), 0.0d);
        WalletBalanceSaveUI walletBalanceSaveUI2 = this.f207865g;
        if (walletBalanceSaveUI2.f207832d <= 0.0d || !walletBalanceSaveUI2.f207836h.mo105094l()) {
            C76912y0.makeText((Context) this.f207865g.getContext(), (int) C0966R.string.kmc, 0).show();
            return;
        }
        this.f207865g.hideWcKb();
        this.f207865g.mo98874H7();
    }
}
