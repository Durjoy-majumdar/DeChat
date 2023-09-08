package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C50047jx;
import te3.C50188kx;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.b */
public class C43282b extends C75128o0<C50188kx> {
    public C43282b(String str) {
        C50047jx jxVar = new C50047jx();
        jxVar.f136365e = str;
        jxVar.f136364d = (int) System.currentTimeMillis();
        jxVar.f136366f = C71648n1.f207652a;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = jxVar;
        bVar.f127067b = new C50188kx();
        bVar.f127069d = 2512;
        bVar.f127068c = "/cgi-bin/mmpay-bin/lqtlqautoin/closeautolqtolqt";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105918d("MicroMsg.CgiLqtAutoChargeClose", "close ");
    }
}
