package p340fm;

import com.tencent.p014mm.autogen.events.SessionChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import ih0.C21093g;

/* renamed from: fm.s */
public class C32120s extends IStaticListener<SessionChangeEvent> {
    public boolean callback(IEvent iEvent) {
        SessionChangeEvent sessionChangeEvent = (SessionChangeEvent) iEvent;
        C21093g gVar = (C21093g) C86312j.m106911c(C21093g.class);
        gVar.getClass();
        if (sessionChangeEvent == null) {
            return false;
        }
        SessionChangeEvent.C28822a aVar = sessionChangeEvent.f78973d;
        if (aVar.f78976c != 0) {
            return false;
        }
        gVar.vx0(aVar.f78974a, aVar.f78975b);
        return false;
    }
}
