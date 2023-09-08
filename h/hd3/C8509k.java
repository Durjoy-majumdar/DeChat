package hd3;

import com.tencent.p014mm.autogen.events.FinderSendMsgEvent;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import d62.C7250m;
import d62.C97425j;
import eb0.C45628s0;

/* renamed from: hd3.k */
public class C8509k extends IStaticListener<FinderSendMsgEvent> {
    public boolean callback(IEvent iEvent) {
        FinderSendMsgEvent finderSendMsgEvent = (FinderSendMsgEvent) iEvent;
        FinderSendMsgEvent.C1060a aVar = finderSendMsgEvent.f9242d;
        C72695v.m85049B(aVar.f9243a, "", "", aVar.f9244b, aVar.f9245c, (String) null);
        C97425j a = C7250m.m7431a();
        FinderSendMsgEvent.C1060a aVar2 = finderSendMsgEvent.f9242d;
        String str = aVar2.f9244b;
        a.mo136257Tm(str, aVar2.f9246d, C45628s0.m50810y(str), 0);
        return false;
    }
}
