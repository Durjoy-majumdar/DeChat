package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.u */
public class C70578u extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ MobileRemittanceUI f204041g;

    public C70578u(MobileRemittanceUI mobileRemittanceUI) {
        this.f204041g = mobileRemittanceUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        MobileRemittanceUI mobileRemittanceUI = this.f204041g;
        mobileRemittanceUI.f203955P = Util.getDouble(mobileRemittanceUI.f203945E.getText(), 0.0d);
        if (!this.f204041g.f203945E.mo105094l()) {
            C76912y0.makeText((Context) this.f204041g.getContext(), (int) C0966R.string.kmc, 0).show();
            return;
        }
        MobileRemittanceUI mobileRemittanceUI2 = this.f204041g;
        if (mobileRemittanceUI2.f203955P < 0.01d) {
            C76912y0.makeText((Context) mobileRemittanceUI2.getContext(), (int) C0966R.string.hzn, 0).show();
            return;
        }
        mobileRemittanceUI2.hideWcKb();
        this.f204041g.mo97217K7(false, false);
        this.f204041g.mo97216J7(10);
    }
}
