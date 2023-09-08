package gd0;

import com.tencent.p014mm.autogen.events.FMessageConversationStateOpEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import fd0.C75743h;

/* renamed from: gd0.b */
public class C75904b extends IStaticListener<FMessageConversationStateOpEvent> {
    public boolean callback(IEvent iEvent) {
        FMessageConversationStateOpEvent fMessageConversationStateOpEvent = (FMessageConversationStateOpEvent) iEvent;
        fMessageConversationStateOpEvent.f193601d.getClass();
        FMessageConversationStateOpEvent.C67694a aVar = fMessageConversationStateOpEvent.f193601d;
        String str = aVar.f193604b;
        int i = aVar.f193603a;
        if (i == 2) {
            C75743h.vx0().mo101171bF(str, 2);
        } else if (i == 1) {
            C75743h.vx0().mo101171bF(str, 1);
        } else {
            C75743h.vx0().mo101171bF(str, 0);
        }
        fMessageConversationStateOpEvent.f193602e.f193605a = i;
        return false;
    }
}
