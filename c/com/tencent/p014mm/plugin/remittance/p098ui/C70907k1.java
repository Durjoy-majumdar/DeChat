package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.remittance.model.C70607m0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.k1 */
public class C70907k1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C70607m0 f205333d;

    /* renamed from: e */
    public final /* synthetic */ RemittanceOSUI f205334e;

    public C70907k1(RemittanceOSUI remittanceOSUI, C70607m0 m0Var) {
        this.f205334e = remittanceOSUI;
        this.f205333d = m0Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f205334e.mo97488b8(this.f205333d.f204277g);
    }
}
