package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.aa.ui.j1 */
public class C68294j1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ PaylistAAUI f196314d;

    public C68294j1(PaylistAAUI paylistAAUI) {
        this.f196314d = paylistAAUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Dialog dialog = this.f196314d.f196252n;
        if (dialog != null && dialog.isShowing()) {
            this.f196314d.f196252n.dismiss();
        }
    }
}
