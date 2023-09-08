package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;
import android.content.Intent;
import b73.C28273c;
import di3.C86312j;

/* renamed from: com.tencent.mm.plugin.offline.ui.x */
public class C70038x implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70034w f202067d;

    public C70038x(C70034w wVar) {
        this.f202067d = wVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91351e(this.f202067d.f202060a, new Intent());
    }
}
