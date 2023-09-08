package com.tencent.p014mm.plugin.voip.model;

import android.content.DialogInterface;
import di3.C86312j;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr$$g */
public final /* synthetic */ class NewVoipMgr$$g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewVoipMgr f317139d;

    public /* synthetic */ NewVoipMgr$$g(NewVoipMgr newVoipMgr) {
        this.f317139d = newVoipMgr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        NewVoipMgr newVoipMgr = this.f317139d;
        newVoipMgr.getClass();
        dialogInterface.dismiss();
        ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(newVoipMgr.f317093h.mo152927i3());
    }
}
