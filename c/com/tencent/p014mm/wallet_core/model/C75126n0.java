package com.tencent.p014mm.wallet_core.model;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: com.tencent.mm.wallet_core.model.n0 */
public class C75126n0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C75128o0 f221055d;

    public C75126n0(C75128o0 o0Var) {
        this.f221055d = o0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Dialog dialog = this.f221055d.f221059o;
        if (dialog != null && dialog.isShowing()) {
            this.f221055d.f221059o.dismiss();
        }
    }
}
