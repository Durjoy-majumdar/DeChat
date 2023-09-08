package p756xt;

import b60.C28260e;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import f40.C86709a0;
import gy3.C87412m;
import y50.C66541q0;

/* renamed from: xt.k */
public final class C38828k extends IStaticListener<RevokeMsgEvent> {
    public boolean callback(IEvent iEvent) {
        RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
        C87412m.m108594g(revokeMsgEvent, "event");
        if (!C86709a0.m107522a() || revokeMsgEvent.f78943d.f78947d.getType() != 855638065) {
            return false;
        }
        String content = revokeMsgEvent.f78943d.f78947d.getContent();
        C87412m.m108593f(content, "event.data.rawMsgInfo.content");
        C68070l.C68072b u = C68070l.C68072b.m80422u(content, revokeMsgEvent.f78943d.f78947d.mo108775z2());
        if (u == null) {
            return false;
        }
        C28260e.m38144jo().mo55889d(Long.parseLong(((C66541q0) u.mo93555w(C66541q0.class)).f191394b));
        return false;
    }
}
