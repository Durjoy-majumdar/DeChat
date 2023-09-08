package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.DialogInterface;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$a0 */
public class WalletLqtSaveFetchUI$$a0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f208224d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtSaveFetchUI f208225e;

    public WalletLqtSaveFetchUI$$a0(WalletLqtSaveFetchUI walletLqtSaveFetchUI, String str) {
        this.f208225e = walletLqtSaveFetchUI;
        this.f208224d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C75228t.m90219L(this.f208225e.getContext(), this.f208224d, false);
    }
}
