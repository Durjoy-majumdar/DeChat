package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.model.C70607m0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.h1 */
public class C70894h1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70607m0 f205305d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceOSUI f205306e;

    public C70894h1(RemittanceOSUI remittanceOSUI, C70607m0 m0Var) {
        this.f205306e = remittanceOSUI;
        this.f205305d = m0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f205306e.mo97489c8(this.f205305d.f204276f);
    }
}
