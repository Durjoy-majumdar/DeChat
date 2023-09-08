package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.aa.ui.e0 */
public class C68281e0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ LaunchAABeforeUI f196292d;

    public C68281e0(LaunchAABeforeUI launchAABeforeUI) {
        this.f196292d = launchAABeforeUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Dialog dialog = this.f196292d.f196031d;
        if (dialog != null && dialog.isShowing()) {
            this.f196292d.f196031d.dismiss();
        }
        this.f196292d.finish();
    }
}
