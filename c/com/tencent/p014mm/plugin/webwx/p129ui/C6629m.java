package com.tencent.p014mm.plugin.webwx.p129ui;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.webwx.ui.m */
public class C6629m implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ WebWXPopupUnlockUI f23911d;

    public C6629m(WebWXPopupUnlockUI webWXPopupUnlockUI) {
        this.f23911d = webWXPopupUnlockUI;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f23911d.finish();
    }
}
