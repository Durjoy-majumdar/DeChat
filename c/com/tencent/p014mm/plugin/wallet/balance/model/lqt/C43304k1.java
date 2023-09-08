package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C88643g;
import te3.C50958qg3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.k1 */
public class C43304k1 implements C87581a<Void, C50958qg3> {

    /* renamed from: a */
    public final /* synthetic */ C71624d1 f117140a;

    public C43304k1(C71624d1 d1Var) {
        this.f117140a = d1Var;
    }

    public Object call(Object obj) {
        C50958qg3 qg32 = (C50958qg3) obj;
        Log.m105925i("MicroMsg.LqtSaveFetchLogic", "%s pre redeem finish: %s", Integer.valueOf(this.f117140a.hashCode()), qg32);
        this.f117140a.f207603b.hideLoading();
        this.f117140a.f207613l = C88643g.m110544b();
        this.f117140a.f207613l.mo72092b();
        C71624d1 d1Var = this.f117140a;
        d1Var.f207608g = qg32.f140311f;
        if (qg32.f140309d != 0) {
            return null;
        }
        d1Var.mo98809a();
        return null;
    }
}
