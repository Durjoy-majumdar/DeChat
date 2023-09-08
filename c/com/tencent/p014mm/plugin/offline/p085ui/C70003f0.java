package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1;

/* renamed from: com.tencent.mm.plugin.offline.ui.f0 */
public class C70003f0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C70034w f202020d;

    public C70003f0(C70034w wVar) {
        this.f202020d = wVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C70034w wVar = this.f202020d;
        C72379f1 f1Var = wVar.f202062c;
        if (f1Var != null) {
            f1Var.dismiss();
            wVar.f202062c = null;
        }
    }
}
