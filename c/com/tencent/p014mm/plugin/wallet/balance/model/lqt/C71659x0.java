package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C78005vk3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.x0 */
public class C71659x0 implements C87581a<Void, C89132b.C89134c<C78005vk3>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f207682a;

    public C71659x0(C71615a1 a1Var, C46888b bVar) {
        this.f207682a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtSaveFetchInteractor", "on qry purchase result finish, cgiBack: %s, errType: %s, errCode: %s", cVar, Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C78005vk3 vk32 = (C78005vk3) cVar.f256796d;
            Log.m105925i("MicroMsg.LqtSaveFetchInteractor", "on qry purchase result finsih, retcode: %s, retmsg: %s, purchase_state: %s", Integer.valueOf(vk32.f228317d), vk32.f228318e, Integer.valueOf(vk32.f228319f));
            if (vk32.f228325o != null) {
                WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new WCPayLqtSaveFetchUIShowDialogEvent();
                wCPayLqtSaveFetchUIShowDialogEvent.f107805d.f107806a = ((C78005vk3) cVar.f256796d).f228325o;
                wCPayLqtSaveFetchUIShowDialogEvent.publish();
            }
            if (vk32.f228317d == 0) {
                C71648n1.m84125c(vk32.f228326p);
                this.f207682a.mo72093c(vk32);
                C115669n.INSTANCE.idkeyStat(663, 6, 1, false);
            } else {
                this.f207682a.mo72091a(vk32.f228325o != null ? null : vk32.f228318e);
                C115669n.INSTANCE.idkeyStat(663, 7, 1, false);
            }
        } else {
            this.f207682a.mo72091a(Boolean.FALSE);
            C115669n.INSTANCE.idkeyStat(663, 8, 1, false);
        }
        return null;
    }
}
