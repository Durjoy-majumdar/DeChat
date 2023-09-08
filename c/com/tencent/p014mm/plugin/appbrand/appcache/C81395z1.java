package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.autogen.events.WxaPkgCDNDownloaderEventEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.z1 */
public final class C81395z1 extends IStaticListener<WxaPkgCDNDownloaderEventEvent> {
    /* JADX WARNING: type inference failed for: r8v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r8v14, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r8) {
        /*
            r7 = this;
            com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent r8 = (com.tencent.p014mm.autogen.events.WxaPkgCDNDownloaderEventEvent) r8
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r8, r0)
            boolean r0 = f40.C86709a0.m107522a()
            r1 = 0
            if (r0 != 0) goto L_0x0010
            goto L_0x008d
        L_0x0010:
            com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent$a r0 = r8.f236311d
            r2 = 0
            if (r0 == 0) goto L_0x0018
            ei0.a r0 = r0.f236313b
            goto L_0x0019
        L_0x0018:
            r0 = r2
        L_0x0019:
            boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81229b1.m99529b(r0)
            if (r0 == 0) goto L_0x008d
            com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent$a r0 = r8.f236311d
            int r3 = r0.f236312a
            r4 = 368(0x170, float:5.16E-43)
            r5 = 1
            if (r3 == r5) goto L_0x0086
            r6 = 2
            if (r3 == r6) goto L_0x002c
            goto L_0x008d
        L_0x002c:
            com.tencent.mm.pluginsdk.res.downloader.model.p r0 = r0.f236314c
            java.lang.String r3 = "RESPONSE_KEY_CRONET_PERFORMANCE"
            if (r0 == 0) goto L_0x005e
            int r0 = r0.f249598g
            if (r0 != r6) goto L_0x005e
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 75
            r0.mo175911u(r4, r6)
            com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent$a r8 = r8.f236311d
            com.tencent.mm.pluginsdk.res.downloader.model.p r8 = r8.f236314c
            if (r8 == 0) goto L_0x004e
            android.os.Bundle r8 = r8.f249601j
            if (r8 == 0) goto L_0x004e
            android.os.Parcelable r8 = r8.getParcelable(r3)
            r2 = r8
            com.tencent.mars.cdn.CdnLogic$WebPageProfile r2 = (com.tencent.mars.cdn.CdnLogic.WebPageProfile) r2
        L_0x004e:
            if (r2 == 0) goto L_0x0055
            boolean r8 = r2.socketReused
            if (r8 != r5) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r5 == 0) goto L_0x008d
            r8 = 76
            r0.mo175911u(r4, r8)
            goto L_0x008d
        L_0x005e:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 77
            r0.mo175911u(r4, r6)
            com.tencent.mm.autogen.events.WxaPkgCDNDownloaderEventEvent$a r8 = r8.f236311d
            com.tencent.mm.pluginsdk.res.downloader.model.p r8 = r8.f236314c
            if (r8 == 0) goto L_0x0076
            android.os.Bundle r8 = r8.f249601j
            if (r8 == 0) goto L_0x0076
            android.os.Parcelable r8 = r8.getParcelable(r3)
            r2 = r8
            com.tencent.mars.cdn.CdnLogic$WebPageProfile r2 = (com.tencent.mars.cdn.CdnLogic.WebPageProfile) r2
        L_0x0076:
            if (r2 == 0) goto L_0x007d
            boolean r8 = r2.socketReused
            if (r8 != r5) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r5 = 0
        L_0x007e:
            if (r5 == 0) goto L_0x008d
            r8 = 78
            r0.mo175911u(r4, r8)
            goto L_0x008d
        L_0x0086:
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0 = 74
            r8.mo175911u(r4, r0)
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81395z1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
