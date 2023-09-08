package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C50595nu2;
import te3.C50734ou2;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.h */
public class C43299h extends C75128o0<C50734ou2> {
    public C43299h(int i, int i2, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50595nu2();
        bVar.f127067b = new C50734ou2();
        bVar.f127069d = 2507;
        bVar.f127068c = "/cgi-bin/mmpay-bin/manageplan";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C50595nu2 nu22 = (C50595nu2) a.f127055a.f127080a;
        nu22.f138780d = i;
        nu22.f138781e = i2;
        nu22.f138782f = str;
        mo123453j(a);
        Log.m105925i("MicroMsg.CgiLqtManagePlan", "type: %s, planId: %s", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
