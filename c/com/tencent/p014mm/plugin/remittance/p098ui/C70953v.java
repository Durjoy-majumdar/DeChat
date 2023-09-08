package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.model.C70587h0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.v */
public class C70953v implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70587h0 f205400d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceBaseUI f205401e;

    public C70953v(RemittanceBaseUI remittanceBaseUI, C70587h0 h0Var) {
        this.f205401e = remittanceBaseUI;
        this.f205400d = h0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        RemittanceBaseUI remittanceBaseUI = this.f205401e;
        String str = this.f205400d.f204074D;
        int i2 = RemittanceBaseUI.f204341f1;
        remittanceBaseUI.mo97276P7(2, 2, str);
    }
}
