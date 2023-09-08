package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.autogen.events.WxaPkgPreConnectCDNEventEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import f40.C86709a0;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.b2 */
public final class C81233b2 extends IStaticListener<WxaPkgPreConnectCDNEventEvent> {
    public boolean callback(IEvent iEvent) {
        CdnLogic.C2CDownloadResult c2CDownloadResult;
        CdnLogic.CronetTaskResult cronetTaskResult;
        CdnLogic.C2CDownloadResult c2CDownloadResult2;
        WxaPkgPreConnectCDNEventEvent wxaPkgPreConnectCDNEventEvent = (WxaPkgPreConnectCDNEventEvent) iEvent;
        C87412m.m108594g(wxaPkgPreConnectCDNEventEvent, "event");
        if (C86709a0.m107522a()) {
            WxaPkgPreConnectCDNEventEvent.C80749a aVar = wxaPkgPreConnectCDNEventEvent.f236315d;
            Integer valueOf = aVar != null ? Integer.valueOf(aVar.f236316a) : null;
            boolean z = true;
            if (valueOf != null && valueOf.intValue() == 1) {
                C115669n.INSTANCE.mo175911u(368, 71);
            } else if (valueOf != null && valueOf.intValue() == 2) {
                WxaPkgPreConnectCDNEventEvent.C80749a aVar2 = wxaPkgPreConnectCDNEventEvent.f236315d;
                if (!((aVar2 == null || (c2CDownloadResult2 = aVar2.f236317b) == null || c2CDownloadResult2.httpStatusCode != 200) ? false : true)) {
                    if (aVar2 == null || (c2CDownloadResult = aVar2.f236317b) == null || (cronetTaskResult = c2CDownloadResult.cronetTaskResult) == null || cronetTaskResult.statusCode != 200) {
                        z = false;
                    }
                    if (!z) {
                        C115669n.INSTANCE.mo175911u(368, 73);
                    }
                }
                C115669n.INSTANCE.mo175911u(368, 72);
            }
        }
        return false;
    }
}
