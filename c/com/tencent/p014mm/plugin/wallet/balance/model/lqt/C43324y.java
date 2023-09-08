package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.autogen.events.WCPayLqtDetailUIShowDialogEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C78023zk3;
import ub3.C78144b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.y */
public class C43324y implements C87581a<Void, C89132b.C89134c<C78023zk3>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f117161a;

    public C43324y(C43287e0 e0Var, C46888b bVar) {
        this.f117161a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtDetailInteractor", "on qryusrfunddetail finish, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C78023zk3 zk32 = (C78023zk3) cVar.f256796d;
            Log.m105925i("MicroMsg.LqtDetailInteractor", "on qryusrfunddetail finsih, retcode: %s, retmsg: %s", Integer.valueOf(zk32.f228723d), zk32.f228724e);
            if (zk32.f228713T0 != null) {
                WCPayLqtDetailUIShowDialogEvent wCPayLqtDetailUIShowDialogEvent = new WCPayLqtDetailUIShowDialogEvent();
                wCPayLqtDetailUIShowDialogEvent.f107803d.f107804a = zk32.f228713T0;
                wCPayLqtDetailUIShowDialogEvent.publish();
            }
            if (zk32.f228723d == 0) {
                C71648n1.m84125c(zk32.f228715U0);
                ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_NEW_LQT_LONG_SYNC, Long.valueOf((long) zk32.f228725f));
                this.f117161a.mo72093c(zk32);
                C115669n.INSTANCE.idkeyStat(663, 0, 1, false);
            } else {
                this.f117161a.mo72091a(zk32.f228713T0 != null ? null : zk32.f228724e);
                C115669n.INSTANCE.idkeyStat(663, 1, 1, false);
            }
        } else {
            this.f117161a.mo72091a(Boolean.FALSE);
            C115669n.INSTANCE.idkeyStat(663, 2, 1, false);
        }
        return null;
    }
}
