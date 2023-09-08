package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import te3.gj4;
import xi2.C78842a;
import xi2.C78843b;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$l */
public class MobileRemitNumberInputUI$$l extends C78842a {

    /* renamed from: a */
    public final /* synthetic */ gj4 f203910a;

    /* renamed from: b */
    public final /* synthetic */ MobileRemitNumberInputUI f203911b;

    public MobileRemitNumberInputUI$$l(MobileRemitNumberInputUI mobileRemitNumberInputUI, gj4 gj4) {
        this.f203911b = mobileRemitNumberInputUI;
        this.f203910a = gj4;
    }

    /* renamed from: c */
    public void mo6028c(Object obj) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "wxname_chg_win dialog click jumpItem.action:exit");
        this.f203911b.mo97196H7();
    }

    /* renamed from: f */
    public void mo97200f(Object obj) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "wxname_chg_win dialog click jumpItem.action:continue");
        C78843b.m95367a(this.f203911b.getContext(), this.f203910a);
    }
}
