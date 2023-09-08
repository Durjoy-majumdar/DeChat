package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import te3.C48730al;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.j */
public final class C72150j implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RealnameVerifySelectGuardianUI f209285d;

    /* renamed from: e */
    public final /* synthetic */ C48730al f209286e;

    public C72150j(RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, C48730al alVar) {
        this.f209285d = realnameVerifySelectGuardianUI;
        this.f209286e = alVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        RealnameVerifySelectGuardianUI.m84499g8(this.f209285d, this.f209286e.f130603e);
    }
}
