package com.tencent.p014mm.plugin.offline.p085ui;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.offline.ui.s */
public class C70026s implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f202053d;

    public C70026s(Activity activity) {
        this.f202053d = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.f202053d;
        if (activity instanceof WalletOfflineCoinPurseUI) {
            ((WalletOfflineCoinPurseUI) activity).f201841P1 = false;
        }
        dialogInterface.dismiss();
    }
}
