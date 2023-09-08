package on3;

import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gy3.C87412m;
import nn3.C76946a;

/* renamed from: on3.i */
public final class C35235i extends IStaticListener<RevokeMsgEvent> {
    public boolean callback(IEvent iEvent) {
        RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
        C87412m.m108594g(revokeMsgEvent, "event");
        RevokeMsgEvent.C28810a aVar = revokeMsgEvent.f78943d;
        C72963f4 f4Var = aVar.f78946c;
        long j = aVar.f78948e;
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(f4Var != null);
        objArr[1] = Long.valueOf(j);
        Log.m105925i("MicroMsg.TopMsgRevokeMsgListener", "revokeMsg callback msgInfoNotNull:%s srvId:%s", objArr);
        if (!(f4Var == null || j == 0)) {
            C77022f xx02 = ((C77029o) C86312j.m106911c(C77029o.class)).xx0(f4Var.mo108768t());
            if (xx02 != null) {
                xx02.mo107343a(j);
            }
            C76946a.f224861a.mo107274a(6, j);
        }
        return false;
    }
}
