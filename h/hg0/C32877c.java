package hg0;

import com.tencent.p014mm.autogen.events.BindQQEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C8233m;
import tc0.C77884m;
import tc0.C77885p;

/* renamed from: hg0.c */
public class C32877c extends IStaticListener<BindQQEvent> {
    public boolean callback(IEvent iEvent) {
        ((BindQQEvent) iEvent).f78728d.getClass();
        try {
            int o = C75592q0.m90785o() | 4096;
            C86709a0.m107535s().mo121142i().mo119676J(34, Integer.valueOf(o));
            C8233m XW = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW();
            C77884m mVar = r3;
            C77884m mVar2 = new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", o, "", 0, "", 0);
            ((C77885p) XW).mo107993q(mVar);
            Log.m105918d("MicroMsg.FriendBindQQ.EventListener", "doClearQQFriendHelper succ ");
            return false;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FriendBindQQ.EventListener", e, "", new Object[0]);
            return false;
        }
    }
}
