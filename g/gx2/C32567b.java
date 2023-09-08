package gx2;

import com.tencent.p014mm.autogen.events.WxaPkgDownloadCompleteNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dx2.C31343d;
import dx2.C86411e;
import gy3.C87412m;
import kr0.C33987b1;

/* renamed from: gx2.b */
public final class C32567b extends IStaticListener<WxaPkgDownloadCompleteNotifyEvent> {

    /* renamed from: d */
    public final String f86457d = "SurfacePkgUpdateEventListener";

    public boolean callback(IEvent iEvent) {
        WxaPkgDownloadCompleteNotifyEvent wxaPkgDownloadCompleteNotifyEvent = (WxaPkgDownloadCompleteNotifyEvent) iEvent;
        C87412m.m108594g(wxaPkgDownloadCompleteNotifyEvent, "event");
        Log.m105927v(this.f86457d, "pkgUpdateEventListener appId=%s", wxaPkgDownloadCompleteNotifyEvent.f79073d.f79074a);
        if (wxaPkgDownloadCompleteNotifyEvent.f79073d.f79078e != 0) {
            return true;
        }
        if (C31343d.f83890a.mo58078c().contains(wxaPkgDownloadCompleteNotifyEvent.f79073d.f79074a)) {
            C86411e.f251188h.mo58083a(1);
            C33987b1 b1Var = (C33987b1) C86312j.m106911c(C33987b1.class);
            if (b1Var != null) {
                WxaPkgDownloadCompleteNotifyEvent.C28858a aVar = wxaPkgDownloadCompleteNotifyEvent.f79073d;
                b1Var.mo59394hF(aVar.f79074a, aVar.f79077d);
            }
        }
        return false;
    }
}
