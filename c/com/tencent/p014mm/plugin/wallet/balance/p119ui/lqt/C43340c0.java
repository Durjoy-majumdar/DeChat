package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtDetailUI;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.c0 */
public class C43340c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtDetailUI.C43332s f117206d;

    public C43340c0(WalletLqtDetailUI.C43332s sVar) {
        this.f117206d = sVar;
    }

    public void run() {
        Dialog dialog = WalletLqtDetailUI.this.f207943T;
        if (dialog != null) {
            dialog.dismiss();
        }
        WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
        C76701a.makeText((Context) walletLqtDetailUI, (CharSequence) walletLqtDetailUI.getString(C0966R.string.kwh), 1).show();
    }
}
