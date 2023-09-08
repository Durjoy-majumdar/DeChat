package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;

/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceHKUI$$c */
public class RemittanceHKUI$$c extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ RemittanceHKUI f204927g;

    public RemittanceHKUI$$c(RemittanceHKUI remittanceHKUI) {
        this.f204927g = remittanceHKUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.RemittanceHKUI", "hy: on click banner");
        if (!Util.isNullOrNil(this.f204927g.f204924j1)) {
            C75228t.m90219L(this.f204927g.getContext(), this.f204927g.f204924j1, true);
        }
    }
}
