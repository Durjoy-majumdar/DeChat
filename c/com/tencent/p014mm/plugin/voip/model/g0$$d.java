package com.tencent.p014mm.plugin.voip.model;

import android.content.Context;
import android.content.DialogInterface;
import di3.C86312j;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.voip.model.g0$$d */
public final /* synthetic */ class g0$$d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f21741d;

    public /* synthetic */ g0$$d(Context context) {
        this.f21741d = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f21741d;
        dialogInterface.dismiss();
        ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(context);
    }
}
