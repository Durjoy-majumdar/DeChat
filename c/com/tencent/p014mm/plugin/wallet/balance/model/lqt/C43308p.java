package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.wallet_core.model.C75128o0;
import ob0.C47350c;
import te3.C52130yk3;
import te3.C78023zk3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.p */
public class C43308p extends C75128o0<C78023zk3> {

    /* renamed from: p */
    public C52130yk3 f117144p = null;

    public C43308p() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52130yk3();
        bVar.f127067b = new C78023zk3();
        bVar.f127069d = 1211;
        bVar.f127068c = "/cgi-bin/mmpay-bin/qryusrfunddetail";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C52130yk3 yk32 = (C52130yk3) bVar.mo72403a().f127055a.f127080a;
        this.f117144p = yk32;
        yk32.f145346d = (int) System.currentTimeMillis();
        this.f117144p.f145347e = C71648n1.f207652a;
        mo123453j(bVar.mo72403a());
    }
}
