package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.app.Dialog;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.k */
public class C5728k implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ Dialog f21754d;

    public C5728k(WalletBalanceFetchUI walletBalanceFetchUI, Dialog dialog) {
        this.f21754d = dialog;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.WalletBalanceFetchUI", "showIdentifyInfoCompleteDialog onCancel");
        Dialog dialog = this.f21754d;
        if (dialog != null && dialog.isShowing()) {
            this.f21754d.dismiss();
        }
    }
}
