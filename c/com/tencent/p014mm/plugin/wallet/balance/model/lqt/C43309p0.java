package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import b63.C67197o;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C49074d03;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.p0 */
public class C43309p0 implements C87581a<Object, C89132b.C89134c<C49074d03>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f117145a;

    public C43309p0(C43313r0 r0Var, C46888b bVar) {
        this.f117145a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtPlanAddInteractor", "errCode: %s, errType: %s, resp: %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), cVar.f256796d);
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            C49074d03 d032 = (C49074d03) cVar.f256796d;
            Log.m105925i("MicroMsg.LqtPlanAddInteractor", "retCode: %s, retMsg: %s", Integer.valueOf(d032.f132052d), d032.f132053e);
            int i2 = d032.f132052d;
            if (i2 == 0) {
                this.f117145a.mo72093c(d032);
                return null;
            }
            this.f117145a.mo72091a(C67197o.m79488c(i2, d032.f132053e));
            return null;
        }
        this.f117145a.mo72091a(C67197o.m79487b(cVar.f256794b, i));
        return null;
    }
}
