package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.app.Activity;
import android.content.DialogInterface;
import di3.C86312j;
import p227rn.C36390p;
import p227rn.C48052u;
import p227rn.C48054w;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.b */
public class C43382b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C43380a f117322d;

    public C43382b(C43380a aVar) {
        this.f117322d = aVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C48052u v = ((C48054w) C86312j.m106911c(C48054w.class)).mo72625v(this.f117322d.f117316e.getUsername());
        C43380a aVar = this.f117322d;
        ((C36390p) C86312j.m106911c(C36390p.class)).ip0(v, (Activity) aVar.f117315d, aVar.f117316e, false);
        this.f117322d.mo67578a();
    }
}
