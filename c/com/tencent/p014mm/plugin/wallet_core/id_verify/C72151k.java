package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.k */
public class C72151k implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SwitchRealnameVerifyModeUI f209287d;

    public C72151k(SwitchRealnameVerifyModeUI switchRealnameVerifyModeUI) {
        this.f209287d = switchRealnameVerifyModeUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f209287d.finish();
    }
}
