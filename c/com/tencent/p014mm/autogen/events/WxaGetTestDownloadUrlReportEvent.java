package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WxaGetTestDownloadUrlReportEvent */
public final class WxaGetTestDownloadUrlReportEvent extends IEvent {

    /* renamed from: d */
    public C28857a f79072d = new C28857a();

    /* renamed from: com.tencent.mm.autogen.events.WxaGetTestDownloadUrlReportEvent$a */
    public static final class C28857a {
    }

    public WxaGetTestDownloadUrlReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WxaGetTestDownloadUrlReportEvent)) {
            return false;
        }
        C28857a aVar = ((WxaGetTestDownloadUrlReportEvent) iEvent).f79072d;
        this.f79072d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0L, 0L)) {
            return false;
        }
        this.f79072d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0L, 0L)) {
            return false;
        }
        this.f79072d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f79072d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
