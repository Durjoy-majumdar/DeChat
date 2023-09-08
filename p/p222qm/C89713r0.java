package p222qm;

import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.xwebutil.C86032n;
import com.tencent.xweb.XWebSdk;
import eb0.C7624i3;
import eb0.C97625j3;
import f40.C86718e;

/* renamed from: qm.r0 */
public class C89713r0 extends IStaticListener<LogoutEvent> {
    public boolean callback(IEvent iEvent) {
        LogoutEvent logoutEvent = (LogoutEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        if (logoutEvent.f78863d.f78864a != 2) {
            C86032n.m106476b("com.tencent.mm.intent.ACTION_TOOLS_REMOVE_COOKIE");
            try {
                MultiProcessMMKV.getMMKV("__webView_ad").removeValueForKey("AdWUID");
                XWebSdk.clearAllWebViewCache(true);
                Log.m105924i("MicroMsg.WorkerProfile", "clearAllWebViewCache");
            } catch (Exception e) {
                Log.m105925i("MicroMsg.WorkerProfile", "clear cookie failed : %s", e);
            }
        }
        if (C97625j3.m125811a()) {
            int i = logoutEvent.f78863d.f78864a;
            boolean z = i == 3;
            boolean z2 = i == 1;
            if (z) {
                C7624i3.f25910c.mo8756d("login_user_name", "");
                C86718e.f251748x = true;
            } else {
                if (z2) {
                    C86718e.f251748x = true;
                    MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
                }
                C7624i3.f25910c.mo8755c((String) C97625j3.m125812b().mo105906u().mo119684e(6, (Object) null), C97625j3.m125812b().mo105906u().mo119688i(9, 0), (String) C97625j3.m125812b().mo105906u().mo119684e(5, (Object) null));
            }
        }
        return false;
    }
}
