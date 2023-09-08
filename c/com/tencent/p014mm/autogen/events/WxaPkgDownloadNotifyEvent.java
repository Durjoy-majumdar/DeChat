package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WxaPkgDownloadNotifyEvent */
public final class WxaPkgDownloadNotifyEvent extends IEvent {

    /* renamed from: d */
    public C1170a f9617d = new C1170a();

    /* renamed from: com.tencent.mm.autogen.events.WxaPkgDownloadNotifyEvent$a */
    public static final class C1170a {
    }

    public WxaPkgDownloadNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WxaPkgDownloadNotifyEvent)) {
            return false;
        }
        C1170a aVar = ((WxaPkgDownloadNotifyEvent) iEvent).f9617d;
        this.f9617d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9617d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
