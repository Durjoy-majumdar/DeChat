package p340fm;

import com.tencent.p014mm.autogen.events.FindMoreFriendEntryRedDotEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import ih0.C33327c;
import ih0.C33329e;
import zt3.C119157j;

/* renamed from: fm.o */
public class C32110o extends IStaticListener<FindMoreFriendEntryRedDotEvent> {
    public boolean callback(IEvent iEvent) {
        C33329e xx02 = C33329e.xx0();
        xx02.getClass();
        ((C119157j) C119157j.f356862d).mo183876g(new C33327c(xx02, (FindMoreFriendEntryRedDotEvent) iEvent), "Ai_thread");
        return false;
    }
}
