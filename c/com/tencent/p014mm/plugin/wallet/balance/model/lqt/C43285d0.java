package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C51787w53;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.d0 */
public class C43285d0 implements C87581a<Void, C89132b.C89134c<C51787w53>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f117123a;

    public C43285d0(C43287e0 e0Var, C46888b bVar) {
        this.f117123a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtDetailInteractor", "lqtOnClickRedDotReq end, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C71648n1.m84125c(((C51787w53) cVar.f256796d).f143867f);
        }
        C46888b bVar = this.f117123a;
        if (bVar == null) {
            return null;
        }
        bVar.resume();
        return null;
    }
}
