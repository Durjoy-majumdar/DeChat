package p697tm;

import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C29276n;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81337l;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81344s;
import com.tencent.p014mm.plugin.appbrand.config.C81652f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.EventScanCodeSheetPreloadWxaAttrs;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import sx3.C26236u;

/* renamed from: tm.y0 */
public class C37205y0 extends IStaticListener<EventScanCodeSheetPreloadWxaAttrs> {
    public boolean callback(IEvent iEvent) {
        EventScanCodeSheetPreloadWxaAttrs eventScanCodeSheetPreloadWxaAttrs = (EventScanCodeSheetPreloadWxaAttrs) iEvent;
        if (!C86709a0.m107522a()) {
            return false;
        }
        C81337l lVar = (C81337l) C86312j.m106911c(C81337l.class);
        lVar.getClass();
        C87412m.m108594g(eventScanCodeSheetPreloadWxaAttrs, "event");
        String str = eventScanCodeSheetPreloadWxaAttrs.f81941d;
        if (str != null && lVar.vx0(str)) {
            C115669n.INSTANCE.mo175911u(1342, 3);
            long nowMilliSecond = Util.nowMilliSecond();
            Log.m105924i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode username:" + str + ", timestamp:" + nowMilliSecond);
            C81344s.f238811a.mo113619a(C26236u.m33719b(str), C81652f.C81653a.QRCODE, new C29276n(str, nowMilliSecond));
        }
        return true;
    }
}
