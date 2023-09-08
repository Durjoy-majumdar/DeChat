package rx2;

import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import sx2.C118318d;

/* renamed from: rx2.i */
public class C118251i extends IStaticListener<TalkRoomServerEvent> {
    public boolean callback(IEvent iEvent) {
        TalkRoomServerEvent talkRoomServerEvent = (TalkRoomServerEvent) iEvent;
        if (talkRoomServerEvent == null) {
            return false;
        }
        TalkRoomServerEvent.C55169a aVar = talkRoomServerEvent.f154883d;
        if (aVar.f154886b) {
            C118318d.yx0().mo183116i();
        } else if (!aVar.f154885a || talkRoomServerEvent.f154884e == null || C118318d.yx0() == null) {
            return false;
        } else {
            talkRoomServerEvent.f154884e.f154887a = C118318d.yx0().f353649h;
        }
        return true;
    }
}
