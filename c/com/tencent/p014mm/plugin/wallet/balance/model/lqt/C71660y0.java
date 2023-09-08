package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C78014xp3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.y0 */
public class C71660y0 implements C87581a<Void, C89132b.C89134c<C78014xp3>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f207683a;

    public C71660y0(C71615a1 a1Var, C46888b bVar) {
        this.f207683a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtSaveFetchInteractor", "on redeem fund finish, cgiBack: %s, errType: %s, errCode: %s", cVar, Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C78014xp3 xp32 = (C78014xp3) cVar.f256796d;
            Log.m105925i("MicroMsg.LqtSaveFetchInteractor", "on redeem fund finsih, retcode: %s, retmsg: %s", Integer.valueOf(xp32.f228521d), xp32.f228522e);
            if (xp32.f228533s != null) {
                WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new WCPayLqtSaveFetchUIShowDialogEvent();
                wCPayLqtSaveFetchUIShowDialogEvent.f107805d.f107806a = ((C78014xp3) cVar.f256796d).f228533s;
                wCPayLqtSaveFetchUIShowDialogEvent.publish();
            }
            if (xp32.f228521d == 0) {
                C71648n1.m84125c(xp32.f228534t);
                this.f207683a.mo72093c(xp32);
                C115669n.INSTANCE.idkeyStat(663, 12, 1, false);
            } else {
                C46888b bVar = this.f207683a;
                if (xp32.f228533s != null) {
                    xp32 = null;
                }
                bVar.mo72091a(xp32);
                C115669n.INSTANCE.idkeyStat(663, 13, 1, false);
            }
        } else {
            this.f207683a.mo72091a(Boolean.FALSE);
            C115669n.INSTANCE.idkeyStat(663, 14, 1, false);
        }
        return null;
    }
}
