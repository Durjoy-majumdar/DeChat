package p730vu;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import f40.C86709a0;
import t72.C118391i;
import zt3.C119157j;

/* renamed from: vu.e */
public class C37835e extends IStaticListener<PostSyncTaskEvent> {
    public boolean callback(IEvent iEvent) {
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        if (!C86709a0.m107522a()) {
            return false;
        }
        int i = C118391i.f353823D;
        C118391i iVar = (C118391i) C86312j.m106911c(C118391i.class);
        iVar.f353844y.mo97819a();
        ((C119157j) C119157j.f356862d).mo183878i(iVar.f353844y, 3000);
        return false;
    }
}
