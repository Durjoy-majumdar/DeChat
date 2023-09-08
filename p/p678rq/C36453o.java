package p678rq;

import com.tencent.p014mm.autogen.events.NewEdgeSqlDeleteEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import o81.C117715c;
import o81.C117722h;

/* renamed from: rq.o */
public class C36453o extends IStaticListener<NewEdgeSqlDeleteEvent> {
    public boolean callback(IEvent iEvent) {
        C117715c wx02 = C117715c.wx0();
        wx02.f352043g.post(new C117722h(wx02, (NewEdgeSqlDeleteEvent) iEvent));
        return false;
    }
}
