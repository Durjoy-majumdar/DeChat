package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WxaPkgDownloadCompleteNotifyEvent */
public final class WxaPkgDownloadCompleteNotifyEvent extends IEvent {

    /* renamed from: d */
    public C28858a f79073d = new C28858a();

    /* renamed from: com.tencent.mm.autogen.events.WxaPkgDownloadCompleteNotifyEvent$a */
    public static final class C28858a {

        /* renamed from: a */
        public String f79074a;

        /* renamed from: b */
        public String f79075b;

        /* renamed from: c */
        public String f79076c;

        /* renamed from: d */
        public int f79077d;

        /* renamed from: e */
        public int f79078e;
    }

    public WxaPkgDownloadCompleteNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WxaPkgDownloadCompleteNotifyEvent)) {
            return false;
        }
        C28858a aVar = ((WxaPkgDownloadCompleteNotifyEvent) iEvent).f79073d;
        return C46238a.m51546a(this.f79073d.f79074a, aVar.f79074a) && C46238a.m51546a(this.f79073d.f79075b, aVar.f79075b) && C46238a.m51546a(this.f79073d.f79076c, aVar.f79076c) && C46238a.m51546a(Integer.valueOf(this.f79073d.f79077d), Integer.valueOf(aVar.f79077d)) && C46238a.m51546a(Integer.valueOf(this.f79073d.f79078e), Integer.valueOf(aVar.f79078e));
    }
}
