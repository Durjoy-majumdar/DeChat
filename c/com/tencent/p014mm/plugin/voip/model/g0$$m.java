package com.tencent.p014mm.plugin.voip.model;

import android.content.Context;
import android.content.DialogInterface;
import di3.C86312j;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.voip.model.g0$$m */
public final /* synthetic */ class g0$$m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f21746d;

    public /* synthetic */ g0$$m(Context context) {
        this.f21746d = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f21746d;
        dialogInterface.dismiss();
        ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(context);
    }
}
