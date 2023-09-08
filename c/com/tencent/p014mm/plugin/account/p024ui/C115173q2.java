package com.tencent.p014mm.plugin.account.p024ui;

import android.content.DialogInterface;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.q2 */
public class C115173q2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RegByEmailUI f345219d;

    public C115173q2(RegByEmailUI regByEmailUI) {
        this.f345219d = regByEmailUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C78595a.m94985e(this.f345219d.f344812n);
        this.f345219d.hideVKB();
        this.f345219d.finish();
    }
}
