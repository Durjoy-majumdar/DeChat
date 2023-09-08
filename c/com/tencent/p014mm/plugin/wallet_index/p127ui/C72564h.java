package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import n63.C76835c;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.h */
public class C72564h implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ WalletIapUI f211107d;

    public C72564h(WalletIapUI walletIapUI) {
        this.f211107d = walletIapUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105925i("MicroMsg.WalletIapUI", "showLoadingDialog onCancel currentScene: %d", Integer.valueOf(this.f211107d.f211031e));
        C76835c a = this.f211107d.f211031e == 2 ? C76835c.m92624a(7) : C76835c.m92624a(1);
        Intent intent = new Intent();
        intent.putExtra("key_err_code", a.f224657a);
        intent.putExtra("key_err_msg", a.f224658b);
        this.f211107d.setResult(-1, intent);
        this.f211107d.finish();
    }
}
