package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import yq3.C79144b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.f */
public class C71710f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBalanceFetchUI f207897d;

    public C71710f(WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f207897d = walletBalanceFetchUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        dialogInterface.dismiss();
        WalletBalanceFetchUI walletBalanceFetchUI = this.f207897d;
        Bankcard bankcard = walletBalanceFetchUI.f207728e;
        if (bankcard != null) {
            String str3 = bankcard.field_bankcardType;
            str = bankcard.field_bindSerial;
            str2 = str3;
        } else {
            str2 = "";
            str = str2;
        }
        walletBalanceFetchUI.f207712I = 1;
        walletBalanceFetchUI.getClass();
        C79144b.m95773a().getClass();
        C79144b.m95773a().getClass();
        WalletBalanceFetchUI walletBalanceFetchUI2 = this.f207897d;
        walletBalanceFetchUI2.mo98842Q7(21, walletBalanceFetchUI2.f207729f, "1", str2, str, walletBalanceFetchUI2.f207712I);
    }
}
