package h22;

import android.app.Application;
import android.content.Context;
import com.tencent.p014mm.autogen.events.StartActivityEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import dp1.C116618b2;
import dp1.C58391n;
import eb0.C31543z5;
import gy3.C87412m;
import z04.C112550d0;

/* renamed from: h22.x */
public final class C117062x extends IStaticListener<StartActivityEvent> {
    public boolean callback(IEvent iEvent) {
        StartActivityEvent startActivityEvent = (StartActivityEvent) iEvent;
        C87412m.m108594g(startActivityEvent, "event");
        String str = startActivityEvent.f343622d.f343623a;
        boolean z = false;
        if (str != null && C112550d0.m153801u(str, "com.tencent.mm.plugin.finder", false)) {
            Log.m105924i("MicroMsg.StartActivityEventListener", "startActivity: target class = " + startActivityEvent.f343622d.f343623a);
            C58391n.f167292a.getClass();
            C58391n.f167294c = C31543z5.m39453c();
        }
        String str2 = startActivityEvent.f343622d.f343623a;
        if (str2 != null && str2.equals("com.tencent.mm.plugin.shake.ui.ShakeReportUI")) {
            z = true;
        }
        if (z) {
            C116618b2.f349686a = C31543z5.m39453c();
            C116618b2.f349687b = "ShakeReportUI";
            if (!C116618b2.f349688c) {
                Context context = MMApplicationContext.getContext();
                Application application = context instanceof Application ? (Application) context : null;
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(C116618b2.f349690e);
                }
                C116618b2.f349688c = true;
            }
        }
        return true;
    }
}
