package com.tencent.p014mm.wallet_core.p137ui;

import android.widget.PopupWindow;

/* renamed from: com.tencent.mm.wallet_core.ui.m */
public class C75224m implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C75218i f221339d;

    public C75224m(C75218i iVar) {
        this.f221339d = iVar;
    }

    public void onDismiss() {
        this.f221339d.f221317a.getWindow().clearFlags(1024);
    }
}
