package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.app.Activity;
import android.content.DialogInterface;
import di3.C86312j;
import p227rn.C36390p;
import p227rn.C48052u;
import p227rn.C48054w;
import te3.C49809i72;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.d */
public class C43391d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C43383c f117338d;

    public C43391d(C43383c cVar) {
        this.f117338d = cVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C48052u v = ((C48054w) C86312j.m106911c(C48054w.class)).mo72625v(this.f117338d.f117324e.getUsername());
        C43383c cVar = this.f117338d;
        ((C36390p) C86312j.m106911c(C36390p.class)).ip0(v, (Activity) cVar.f117323d, cVar.f117324e, false);
        this.f117338d.mo67585e();
        this.f117338d.mo67582b();
        this.f117338d.mo67583c((C49809i72) null);
        this.f117338d.mo67581a(10);
    }
}
