package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.plugin.appbrand.appcache.C81278k;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import ob0.C89132b;

/* renamed from: com.tencent.mm.autogen.events.WxaGetDownloadUrlReportEvent */
public final class WxaGetDownloadUrlReportEvent extends IEvent {

    /* renamed from: d */
    public C80747a f236306d = new C80747a();

    /* renamed from: com.tencent.mm.autogen.events.WxaGetDownloadUrlReportEvent$a */
    public static final class C80747a {

        /* renamed from: a */
        public C81278k f236307a;

        /* renamed from: b */
        public C89132b.C89134c f236308b;

        /* renamed from: c */
        public long f236309c;

        /* renamed from: d */
        public long f236310d;
    }

    public WxaGetDownloadUrlReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WxaGetDownloadUrlReportEvent)) {
            return false;
        }
        C80747a aVar = ((WxaGetDownloadUrlReportEvent) iEvent).f236306d;
        return C46238a.m51546a(this.f236306d.f236307a, aVar.f236307a) && C46238a.m51546a(this.f236306d.f236308b, aVar.f236308b) && C46238a.m51546a(Long.valueOf(this.f236306d.f236309c), Long.valueOf(aVar.f236309c)) && C46238a.m51546a(Long.valueOf(this.f236306d.f236310d), Long.valueOf(aVar.f236310d));
    }
}
