package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C49558gg3;
import te3.C49703hg3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.l */
public class C43305l extends C75128o0<C49703hg3> {

    /* renamed from: p */
    public int f117141p;

    public C43305l(int i, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49558gg3();
        bVar.f127067b = new C49703hg3();
        bVar.f127069d = 1770;
        bVar.f127068c = "/cgi-bin/mmpay-bin/preaddplan";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C49558gg3 gg32 = (C49558gg3) a.f127055a.f127080a;
        gg32.f134039d = i;
        gg32.f134040e = i2;
        mo123453j(a);
        this.f117141p = i;
        Log.m105925i("MicroMsg.CgiLqtPreAddPlan", "scene: %s, planId: %s", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
