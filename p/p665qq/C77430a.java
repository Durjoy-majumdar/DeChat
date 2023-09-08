package p665qq;

import com.tencent.p014mm.autogen.events.BannerOnInitEvent;
import com.tencent.p014mm.autogen.events.BannerToAddEvent;
import com.tencent.p014mm.plugin.expt.p472ui.ExptReportBanner;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import la1.C61258b;

/* renamed from: qq.a */
public class C77430a extends IStaticListener<BannerOnInitEvent> {
    public boolean callback(IEvent iEvent) {
        Log.m105925i("MicroMsg.ExptReportService", "%d banner on init ", Integer.valueOf(((C61258b) C86312j.m106911c(C61258b.class)).hashCode()));
        BannerToAddEvent bannerToAddEvent = new BannerToAddEvent();
        bannerToAddEvent.f193489d.f193492c = new ExptReportBanner(((BannerOnInitEvent) iEvent).f193487d.f193488a);
        bannerToAddEvent.publish();
        return false;
    }
}
