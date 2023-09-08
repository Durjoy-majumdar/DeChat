package vh2;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import uh2.C111172e;
import uh2.C111175f;
import uh2.C111176g;
import uh2.C111177h;

/* renamed from: vh2.b */
public class C111514b extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C111175f.f332956d.f315408a.callback(checkResUpdateCacheFileEvent);
        C111176g.f332958d.f315408a.callback(checkResUpdateCacheFileEvent);
        C111172e.f332951b.f315408a.callback(checkResUpdateCacheFileEvent);
        C111177h.f332960d.f315408a.callback(checkResUpdateCacheFileEvent);
        return false;
    }
}
