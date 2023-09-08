package com.tencent.p014mm.plugin.mall.p075ui;

import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import te3.C51787w53;

/* renamed from: com.tencent.mm.plugin.mall.ui.a0 */
public class C42555a0 implements C87581a<Void, C89132b.C89134c<C51787w53>> {
    public C42555a0(MallWalletSectionCellView mallWalletSectionCellView) {
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.MallWalletSectionCellView", "lqtOnClickRedDotReq end, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a != 0 || cVar.f256794b != 0) {
            return null;
        }
        C71648n1.m84125c(((C51787w53) cVar.f256796d).f143867f);
        return null;
    }
}
