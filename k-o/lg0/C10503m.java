package lg0;

import com.tencent.p014mm.autogen.events.GetMFriendEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import f40.C86709a0;
import hg0.C76173n0;
import te3.C64568n32;

/* renamed from: lg0.m */
public class C10503m extends IStaticListener<GetMFriendEvent> {
    public boolean callback(IEvent iEvent) {
        GetMFriendEvent getMFriendEvent = (GetMFriendEvent) iEvent;
        if (!(getMFriendEvent instanceof GetMFriendEvent)) {
            return false;
        }
        int i = getMFriendEvent.f9301d.f9302a;
        C76173n0 n0Var = new C76173n0();
        ((C64568n32) n0Var.f223166d.f127055a.f127080a).f184429j = i;
        C86709a0.m107524d().mo123460f(n0Var);
        return false;
    }
}
