package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import v53.C78350l0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.f0 */
public class C71711f0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78350l0 f207898d;

    /* renamed from: e */
    public final /* synthetic */ WalletBalanceSaveUI f207899e;

    public C71711f0(WalletBalanceSaveUI walletBalanceSaveUI, C78350l0 l0Var) {
        this.f207899e = walletBalanceSaveUI;
        this.f207898d = l0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105925i("MicroMsg.WalletBalanceSaveUI", "click open lqt: %s", Integer.valueOf(this.f207898d.f229597c));
        C115669n.INSTANCE.mo160131h(17084, 8);
        C78350l0 l0Var = this.f207898d;
        int i2 = l0Var.f229597c;
        if (i2 == 2) {
            WalletBalanceSaveUI walletBalanceSaveUI = this.f207899e;
            walletBalanceSaveUI.f207844s = true;
            C75228t.m90219L(walletBalanceSaveUI.getContext(), this.f207898d.f229596b, true);
        } else if (i2 == 3) {
            this.f207899e.f207844s = true;
            C75228t.m90224Q(l0Var.f229598d, l0Var.f229596b, 0, 1000);
        }
    }
}
