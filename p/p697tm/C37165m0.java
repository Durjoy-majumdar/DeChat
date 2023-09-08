package p697tm;

import com.tencent.p014mm.autogen.events.AppBrandGetServiceUnreadCountEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import wi0.C38158d;

/* renamed from: tm.m0 */
public class C37165m0 extends IStaticListener<AppBrandGetServiceUnreadCountEvent> {
    public boolean callback(IEvent iEvent) {
        AppBrandGetServiceUnreadCountEvent appBrandGetServiceUnreadCountEvent = (AppBrandGetServiceUnreadCountEvent) iEvent;
        if (C86709a0.m107522a() && !Util.isNullOrNil(appBrandGetServiceUnreadCountEvent.f78712d.f78714a)) {
            String str = appBrandGetServiceUnreadCountEvent.f78712d.f78714a;
            C38158d h1 = C81161g2.m99451h1();
            appBrandGetServiceUnreadCountEvent.f78713e.f78715a = Util.getInt(h1.mo61553Lo(str + "_unreadCount", "0"), 0);
        }
        return false;
    }
}
