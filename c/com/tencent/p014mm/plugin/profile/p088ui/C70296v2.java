package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.profile.ui.v2 */
public class C70296v2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI2 f203063d;

    public C70296v2(SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2) {
        this.f203063d = sayHiWithSnsPermissionUI2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C77398g gVar = this.f203063d.f202835W0;
        if (gVar != null) {
            gVar.dismiss();
            this.f203063d.f202835W0 = null;
        }
    }
}
