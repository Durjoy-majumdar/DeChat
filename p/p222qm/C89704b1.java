package p222qm;

import com.tencent.p014mm.autogen.events.RetransmitMsgEvent;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: qm.b1 */
public class C89704b1 extends IStaticListener<RetransmitMsgEvent> {
    public boolean callback(IEvent iEvent) {
        RetransmitMsgEvent.C80736a aVar = ((RetransmitMsgEvent) iEvent).f236267d;
        C73313b1.m86457c(aVar.f236268a, aVar.f236269b, aVar.f236270c, aVar.f236271d, aVar.f236272e);
        return false;
    }
}
