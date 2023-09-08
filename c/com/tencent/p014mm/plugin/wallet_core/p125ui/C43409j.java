package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.app.Activity;
import android.content.DialogInterface;
import di3.C86312j;
import p227rn.C36390p;
import p227rn.C48052u;
import p227rn.C48054w;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.j */
public class C43409j implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C43404i f117368d;

    public C43409j(C43404i iVar) {
        this.f117368d = iVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C48052u v = ((C48054w) C86312j.m106911c(C48054w.class)).mo72625v(this.f117368d.f117358e.getUsername());
        C43404i iVar = this.f117368d;
        ((C36390p) C86312j.m106911c(C36390p.class)).ip0(v, (Activity) iVar.f117357d, iVar.f117358e, false);
        this.f117368d.mo67599b();
    }
}
