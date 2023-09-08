package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import n63.C76835c;

/* renamed from: com.tencent.mm.plugin.wallet_index.ui.m */
public final class C72569m implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ WecoinIapUI f211123d;

    public C72569m(WecoinIapUI wecoinIapUI) {
        this.f211123d = wecoinIapUI;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Log.m105925i("MicroMsg.WecoinIapUI", "showLoadingDialog onCancel currentScene: %d", Integer.valueOf(this.f211123d.f211065h));
        WecoinIapUI wecoinIapUI = this.f211123d;
        C76835c a = wecoinIapUI.f211065h == wecoinIapUI.f211064g ? C76835c.m92624a(7) : C76835c.m92624a(1);
        Intent intent = new Intent();
        intent.putExtra("key_err_code", a.f224657a);
        intent.putExtra("key_err_msg", a.f224658b);
        this.f211123d.setResult(-1, intent);
        this.f211123d.finish();
    }
}
