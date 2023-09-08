package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C77964lj3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.w0 */
public class C71658w0 implements C87581a<Void, C89132b.C89134c<C77964lj3>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f207681a;

    public C71658w0(C71615a1 a1Var, C46888b bVar) {
        this.f207681a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtSaveFetchInteractor", "on purchaseFund finish, cgiBack: %s, errType: %s, errCode: %s", cVar, Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C77964lj3 lj32 = (C77964lj3) cVar.f256796d;
            Log.m105925i("MicroMsg.LqtSaveFetchInteractor", "on purchaseFund finsih, retcode: %s, retmsg: %s, prepayid: %s, out_trade_no: %s", Integer.valueOf(lj32.f227814d), lj32.f227815e, lj32.f227816f, lj32.f227817g);
            if (lj32.f227820j != null) {
                WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new WCPayLqtSaveFetchUIShowDialogEvent();
                wCPayLqtSaveFetchUIShowDialogEvent.f107805d.f107806a = ((C77964lj3) cVar.f256796d).f227820j;
                wCPayLqtSaveFetchUIShowDialogEvent.publish();
            }
            if (lj32.f227814d == 0) {
                C71648n1.m84125c(lj32.f227821n);
                this.f207681a.mo72093c(cVar.f256796d);
                C115669n.INSTANCE.idkeyStat(663, 3, 1, false);
            } else {
                this.f207681a.mo72091a(lj32.f227820j != null ? null : lj32.f227815e);
                C115669n.INSTANCE.idkeyStat(664, 4, 1, false);
            }
        } else {
            this.f207681a.mo72091a(Boolean.FALSE);
            C115669n.INSTANCE.idkeyStat(664, 5, 1, false);
        }
        return null;
    }
}
