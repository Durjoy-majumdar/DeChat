package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.View;
import com.tencent.p014mm.p136ui.C7038w;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.c */
public class C42869c extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ F2FAppBrandRemittanceUI f116085g;

    public C42869c(F2FAppBrandRemittanceUI f2FAppBrandRemittanceUI) {
        this.f116085g = f2FAppBrandRemittanceUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        this.f116085g.f116064h.mo140680z();
        F2FAppBrandRemittanceUI f2FAppBrandRemittanceUI = this.f116085g;
        f2FAppBrandRemittanceUI.f116064h = null;
        f2FAppBrandRemittanceUI.mo67019H7(C7038w.CANCEL, "");
        C115669n.INSTANCE.mo160131h(19821, 3, this.f116085g.f116060d, 0);
    }
}
