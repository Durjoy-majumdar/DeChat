package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C49814i83;
import te3.C49960j83;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.d */
public class C43284d extends C75128o0<C49960j83> {
    public C43284d(String str) {
        C49814i83 i832 = new C49814i83();
        i832.f135169d = (int) System.currentTimeMillis();
        i832.f135170e = str;
        i832.f135171f = C71648n1.f207652a;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = i832;
        bVar.f127067b = new C49960j83();
        bVar.f127069d = 2896;
        bVar.f127068c = "/cgi-bin/mmpay-bin/lqtlqautoin/openlqautotrans";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Log.m105919d("MicroMsg.CgiLqtAutoChargeOpen", "pwd: %s", str);
    }
}
