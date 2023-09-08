package p678rq;

import com.tencent.p014mm.autogen.events.SessionEdgeScriptChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import o81.C117715c;
import o81.C117723i;

/* renamed from: rq.a */
public class C36435a extends IStaticListener<SessionEdgeScriptChangeEvent> {
    public boolean callback(IEvent iEvent) {
        C117715c wx02 = C117715c.wx0();
        wx02.f352043g.post(new C117723i(wx02, (SessionEdgeScriptChangeEvent) iEvent));
        return false;
    }
}
