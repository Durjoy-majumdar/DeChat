package rx2;

import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import sx2.C118318d;

/* renamed from: rx2.e */
public class C36558e extends IStaticListener<LogoutEvent> {
    public boolean callback(IEvent iEvent) {
        ((LogoutEvent) iEvent).f78863d.getClass();
        if (C118318d.yx0() == null) {
            return false;
        }
        C118318d.yx0().mo183116i();
        return false;
    }
}
