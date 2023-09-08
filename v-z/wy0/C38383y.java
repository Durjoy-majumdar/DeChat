package wy0;

import com.tencent.p014mm.autogen.events.DeleteMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import gy3.C87412m;

/* renamed from: wy0.y */
public final class C38383y extends IStaticListener<DeleteMsgEvent> {
    public boolean callback(IEvent iEvent) {
        DeleteMsgEvent deleteMsgEvent = (DeleteMsgEvent) iEvent;
        C87412m.m108594g(deleteMsgEvent, "event");
        DeleteMsgEvent.C28727a aVar = deleteMsgEvent.f78765d;
        long j = aVar.f78766a;
        String str = aVar.f78767b;
        if (j > 0) {
            C102506a.f301832a.mo142123h(j);
            return true;
        } else if (str != null) {
            C102519e.m135322d(new C38381w(str));
            return true;
        } else {
            C102519e.m135322d(C38382x.f101268d);
            return true;
        }
    }
}
