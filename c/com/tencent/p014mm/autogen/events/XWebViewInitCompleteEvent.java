package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.XWebViewInitCompleteEvent */
public final class XWebViewInitCompleteEvent extends IEvent {

    /* renamed from: d */
    public C17694a f48138d = new C17694a();

    /* renamed from: com.tencent.mm.autogen.events.XWebViewInitCompleteEvent$a */
    public static final class C17694a {

        /* renamed from: a */
        public boolean f48139a = false;
    }

    public XWebViewInitCompleteEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof XWebViewInitCompleteEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f48138d.f48139a), Boolean.valueOf(((XWebViewInitCompleteEvent) iEvent).f48138d.f48139a));
    }
}
