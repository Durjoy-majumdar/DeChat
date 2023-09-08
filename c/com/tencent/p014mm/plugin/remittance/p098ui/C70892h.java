package com.tencent.p014mm.plugin.remittance.p098ui;

import com.tencent.p014mm.plugin.remittance.model.C42835a0;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.h */
public class C70892h implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ PersonalPayRemittanceUI f205303a;

    public C70892h(PersonalPayRemittanceUI personalPayRemittanceUI) {
        this.f205303a = personalPayRemittanceUI;
    }

    /* renamed from: a */
    public void mo2001a() {
        Log.m105924i("MicroMsg.PersonalPayRemittanceUI", "click pay button");
        this.f205303a.f204314s.alive();
        PersonalPayRemittanceUI personalPayRemittanceUI = this.f205303a;
        personalPayRemittanceUI.addSceneEndListener(4304);
        personalPayRemittanceUI.doSceneProgress(new C42835a0(personalPayRemittanceUI.f204302d, personalPayRemittanceUI.f204303e, personalPayRemittanceUI.f204304f), false);
        personalPayRemittanceUI.showLoading();
        C101218e0 e0Var = personalPayRemittanceUI.f204311p;
        if (e0Var != null) {
            personalPayRemittanceUI.f204313r = false;
            e0Var.mo140680z();
            personalPayRemittanceUI.f204311p = null;
        }
    }
}
