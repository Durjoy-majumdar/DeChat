package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.i */
public class C5726i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceFetchUI f21752d;

    public C5726i(WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f21752d = walletBalanceFetchUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C115669n.INSTANCE.mo160131h(16398, this.f21752d.f207715L, 4, "", "");
    }
}
