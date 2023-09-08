package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.a */
public class C70554a implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ BankMobileRemittanceChooseUI f204014d;

    public C70554a(BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI) {
        this.f204014d = bankMobileRemittanceChooseUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Dialog dialog = this.f204014d.f203838g;
        if (dialog != null && dialog.isShowing()) {
            this.f204014d.f203838g.dismiss();
        }
    }
}
