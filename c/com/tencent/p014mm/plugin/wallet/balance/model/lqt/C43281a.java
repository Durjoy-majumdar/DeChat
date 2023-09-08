package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C51637v3;
import te3.C51776w3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.a */
public class C43281a extends C75128o0<C51776w3> {
    public C43281a(String str, String str2, String str3, String str4, long j, int i, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51637v3();
        bVar.f127067b = new C51776w3();
        bVar.f127069d = 2780;
        bVar.f127068c = "/cgi-bin/mmpay-bin/addplan";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C51637v3 v3Var = (C51637v3) a.f127055a.f127080a;
        v3Var.f143276i = str;
        v3Var.f143272e = str2;
        v3Var.f143273f = str3;
        v3Var.f143274g = str4;
        v3Var.f143271d = j;
        v3Var.f143275h = i;
        v3Var.f143277j = i2;
        mo123453j(a);
        Log.m105925i("MicroMsg.CgiLqtAddPlan", "card_tail: %s, amount: %s, day: %s, planId: %s", str3, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2));
    }
}
