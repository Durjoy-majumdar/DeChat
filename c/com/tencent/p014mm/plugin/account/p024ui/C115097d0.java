package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.account.ui.d0 */
public class C115097d0 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ LoginByMobileSendSmsUI f345093d;

    public C115097d0(LoginByMobileSendSmsUI loginByMobileSendSmsUI) {
        this.f345093d = loginByMobileSendSmsUI;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f345093d.f344482n = null;
    }
}
