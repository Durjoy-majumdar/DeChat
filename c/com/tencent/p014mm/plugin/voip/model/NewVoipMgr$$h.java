package com.tencent.p014mm.plugin.voip.model;

import android.content.DialogInterface;
import l33.C109247e;

/* renamed from: com.tencent.mm.plugin.voip.model.NewVoipMgr$$h */
public final /* synthetic */ class NewVoipMgr$$h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewVoipMgr f317140d;

    public /* synthetic */ NewVoipMgr$$h(NewVoipMgr newVoipMgr) {
        this.f317140d = newVoipMgr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f317140d.mo152448T0(4103);
        C109247e.xx0().mo152614m();
        dialogInterface.dismiss();
    }
}
