package com.tencent.p014mm.plugin.remittance.p098ui;

import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ie3.C76331i;
import q43.C77302a;
import qo3.C101218e0;
import te3.C49879ip;

/* renamed from: com.tencent.mm.plugin.remittance.ui.d */
public class C42870d implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ C49879ip f116086a;

    /* renamed from: b */
    public final /* synthetic */ F2FAppBrandRemittanceUI f116087b;

    public C42870d(F2FAppBrandRemittanceUI f2FAppBrandRemittanceUI, C49879ip ipVar) {
        this.f116087b = f2FAppBrandRemittanceUI;
        this.f116086a = ipVar;
    }

    /* renamed from: a */
    public void mo2001a() {
        Log.m105925i("MicroMsg.F2FAppBrandRemittanceUI", "go to remittaneUI，appid：%s", this.f116087b.f116060d);
        this.f116087b.f116066j.alive();
        C77302a aVar = new C77302a();
        F2FAppBrandRemittanceUI f2FAppBrandRemittanceUI = this.f116087b;
        aVar.f225422a = f2FAppBrandRemittanceUI.f116060d;
        C76331i.m91764h(f2FAppBrandRemittanceUI.getContext(), 1, this.f116086a.f135561g, 56, aVar, (Bundle) null);
        C115669n.INSTANCE.mo160131h(19821, 2, this.f116087b.f116060d, 0);
    }
}
