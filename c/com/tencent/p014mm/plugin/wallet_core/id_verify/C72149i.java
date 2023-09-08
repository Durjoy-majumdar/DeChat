package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import te3.C48730al;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.i */
public final class C72149i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RealnameVerifySelectGuardianUI f209283d;

    /* renamed from: e */
    public final /* synthetic */ C48730al f209284e;

    public C72149i(RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, C48730al alVar) {
        this.f209283d = realnameVerifySelectGuardianUI;
        this.f209284e = alVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        RealnameVerifySelectGuardianUI.m84499g8(this.f209283d, this.f209284e.f130603e);
    }
}
