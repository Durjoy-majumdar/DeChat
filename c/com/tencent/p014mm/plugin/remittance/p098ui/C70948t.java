package com.tencent.p014mm.plugin.remittance.p098ui;

import com.tencent.p014mm.wallet_core.p137ui.C75217h;

/* renamed from: com.tencent.mm.plugin.remittance.ui.t */
public class C70948t implements C75217h {

    /* renamed from: a */
    public final /* synthetic */ RemittanceBaseUI f205394a;

    public C70948t(RemittanceBaseUI remittanceBaseUI) {
        this.f205394a = remittanceBaseUI;
    }

    public void onVisibleStateChange(boolean z) {
        if (z) {
            RemittanceBaseUI remittanceBaseUI = this.f205394a;
            remittanceBaseUI.scrollToFormEditPosAfterShowTenPay(remittanceBaseUI.f204343B, remittanceBaseUI.f204393q, 30);
            return;
        }
        this.f205394a.f204343B.scrollTo(0, 0);
    }
}
