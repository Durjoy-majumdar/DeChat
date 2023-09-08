package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.j */
public class C5727j implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceFetchUI f21753d;

    public C5727j(WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f21753d = walletBalanceFetchUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f21753d.getString(C0966R.string.ksw));
        intent.putExtra("showShare", false);
        C75228t.m90217J(this.f21753d.getContext(), intent);
        dialogInterface.dismiss();
        C115669n.INSTANCE.mo160131h(16398, this.f21753d.f207715L, 3, "", "");
    }
}
