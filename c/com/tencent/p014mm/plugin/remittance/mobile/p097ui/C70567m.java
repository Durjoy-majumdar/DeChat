package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import qo3.C101218e0;
import te3.C64600o30;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.m */
public class C70567m implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C101218e0 f204028a;

    /* renamed from: b */
    public final /* synthetic */ MobileRemittanceUI f204029b;

    public C70567m(MobileRemittanceUI mobileRemittanceUI, C101218e0 e0Var) {
        this.f204029b = mobileRemittanceUI;
        this.f204028a = e0Var;
    }

    /* renamed from: a */
    public void mo2001a() {
        MobileRemittanceUI mobileRemittanceUI = this.f204029b;
        C64600o30 o302 = (C64600o30) ((ArrayList) mobileRemittanceUI.f203973n).get(mobileRemittanceUI.f203958S);
        Log.m105925i("MicroMsg.mobileRemit.MobileRemittanceUI", "DelayOption View click confirm! (code:%s option:%s)", Integer.valueOf(o302.f184613e), o302.f184612d);
        MobileRemittanceUI mobileRemittanceUI2 = this.f204029b;
        mobileRemittanceUI2.f203959T = mobileRemittanceUI2.f203958S;
        mobileRemittanceUI2.f203957R = o302.f184613e;
        mobileRemittanceUI2.f203953M.setText(o302.f184612d);
        this.f204028a.mo140680z();
    }
}
