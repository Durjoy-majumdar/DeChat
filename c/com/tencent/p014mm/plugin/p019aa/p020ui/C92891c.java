package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.aa.ui.c */
public class C92891c implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ AAImagPreviewUI f267581d;

    public C92891c(AAImagPreviewUI aAImagPreviewUI) {
        this.f267581d = aAImagPreviewUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Dialog dialog = this.f267581d.f267565i;
        if (dialog != null && dialog.isShowing()) {
            this.f267581d.f267565i.dismiss();
        }
    }
}
