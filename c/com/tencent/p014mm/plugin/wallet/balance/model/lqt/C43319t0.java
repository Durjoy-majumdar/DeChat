package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import b63.C67197o;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C50734ou2;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.t0 */
public class C43319t0 implements C87581a<Object, C89132b.C89134c<C50734ou2>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f117157a;

    public C43319t0(C43321u0 u0Var, C46888b bVar) {
        this.f117157a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtPlanHomeInteractor", "errCode: %s, errType: %s, resp: %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), cVar.f256796d);
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            C50734ou2 ou22 = (C50734ou2) cVar.f256796d;
            Log.m105925i("MicroMsg.LqtPlanHomeInteractor", "retCode: %s, retMsg: %s", Integer.valueOf(ou22.f139368d), ou22.f139369e);
            int i2 = ou22.f139368d;
            if (i2 == 0) {
                this.f117157a.mo72093c(ou22);
                return null;
            }
            this.f117157a.mo72091a(C67197o.m79488c(i2, ou22.f139369e));
            return null;
        }
        this.f117157a.mo72091a(C67197o.m79487b(cVar.f256794b, i));
        return null;
    }
}
