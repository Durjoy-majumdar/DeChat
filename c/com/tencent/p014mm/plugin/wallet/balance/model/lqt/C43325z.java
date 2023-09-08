package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import com.tencent.p014mm.autogen.events.WCPayLqtDetailUIShowDialogEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C49344ex;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.z */
public class C43325z implements C87581a<Void, C89132b.C89134c<C49344ex>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f117162a;

    /* renamed from: b */
    public final /* synthetic */ C43287e0 f117163b;

    public C43325z(C43287e0 e0Var, C46888b bVar) {
        this.f117163b = e0Var;
        this.f117162a = bVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.LqtDetailInteractor", "on close lqt account finish, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        this.f117163b.getClass();
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_LQT_OPEN_FLAG_INT_SYNC, -1);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_LQT_ENTRY_WORDING_STRING_SYNC, (Object) null);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C49344ex exVar = (C49344ex) cVar.f256796d;
            Log.m105925i("MicroMsg.LqtDetailInteractor", "on close lqt account finsih, retcode: %s, retmsg: %s", Integer.valueOf(exVar.f133151d), exVar.f133152e);
            if (exVar.f133153f != null) {
                WCPayLqtDetailUIShowDialogEvent wCPayLqtDetailUIShowDialogEvent = new WCPayLqtDetailUIShowDialogEvent();
                wCPayLqtDetailUIShowDialogEvent.f107803d.f107804a = exVar.f133153f;
                wCPayLqtDetailUIShowDialogEvent.publish();
            }
            if (exVar.f133151d == 0) {
                C71648n1.m84125c(exVar.f133154g);
                this.f117162a.mo72093c(exVar);
                C115669n.INSTANCE.idkeyStat(663, 15, 1, false);
            } else {
                this.f117162a.mo72091a(exVar.f133153f != null ? null : exVar.f133152e);
                C115669n.INSTANCE.idkeyStat(663, 16, 1, false);
            }
        } else {
            this.f117162a.mo72091a(Boolean.FALSE);
            C115669n.INSTANCE.idkeyStat(663, 17, 1, false);
        }
        return null;
    }
}
