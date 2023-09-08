package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import te3.C51181s;

/* renamed from: com.tencent.mm.plugin.aa.ui.o */
public class C68312o implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C51181s f196335d;

    /* renamed from: e */
    public final /* synthetic */ C68322q f196336e;

    public C68312o(C68322q qVar, C51181s sVar) {
        this.f196336e = qVar;
        this.f196335d = sVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.AARemittanceUI", "click aaPay doPay");
        AARemittanceUI.m80589J7(this.f196336e.f196347a, this.f196335d);
        AARemittanceUI aARemittanceUI = this.f196336e.f196347a;
        aARemittanceUI.f195962G = C75197d0.m90165f(aARemittanceUI, false, false, (DialogInterface.OnCancelListener) null);
    }
}
