package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.v0 */
public class C4723v0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponCardUI f19729d;

    public C4723v0(IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f19729d = iPCallShareCouponCardUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C88144b.m109791i(this.f19729d.getContext(), "account", ".ui.FacebookAuthUI", new Intent(), (Bundle) null);
    }
}
