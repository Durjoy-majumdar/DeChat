package com.tencent.p014mm.wallet_core.p137ui;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.tencent.mm.wallet_core.ui.y */
public class C75242y implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletBaseUI f221369d;

    /* renamed from: e */
    public final /* synthetic */ String f221370e;

    public C75242y(WalletBaseUI walletBaseUI, String str) {
        this.f221369d = walletBaseUI;
        this.f221370e = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C75190a0.m90155a(this.f221369d);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f221370e);
        C75228t.m90217J(this.f221369d.getContext(), intent);
        C75228t.m90243e0(3, 1);
    }
}
