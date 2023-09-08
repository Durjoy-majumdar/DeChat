package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.DialogInterface;
import di3.C86312j;
import kv1.C99260q;
import lv1.C99664b;

/* renamed from: com.tencent.mm.plugin.aa.ui.g0 */
public class C68285g0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C99664b f196298d;

    /* renamed from: e */
    public final /* synthetic */ LaunchAAUI f196299e;

    public C68285g0(LaunchAAUI launchAAUI, C99664b bVar) {
        this.f196299e = launchAAUI;
        this.f196298d = bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Dialog dialog = this.f196299e.f196118U0;
        if (dialog != null && dialog.isShowing()) {
            this.f196299e.f196118U0.dismiss();
        }
        ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(this.f196298d);
        this.f196299e.f196120V0 = false;
    }
}
