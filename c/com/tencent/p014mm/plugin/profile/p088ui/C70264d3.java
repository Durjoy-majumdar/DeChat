package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.profile.ui.d3 */
public class C70264d3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SayHiWithSnsPermissionUI3 f203018d;

    public C70264d3(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f203018d = sayHiWithSnsPermissionUI3;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C77398g gVar = this.f203018d.f202932f1;
        if (gVar != null) {
            gVar.dismiss();
            this.f203018d.f202932f1 = null;
        }
    }
}
