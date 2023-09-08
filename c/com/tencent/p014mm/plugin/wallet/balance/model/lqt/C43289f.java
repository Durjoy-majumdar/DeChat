package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C49198dx;
import te3.C49344ex;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.f */
public class C43289f extends C75128o0<C49344ex> {
    public C43289f(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49198dx();
        bVar.f127067b = new C49344ex();
        bVar.f127069d = 1386;
        bVar.f127068c = "/cgi-bin/mmpay-bin/closefundaccount";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C49198dx dxVar = (C49198dx) a.f127055a.f127080a;
        dxVar.f132553d = str;
        dxVar.f132554e = i;
        dxVar.f132555f = C71648n1.f207652a;
        mo123453j(a);
    }
}
