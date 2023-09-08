package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.j */
public class C70564j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MobileRemittanceUI f204025d;

    public C70564j(MobileRemittanceUI mobileRemittanceUI) {
        this.f204025d = mobileRemittanceUI;
    }

    public void run() {
        MobileRemittanceUI mobileRemittanceUI = this.f204025d;
        mobileRemittanceUI.f203980t = mobileRemittanceUI.f203946F.getWidth();
        this.f204025d.f203948H.setVisibility(8);
        Log.m105919d("MicroMsg.mobileRemit.MobileRemittanceUI", "post: mMaxUnitWidth:%s", Integer.valueOf(this.f204025d.f203980t));
    }
}
