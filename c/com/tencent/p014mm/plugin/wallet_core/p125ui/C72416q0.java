package com.tencent.p014mm.plugin.wallet_core.p125ui;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import te3.tk4;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.q0 */
public class C72416q0 implements C87581a<Object, C89132b.C89134c<tk4>> {

    /* renamed from: a */
    public final /* synthetic */ WalletOrderInfoNewUI f210660a;

    public C72416q0(WalletOrderInfoNewUI walletOrderInfoNewUI) {
        this.f210660a = walletOrderInfoNewUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        WalletOrderInfoNewUI walletOrderInfoNewUI = this.f210660a;
        walletOrderInfoNewUI.f210148t1 = null;
        walletOrderInfoNewUI.f210118b1.setVisibility(8);
        walletOrderInfoNewUI.f210116Z0.setVisibility(0);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "retCode: %s, retMsg: %s", Integer.valueOf(((tk4) cVar.f256796d).f142267d), ((tk4) cVar.f256796d).f142268e);
            if (((tk4) cVar.f256796d).f142267d == 0) {
                WalletOrderInfoNewUI walletOrderInfoNewUI2 = this.f210660a;
                walletOrderInfoNewUI2.f210131k1 = false;
                walletOrderInfoNewUI2.f210152v1 = 1;
                walletOrderInfoNewUI2.mo99598X7();
                C115669n nVar = C115669n.INSTANCE;
                WalletOrderInfoNewUI walletOrderInfoNewUI3 = this.f210660a;
                nVar.mo160131h(17270, walletOrderInfoNewUI3.f210138p, walletOrderInfoNewUI3.f210126h1.f226718r.f226729q, 2, 1, 2, Long.valueOf(System.currentTimeMillis()));
            } else {
                C115669n nVar2 = C115669n.INSTANCE;
                WalletOrderInfoNewUI walletOrderInfoNewUI4 = this.f210660a;
                nVar2.mo160131h(17270, walletOrderInfoNewUI4.f210138p, walletOrderInfoNewUI4.f210126h1.f226718r.f226729q, 2, 2, 2, Long.valueOf(System.currentTimeMillis()));
            }
        } else {
            C115669n nVar3 = C115669n.INSTANCE;
            WalletOrderInfoNewUI walletOrderInfoNewUI5 = this.f210660a;
            nVar3.mo160131h(17270, walletOrderInfoNewUI5.f210138p, walletOrderInfoNewUI5.f210126h1.f226718r.f226729q, 2, 2, 2, Long.valueOf(System.currentTimeMillis()));
        }
        return null;
    }
}
