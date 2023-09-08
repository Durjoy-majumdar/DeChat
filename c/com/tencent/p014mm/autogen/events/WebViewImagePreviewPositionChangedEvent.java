package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WebViewImagePreviewPositionChangedEvent */
public final class WebViewImagePreviewPositionChangedEvent extends IEvent {

    /* renamed from: d */
    public C40187a f107834d = new C40187a();

    /* renamed from: com.tencent.mm.autogen.events.WebViewImagePreviewPositionChangedEvent$a */
    public static final class C40187a {

        /* renamed from: a */
        public int f107835a = 0;

        /* renamed from: b */
        public int f107836b = 0;
    }

    public WebViewImagePreviewPositionChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WebViewImagePreviewPositionChangedEvent)) {
            return false;
        }
        C40187a aVar = ((WebViewImagePreviewPositionChangedEvent) iEvent).f107834d;
        return C46238a.m51546a(Integer.valueOf(this.f107834d.f107835a), Integer.valueOf(aVar.f107835a)) && C46238a.m51546a(Integer.valueOf(this.f107834d.f107836b), Integer.valueOf(aVar.f107836b));
    }
}
