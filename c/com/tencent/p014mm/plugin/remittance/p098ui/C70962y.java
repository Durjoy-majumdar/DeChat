package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.model.C70587h0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.y */
public class C70962y implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70587h0 f205418d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceBaseUI f205419e;

    public C70962y(RemittanceBaseUI remittanceBaseUI, C70587h0 h0Var) {
        this.f205419e = remittanceBaseUI;
        this.f205418d = h0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        RemittanceBaseUI remittanceBaseUI = this.f205419e;
        C70587h0 h0Var = this.f205418d;
        int i2 = RemittanceBaseUI.f204341f1;
        if (!remittanceBaseUI.mo97280T7(h0Var)) {
            RemittanceBaseUI remittanceBaseUI2 = this.f205419e;
            C70587h0 h0Var2 = this.f205418d;
            remittanceBaseUI2.mo97281V7(h0Var2.f204093d, remittanceBaseUI2.f204384f, remittanceBaseUI2.f204361S, h0Var2);
        }
    }
}
