package com.tencent.p014mm.plugin.remittance.p098ui;

import android.view.View;
import com.tencent.p014mm.p136ui.C7063x;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.g */
public class C70890g extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ PersonalPayRemittanceUI f205302g;

    public C70890g(PersonalPayRemittanceUI personalPayRemittanceUI) {
        this.f205302g = personalPayRemittanceUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        this.f205302g.f204311p.mo140680z();
        PersonalPayRemittanceUI personalPayRemittanceUI = this.f205302g;
        personalPayRemittanceUI.f204311p = null;
        personalPayRemittanceUI.f204313r = true;
        personalPayRemittanceUI.mo97264I7(C7063x.CANCEL, "");
    }
}
