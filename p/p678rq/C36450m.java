package p678rq;

import com.tencent.p014mm.autogen.events.NewEdgeScriptUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import o81.C117715c;
import o81.C117719e;

/* renamed from: rq.m */
public class C36450m extends IStaticListener<NewEdgeScriptUpdateEvent> {
    public boolean callback(IEvent iEvent) {
        C117715c wx02 = C117715c.wx0();
        wx02.f352043g.post(new C117719e(wx02, (NewEdgeScriptUpdateEvent) iEvent));
        return false;
    }
}
