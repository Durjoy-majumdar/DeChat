package p670qx;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import p655px.C35713i;
import zt3.C119157j;

/* renamed from: qx.t */
public class C36168t extends IStaticListener<PostSyncTaskEvent> {
    public boolean callback(IEvent iEvent) {
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        ((C119157j) C119157j.f356862d).mo183876g(new C35713i(), "SIRWorker");
        return false;
    }
}
