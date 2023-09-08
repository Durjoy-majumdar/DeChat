package qi2;

import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import oi2.C77010f;
import vi2.C78418c;

/* renamed from: qi2.i */
public class C35899i extends IStaticListener<RevokeMsgEvent> {
    public boolean callback(IEvent iEvent) {
        RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
        Log.m105924i("RevokeMsgListener", "receive revoke msg");
        C77010f.vx0().Bx0(revokeMsgEvent.f78943d.f78946c.mo108768t(), revokeMsgEvent.f78943d.f78946c, (C78418c) null);
        return false;
    }
}
