package on3;

import com.tencent.p014mm.autogen.events.RevokeNativeMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import nn3.C76946a;

/* renamed from: on3.k */
public final class C35237k extends IStaticListener<RevokeNativeMsgEvent> {
    public boolean callback(IEvent iEvent) {
        RevokeNativeMsgEvent revokeNativeMsgEvent = (RevokeNativeMsgEvent) iEvent;
        C87412m.m108594g(revokeNativeMsgEvent, "event");
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(revokeNativeMsgEvent.f78950d.f78951a);
        long y2 = b002.mo108774y2();
        Log.m105925i("MicroMsg.TopMsgRevokeNativeMessageListener", "revokeNativeMsg callback srvId:%s", Long.valueOf(y2));
        if (y2 != 0) {
            C77022f xx02 = ((C77029o) C86312j.m106911c(C77029o.class)).xx0(b002.mo108768t());
            if (xx02 != null) {
                xx02.mo107343a(y2);
            }
            C76946a.f224861a.mo107274a(6, y2);
        }
        return false;
    }
}
