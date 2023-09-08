package p678rq;

import com.tencent.p014mm.autogen.events.SessionEdgeSqlChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import o81.C117715c;
import o81.C117724j;

/* renamed from: rq.c */
public class C36438c extends IStaticListener<SessionEdgeSqlChangeEvent> {
    public boolean callback(IEvent iEvent) {
        C117715c wx02 = C117715c.wx0();
        wx02.f352043g.post(new C117724j(wx02, (SessionEdgeSqlChangeEvent) iEvent));
        return false;
    }
}
