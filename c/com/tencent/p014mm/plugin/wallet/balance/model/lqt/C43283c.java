package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49210e03;
import te3.C49357f03;
import te3.kg4;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.c */
public class C43283c extends C89132b<C49357f03> {
    public C43283c(kg4 kg4) {
        C49210e03 e032 = new C49210e03();
        e032.f132610f = kg4;
        e032.f132608d = (int) System.currentTimeMillis();
        e032.f132611g = C71648n1.f207652a;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = e032;
        bVar.f127067b = new C49357f03();
        bVar.f127069d = 1640;
        bVar.f127068c = "/cgi-bin/mmpay-bin/lqtlqautoin/modifytrantime";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        mo123453j(bVar.mo72403a());
        Object[] objArr = new Object[1];
        objArr[0] = kg4 != null ? Integer.valueOf(kg4.f136782d) : "null";
        Log.m105925i("MicroMsg.CgiLqtAutoChargeModifyTime", "modify time: %s", objArr);
    }
}
