package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import b63.C67197o;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C51776w3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.o0 */
public class C43307o0 implements C87581a<Object, C89132b.C89134c<C51776w3>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f117143a;

    public C43307o0(C43313r0 r0Var, C46888b bVar) {
        this.f117143a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtPlanAddInteractor", "errCode: %s, errType: %s, resp: %s", Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), cVar.f256796d);
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            C51776w3 w3Var = (C51776w3) cVar.f256796d;
            Log.m105925i("MicroMsg.LqtPlanAddInteractor", "retCode: %s, retMsg: %s", Integer.valueOf(w3Var.f143840d), w3Var.f143841e);
            int i2 = w3Var.f143840d;
            if (i2 == 0) {
                this.f117143a.mo72093c(w3Var);
                return null;
            }
            this.f117143a.mo72091a(C67197o.m79488c(i2, w3Var.f143841e));
            return null;
        }
        this.f117143a.mo72091a(C67197o.m79487b(cVar.f256794b, i));
        return null;
    }
}
