package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.profile.ui.q2 */
public class C70290q2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI f203057d;

    public C70290q2(SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI) {
        this.f203057d = sayHiWithSnsPermissionUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C77398g gVar = this.f203057d.f202761l1;
        if (gVar != null) {
            gVar.dismiss();
            this.f203057d.f202761l1 = null;
        }
    }
}
