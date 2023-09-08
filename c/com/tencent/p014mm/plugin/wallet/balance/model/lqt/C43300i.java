package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C48935c03;
import te3.C49074d03;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.i */
public class C43300i extends C75128o0<C49074d03> {
    public C43300i(int i, String str, String str2, String str3, long j, int i2, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48935c03();
        bVar.f127067b = new C49074d03();
        bVar.f127069d = 2614;
        bVar.f127068c = "/cgi-bin/mmpay-bin/modifyplan";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C48935c03 c032 = (C48935c03) a.f127055a.f127080a;
        c032.f131425d = i;
        c032.f131426e = str;
        c032.f131427f = str2;
        c032.f131428g = str3;
        c032.f131429h = j;
        c032.f131430i = i2;
        c032.f131431j = str4;
        mo123453j(a);
        Log.m105925i("MicroMsg.CgiLqtModifyPlan", "plan_id: %s, card_tail: %s, amount: %s, day: %s", Integer.valueOf(i), str2, Long.valueOf(j), Integer.valueOf(i2));
    }
}
