package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.model.C70587h0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.d0 */
public class C70880d0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f205291d;

    /* renamed from: e */
    public final /* synthetic */ C70587h0 f205292e;

    /* renamed from: f */
    public final /* synthetic */ RemittanceBaseUI f205293f;

    public C70880d0(RemittanceBaseUI remittanceBaseUI, String str, C70587h0 h0Var) {
        this.f205293f = remittanceBaseUI;
        this.f205291d = str;
        this.f205292e = h0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f205293f.showLoading();
        RemittanceBaseUI remittanceBaseUI = this.f205293f;
        remittanceBaseUI.mo97281V7(this.f205291d, remittanceBaseUI.f204384f, remittanceBaseUI.f204361S, this.f205292e);
    }
}
