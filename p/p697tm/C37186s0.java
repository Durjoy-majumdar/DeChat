package p697tm;

import com.tencent.p014mm.autogen.events.AppBrandSetServiceUnreadCountEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: tm.s0 */
public class C37186s0 extends IStaticListener<AppBrandSetServiceUnreadCountEvent> {
    public boolean callback(IEvent iEvent) {
        AppBrandSetServiceUnreadCountEvent appBrandSetServiceUnreadCountEvent = (AppBrandSetServiceUnreadCountEvent) iEvent;
        if (C86709a0.m107522a() && !Util.isNullOrNil(appBrandSetServiceUnreadCountEvent.f78716d.f78717a)) {
            String str = appBrandSetServiceUnreadCountEvent.f78716d.f78717a;
            appBrandSetServiceUnreadCountEvent.f78716d.getClass();
            C81161g2.m99451h1().mo61552B9(str + "_unreadCount", "0");
            String e = C81661j.m100180e(str);
            appBrandSetServiceUnreadCountEvent.f78716d.getClass();
            C81964j.m100678a(e, 0);
        }
        return false;
    }
}
