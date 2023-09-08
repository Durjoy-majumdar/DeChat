package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.model.C70587h0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.w */
public class C70956w implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70587h0 f205407d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceBaseUI f205408e;

    public C70956w(RemittanceBaseUI remittanceBaseUI, C70587h0 h0Var) {
        this.f205408e = remittanceBaseUI;
        this.f205407d = h0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        RemittanceBaseUI remittanceBaseUI = this.f205408e;
        C70587h0 h0Var = this.f205407d;
        int i2 = RemittanceBaseUI.f204341f1;
        if (!remittanceBaseUI.mo97280T7(h0Var)) {
            this.f205408e.showLoading();
            RemittanceBaseUI remittanceBaseUI2 = this.f205408e;
            C70587h0 h0Var2 = this.f205407d;
            remittanceBaseUI2.mo97281V7(h0Var2.f204093d, remittanceBaseUI2.f204384f, remittanceBaseUI2.f204361S, h0Var2);
        }
    }
}
