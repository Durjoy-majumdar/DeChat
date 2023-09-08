package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C50001jj3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.e1 */
public class C43288e1 implements C87581a<Void, C89132b.C89134c<C50001jj3>> {

    /* renamed from: a */
    public final /* synthetic */ C71624d1 f117124a;

    public C43288e1(C71624d1 d1Var) {
        this.f117124a = d1Var;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtSaveFetchLogic", "CgiPurchaseFromBankGuide end, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C71648n1.m84125c(((C50001jj3) cVar.f256796d).f136160f);
        }
        C46888b bVar = this.f117124a.f207613l;
        if (bVar == null) {
            return null;
        }
        bVar.resume();
        return null;
    }
}
