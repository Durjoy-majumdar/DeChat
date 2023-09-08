package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.model.C70607m0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.j1 */
public class C70899j1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70607m0 f205317d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceOSUI f205318e;

    public C70899j1(RemittanceOSUI remittanceOSUI, C70607m0 m0Var) {
        this.f205318e = remittanceOSUI;
        this.f205317d = m0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f205318e.mo97489c8(this.f205317d.f204276f);
    }
}
