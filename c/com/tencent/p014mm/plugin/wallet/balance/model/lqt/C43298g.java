package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49069cz1;
import te3.C49206dz1;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.g */
public class C43298g extends C89132b<C49206dz1> {
    public C43298g(long j, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49069cz1();
        bVar.f127067b = new C49206dz1();
        bVar.f127069d = 5075;
        bVar.f127068c = "/cgi-bin/mmpay-bin/getdistributepreview";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C49069cz1 cz12 = (C49069cz1) a.f127055a.f127080a;
        cz12.f132039d = j;
        cz12.f132040e = i;
        cz12.f132041f = C71648n1.f207652a;
        mo123453j(a);
        Log.m105925i("MicroMsg.CgiLqtGetDistributePreview", "init amount: %s, scene: %s", Long.valueOf(j), Integer.valueOf(i));
    }
}
