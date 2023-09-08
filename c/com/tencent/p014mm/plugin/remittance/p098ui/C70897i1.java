package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.model.C70607m0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.i1 */
public class C70897i1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70607m0 f205312d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceOSUI f205313e;

    public C70897i1(RemittanceOSUI remittanceOSUI, C70607m0 m0Var) {
        this.f205313e = remittanceOSUI;
        this.f205312d = m0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f205313e.mo97488b8(this.f205312d.f204277g);
    }
}
