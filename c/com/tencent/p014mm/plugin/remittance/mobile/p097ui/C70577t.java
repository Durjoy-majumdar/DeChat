package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.t */
public class C70577t implements C7092q.C7093a {

    /* renamed from: a */
    public final /* synthetic */ MobileRemittanceUI f204040a;

    public C70577t(MobileRemittanceUI mobileRemittanceUI) {
        this.f204040a = mobileRemittanceUI;
    }

    public void onClick(View view) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "click verify real name");
        MobileRemittanceUI mobileRemittanceUI = this.f204040a;
        int i = MobileRemittanceUI.f203940y0;
        mobileRemittanceUI.mo97220N7(1);
        this.f204040a.mo97216J7(8);
    }
}
