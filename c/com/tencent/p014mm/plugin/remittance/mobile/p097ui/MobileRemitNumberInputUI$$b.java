package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import te3.gj4;
import xi2.C78842a;
import xi2.C78843b;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$b */
public class MobileRemitNumberInputUI$$b extends C78842a {

    /* renamed from: a */
    public final /* synthetic */ gj4 f203895a;

    /* renamed from: b */
    public final /* synthetic */ MobileRemitNumberInputUI f203896b;

    public MobileRemitNumberInputUI$$b(MobileRemitNumberInputUI mobileRemitNumberInputUI, gj4 gj4) {
        this.f203896b = mobileRemitNumberInputUI;
        this.f203895a = gj4;
    }

    /* renamed from: c */
    public void mo6028c(Object obj) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "jump_win dialog click jumpItem.action:exit");
        this.f203896b.mo97196H7();
    }

    /* renamed from: f */
    public void mo97200f(Object obj) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "jump_win dialog click jumpItem.action:continue");
        C78843b.m95367a(this.f203896b.getContext(), this.f203895a);
    }
}
