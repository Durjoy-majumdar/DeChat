package com.tencent.p014mm.plugin.wallet_core.p125ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import te3.C52150yp1;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.r0 */
public class C43411r0 implements C87581a<Object, C89132b.C89134c<C52150yp1>> {
    public C43411r0(WalletOrderInfoNewUI walletOrderInfoNewUI) {
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a != 0 || cVar.f256794b != 0) {
            return null;
        }
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "retCode: %s, retMsg: %s", Integer.valueOf(((C52150yp1) cVar.f256796d).f145452d), ((C52150yp1) cVar.f256796d).f145453e);
        return null;
    }
}
