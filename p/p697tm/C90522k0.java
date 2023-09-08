package p697tm;

import com.tencent.p014mm.autogen.events.AppActiveEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81285k2;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81310b;
import com.tencent.p014mm.plugin.appbrand.appusage.C81514n;
import com.tencent.p014mm.plugin.appbrand.appusage.C81516o;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81555b;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81557d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import eb0.C31543z5;
import f40.C86709a0;
import hi0.C87507t;
import js0.C88024r;
import ki0.C33910e;

/* renamed from: tm.k0 */
public class C90522k0 extends IStaticListener<AppActiveEvent> {
    public boolean callback(IEvent iEvent) {
        AppActiveEvent.C28702a aVar;
        AppActiveEvent appActiveEvent = (AppActiveEvent) iEvent;
        if (!(!C86709a0.m107522a() || appActiveEvent == null || (aVar = appActiveEvent.f78710d) == null)) {
            if (aVar.f78711a) {
                if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                    Log.m105924i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "periodFetchDataWhenAppEnterForeground, not wifi network");
                } else {
                    long a = C31543z5.m39451a();
                    if (a - C81557d.f239184a < 900000) {
                        Log.m105924i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "periodFetchDataWhenAppEnterForeground, too frequent");
                    } else {
                        C81557d.f239184a = a;
                        C88024r.m109571a().postToWorker(new C81555b());
                    }
                }
            }
            if (!appActiveEvent.f78710d.f78711a && C86709a0.m107523b().f251765p) {
                C81285k2.m99657a(false, (Runnable) null);
                C81516o qq = C81516o.m100007qq();
                qq.getClass();
                C88024r.m109571a().postToWorker(new C81514n(qq));
                C81310b.m99725l();
                C87507t.m108819a().mo121960b();
                ((C33910e) C81161g2.Bx0(C33910e.class)).getClass();
            }
        }
        return false;
    }
}
