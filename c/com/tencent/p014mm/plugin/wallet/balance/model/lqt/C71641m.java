package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C50958qg3;
import te3.C77969n9;
import te3.C77978pg3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.m */
public class C71641m extends C75128o0<C50958qg3> {
    public C71641m(int i, C77969n9 n9Var, int i2, int i3, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77978pg3();
        bVar.f127067b = new C50958qg3();
        bVar.f127069d = 1324;
        bVar.f127068c = "/cgi-bin/mmpay-bin/preredeemfund";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C77978pg3 pg32 = (C77978pg3) a.f127055a.f127080a;
        pg32.f228019d = i;
        if (n9Var != null) {
            pg32.f228020e = 1;
            pg32.f228021f = n9Var;
        } else {
            pg32.f228020e = 0;
            pg32.f228021f = null;
        }
        pg32.f228022g = i2;
        pg32.f228023h = i3;
        pg32.f228024i = str;
        pg32.f228025j = C71648n1.f207652a;
        mo123453j(a);
    }
}
