package com.tencent.p014mm.autogen.events;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WxaPkgPreConnectCDNEventEvent */
public final class WxaPkgPreConnectCDNEventEvent extends IEvent {

    /* renamed from: d */
    public C80749a f236315d = new C80749a();

    /* renamed from: com.tencent.mm.autogen.events.WxaPkgPreConnectCDNEventEvent$a */
    public static final class C80749a {

        /* renamed from: a */
        public int f236316a = 0;

        /* renamed from: b */
        public CdnLogic.C2CDownloadResult f236317b;
    }

    public WxaPkgPreConnectCDNEventEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WxaPkgPreConnectCDNEventEvent)) {
            return false;
        }
        C80749a aVar = ((WxaPkgPreConnectCDNEventEvent) iEvent).f236315d;
        return C46238a.m51546a(Integer.valueOf(this.f236315d.f236316a), Integer.valueOf(aVar.f236316a)) && C46238a.m51546a(this.f236315d.f236317b, aVar.f236317b);
    }
}
