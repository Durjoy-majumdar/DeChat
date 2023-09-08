package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C51347t53;
import te3.C78002u53;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.j */
public class C43301j extends C75128o0<C78002u53> {
    public C43301j(int i, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51347t53();
        bVar.f127067b = new C78002u53();
        bVar.f127069d = 2585;
        bVar.f127068c = "/cgi-bin/mmpay-bin/onclickpurchase";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C51347t53 t532 = (C51347t53) a.f127055a.f127080a;
        t532.f141968d = i;
        t532.f141969e = i2;
        t532.f141973i = C71648n1.f207652a;
        mo123453j(a);
    }

    public C43301j(int i, int i2, long j) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51347t53();
        bVar.f127067b = new C78002u53();
        bVar.f127069d = 2585;
        bVar.f127068c = "/cgi-bin/mmpay-bin/onclickpurchase";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C51347t53 t532 = (C51347t53) a.f127055a.f127080a;
        t532.f141968d = i;
        t532.f141969e = i2;
        t532.f141973i = C71648n1.f207652a;
        if (j > 0) {
            t532.f141972h = j;
        }
        mo123453j(a);
    }
}
