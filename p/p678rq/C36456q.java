package p678rq;

import com.tencent.p014mm.autogen.events.NewEdgeSqlUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import o81.C117715c;
import o81.C117721g;

/* renamed from: rq.q */
public class C36456q extends IStaticListener<NewEdgeSqlUpdateEvent> {
    public boolean callback(IEvent iEvent) {
        C117715c wx02 = C117715c.wx0();
        wx02.f352043g.post(new C117721g(wx02, (NewEdgeSqlUpdateEvent) iEvent));
        return false;
    }
}
