package q71;

import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hk2.C32939b;

/* renamed from: q71.g */
public class C35780g extends IStaticListener<LogoutEvent> {
    public boolean callback(IEvent iEvent) {
        LogoutEvent logoutEvent = (LogoutEvent) iEvent;
        Class cls = C32939b.class;
        if (logoutEvent instanceof LogoutEvent) {
            Log.m105925i("RtosLogoutEvent", "Logout Event callback. reason:%d ", Integer.valueOf(logoutEvent.f78863d.f78864a));
            int i = logoutEvent.f78863d.f78864a;
            if (i == 0 || i == 1 || i == 3) {
                ((C32939b) C86312j.m106911c(cls)).mo33901s1();
                ((C32939b) C86312j.m106911c(cls)).mo33887Cl();
            }
        }
        return false;
    }
}
