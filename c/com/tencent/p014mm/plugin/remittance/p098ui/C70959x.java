package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.plugin.remittance.model.C70587h0;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p286zl.C16292g;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.remittance.ui.x */
public class C70959x implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70587h0 f205414d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceBaseUI f205415e;

    public C70959x(RemittanceBaseUI remittanceBaseUI, C70587h0 h0Var) {
        this.f205415e = remittanceBaseUI;
        this.f205414d = h0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (Util.isNullOrNil(this.f205414d.f204095f.f204117c)) {
            C79143a.m95772k(this.f205415e, "order", "ShowOrdersInfoProcess", (Bundle) null, (C79148e.C79149a) null);
        } else {
            ((C16292g) C86312j.m106911c(C16292g.class)).nr0(this.f205415e, this.f205414d.f204095f.f204117c, 5, true);
        }
    }
}
