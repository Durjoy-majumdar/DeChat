package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C64810wp3;
import te3.C78014xp3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.q */
public class C57478q extends C75128o0<C78014xp3> implements C45119n {
    public C57478q(int i, String str, String str2, int i2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64810wp3();
        bVar.f127067b = new C78014xp3();
        bVar.f127069d = 1338;
        bVar.f127068c = "/cgi-bin/mmpay-bin/redeemfund";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C64810wp3 wp32 = (C64810wp3) a.f127055a.f127080a;
        wp32.f186155d = i;
        wp32.f186157f = str;
        wp32.f186156e = str2;
        wp32.f186158g = i2;
        wp32.f186159h = str3;
        wp32.f186160i = C71648n1.f207652a;
        mo123453j(a);
    }
}
