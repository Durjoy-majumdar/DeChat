package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WebViewUIDestroyEvent */
public final class WebViewUIDestroyEvent extends IEvent {

    /* renamed from: d */
    public C67832a f194105d = new C67832a();

    /* renamed from: com.tencent.mm.autogen.events.WebViewUIDestroyEvent$a */
    public static final class C67832a {

        /* renamed from: a */
        public String f194106a;
    }

    public WebViewUIDestroyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WebViewUIDestroyEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f194105d.f194106a, ((WebViewUIDestroyEvent) iEvent).f194105d.f194106a);
    }
}
