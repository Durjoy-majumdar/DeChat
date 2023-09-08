package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PublishScanCodeResultEvent */
public final class PublishScanCodeResultEvent extends IEvent {

    /* renamed from: d */
    public C67760a f193844d = new C67760a();

    /* renamed from: e */
    public C67761b f193845e = new C67761b();

    /* renamed from: com.tencent.mm.autogen.events.PublishScanCodeResultEvent$a */
    public static final class C67760a {

        /* renamed from: a */
        public int f193846a = 0;

        /* renamed from: b */
        public String f193847b;

        /* renamed from: c */
        public String f193848c;
    }

    /* renamed from: com.tencent.mm.autogen.events.PublishScanCodeResultEvent$b */
    public static final class C67761b {
    }

    public PublishScanCodeResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PublishScanCodeResultEvent)) {
            return false;
        }
        PublishScanCodeResultEvent publishScanCodeResultEvent = (PublishScanCodeResultEvent) iEvent;
        C67760a aVar = publishScanCodeResultEvent.f193844d;
        if (!C46238a.m51546a(Integer.valueOf(this.f193844d.f193846a), Integer.valueOf(aVar.f193846a)) || !C46238a.m51546a(this.f193844d.f193847b, aVar.f193847b) || !C46238a.m51546a(this.f193844d.f193848c, aVar.f193848c)) {
            return false;
        }
        C67761b bVar = publishScanCodeResultEvent.f193845e;
        this.f193845e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
