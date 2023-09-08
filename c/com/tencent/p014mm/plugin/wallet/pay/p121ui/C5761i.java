package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.content.DialogInterface;
import android.widget.CheckBox;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.i */
public class C5761i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CheckBox f21817d;

    /* renamed from: e */
    public final /* synthetic */ WalletPayUI f21818e;

    public C5761i(WalletPayUI walletPayUI, CheckBox checkBox) {
        this.f21818e = walletPayUI;
        this.f21817d = checkBox;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f21817d.isChecked()) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(196614, Boolean.FALSE);
        }
        this.f21818e.mo99115K7(false);
    }
}
