package p678rq;

import com.tencent.p014mm.autogen.events.NewEdgeScriptDeleteEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import o81.C117715c;
import o81.C117720f;

/* renamed from: rq.k */
public class C36447k extends IStaticListener<NewEdgeScriptDeleteEvent> {
    public boolean callback(IEvent iEvent) {
        C117715c wx02 = C117715c.wx0();
        wx02.f352043g.post(new C117720f(wx02, (NewEdgeScriptDeleteEvent) iEvent));
        return false;
    }
}
