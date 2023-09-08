package p697tm;

import com.tencent.luggage.sdk.processes.C80249b;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81194z;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: tm.i1 */
public class C90521i1 extends IStaticListener<LogoutEvent> {
    public boolean callback(IEvent iEvent) {
        LogoutEvent logoutEvent = (LogoutEvent) iEvent;
        if (!C86709a0.m107522a()) {
            return false;
        }
        Log.m105925i("MicroMsg.SubCoreAppBrand", "logoutListener.callback(event.data.reason=%d)", Integer.valueOf(logoutEvent.f78863d.f78864a));
        int i = logoutEvent.f78863d.f78864a;
        if (i == 1 || i == 3) {
            AppBrandProcessesManager.m103869I().mo111405r(C80249b.KILL_TYPE_NOTIFY_ACCOUNT_RELEASE);
        } else {
            AppBrandProcessesManager.m103869I().mo111405r(C80249b.KILL_TYPE_SILENT_ACCOUNT_LOGOUT);
        }
        C81194z.f238510d.Rc0("WxLogout");
        return true;
    }
}
