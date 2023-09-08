package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.model.C70587h0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.u */
public class C70950u implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70587h0 f205395d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceBaseUI f205396e;

    public C70950u(RemittanceBaseUI remittanceBaseUI, C70587h0 h0Var) {
        this.f205396e = remittanceBaseUI;
        this.f205395d = h0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        RemittanceBaseUI remittanceBaseUI = this.f205396e;
        String str = this.f205395d.f204074D;
        int i2 = RemittanceBaseUI.f204341f1;
        remittanceBaseUI.mo97276P7(2, 3, str);
        if (!this.f205396e.mo97280T7(this.f205395d)) {
            this.f205396e.showLoading();
            RemittanceBaseUI remittanceBaseUI2 = this.f205396e;
            C70587h0 h0Var = this.f205395d;
            remittanceBaseUI2.mo97281V7(h0Var.f204093d, remittanceBaseUI2.f204384f, remittanceBaseUI2.f204361S, h0Var);
        }
    }
}
